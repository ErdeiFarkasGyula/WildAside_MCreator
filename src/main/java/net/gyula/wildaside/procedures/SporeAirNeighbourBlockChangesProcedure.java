package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SporeAirNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -3;
		found = false;
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = -3;
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getMaterial() == net.minecraft.world.level.material.Material.WATER
							|| (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
									.getMaterial() == net.minecraft.world.level.material.Material.LAVA) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
