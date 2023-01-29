
package net.gyula.wildaside.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraftforge.common.IPlantable;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.BlockHitResult;

import net.gyula.wildaside.procedures.VibrionSporeholderPlantDestroyedByPlayerProcedure;
import net.gyula.wildaside.procedures.VibrionSporeholderEffectGiverProcedure;
import net.gyula.wildaside.procedures.VibrionBlockOnBlockRightClickedProcedure;
import net.gyula.wildaside.procedures.VibrionParticleSpawnLowProcedure;
import net.gyula.wildaside.init.WildasideModBlocks;

import net.gyula.wildaside.procedures.VibrionGrowthGrowerProcedure;
import net.gyula.wildaside.procedures.DropXP2_10Procedure;
import net.gyula.wildaside.procedures.GiveContaminationToPlayersInBlockProcedure;

import java.util.Random;

public class VibrionSporeholderBlock extends FlowerBlock {
	public VibrionSporeholderBlock() {
		super(MobEffects.MOVEMENT_SPEED, 0, BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_YELLOW).sound(SoundType.FUNGUS)
				.strength(1.5f, 2f).lightLevel(s -> 5).noCollission());
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(0, 0, 0, 16, 4, 16).move(offset.x, offset.y, offset.z);
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		VibrionBlockOnBlockRightClickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}


	@Override
	public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.DANGER_OTHER;
	}

	@Override
	public BlockBehaviour.OffsetType getOffsetType() {
		return BlockBehaviour.OffsetType.NONE;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		VibrionSporeholderEffectGiverProcedure.execute(entity);
		VibrionBlockOnBlockRightClickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		VibrionSporeholderPlantDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		VibrionParticleSpawnLowProcedure.execute(world, x, y, z);
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		VibrionSporeholderPlantDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(WildasideModBlocks.VIBRION_SPOREHOLDER.get(), renderType -> renderType == RenderType.cutout());
	}
	
	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		VibrionBlockOnBlockRightClickedProcedure.execute(world, x, y, z);
		GiveContaminationToPlayersInBlockProcedure.execute(world, x, y, z);
		return InteractionResult.SUCCESS;
	}
}
