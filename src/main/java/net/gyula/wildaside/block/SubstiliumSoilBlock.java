
package net.gyula.wildaside.block;

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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.procedures.SubstiliumSoilCheckTopBlockProcedure;
import net.gyula.wildaside.procedures.DropXP0_3Procedure;
import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class SubstiliumSoilBlock extends Block {
	public SubstiliumSoilBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_CYAN).sound(SoundType.ROOTED_DIRT).strength(2f, 5f));
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
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		SubstiliumSoilCheckTopBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		for (int l = 0; l < 2; ++l) {
			double x0 = x + 0.5 + (random.nextFloat() - 0.5) * 0.3D;
			double y0 = y + 1.2 + (random.nextFloat() - 0.5) * 0.3D;
			double z0 = z + 0.5 + (random.nextFloat() - 0.5) * 0.3D;
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.SUBSTILIUM_PARTICLE.get()), x0, y0, z0, 0, 0, 0);
		}
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		DropXP0_3Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		DropXP0_3Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
