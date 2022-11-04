package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class EntoriumSporebombFlyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 1, 3)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), x, y, z, 0, 0, 0);
		}
	}
}
