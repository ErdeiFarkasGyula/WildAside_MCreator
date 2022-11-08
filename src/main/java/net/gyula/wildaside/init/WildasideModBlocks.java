
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.gyula.wildaside.block.VibrionSporeholderBlock;
import net.gyula.wildaside.block.VibrionRootsBlock;
import net.gyula.wildaside.block.VibrionGrowthBlock;
import net.gyula.wildaside.block.VibrionGelBlock;
import net.gyula.wildaside.block.VibrionBlockBlock;
import net.gyula.wildaside.block.SubstiliumStemBlock;
import net.gyula.wildaside.block.SubstiliumSproutsBlock;
import net.gyula.wildaside.block.SubstiliumSoilBlock;
import net.gyula.wildaside.block.SubstiliumShroomBlock;
import net.gyula.wildaside.block.SubstiliumBlockBlock;
import net.gyula.wildaside.block.OvergrownEntoriumOreBlock;
import net.gyula.wildaside.block.LowerSubstiliumSoilBlock;
import net.gyula.wildaside.block.LitVibrionGelBlock;
import net.gyula.wildaside.block.HangingVibrionVinesPlantBlock;
import net.gyula.wildaside.block.HangingVibrionVinesGrowerBlock;
import net.gyula.wildaside.block.HangingVibrionVinesBlock;
import net.gyula.wildaside.block.HangingVibrionGelGrowerBlock;
import net.gyula.wildaside.block.EntoriumOreBlock;
import net.gyula.wildaside.WildasideMod;

public class WildasideModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WildasideMod.MODID);
	public static final RegistryObject<Block> VIBRION_BLOCK = REGISTRY.register("vibrion_block", () -> new VibrionBlockBlock());
	public static final RegistryObject<Block> VIBRION_GEL = REGISTRY.register("vibrion_gel", () -> new VibrionGelBlock());
	public static final RegistryObject<Block> LIT_VIBRION_GEL = REGISTRY.register("lit_vibrion_gel", () -> new LitVibrionGelBlock());
	public static final RegistryObject<Block> VIBRION_ROOTS = REGISTRY.register("vibrion_roots", () -> new VibrionRootsBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES = REGISTRY.register("hanging_vibrion_vines",
			() -> new HangingVibrionVinesBlock());
	public static final RegistryObject<Block> VIBRION_SPOREHOLDER = REGISTRY.register("vibrion_sporeholder", () -> new VibrionSporeholderBlock());
	public static final RegistryObject<Block> VIBRION_GROWTH = REGISTRY.register("vibrion_growth", () -> new VibrionGrowthBlock());
	public static final RegistryObject<Block> SUBSTILIUM_STEM = REGISTRY.register("substilium_stem", () -> new SubstiliumStemBlock());
	public static final RegistryObject<Block> SUBSTILIUM_BLOCK = REGISTRY.register("substilium_block", () -> new SubstiliumBlockBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SHROOM = REGISTRY.register("substilium_shroom", () -> new SubstiliumShroomBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SOIL = REGISTRY.register("substilium_soil", () -> new SubstiliumSoilBlock());
	public static final RegistryObject<Block> OVERGROWN_ENTORIUM_ORE = REGISTRY.register("overgrown_entorium_ore",
			() -> new OvergrownEntoriumOreBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SPROUTS = REGISTRY.register("substilium_sprouts", () -> new SubstiliumSproutsBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES_PLANT = REGISTRY.register("hanging_vibrion_vines_plant",
			() -> new HangingVibrionVinesPlantBlock());
	public static final RegistryObject<Block> LOWER_SUBSTILIUM_SOIL = REGISTRY.register("lower_substilium_soil",
			() -> new LowerSubstiliumSoilBlock());
	public static final RegistryObject<Block> ENTORIUM_ORE = REGISTRY.register("entorium_ore", () -> new EntoriumOreBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES_GROWER = REGISTRY.register("hanging_vibrion_vines_grower",
			() -> new HangingVibrionVinesGrowerBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_GEL_GROWER = REGISTRY.register("hanging_vibrion_gel_grower",
			() -> new HangingVibrionGelGrowerBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VibrionGelBlock.registerRenderLayer();
			LitVibrionGelBlock.registerRenderLayer();
			VibrionRootsBlock.registerRenderLayer();
			HangingVibrionVinesBlock.registerRenderLayer();
			VibrionSporeholderBlock.registerRenderLayer();
			VibrionGrowthBlock.registerRenderLayer();
			SubstiliumSproutsBlock.registerRenderLayer();
			HangingVibrionVinesPlantBlock.registerRenderLayer();
			HangingVibrionGelGrowerBlock.registerRenderLayer();
		}
	}
}
