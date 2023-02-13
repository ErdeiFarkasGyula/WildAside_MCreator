package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Random;
import java.util.Map;

public class SubstiliumTreeGrowerUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean canPlace = false;
		boolean found = false;
		double height = 0;
		double canPlaceLoop = 0;
		double i = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = Blocks.CAVE_AIR.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			i = 0;
			canPlaceLoop = 0;
			canPlace = true;
			if (Math.random() <= 0.75) {
				height = Mth.nextInt(new Random(), 6, 12);
				for (int index0 = 0; index0 < (int) (height); index0++) {
					canPlaceLoop = canPlaceLoop + 1;
					if (world.getBlockState(new BlockPos(x, y + canPlaceLoop, z)).canOcclude()) {
						canPlace = false;
					}
				}
				if (canPlace == true) {
					for (int index1 = 0; index1 < (int) (height); index1++) {
						world.setBlock(new BlockPos(x, y + i, z), WildasideModBlocks.SUBSTILIUM_STEM.get().defaultBlockState(), 3);
						i = i + 1;
					}
					sx = -1;
					found = false;
					for (int index2 = 0; index2 < (int) (3); index2++) {
						sy = height / 3;
						for (int index3 = 0; index3 < (int) (height - height / 3); index3++) {
							sz = -1;
							for (int index4 = 0; index4 < (int) (3); index4++) {
								if (Math.random() >= 0.69) {
									if (!world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)).canOcclude()) {
										if (Math.random() >= 0.15) {
											world.setBlock(new BlockPos(x + sx, y + sy, z + sz), WildasideModBlocks.VIBRION_BLOCK.get().defaultBlockState(), 3);
										} else if (Math.random() >= 0.5) {
											world.setBlock(new BlockPos(x + sx, y + sy, z + sz), WildasideModBlocks.VIBRION_GEL.get().defaultBlockState(), 3);
										} else {
											world.setBlock(new BlockPos(x + sx, y + sy, z + sz), WildasideModBlocks.LIT_VIBRION_GEL.get().defaultBlockState(), 3);
										}
									}
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
					if (!world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)).canOcclude()) {
						world.setBlock(new BlockPos(x, y + height, z), WildasideModBlocks.VIBRION_BLOCK.get().defaultBlockState(), 3);
					}
				}
			} else {
				for (int index5 = 0; index5 < (int) (Mth.nextInt(new Random(), 12, 24) + Mth.nextInt(new Random(), -5, 5)); index5++) {
					if (!world.getBlockState(new BlockPos(x, y + canPlaceLoop, z)).canOcclude()) {
						canPlaceLoop = canPlaceLoop + 1;
					} else {
						canPlace = false;
						break;
					}
				}
				if (canPlace == true) {
					for (int index6 = 0; index6 < (int) (Math.round((canPlaceLoop - 1) * 0.8)); index6++) {
						world.setBlock(new BlockPos(x, y + i, z), WildasideModBlocks.VIBRION_GROWTH_STEM.get().defaultBlockState(), 3);
						i = i + 1;
					}
					world.setBlock(new BlockPos(x, y + Math.round((canPlaceLoop - 1) * 0.8), z), WildasideModBlocks.VIBRION_GROWTH_HEAD.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
