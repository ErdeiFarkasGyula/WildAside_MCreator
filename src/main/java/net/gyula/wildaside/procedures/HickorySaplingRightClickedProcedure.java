package net.gyula.wildaside.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.init.WildasideModBlocks;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class HickorySaplingRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("wildaside:glowing_hickory_saplings")))) {
			if (world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					if (!(new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity))) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setCount(
								(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")), SoundSource.NEUTRAL, 1,
									(float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")),
									SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
					for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 3, 10)); index0++) {
						world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + Math.random()), (y + Math.random()), (z + Math.random()), 0, 0, 0);
					}
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.HICKORY_SAPLING.get()) {
						if (Math.random() >= 0.9) {
							if (Math.random() <= 0.3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_1"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else if (Math.random() <= 0.3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_2"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_3"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.RED_GLOWING_HICKORY_SAPLING.get()) {
							if (Math.random() >= 0.93) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "red_glowing_hickory_tree"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING.get()) {
								if (Math.random() >= 0.93) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager()
												.getOrCreate(new ResourceLocation("wildaside", "yellow_glowing_hickory_tree"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
															.setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.BROWN_GLOWING_HICKORY_SAPLING
										.get()) {
									if (Math.random() >= 0.93) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager()
													.getOrCreate(new ResourceLocation("wildaside", "brown_glowing_hickory_tree"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
																.setIgnoreEntities(false),
														_serverworld.random, 3);
											}
										}
									}
								} else {
									if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.GREEN_GLOWING_HICKORY_SAPLING
											.get()) {
										if (Math.random() >= 0.93) {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager()
														.getOrCreate(new ResourceLocation("wildaside", "green_glowing_hickory_tree"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
															new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
																	.setIgnoreEntities(false),
															_serverworld.random, 3);
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.OFF_HAND, true);
					if (!(new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity))) {
						((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).setCount(
								(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() - 1));
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")), SoundSource.NEUTRAL, 1,
									(float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bone_meal.use")),
									SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
					for (int index1 = 0; index1 < (int) (Mth.nextInt(new Random(), 3, 10)); index1++) {
						world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + Math.random()), (y + Math.random()), (z + Math.random()), 0, 0, 0);
					}
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.HICKORY_SAPLING.get()) {
						if (Math.random() >= 0.9) {
							if (Math.random() <= 0.3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_1"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else if (Math.random() <= 0.3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_2"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_3"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.RED_GLOWING_HICKORY_SAPLING.get()) {
							if (Math.random() >= 0.93) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager()
											.getOrCreate(new ResourceLocation("wildaside", "red_glowing_hickory_tree"));
									if (template != null) {
										template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
														.setIgnoreEntities(false),
												_serverworld.random, 3);
									}
								}
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING.get()) {
								if (Math.random() >= 0.93) {
									if (world instanceof ServerLevel _serverworld) {
										StructureTemplate template = _serverworld.getStructureManager()
												.getOrCreate(new ResourceLocation("wildaside", "yellow_glowing_hickory_tree"));
										if (template != null) {
											template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
															.setIgnoreEntities(false),
													_serverworld.random, 3);
										}
									}
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.BROWN_GLOWING_HICKORY_SAPLING
										.get()) {
									if (Math.random() >= 0.93) {
										if (world instanceof ServerLevel _serverworld) {
											StructureTemplate template = _serverworld.getStructureManager()
													.getOrCreate(new ResourceLocation("wildaside", "brown_glowing_hickory_tree"));
											if (template != null) {
												template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
														new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
																.setIgnoreEntities(false),
														_serverworld.random, 3);
											}
										}
									}
								} else {
									if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.GREEN_GLOWING_HICKORY_SAPLING
											.get()) {
										if (Math.random() >= 0.93) {
											if (world instanceof ServerLevel _serverworld) {
												StructureTemplate template = _serverworld.getStructureManager()
														.getOrCreate(new ResourceLocation("wildaside", "green_glowing_hickory_tree"));
												if (template != null) {
													template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
															new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE)
																	.setIgnoreEntities(false),
															_serverworld.random, 3);
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
