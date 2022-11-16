
package net.gyula.wildaside.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.properties.BooleanProperty;

import net.gyula.wildaside.procedures.HickoryPlanksPlacedProcedure;

import java.util.List;
import java.util.Collections;
import net.minecraft.world.level.block.state.StateDefinition;

public class HickoryStairsBlock extends StairBlock {

	public static final BooleanProperty IS_YELLOW = BooleanProperty.create("is_yellow");

	public HickoryStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(),
				BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.WOOD).strength(2.5f, 4f).dynamicShape());
		this.registerDefaultState(this.stateDefinition.any().setValue(IS_YELLOW, false));	
	}

	@Override
	public float getExplosionResistance() {
		return 4f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState p_56947_) {
		return false;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		HickoryPlanksPlacedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
   	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
   	   	pBuilder.add(FACING, HALF, SHAPE, WATERLOGGED, IS_YELLOW);
   	}
}
