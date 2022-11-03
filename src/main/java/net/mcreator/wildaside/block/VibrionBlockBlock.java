
package net.mcreator.wildaside.block;

import org.checkerframework.checker.units.qual.s;

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

public class VibrionBlockBlock extends Block {
	public VibrionBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_YELLOW).sound(SoundType.SHROOMLIGHT).strength(2.3f, 1f)
				.lightLevel(s -> 7));
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
