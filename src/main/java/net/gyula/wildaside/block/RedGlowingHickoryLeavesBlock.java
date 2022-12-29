
package net.gyula.wildaside.block;

import java.util.function.ToIntFunction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.procedures.RedGlowingHickoryLeavesBlockDestroyedByPlayerProcedure;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class RedGlowingHickoryLeavesBlock extends LeavesBlock {

	public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

	public RedGlowingHickoryLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_RED).sound(SoundType.GRASS).lightLevel(glowingLeavesLightlevel(7)).strength(0.3f).noOcclusion());
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
		return 1;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		RedGlowingHickoryLeavesBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(LIT);
	}

	private static ToIntFunction<BlockState> glowingLeavesLightlevel (int pLightValue) {
      return (gLLl) -> {
         return gLLl.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
      };
   }

	
}
