package net.gyula.wildaside.entity.spawneggs;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.gyula.wildaside.init.WildasideModTabs;
import net.gyula.wildaside.init.WildasideModEntities;
import net.gyula.wildaside.WildasideMod;

public class GeckoLibSpawnEggs {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WildasideMod.MODID);

	public static final RegistryObject<Item> VIBRION_MONSTER = REGISTRY.register("vibrion_monster_spawn_egg",
			() -> new ForgeSpawnEggItem(WildasideModEntities.VIBRION_MONSTER, -329728, -10155038, new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB)));
	public static final RegistryObject<Item> RANGED_VIBRION_MONSTER = REGISTRY.register("ranged_vibrion_monster_spawn_egg",
			() -> new ForgeSpawnEggItem(WildasideModEntities.RANGED_VIBRION_MONSTER, -10155038, -329728, new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB)));
}
