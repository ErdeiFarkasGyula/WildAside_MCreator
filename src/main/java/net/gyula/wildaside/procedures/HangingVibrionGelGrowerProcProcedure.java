package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

public class HangingVibrionGelGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState randomBlock = Blocks.AIR.defaultBlockState();
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			if (Math.random() > 0.5) {
				randomBlock = WildasideModBlocks.VIBRION_GEL.get().defaultBlockState();
			} else {
				randomBlock = WildasideModBlocks.LIT_VIBRION_GEL.get().defaultBlockState();
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (world.getBlockState(new BlockPos(x, y - 2, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (world.getBlockState(new BlockPos(x, y - 3, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x, y, z), randomBlock, 3);
				world.setBlock(new BlockPos(x, y - 1, z), randomBlock, 3);
				world.setBlock(new BlockPos(x, y - 2, z), randomBlock, 3);
				if ((world.getBlockState(new BlockPos(x, y - 4, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y - 3, z), randomBlock, 3);
					if ((world.getBlockState(new BlockPos(x, y - 5, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x, y - 4, z), randomBlock, 3);
						if ((world.getBlockState(new BlockPos(x, y - 6, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
							if (0.8 > Math.random()) {
								world.setBlock(new BlockPos(x, y - 5, z), randomBlock, 3);
								if ((world.getBlockState(new BlockPos(x, y - 7, z)))
										.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
									world.setBlock(new BlockPos(x, y - 6, z), randomBlock, 3);
									if ((world.getBlockState(new BlockPos(x, y - 8, z)))
											.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
										world.setBlock(new BlockPos(x, y - 7, z), randomBlock, 3);
										if ((world.getBlockState(new BlockPos(x, y - 9, z)))
												.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
											world.setBlock(new BlockPos(x, y - 8, z), randomBlock, 3);
											if ((world.getBlockState(new BlockPos(x, y - 10, z)))
													.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
												if (0.8 > Math.random()) {
													world.setBlock(new BlockPos(x, y - 9, z), randomBlock, 3);
													if ((world.getBlockState(new BlockPos(x, y - 11, z)))
															.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
														world.setBlock(new BlockPos(x, y - 10, z), randomBlock, 3);
														if ((world.getBlockState(new BlockPos(x, y - 12, z)))
																.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
															if (0.7 > Math.random()) {
																world.setBlock(new BlockPos(x, y - 11, z), randomBlock, 3);
																if ((world.getBlockState(new BlockPos(x, y - 13, z)))
																		.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																	if (0.9 > Math.random()) {
																		world.setBlock(new BlockPos(x, y - 12, z), randomBlock, 3);
																		if ((world.getBlockState(new BlockPos(x, y - 14, z)))
																				.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																			if (0.9 > Math.random()) {
																				world.setBlock(new BlockPos(x, y - 13, z), randomBlock, 3);
																				if ((world.getBlockState(new BlockPos(x, y - 15, z)))
																						.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																					if (0.9 > Math.random()) {
																						world.setBlock(new BlockPos(x, y - 14, z), randomBlock, 3);
																						if ((world.getBlockState(new BlockPos(x, y - 16, z)))
																								.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																							if (0.7 > Math.random()) {
																								world.setBlock(new BlockPos(x, y - 15, z),
																										randomBlock, 3);
																								if ((world.getBlockState(new BlockPos(x, y - 17, z)))
																										.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																									if (0.7 > Math.random()) {
																										world.setBlock(new BlockPos(x, y - 16, z),
																												randomBlock, 3);
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
