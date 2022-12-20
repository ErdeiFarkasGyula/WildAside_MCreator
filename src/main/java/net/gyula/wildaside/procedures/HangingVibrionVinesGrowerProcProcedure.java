package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Random;

public class HangingVibrionVinesGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canGrow = false;
		boolean canAdvance = false;
		boolean found = false;
		double canGrowNumber = 0;
		double baseBuilder = 0;
		double AdvanceNumber = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			world.setBlock(new BlockPos(x, y, z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			if (new ResourceLocation("wildaside:vibrion_hive").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
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
					for (int index2 = 0; index2 < (int) (Mth.nextInt(new Random(), 3, 40)); index2++) {
						canAdvance = (world.getBlockState(new BlockPos(x, (y - AdvanceNumber) - 4, z)))
								.getMaterial() == net.minecraft.world.level.material.Material.AIR;
						if (canAdvance == true) {
							world.setBlock(new BlockPos(x, (y - AdvanceNumber) - 4, z),
									WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
						}
						AdvanceNumber = AdvanceNumber + 1;
					}
					sx = -4;
					found = false;
					for (int index3 = 0; index3 < (int) (9); index3++) {
						sy = -1;
						for (int index4 = 0; index4 < (int) (6); index4++) {
							sz = -4;
							for (int index5 = 0; index5 < (int) (9); index5++) {
								if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)))
										.is(BlockTags.create(new ResourceLocation("minecraft:base_stone_overworld")))) {
									if (Math.random() <= 0.25) {
										world.setBlock(new BlockPos(x + sx, y + sy, z + sz),
												WildasideModBlocks.SUBSTILIUM_SOIL.get().defaultBlockState(), 3);
									}
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
				}
			}
		}
	}
}
