
package net.gyula.wildaside.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.gyula.wildaside.procedures.ImmuneProtectionProcProcedure;

public class ImmuneProtectionMobEffect extends MobEffect {
	public ImmuneProtectionMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3579177);
	}

	@Override
	public String getDescriptionId() {
		return "effect.wildaside.immune_protection";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ImmuneProtectionProcProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
