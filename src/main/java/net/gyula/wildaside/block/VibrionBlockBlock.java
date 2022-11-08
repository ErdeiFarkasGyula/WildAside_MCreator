
package net.gyula.wildaside.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.IPlantable;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.procedures.VibrionGrowthGrowerProcedure;
import net.gyula.wildaside.procedures.DropXP2_10Procedure;
import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class VibrionBlockBlock extends Block {
	public VibrionBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).sound(SoundType.SHROOMLIGHT).strength(2.3f, 1f)
				.lightLevel(s -> 7).randomTicks());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		VibrionGrowthGrowerProcedure.execute(world, x, y, z);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 3; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.2D;
			double dy = (random.nextFloat() - 0.5D) * 0.2D;
			double dz = (random.nextFloat() - 0.5D) * 0.2D;
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), x0, y0, z0, dx, dy, dz);
		}
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		DropXP2_10Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		DropXP2_10Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
