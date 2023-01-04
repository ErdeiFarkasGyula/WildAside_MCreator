
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
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.gyula.wildaside.block.YellowGlowingHickorySaplingBlock;
import net.gyula.wildaside.block.YellowGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.VibrionSporeholderBlock;
import net.gyula.wildaside.block.VibrionRootsBlock;
import net.gyula.wildaside.block.VibrionGrowthBlock;
import net.gyula.wildaside.block.VibrionGlassPaneBlock;
import net.gyula.wildaside.block.VibrionGlassBlock;
import net.gyula.wildaside.block.VibrionGelBlock;
import net.gyula.wildaside.block.VibrionBlockBlock;
import net.gyula.wildaside.block.SubstiliumTreeGrowerBlock;
import net.gyula.wildaside.block.SubstiliumTrapdoorBlock;
import net.gyula.wildaside.block.SubstiliumTilesBlock;
import net.gyula.wildaside.block.SubstiliumTileWallBlock;
import net.gyula.wildaside.block.SubstiliumTileStairsBlock;
import net.gyula.wildaside.block.SubstiliumTileSlabBlock;
import net.gyula.wildaside.block.SubstiliumTilePressurePlateBlock;
import net.gyula.wildaside.block.SubstiliumTileButtonBlock;
import net.gyula.wildaside.block.SubstiliumStemBlock;
import net.gyula.wildaside.block.SubstiliumStairsBlock;
import net.gyula.wildaside.block.SubstiliumSproutsBlock;
import net.gyula.wildaside.block.SubstiliumSoilBlock;
import net.gyula.wildaside.block.SubstiliumSlabBlock;
import net.gyula.wildaside.block.SubstiliumShroomBlock;
import net.gyula.wildaside.block.SubstiliumPressurePlateBlock;
import net.gyula.wildaside.block.SubstiliumPlanksBlock;
import net.gyula.wildaside.block.SubstiliumFenceGateBlock;
import net.gyula.wildaside.block.SubstiliumFenceBlock;
import net.gyula.wildaside.block.SubstiliumDoorBlock;
import net.gyula.wildaside.block.SubstiliumButtonBlock;
import net.gyula.wildaside.block.SubstiliumBlockBlock;
import net.gyula.wildaside.block.StrippedSubstiliumStemBlock;
import net.gyula.wildaside.block.StrippedSubstiliumBlockBlock;
import net.gyula.wildaside.block.StrippedHickoryLogBlock;
import net.gyula.wildaside.block.StrippedHickoryBlockBlock;
import net.gyula.wildaside.block.SpottedWintergreenBlock;
import net.gyula.wildaside.block.SporeBlasterBlock;
import net.gyula.wildaside.block.SporeAirBlock;
import net.gyula.wildaside.block.SmoothSubstiliumWallBlock;
import net.gyula.wildaside.block.SmoothSubstiliumStairsBlock;
import net.gyula.wildaside.block.SmoothSubstiliumSoilBlock;
import net.gyula.wildaside.block.SmoothSubstiliumSlabBlock;
import net.gyula.wildaside.block.SmoothSubstiliumPressurePlateBlock;
import net.gyula.wildaside.block.SmoothSubstiliumButtonBlock;
import net.gyula.wildaside.block.RedGlowingHickorySaplingBlock;
import net.gyula.wildaside.block.RedGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.PanxterFlowerBlock;
import net.gyula.wildaside.block.OvergrownEntoriumOreBlock;
import net.gyula.wildaside.block.NaturalSporeBlasterBlock;
import net.gyula.wildaside.block.LowerSubstiliumSoilBlock;
import net.gyula.wildaside.block.LitVibrionGlassPaneBlock;
import net.gyula.wildaside.block.LitVibrionGlassBlock;
import net.gyula.wildaside.block.LitVibrionGelBlock;
import net.gyula.wildaside.block.HickoryStairsBlock;
import net.gyula.wildaside.block.HickorySlabBlock;
import net.gyula.wildaside.block.HickorySaplingBlock;
import net.gyula.wildaside.block.HickoryPressurePlateBlock;
import net.gyula.wildaside.block.HickoryPlanksBlock;
import net.gyula.wildaside.block.HickoryLogBlock;
import net.gyula.wildaside.block.HickoryLeavesBlock;
import net.gyula.wildaside.block.HickoryFenceGateBlock;
import net.gyula.wildaside.block.HickoryFenceBlock;
import net.gyula.wildaside.block.HickoryButtonBlock;
import net.gyula.wildaside.block.HickoryBlockBlock;
import net.gyula.wildaside.block.HangingVibrionVinesPlantBlock;
import net.gyula.wildaside.block.HangingVibrionVinesGrowerBlock;
import net.gyula.wildaside.block.HangingVibrionVinesBlock;
import net.gyula.wildaside.block.HangingVibrionGelGrowerBlock;
import net.gyula.wildaside.block.GreenGlowingHickorySaplingBlock;
import net.gyula.wildaside.block.GreenGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.FallenYellowGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.FallenRedGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.FallenHickoryLeavesBlock;
import net.gyula.wildaside.block.FallenGreenGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.FallenBrownGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.EntoriumOreBlock;
import net.gyula.wildaside.block.CompressedSubstiliumSoilBlock;
import net.gyula.wildaside.block.ChiseledSubstiliumSoilBlock;
import net.gyula.wildaside.block.BrownGlowingHickorySaplingBlock;
import net.gyula.wildaside.block.BrownGlowingHickoryLeavesBlock;
import net.gyula.wildaside.block.BioengineerWorkspaceBlock;
import net.gyula.wildaside.WildasideMod;

