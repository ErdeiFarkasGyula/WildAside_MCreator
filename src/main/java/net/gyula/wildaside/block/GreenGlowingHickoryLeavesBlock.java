
package net.gyula.wildaside.block;

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

import net.gyula.wildaside.procedures.RedGlowingHickoryLeavesBlockDestroyedByPlayerProcedure;
import net.minecraft.world.level.block.RedstoneTorchBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.gyula.wildaside.procedures.GlowingHickoryLeavesUpdateTickProcedure;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.util.Mth;
import java.util.function.ToIntFunction;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.Block;

import java.util.Random;

import net.gyula.wildaside.procedures.GreenGlowingHickoryLeavesBlockDestroyedByPlayerProcedure;

public class GreenGlowingHickoryLeavesBlock extends LeavesBlock {

	public static final IntegerProperty LIGHT = IntegerProperty.create("light", 0, 7);
	public static final IntegerProperty DISTANCE = BlockStateProperties.DISTANCE;
	public static final BooleanProperty PERSISTENT = BlockStateProperties.PERSISTENT;

	public GreenGlowingHickoryLeavesBlock() {
		super(BlockBehaviour.Properties.of(Material.LEAVES, MaterialColor.COLOR_GREEN).sound(SoundType.GRASS).strength(0.3f).lightLevel(wildasideGlowingLeavesLightToInt()).noOcclusion());
		this.registerDefaultState(this.defaultBlockState().setValue(LIGHT, Integer.valueOf(0)));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		GreenGlowingHickoryLeavesBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, (Mth.nextInt(new Random(), 300, 500)));
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		GlowingHickoryLeavesUpdateTickProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, (Mth.nextInt(new Random(), 300, 500)));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		pBuilder.add(LIGHT, DISTANCE, PERSISTENT);
	}

	private static ToIntFunction<BlockState> wildasideGlowingLeavesLightToInt() {
		return (s) -> {
			return s.getValue(LIGHT);
		};
	}
}
