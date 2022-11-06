package net.gyula.wildaside.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

public class VibrionGrowthGrowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (0.025 > Math.random()) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
				if (world.getMaxLocalRawBrightness(new BlockPos(x, y - 1, z)) < 9) {
					world.setBlock(new BlockPos(x, y - 1, z), WildasideModBlocks.VIBRION_GROWTH.get().defaultBlockState(), 3);
					if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.MUTEVIBRIONGROWTHS) == true) {
						if (0.25 > Math.random()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, new BlockPos(x, y, z),
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.mood")),
											SoundSource.AMBIENT, (float) 0.5, (float) 0.8);
								} else {
									_level.playLocalSound(x, y, z,
											ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.mood")),
											SoundSource.AMBIENT, (float) 0.5, (float) 0.8, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
