
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.gyula.wildaside.client.renderer.VibrionMonsterRenderer;
import net.gyula.wildaside.client.renderer.RangedVibrionMonsterRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WildasideModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WildasideModEntities.VIBRION_MONSTER.get(), VibrionMonsterRenderer::new);
		event.registerEntityRenderer(WildasideModEntities.RANGED_VIBRION_MONSTER.get(), RangedVibrionMonsterRenderer::new);
		event.registerEntityRenderer(WildasideModEntities.ENTORIUM_SPOREBOMB.get(), ThrownItemRenderer::new);
	}
}
