package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

public class SubstiliumTreeGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canPlace = false;
		double canPlaceNumber = 0;
		double trunkPlacerNumber = 0;
		String treeType = "";
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			world.setBlock(new BlockPos(x, y, z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			canPlaceNumber = 0;
			for (int index0 = 0; index0 < (int) (7); index0++) {
				canPlaceNumber = canPlaceNumber + 1;
				canPlace = (world.getBlockState(new BlockPos(x, y + canPlaceNumber, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR;
			}
			if (canPlaceNumber >= 7) {
				if (canPlace == true) {
					trunkPlacerNumber = 0;
					for (int index1 = 0; index1 < (int) (7); index1++) {
						world.setBlock(new BlockPos(x, y + trunkPlacerNumber, z), WildasideModBlocks.SUBSTILIUM_STEM.get().defaultBlockState(), 3);
						trunkPlacerNumber = trunkPlacerNumber + 1;
					}
					if (Math.random() > 0.5) {
						treeType = "shroom";
					} else {
						treeType = "stick";
					}
				}
			}
		}
	}
}
