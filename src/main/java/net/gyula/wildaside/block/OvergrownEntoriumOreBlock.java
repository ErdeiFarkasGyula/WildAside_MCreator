
package net.gyula.wildaside.block;

import net.minecraftforge.common.IPlantable;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class OvergrownEntoriumOreBlock extends Block {
	public OvergrownEntoriumOreBlock() {
		super(BlockBehaviour.Properties.of(Material.GRASS, MaterialColor.COLOR_CYAN).sound(SoundType.GILDED_BLACKSTONE).strength(3.5f, 5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}
}
