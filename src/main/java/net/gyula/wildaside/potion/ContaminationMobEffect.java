
package net.gyula.wildaside.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.gyula.wildaside.procedures.ContaminationEffectStartedProcedure;

public class ContaminationMobEffect extends MobEffect {
	public ContaminationMobEffect() {
		super(MobEffectCategory.HARMFUL, -6184663);
	}

	@Override
	public String getDescriptionId() {
		return "effect.wildaside.contamination";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		ContaminationEffectStartedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
