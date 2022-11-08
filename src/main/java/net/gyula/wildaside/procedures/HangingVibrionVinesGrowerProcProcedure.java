package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Map;

public class HangingVibrionVinesGrowerProcProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (world.getBlockState(new BlockPos(x, y - 2, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR
					&& (world.getBlockState(new BlockPos(x, y - 3, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				world.setBlock(new BlockPos(x, y, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y - 1, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y - 2, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x, y - 3, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
				if ((world.getBlockState(new BlockPos(x, y - 4, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
					world.setBlock(new BlockPos(x, y - 4, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
					if ((world.getBlockState(new BlockPos(x, y - 5, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
						world.setBlock(new BlockPos(x, y - 5, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
						if ((world.getBlockState(new BlockPos(x, y - 6, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
							if (0.8 > Math.random()) {
								world.setBlock(new BlockPos(x, y - 6, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
								if ((world.getBlockState(new BlockPos(x, y - 7, z)))
										.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
									world.setBlock(new BlockPos(x, y - 7, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
									if ((world.getBlockState(new BlockPos(x, y - 8, z)))
											.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
										world.setBlock(new BlockPos(x, y - 8, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(),
												3);
										if ((world.getBlockState(new BlockPos(x, y - 9, z)))
												.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
											world.setBlock(new BlockPos(x, y - 9, z),
													WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
											if ((world.getBlockState(new BlockPos(x, y - 10, z)))
													.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
												if (0.8 > Math.random()) {
													world.setBlock(new BlockPos(x, y - 10, z),
															WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
													if ((world.getBlockState(new BlockPos(x, y - 11, z)))
															.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
														world.setBlock(new BlockPos(x, y - 11, z),
																WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
														if ((world.getBlockState(new BlockPos(x, y - 12, z)))
																.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
															if (0.7 > Math.random()) {
																world.setBlock(new BlockPos(x, y - 12, z),
																		WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
																if ((world.getBlockState(new BlockPos(x, y - 13, z)))
																		.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																	if (0.9 > Math.random()) {
																		world.setBlock(new BlockPos(x, y - 13, z),
																				WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(),
																				3);
																		if ((world.getBlockState(new BlockPos(x, y - 14, z)))
																				.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																			if (0.9 > Math.random()) {
																				world.setBlock(new BlockPos(x, y - 14, z),
																						WildasideModBlocks.HANGING_VIBRION_VINES.get()
																								.defaultBlockState(),
																						3);
																				if ((world.getBlockState(new BlockPos(x, y - 15, z)))
																						.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																					if (0.9 > Math.random()) {
																						world.setBlock(new BlockPos(x, y - 15, z),
																								WildasideModBlocks.HANGING_VIBRION_VINES.get()
																										.defaultBlockState(),
																								3);
																						if ((world.getBlockState(new BlockPos(x, y - 16, z)))
																								.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																							if (0.7 > Math.random()) {
																								world.setBlock(new BlockPos(x, y - 16, z),
																										WildasideModBlocks.HANGING_VIBRION_VINES.get()
																												.defaultBlockState(),
																										3);
																								if ((world.getBlockState(new BlockPos(x, y - 17, z)))
																										.getMaterial() == net.minecraft.world.level.material.Material.AIR) {
																									if (0.7 > Math.random()) {
																										world.setBlock(new BlockPos(x, y - 17, z),
																												WildasideModBlocks.HANGING_VIBRION_VINES
																														.get().defaultBlockState(),
																												3);
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