public class WildasideModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WildasideMod.MODID);
	public static final RegistryObject<Block> VIBRION_BLOCK = REGISTRY.register("vibrion_block", () -> new VibrionBlockBlock());
	public static final RegistryObject<Block> VIBRION_GEL = REGISTRY.register("vibrion_gel", () -> new VibrionGelBlock());
	public static final RegistryObject<Block> LIT_VIBRION_GEL = REGISTRY.register("lit_vibrion_gel", () -> new LitVibrionGelBlock());
	public static final RegistryObject<Block> VIBRION_GLASS = REGISTRY.register("vibrion_glass", () -> new VibrionGlassBlock());
	public static final RegistryObject<Block> LIT_VIBRION_GLASS = REGISTRY.register("lit_vibrion_glass", () -> new LitVibrionGlassBlock());
	public static final RegistryObject<Block> VIBRION_GLASS_PANE = REGISTRY.register("vibrion_glass_pane", () -> new VibrionGlassPaneBlock());
	public static final RegistryObject<Block> LIT_VIBRION_GLASS_PANE = REGISTRY.register("lit_vibrion_glass_pane",
			() -> new LitVibrionGlassPaneBlock());
	public static final RegistryObject<Block> VIBRION_ROOTS = REGISTRY.register("vibrion_roots", () -> new VibrionRootsBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES = REGISTRY.register("hanging_vibrion_vines",
			() -> new HangingVibrionVinesBlock());
	public static final RegistryObject<Block> VIBRION_SPOREHOLDER = REGISTRY.register("vibrion_sporeholder", () -> new VibrionSporeholderBlock());
	public static final RegistryObject<Block> VIBRION_GROWTH = REGISTRY.register("vibrion_growth", () -> new VibrionGrowthBlock());
	public static final RegistryObject<Block> SUBSTILIUM_STEM = REGISTRY.register("substilium_stem", () -> new SubstiliumStemBlock());
	public static final RegistryObject<Block> SUBSTILIUM_BLOCK = REGISTRY.register("substilium_block", () -> new SubstiliumBlockBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SHROOM = REGISTRY.register("substilium_shroom", () -> new SubstiliumShroomBlock());
	public static final RegistryObject<Block> STRIPPED_SUBSTILIUM_STEM = REGISTRY.register("stripped_substilium_stem",
			() -> new StrippedSubstiliumStemBlock());
	public static final RegistryObject<Block> STRIPPED_SUBSTILIUM_BLOCK = REGISTRY.register("stripped_substilium_block",
			() -> new StrippedSubstiliumBlockBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SOIL = REGISTRY.register("substilium_soil", () -> new SubstiliumSoilBlock());
	public static final RegistryObject<Block> OVERGROWN_ENTORIUM_ORE = REGISTRY.register("overgrown_entorium_ore",
			() -> new OvergrownEntoriumOreBlock());
	public static final RegistryObject<Block> ENTORIUM_ORE = REGISTRY.register("entorium_ore", () -> new EntoriumOreBlock());
	public static final RegistryObject<Block> COMPRESSED_SUBSTILIUM_SOIL = REGISTRY.register("compressed_substilium_soil",
			() -> new CompressedSubstiliumSoilBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TILES = REGISTRY.register("substilium_tiles", () -> new SubstiliumTilesBlock());
	public static final RegistryObject<Block> SMOOTH_SUBSTILIUM_SOIL = REGISTRY.register("smooth_substilium_soil",
			() -> new SmoothSubstiliumSoilBlock());
	public static final RegistryObject<Block> CHISELED_SUBSTILIUM_SOIL = REGISTRY.register("chiseled_substilium_soil",
			() -> new ChiseledSubstiliumSoilBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TILE_STAIRS = REGISTRY.register("substilium_tile_stairs",
			() -> new SubstiliumTileStairsBlock());
	public static final RegistryObject<Block> SMOOTH_SUBSTILIUM_STAIRS = REGISTRY.register("smooth_substilium_stairs",
			() -> new SmoothSubstiliumStairsBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TILE_SLAB = REGISTRY.register("substilium_tile_slab", () -> new SubstiliumTileSlabBlock());
	public static final RegistryObject<Block> SMOOTH_SUBSTILIUM_SLAB = REGISTRY.register("smooth_substilium_slab",
			() -> new SmoothSubstiliumSlabBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TILE_WALL = REGISTRY.register("substilium_tile_wall", () -> new SubstiliumTileWallBlock());
	public static final RegistryObject<Block> SMOOTH_SUBSTILIUM_WALL = REGISTRY.register("smooth_substilium_wall",
			() -> new SmoothSubstiliumWallBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TILE_PRESSURE_PLATE = REGISTRY.register("substilium_tile_pressure_plate",
			() -> new SubstiliumTilePressurePlateBlock());
	public static final RegistryObject<Block> SMOOTH_SUBSTILIUM_PRESSURE_PLATE = REGISTRY.register("smooth_substilium_pressure_plate",
			() -> new SmoothSubstiliumPressurePlateBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TILE_BUTTON = REGISTRY.register("substilium_tile_button",
			() -> new SubstiliumTileButtonBlock());
	public static final RegistryObject<Block> SMOOTH_SUBSTILIUM_BUTTON = REGISTRY.register("smooth_substilium_button",
			() -> new SmoothSubstiliumButtonBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SPROUTS = REGISTRY.register("substilium_sprouts", () -> new SubstiliumSproutsBlock());
	public static final RegistryObject<Block> SUBSTILIUM_PLANKS = REGISTRY.register("substilium_planks", () -> new SubstiliumPlanksBlock());
	public static final RegistryObject<Block> SUBSTILIUM_STAIRS = REGISTRY.register("substilium_stairs", () -> new SubstiliumStairsBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SLAB = REGISTRY.register("substilium_slab", () -> new SubstiliumSlabBlock());
	public static final RegistryObject<Block> SUBSTILIUM_FENCE = REGISTRY.register("substilium_fence", () -> new SubstiliumFenceBlock());
	public static final RegistryObject<Block> SUBSTILIUM_FENCE_GATE = REGISTRY.register("substilium_fence_gate",
			() -> new SubstiliumFenceGateBlock());
	public static final RegistryObject<Block> SUBSTILIUM_DOOR = REGISTRY.register("substilium_door", () -> new SubstiliumDoorBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TRAPDOOR = REGISTRY.register("substilium_trapdoor", () -> new SubstiliumTrapdoorBlock());
	public static final RegistryObject<Block> SUBSTILIUM_PRESSURE_PLATE = REGISTRY.register("substilium_pressure_plate",
			() -> new SubstiliumPressurePlateBlock());
	public static final RegistryObject<Block> SUBSTILIUM_BUTTON = REGISTRY.register("substilium_button", () -> new SubstiliumButtonBlock());
	public static final RegistryObject<Block> NATURAL_SPORE_BLASTER = REGISTRY.register("natural_spore_blaster",
			() -> new NaturalSporeBlasterBlock());
	public static final RegistryObject<Block> SPORE_BLASTER = REGISTRY.register("spore_blaster", () -> new SporeBlasterBlock());
	public static final RegistryObject<Block> BIOENGINEER_WORKSPACE = REGISTRY.register("bioengineer_workspace",
			() -> new BioengineerWorkspaceBlock());
	public static final RegistryObject<Block> HICKORY_LOG = REGISTRY.register("hickory_log", () -> new HickoryLogBlock());
	public static final RegistryObject<Block> HICKORY_BLOCK = REGISTRY.register("hickory_block", () -> new HickoryBlockBlock());
	public static final RegistryObject<Block> STRIPPED_HICKORY_LOG = REGISTRY.register("stripped_hickory_log", () -> new StrippedHickoryLogBlock());
	public static final RegistryObject<Block> STRIPPED_HICKORY_BLOCK = REGISTRY.register("stripped_hickory_block",
			() -> new StrippedHickoryBlockBlock());
	public static final RegistryObject<Block> HICKORY_PLANKS = REGISTRY.register("hickory_planks", () -> new HickoryPlanksBlock());
	public static final RegistryObject<Block> HICKORY_STAIRS = REGISTRY.register("hickory_stairs", () -> new HickoryStairsBlock());
	public static final RegistryObject<Block> HICKORY_SLAB = REGISTRY.register("hickory_slab", () -> new HickorySlabBlock());
	public static final RegistryObject<Block> HICKORY_FENCE = REGISTRY.register("hickory_fence", () -> new HickoryFenceBlock());
	public static final RegistryObject<Block> HICKORY_FENCE_GATE = REGISTRY.register("hickory_fence_gate", () -> new HickoryFenceGateBlock());
	public static final RegistryObject<Block> HICKORY_PRESSURE_PLATE = REGISTRY.register("hickory_pressure_plate",
			() -> new HickoryPressurePlateBlock());
	public static final RegistryObject<Block> HICKORY_BUTTON = REGISTRY.register("hickory_button", () -> new HickoryButtonBlock());
	public static final RegistryObject<Block> HICKORY_LEAVES = REGISTRY.register("hickory_leaves", () -> new HickoryLeavesBlock());
	public static final RegistryObject<Block> RED_GLOWING_HICKORY_LEAVES = REGISTRY.register("red_glowing_hickory_leaves",
			() -> new RedGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> YELLOW_GLOWING_HICKORY_LEAVES = REGISTRY.register("yellow_glowing_hickory_leaves",
			() -> new YellowGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> BROWN_GLOWING_HICKORY_LEAVES = REGISTRY.register("brown_glowing_hickory_leaves",
			() -> new BrownGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> GREEN_GLOWING_HICKORY_LEAVES = REGISTRY.register("green_glowing_hickory_leaves",
			() -> new GreenGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> FALLEN_HICKORY_LEAVES = REGISTRY.register("fallen_hickory_leaves",
			() -> new FallenHickoryLeavesBlock());
	public static final RegistryObject<Block> FALLEN_RED_GLOWING_HICKORY_LEAVES = REGISTRY.register("fallen_red_glowing_hickory_leaves",
			() -> new FallenRedGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> FALLEN_YELLOW_GLOWING_HICKORY_LEAVES = REGISTRY.register("fallen_yellow_glowing_hickory_leaves",
			() -> new FallenYellowGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> FALLEN_BROWN_GLOWING_HICKORY_LEAVES = REGISTRY.register("fallen_brown_glowing_hickory_leaves",
			() -> new FallenBrownGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> FALLEN_GREEN_GLOWING_HICKORY_LEAVES = REGISTRY.register("fallen_green_glowing_hickory_leaves",
			() -> new FallenGreenGlowingHickoryLeavesBlock());
	public static final RegistryObject<Block> HICKORY_SAPLING = REGISTRY.register("hickory_sapling", () -> new HickorySaplingBlock());
	public static final RegistryObject<Block> RED_GLOWING_HICKORY_SAPLING = REGISTRY.register("red_glowing_hickory_sapling",
			() -> new RedGlowingHickorySaplingBlock());
	public static final RegistryObject<Block> YELLOW_GLOWING_HICKORY_SAPLING = REGISTRY.register("yellow_glowing_hickory_sapling",
			() -> new YellowGlowingHickorySaplingBlock());
	public static final RegistryObject<Block> BROWN_GLOWING_HICKORY_SAPLING = REGISTRY.register("brown_glowing_hickory_sapling",
			() -> new BrownGlowingHickorySaplingBlock());
	public static final RegistryObject<Block> GREEN_GLOWING_HICKORY_SAPLING = REGISTRY.register("green_glowing_hickory_sapling",
			() -> new GreenGlowingHickorySaplingBlock());
	public static final RegistryObject<Block> PANXTER_FLOWER = REGISTRY.register("panxter_flower", () -> new PanxterFlowerBlock());
	public static final RegistryObject<Block> SPOTTED_WINTERGREEN = REGISTRY.register("spotted_wintergreen", () -> new SpottedWintergreenBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES_PLANT = REGISTRY.register("hanging_vibrion_vines_plant",
			() -> new HangingVibrionVinesPlantBlock());
	public static final RegistryObject<Block> LOWER_SUBSTILIUM_SOIL = REGISTRY.register("lower_substilium_soil",
			() -> new LowerSubstiliumSoilBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES_GROWER = REGISTRY.register("hanging_vibrion_vines_grower",
			() -> new HangingVibrionVinesGrowerBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_GEL_GROWER = REGISTRY.register("hanging_vibrion_gel_grower",
			() -> new HangingVibrionGelGrowerBlock());
	public static final RegistryObject<Block> SUBSTILIUM_TREE_GROWER = REGISTRY.register("substilium_tree_grower",
			() -> new SubstiliumTreeGrowerBlock());
	public static final RegistryObject<Block> SPORE_AIR = REGISTRY.register("spore_air", () -> new SporeAirBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			VibrionGelBlock.registerRenderLayer();
			LitVibrionGelBlock.registerRenderLayer();
			VibrionGlassBlock.registerRenderLayer();
			LitVibrionGlassBlock.registerRenderLayer();
			VibrionGlassPaneBlock.registerRenderLayer();
			LitVibrionGlassPaneBlock.registerRenderLayer();
			VibrionRootsBlock.registerRenderLayer();
			HangingVibrionVinesBlock.registerRenderLayer();
			VibrionSporeholderBlock.registerRenderLayer();
			VibrionGrowthBlock.registerRenderLayer();
			SubstiliumSproutsBlock.registerRenderLayer();
			SubstiliumStairsBlock.registerRenderLayer();
			SubstiliumSlabBlock.registerRenderLayer();
			SubstiliumFenceBlock.registerRenderLayer();
			SubstiliumFenceGateBlock.registerRenderLayer();
			SubstiliumDoorBlock.registerRenderLayer();
			SubstiliumTrapdoorBlock.registerRenderLayer();
			SubstiliumPressurePlateBlock.registerRenderLayer();
			SubstiliumButtonBlock.registerRenderLayer();
			SporeBlasterBlock.registerRenderLayer();
			HickoryFenceBlock.registerRenderLayer();
			HickoryFenceGateBlock.registerRenderLayer();
			HickoryPressurePlateBlock.registerRenderLayer();
			HickoryButtonBlock.registerRenderLayer();
			FallenHickoryLeavesBlock.registerRenderLayer();
			FallenRedGlowingHickoryLeavesBlock.registerRenderLayer();
			FallenYellowGlowingHickoryLeavesBlock.registerRenderLayer();
			FallenBrownGlowingHickoryLeavesBlock.registerRenderLayer();
			FallenGreenGlowingHickoryLeavesBlock.registerRenderLayer();
			HickorySaplingBlock.registerRenderLayer();
			RedGlowingHickorySaplingBlock.registerRenderLayer();
			YellowGlowingHickorySaplingBlock.registerRenderLayer();
			BrownGlowingHickorySaplingBlock.registerRenderLayer();
			GreenGlowingHickorySaplingBlock.registerRenderLayer();
			PanxterFlowerBlock.registerRenderLayer();
			SpottedWintergreenBlock.registerRenderLayer();
			HangingVibrionVinesPlantBlock.registerRenderLayer();
			HangingVibrionGelGrowerBlock.registerRenderLayer();
			SporeAirBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			HickoryLeavesBlock.blockColorLoad(event);
			FallenHickoryLeavesBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			HickoryLeavesBlock.itemColorLoad(event);
			FallenHickoryLeavesBlock.itemColorLoad(event);
		}
	}
}
