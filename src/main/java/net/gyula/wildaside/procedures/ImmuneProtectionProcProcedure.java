package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.gyula.wildaside.init.WildasideModMobEffects;

public class ImmuneProtectionProcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WildasideModMobEffects.CONTAMINATION.get());
		}
	}
}
