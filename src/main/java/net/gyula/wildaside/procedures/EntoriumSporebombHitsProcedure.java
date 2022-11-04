package net.gyula.wildaside.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;
import net.gyula.wildaside.init.WildasideModMobEffects;

import java.util.Random;

public class EntoriumSporebombHitsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.IMMUNE_PROTECTION.get(), 20, 1, (false), (false)));
		for (int index0 = 0; index0 < (int) (Mth.nextInt(new Random(), 3, 8)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), x, y, z, 0, 0, 0);
		}
		class EntoriumSporebombHitsWait4 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(EntoriumSporebombHitsWait4.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					EntoriumSporebombHitsWait4.this.ticks += 1;
					if (EntoriumSporebombHitsWait4.this.ticks >= EntoriumSporebombHitsWait4.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(EntoriumSporebombHitsWait4.this);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 600, 2, (false), (true)));
			}
		}
		new EntoriumSporebombHitsWait4().start(world, 5);
	}
}
