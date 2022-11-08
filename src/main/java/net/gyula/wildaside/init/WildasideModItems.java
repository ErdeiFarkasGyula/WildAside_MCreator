
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.gyula.wildaside.item.VibrionItem;
import net.gyula.wildaside.item.EntoriumSporebombItem;
import net.gyula.wildaside.item.EntoriumPillItem;
import net.gyula.wildaside.item.EntoriumItem;
import net.gyula.wildaside.WildasideMod;

public class WildasideModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WildasideMod.MODID);
	public static final RegistryObject<Item> VIBRION = REGISTRY.register("vibrion", () -> new VibrionItem());
	public static final RegistryObject<Item> VIBRION_BLOCK = block(WildasideModBlocks.VIBRION_BLOCK, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GEL = block(WildasideModBlocks.VIBRION_GEL, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> LIT_VIBRION_GEL = block(WildasideModBlocks.LIT_VIBRION_GEL, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_ROOTS = block(WildasideModBlocks.VIBRION_ROOTS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HANGING_VIBRION_VINES = block(WildasideModBlocks.HANGING_VIBRION_VINES,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_SPOREHOLDER = block(WildasideModBlocks.VIBRION_SPOREHOLDER, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GROWTH = block(WildasideModBlocks.VIBRION_GROWTH, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_STEM = block(WildasideModBlocks.SUBSTILIUM_STEM, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_BLOCK = block(WildasideModBlocks.SUBSTILIUM_BLOCK, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SHROOM = block(WildasideModBlocks.SUBSTILIUM_SHROOM, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL = block(WildasideModBlocks.SUBSTILIUM_SOIL, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> OVERGROWN_ENTORIUM_ORE = block(WildasideModBlocks.OVERGROWN_ENTORIUM_ORE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SPROUTS = block(WildasideModBlocks.SUBSTILIUM_SPROUTS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> ENTORIUM = REGISTRY.register("entorium", () -> new EntoriumItem());
	public static final RegistryObject<Item> ENTORIUM_PILL = REGISTRY.register("entorium_pill", () -> new EntoriumPillItem());
	public static final RegistryObject<Item> ENTORIUM_SPOREBOMB = REGISTRY.register("entorium_sporebomb", () -> new EntoriumSporebombItem());
	public static final RegistryObject<Item> HANGING_VIBRION_VINES_PLANT = block(WildasideModBlocks.HANGING_VIBRION_VINES_PLANT, null);
	public static final RegistryObject<Item> LOWER_SUBSTILIUM_SOIL = block(WildasideModBlocks.LOWER_SUBSTILIUM_SOIL, null);
	public static final RegistryObject<Item> ENTORIUM_ORE = block(WildasideModBlocks.ENTORIUM_ORE, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HANGING_VIBRION_VINES_GROWER = block(WildasideModBlocks.HANGING_VIBRION_VINES_GROWER, null);
	public static final RegistryObject<Item> HANGING_VIBRION_GEL_GROWER = block(WildasideModBlocks.HANGING_VIBRION_GEL_GROWER, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
