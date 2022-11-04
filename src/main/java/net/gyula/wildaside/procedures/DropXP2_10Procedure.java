package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.util.Mth;

import java.util.Random;

public class DropXP2_10Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, Mth.nextInt(new Random(), 2, 10)));
	}
}
