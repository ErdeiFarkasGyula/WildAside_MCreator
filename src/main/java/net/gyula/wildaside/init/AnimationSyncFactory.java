package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.gyula.wildaside.entity.VibrionMonsterEntity;
import net.gyula.wildaside.entity.RangedVibrionMonsterEntity;

@Mod.EventBusSubscriber
public class AnimationSyncFactory {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		if (event != null && event.getEntity() != null) {
			if (event.getEntity() instanceof VibrionMonsterEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
			if (event.getEntity() instanceof RangedVibrionMonsterEntity syncable) {
				String animation = syncable.getSyncedAnimation();
				if (!animation.equals("undefined")) {
					syncable.setAnimation("undefined");
					syncable.animationprocedure = animation;
				}
			}
		}
	}
}
