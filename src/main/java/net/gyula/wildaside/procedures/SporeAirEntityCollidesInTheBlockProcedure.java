package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import net.gyula.wildaside.init.WildasideModMobEffects;

import java.util.Random;

public class SporeAirEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(
					new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 800, Mth.nextInt(new Random(), 2, 3), (false), (false)));
	}
}
