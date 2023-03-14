package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class OvergrownEntoriumOreClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 3, 7)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.ENTORIUM_PARTICLE.get()), (x + Math.random()), (y + Math.random()), (z + Math.random()), (Mth.nextInt(new Random(), -2, 2) / 100), (Mth.nextInt(new Random(), -2, 2) / 100),
					(Mth.nextInt(new Random(), -2, 2) / 100));
		}
	}
}
