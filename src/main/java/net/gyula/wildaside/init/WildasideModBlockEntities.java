
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.gyula.wildaside.block.entity.YellowGlowingHickorySaplingBlockEntity;
import net.gyula.wildaside.block.entity.SporeAirBlockEntity;
import net.gyula.wildaside.block.entity.RedGlowingHickorySaplingBlockEntity;
import net.gyula.wildaside.block.entity.HickorySaplingBlockEntity;
import net.gyula.wildaside.block.entity.GreenGlowingHickorySaplingBlockEntity;
import net.gyula.wildaside.block.entity.BrownGlowingHickorySaplingBlockEntity;
import net.gyula.wildaside.block.entity.BioengineerWorkspaceBlockEntity;
import net.gyula.wildaside.WildasideMod;

public class WildasideModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, WildasideMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BIOENGINEER_WORKSPACE = register("bioengineer_workspace",
			WildasideModBlocks.BIOENGINEER_WORKSPACE, BioengineerWorkspaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> HICKORY_SAPLING = register("hickory_sapling", WildasideModBlocks.HICKORY_SAPLING,
			HickorySaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RED_GLOWING_HICKORY_SAPLING = register("red_glowing_hickory_sapling",
			WildasideModBlocks.RED_GLOWING_HICKORY_SAPLING, RedGlowingHickorySaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> YELLOW_GLOWING_HICKORY_SAPLING = register("yellow_glowing_hickory_sapling",
			WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING, YellowGlowingHickorySaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BROWN_GLOWING_HICKORY_SAPLING = register("brown_glowing_hickory_sapling",
			WildasideModBlocks.BROWN_GLOWING_HICKORY_SAPLING, BrownGlowingHickorySaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GREEN_GLOWING_HICKORY_SAPLING = register("green_glowing_hickory_sapling",
			WildasideModBlocks.GREEN_GLOWING_HICKORY_SAPLING, GreenGlowingHickorySaplingBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPORE_AIR = register("spore_air", WildasideModBlocks.SPORE_AIR, SporeAirBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
