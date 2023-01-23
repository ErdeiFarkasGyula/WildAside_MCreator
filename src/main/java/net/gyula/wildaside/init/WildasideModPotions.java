
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.gyula.wildaside.WildasideMod;

public class WildasideModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, WildasideMod.MODID);
	public static final RegistryObject<Potion> CONTAMINATION_ITEM = REGISTRY.register("contamination_item", () -> new Potion(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 1200, 0, false, true)));
	public static final RegistryObject<Potion> IMMUNE_PORTECTION_ITEM = REGISTRY.register("immune_portection_item", () -> new Potion(new MobEffectInstance(WildasideModMobEffects.IMMUNE_PROTECTION.get(), 240, 0, false, true)));
}
