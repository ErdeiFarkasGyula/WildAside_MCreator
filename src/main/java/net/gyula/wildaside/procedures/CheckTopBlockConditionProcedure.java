package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CheckTopBlockConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude()) {
			return true;
		}
		return false;
	}
}
