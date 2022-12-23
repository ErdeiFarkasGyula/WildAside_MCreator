package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Random;

public class HangingVibrionGelGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState randomBlock = Blocks.AIR.defaultBlockState();
		boolean canGrow = false;
		double emptySpace = 0;
		double loopNumber = 0;
		double canGrowNumber = 0;
		double baseBuilder = 0;
		double AdvanceNumber = 0;
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			if (Math.random() > 0.6) {
				randomBlock = WildasideModBlocks.VIBRION_GEL.get().defaultBlockState();
			} else {
				randomBlock = WildasideModBlocks.LIT_VIBRION_GEL.get().defaultBlockState();
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			emptySpace = 1;
			loopNumber = 0;
			for (int index0 = 0; index0 < (int) (50); index0++) {
				if (world.isEmptyBlock(new BlockPos(x, y - emptySpace, z))) {
					emptySpace = emptySpace + 1;
				} else {
					break;
				}
			}
			for (int index1 = 0; index1 < (int) (Math.round(emptySpace / (Mth.nextInt(new Random(), 15, 22) / 10))); index1++) {
				world.setBlock(new BlockPos(x, y - loopNumber, z), randomBlock, 3);
				loopNumber = loopNumber + 1;
			}
		}
	}
}
