package net.gyula.wildaside.init;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.gyula.wildaside.entity.spawneggs.GeckoLibSpawnEggs;
import net.gyula.wildaside.entity.VibrionMonsterEntity;
import net.gyula.wildaside.entity.RangedVibrionMonsterEntity;
import net.gyula.wildaside.WildasideMod;

@Mod.EventBusSubscriber(modid = WildasideMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModGeckoLibEntities {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			GeckoLibSpawnEggs.REGISTRY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VibrionMonsterEntity.init();
			RangedVibrionMonsterEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(WildasideModEntities.VIBRION_MONSTER.get(), VibrionMonsterEntity.createAttributes().build());
		event.put(WildasideModEntities.RANGED_VIBRION_MONSTER.get(), RangedVibrionMonsterEntity.createAttributes().build());
	}
}
