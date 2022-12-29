
package net.gyula.wildaside.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.procedures.GreenGlowingHickoryLeavesBlockDestroyedByPlayerProcedure;

public class GreenGlowingHickoryLeavesBlock extends LeavesBlock {
	public GreenGlowingHickoryLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_GREEN).sound(SoundType.GRASS).strength(0.3f).lightLevel(s -> 7)
				.noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 8;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		GreenGlowingHickoryLeavesBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
