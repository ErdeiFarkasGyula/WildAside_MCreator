package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.gyula.wildaside.init.WildasideModMobEffects;

public class VibrionSporeholderEffectGiverProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 800, 1, (false), (true)));
	}
}
