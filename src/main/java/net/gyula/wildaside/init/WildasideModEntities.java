
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.gyula.wildaside.entity.VibrionMonsterEntity;
import net.gyula.wildaside.entity.RangedVibrionMonsterEntity;
import net.gyula.wildaside.entity.EntoriumSporebombEntity;
import net.gyula.wildaside.WildasideMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, WildasideMod.MODID);
	public static final RegistryObject<EntityType<VibrionMonsterEntity>> VIBRION_MONSTER = register("vibrion_monster", EntityType.Builder.<VibrionMonsterEntity>of(VibrionMonsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VibrionMonsterEntity::new).fireImmune().sized(1.4000000000000001f, 2.4f));
	public static final RegistryObject<EntityType<EntoriumSporebombEntity>> ENTORIUM_SPOREBOMB = register("projectile_entorium_sporebomb", EntityType.Builder.<EntoriumSporebombEntity>of(EntoriumSporebombEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EntoriumSporebombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RangedVibrionMonsterEntity>> RANGED_VIBRION_MONSTER = register("ranged_vibrion_monster", EntityType.Builder.<RangedVibrionMonsterEntity>of(RangedVibrionMonsterEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RangedVibrionMonsterEntity::new).fireImmune().sized(1.4000000000000001f, 2.4f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
