package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class CheckForRedstonePowerProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) > 0) {
			return true;
		}
		return false;
	}
}
