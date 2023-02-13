package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class SubstiliumSoilClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 1, 2)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.SUBSTILIUM_PARTICLE.get()), (x + Math.random()), (y + Mth.nextInt(new Random(), 0, 30) / 100 + 1), (z + Math.random()), 0, 0.005, 0);
		}
	}
}
