package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Random;

public class HangingVibrionVinesGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canGrow = false;
		boolean canAdvance = false;
		double canGrowNumber = 0;
		double baseBuilder = 0;
		double AdvanceNumber = 0;
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			world.setBlock(new BlockPos(x, y, z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			canGrowNumber = 0;
			for (int index0 = 0; index0 < (int) (3); index0++) {
				canGrowNumber = canGrowNumber + 1;
				canGrow = (world.getBlockState(new BlockPos(x, y - canGrowNumber, z)))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR;
			}
			if (canGrowNumber <= 3 && canGrow == true) {
				baseBuilder = 0;
				for (int index1 = 0; index1 < (int) (4); index1++) {
					world.setBlock(new BlockPos(x, y + baseBuilder, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
					baseBuilder = baseBuilder - 1;
				}
				AdvanceNumber = 0;
				for (int index2 = 0; index2 < (int) (Mth.nextInt(new Random(), 3, 18)); index2++) {
					canAdvance = (world.getBlockState(new BlockPos(x, (y - AdvanceNumber) - 4, z)))
							.getMaterial() == net.minecraft.world.level.material.Material.AIR;
					if (canAdvance == true) {
						world.setBlock(new BlockPos(x, (y - AdvanceNumber) - 4, z),
								WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
					}
					AdvanceNumber = AdvanceNumber + 1;
				}
			}
		}
	}
}
