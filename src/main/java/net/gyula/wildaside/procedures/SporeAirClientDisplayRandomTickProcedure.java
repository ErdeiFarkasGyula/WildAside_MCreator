package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class SporeAirClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 20, 30)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.STILL_VIBRION_PARTICLE.get()),
					(x + Mth.nextInt(new Random(), -10, 10) / 10), (y + Mth.nextInt(new Random(), -10, 10) / 10),
					(z + Mth.nextInt(new Random(), -10, 10) / 10), 0, 0, 0);
		}
	}
}
