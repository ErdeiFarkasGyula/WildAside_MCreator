package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Random;

public class HangingVibrionGelGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState randomBlock = Blocks.AIR.defaultBlockState();
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
			if (Math.random() > 0.5) {
				randomBlock = WildasideModBlocks.VIBRION_GEL.get().defaultBlockState();
			} else {
				randomBlock = WildasideModBlocks.LIT_VIBRION_GEL.get().defaultBlockState();
			}
			canGrowNumber = 0;
			for (int index0 = 0; index0 < (int) (3); index0++) {
				canGrowNumber = canGrowNumber + 1;
				canGrow = (world.getBlockState(new BlockPos(x, y - canGrowNumber, z)))
						.getMaterial() == net.minecraft.world.level.material.Material.AIR;
			}
			if (canGrowNumber <= 3 && canGrow == true) {
				baseBuilder = 0;
				for (int index1 = 0; index1 < (int) (3); index1++) {
					{
						BlockPos _bp = new BlockPos(x, y + baseBuilder, z);
						BlockState _bs = randomBlock;
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
					baseBuilder = baseBuilder - 1;
				}
				AdvanceNumber = 0;
				for (int index2 = 0; index2 < (int) (Mth.nextInt(new Random(), 3, 40)); index2++) {
					canAdvance = (world.getBlockState(new BlockPos(x, (y - AdvanceNumber) - 4, z)))
							.getMaterial() == net.minecraft.world.level.material.Material.AIR;
					if (canAdvance == true) {
						world.setBlock(new BlockPos(x, (y - AdvanceNumber) - 3, z), randomBlock, 3);
					}
					AdvanceNumber = AdvanceNumber + 1;
				}
			}
		}
	}
}
