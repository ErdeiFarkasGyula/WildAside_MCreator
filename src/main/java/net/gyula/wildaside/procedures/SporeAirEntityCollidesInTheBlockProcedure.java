package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.gyula.wildaside.init.WildasideModMobEffects;

import java.util.Random;

public class SporeAirEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("wildaside:is_immune_to_contamination")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), Mth.nextInt(new Random(), 300, 700), Mth.nextInt(new Random(), 2, 3), (false), (true)));
		}
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("wildaside:is_contamination_beneficial")))) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, Mth.nextInt(new Random(), 300, 700), Mth.nextInt(new Random(), 0, 1), (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(new Random(), 300, 700), Mth.nextInt(new Random(), 0, 1), (false), (false)));
		}
	}
}
