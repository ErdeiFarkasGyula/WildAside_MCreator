package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlocks;

public class SubstiliumSoilCheckTopBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude()) {
			world.setBlock(new BlockPos(x, y, z), WildasideModBlocks.LOWER_SUBSTILIUM_SOIL.get().defaultBlockState(), 3);
		}
	}
}
