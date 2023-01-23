package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import net.gyula.wildaside.init.WildasideModMobEffects;

import java.util.Random;

public class VibrionPoisonEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (0.7 > Math.random()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, Mth.nextInt(new Random(), 1, 2), (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, Mth.nextInt(new Random(), 1, 2), (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 60, Mth.nextInt(new Random(), 1, 2), (false), (false)));
		}
	}
}
