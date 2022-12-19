package net.gyula.wildaside.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class HickorySaplingPlantRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean canSaplingBePlaced = false;
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))
						.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
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
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + 1), (y + 1), (z + 1), 0, 0, 0);
				}
				if (!world.isClientSide()) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("WildasideHickorySaplingGrow", Math.random());
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "WildasideHickorySaplingGrow") >= 0.875) {
					if (Math.random() <= 0.3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (Math.random() <= 0.3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.OFF_HAND, true);
				((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))
						.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getCount() - 1));
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
					world.addParticle(ParticleTypes.HAPPY_VILLAGER, (x + 1), (y + 1), (z + 1), 0, 0, 0);
				}
				if (!world.isClientSide()) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("WildasideHickorySaplingGrow", Math.random());
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "WildasideHickorySaplingGrow") >= 0.875) {
					if (Math.random() <= 0.3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (Math.random() <= 0.3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(new ResourceLocation("wildaside", "hickory_tree_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		}
	}
}
