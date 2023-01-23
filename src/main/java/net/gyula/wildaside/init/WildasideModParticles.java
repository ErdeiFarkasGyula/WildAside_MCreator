
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.client.particle.VibrionParticleParticle;
import net.gyula.wildaside.client.particle.SubstiliumParticleParticle;
import net.gyula.wildaside.client.particle.StillVibrionParticleParticle;
import net.gyula.wildaside.client.particle.StillSubstiliumParticleParticle;
import net.gyula.wildaside.client.particle.EntoriumParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WildasideModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) WildasideModParticleTypes.VIBRION_PARTICLE.get(), VibrionParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) WildasideModParticleTypes.ENTORIUM_PARTICLE.get(), EntoriumParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) WildasideModParticleTypes.SUBSTILIUM_PARTICLE.get(), SubstiliumParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) WildasideModParticleTypes.STILL_SUBSTILIUM_PARTICLE.get(), StillSubstiliumParticleParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) WildasideModParticleTypes.STILL_VIBRION_PARTICLE.get(), StillVibrionParticleParticle::provider);
	}
}
