
package net.gyula.wildaside.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.Block;
import net.minecraft.util.Mth;
import java.util.Random;
import java.util.function.ToIntFunction;
import net.gyula.wildaside.procedures.GlowingHickoryLeavesUpdateTickProcedure;

import net.gyula.wildaside.procedures.FallenGreenGlowingHickoryLeavesPlantDestroyedByPlayerProcedure;
import net.gyula.wildaside.init.WildasideModBlocks;

public class FallenGreenGlowingHickoryLeavesBlock extends FlowerBlock {

	public static final IntegerProperty LIGHT = IntegerProperty.create("light", 0, 7);

	public FallenGreenGlowingHickoryLeavesBlock() {
		super(MobEffects.MOVEMENT_SPEED, 0,
				BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GREEN).sound(SoundType.GRASS).strength(0.1f, 0.1f).lightLevel(wildasideGlowingLeavesLightToInt()).noCollission());
		this.registerDefaultState(this.defaultBlockState().setValue(LIGHT, Integer.valueOf(0)));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		return box(0, 0, 0, 16, 2, 16).move(offset.x, offset.y, offset.z);
	}

	@Override
	public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
		return BlockPathTypes.OPEN;
	}

	@Override
	public BlockBehaviour.OffsetType getOffsetType() {
		return BlockBehaviour.OffsetType.NONE;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		FallenGreenGlowingHickoryLeavesPlantDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(WildasideModBlocks.FALLEN_GREEN_GLOWING_HICKORY_LEAVES.get(),
				renderType -> renderType == RenderType.cutout());
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, (Mth.nextInt(new Random(), 400, 700)));
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		GlowingHickoryLeavesUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, (Mth.nextInt(new Random(), 400, 700)));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(LIGHT);
	}

	private static ToIntFunction<BlockState> wildasideGlowingLeavesLightToInt() {
		return (s) -> {
			return s.getValue(LIGHT);
		};
	}
}
