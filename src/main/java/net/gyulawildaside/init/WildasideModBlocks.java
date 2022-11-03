
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyulawildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.gyulawildaside.block.VibrionBlockBlock;
import net.gyulawildaside.WildasideMod;

public class WildasideModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WildasideMod.MODID);
	public static final RegistryObject<Block> VIBRION_BLOCK = REGISTRY.register("vibrion_block", () -> new VibrionBlockBlock());
}
