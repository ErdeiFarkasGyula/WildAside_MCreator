
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.gyula.wildaside.item.VibrionItem;
import net.gyula.wildaside.item.HickoryNutItem;
import net.gyula.wildaside.item.EntoriumSporebombItem;
import net.gyula.wildaside.item.EntoriumPillItem;
import net.gyula.wildaside.item.EntoriumItem;
import net.gyula.wildaside.item.EntoriumGauntletItem;
import net.gyula.wildaside.WildasideMod;

public class WildasideModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WildasideMod.MODID);
	public static final RegistryObject<Item> VIBRION = REGISTRY.register("vibrion", () -> new VibrionItem());
	public static final RegistryObject<Item> VIBRION_BLOCK = block(WildasideModBlocks.VIBRION_BLOCK, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GEL = block(WildasideModBlocks.VIBRION_GEL, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> LIT_VIBRION_GEL = block(WildasideModBlocks.LIT_VIBRION_GEL, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GLASS = block(WildasideModBlocks.VIBRION_GLASS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> LIT_VIBRION_GLASS = block(WildasideModBlocks.LIT_VIBRION_GLASS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GLASS_PANE = block(WildasideModBlocks.VIBRION_GLASS_PANE, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> LIT_VIBRION_GLASS_PANE = block(WildasideModBlocks.LIT_VIBRION_GLASS_PANE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_ROOTS = block(WildasideModBlocks.VIBRION_ROOTS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HANGING_VIBRION_VINES = block(WildasideModBlocks.HANGING_VIBRION_VINES,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_SPOREHOLDER = block(WildasideModBlocks.VIBRION_SPOREHOLDER, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GROWTH = block(WildasideModBlocks.VIBRION_GROWTH, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> ENTORIUM = REGISTRY.register("entorium", () -> new EntoriumItem());
	public static final RegistryObject<Item> ENTORIUM_PILL = REGISTRY.register("entorium_pill", () -> new EntoriumPillItem());
	public static final RegistryObject<Item> ENTORIUM_SPOREBOMB = REGISTRY.register("entorium_sporebomb", () -> new EntoriumSporebombItem());
	public static final RegistryObject<Item> ENTORIUM_GAUNTLET_CHESTPLATE = REGISTRY.register("entorium_gauntlet_chestplate",
			() -> new EntoriumGauntletItem.Chestplate());
	public static final RegistryObject<Item> SUBSTILIUM_STEM = block(WildasideModBlocks.SUBSTILIUM_STEM, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_BLOCK = block(WildasideModBlocks.SUBSTILIUM_BLOCK, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_SUBSTILIUM_STEM = block(WildasideModBlocks.STRIPPED_SUBSTILIUM_STEM,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_SUBSTILIUM_BLOCK = block(WildasideModBlocks.STRIPPED_SUBSTILIUM_BLOCK,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SHROOM = block(WildasideModBlocks.SUBSTILIUM_SHROOM, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL = block(WildasideModBlocks.SUBSTILIUM_SOIL, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> OVERGROWN_ENTORIUM_ORE = block(WildasideModBlocks.OVERGROWN_ENTORIUM_ORE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> ENTORIUM_ORE = block(WildasideModBlocks.ENTORIUM_ORE, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> COMPRESSED_SUBSTILIUM_SOIL = block(WildasideModBlocks.COMPRESSED_SUBSTILIUM_SOIL,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_TILES = block(WildasideModBlocks.SUBSTILIUM_TILES, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> CHISELED_SUBSTILIUM_SOIL = block(WildasideModBlocks.CHISELED_SUBSTILIUM_SOIL,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SPROUTS = block(WildasideModBlocks.SUBSTILIUM_SPROUTS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_PLANKS = block(WildasideModBlocks.SUBSTILIUM_PLANKS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_STAIRS = block(WildasideModBlocks.SUBSTILIUM_STAIRS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SLAB = block(WildasideModBlocks.SUBSTILIUM_SLAB, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_FENCE = block(WildasideModBlocks.SUBSTILIUM_FENCE, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_FENCE_GATE = block(WildasideModBlocks.SUBSTILIUM_FENCE_GATE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_DOOR = doubleBlock(WildasideModBlocks.SUBSTILIUM_DOOR, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_TRAPDOOR = block(WildasideModBlocks.SUBSTILIUM_TRAPDOOR, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_PRESSURE_PLATE = block(WildasideModBlocks.SUBSTILIUM_PRESSURE_PLATE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_BUTTON = block(WildasideModBlocks.SUBSTILIUM_BUTTON, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SPORE_BLASTER = block(WildasideModBlocks.SPORE_BLASTER, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> NATURAL_SPORE_BLASTER = block(WildasideModBlocks.NATURAL_SPORE_BLASTER,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> BIOENGINEER_WORKSPACE = block(WildasideModBlocks.BIOENGINEER_WORKSPACE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_LOG = block(WildasideModBlocks.HICKORY_LOG, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_BLOCK = block(WildasideModBlocks.HICKORY_BLOCK, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_HICKORY_LOG = block(WildasideModBlocks.STRIPPED_HICKORY_LOG,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_HICKORY_BLOCK = block(WildasideModBlocks.STRIPPED_HICKORY_BLOCK,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_PLANKS = block(WildasideModBlocks.HICKORY_PLANKS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_STAIRS = block(WildasideModBlocks.HICKORY_STAIRS, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_SLAB = block(WildasideModBlocks.HICKORY_SLAB, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_FENCE = block(WildasideModBlocks.HICKORY_FENCE, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_FENCE_GATE = block(WildasideModBlocks.HICKORY_FENCE_GATE, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_PRESSURE_PLATE = block(WildasideModBlocks.HICKORY_PRESSURE_PLATE,
			WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_BUTTON = block(WildasideModBlocks.HICKORY_BUTTON, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_LEAVES = block(WildasideModBlocks.HICKORY_LEAVES, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_SAPLING = block(WildasideModBlocks.HICKORY_SAPLING, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_NUT = REGISTRY.register("hickory_nut", () -> new HickoryNutItem());
	public static final RegistryObject<Item> HANGING_VIBRION_VINES_PLANT = block(WildasideModBlocks.HANGING_VIBRION_VINES_PLANT, null);
	public static final RegistryObject<Item> LOWER_SUBSTILIUM_SOIL = block(WildasideModBlocks.LOWER_SUBSTILIUM_SOIL, null);
	public static final RegistryObject<Item> HANGING_VIBRION_VINES_GROWER = block(WildasideModBlocks.HANGING_VIBRION_VINES_GROWER, null);
	public static final RegistryObject<Item> HANGING_VIBRION_GEL_GROWER = block(WildasideModBlocks.HANGING_VIBRION_GEL_GROWER, null);
	public static final RegistryObject<Item> SUBSTILIUM_TREE_GROWER = block(WildasideModBlocks.SUBSTILIUM_TREE_GROWER, null);
	public static final RegistryObject<Item> SPORE_AIR = block(WildasideModBlocks.SPORE_AIR, null);
	public static final RegistryObject<Item> PANXTER_FLOWER = block(WildasideModBlocks.PANXTER_FLOWER, WildasideModTabs.TAB_WILD_ASIDE_TAB);
	public static final RegistryObject<Item> SPOTTED_WINTERGREEN = block(WildasideModBlocks.SPOTTED_WINTERGREEN, WildasideModTabs.TAB_WILD_ASIDE_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
