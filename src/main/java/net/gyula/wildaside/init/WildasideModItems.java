
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

import net.gyula.wildaside.WildasideMod;

public class WildasideModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WildasideMod.MODID);
	public static final RegistryObject<Item> VIBRION_BLOCK = block(WildasideModBlocks.VIBRION_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
