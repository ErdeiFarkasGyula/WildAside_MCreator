package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.gyula.wildaside.init.WildasideModMobEffects;

public class EntoriumPillEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (0.6 >= Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 0, (false), (true)));
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.IMMUNE_PROTECTION.get(), 500, 0, (false), (true)));
	}
}
