package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HangingVibrionVinesGrowerStrConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude()) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE) {
				if (!world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude() && !world.getBlockState(new BlockPos(x, y - 2, z)).canOcclude()
						&& !world.getBlockState(new BlockPos(x, y - 3, z)).canOcclude()) {
					return true;
				}
				return false;
			}
			return false;
		}
		return false;
	}
}
