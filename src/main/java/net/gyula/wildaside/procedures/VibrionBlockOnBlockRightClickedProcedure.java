package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

public class VibrionBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), (x + 0.5), y, (z + 0.5), 10, (-0.2), 0.4, 0.2, 0.1);
	}
}
