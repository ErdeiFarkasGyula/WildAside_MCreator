package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.gyula.wildaside.init.WildasideModParticleTypes;
import net.gyula.wildaside.init.WildasideModMobEffects;

import java.util.Random;
import java.util.Iterator;

public class EntoriumSporebombHitsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 3, 8)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), (x + Math.random()), (y + Math.random()),
					(z + Math.random()), 0, 0, 0);
		}
		if (sourceentity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("wildaside:dangerous_warfare"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemainingCriteria().iterator();
				while (_iterator.hasNext())
					_player.getAdvancements().award(_adv, (String) _iterator.next());
			}
		}
		if (!(entity == sourceentity)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 600, 2, (false), (true)));
		}
	}
}
