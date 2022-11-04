
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

import net.gyula.wildaside.block.VibrionBlockBlock;
import net.gyula.wildaside.block.SubstiliumStemBlock;
import net.gyula.wildaside.block.SubstiliumShroomBlock;
import net.gyula.wildaside.block.SubstiliumBlockBlock;
import net.gyula.wildaside.block.HangingVibrionVinesPlantBlock;
import net.gyula.wildaside.block.HangingVibrionVinesBlock;
import net.gyula.wildaside.WildasideMod;

public class WildasideModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WildasideMod.MODID);
	public static final RegistryObject<Block> VIBRION_BLOCK = REGISTRY.register("vibrion_block", () -> new VibrionBlockBlock());
	public static final RegistryObject<Block> SUBSTILIUM_STEM = REGISTRY.register("substilium_stem", () -> new SubstiliumStemBlock());
	public static final RegistryObject<Block> SUBSTILIUM_BLOCK = REGISTRY.register("substilium_block", () -> new SubstiliumBlockBlock());
	public static final RegistryObject<Block> SUBSTILIUM_SHROOM = REGISTRY.register("substilium_shroom", () -> new SubstiliumShroomBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES_PLANT = REGISTRY.register("hanging_vibrion_vines_plant",
			() -> new HangingVibrionVinesPlantBlock());
	public static final RegistryObject<Block> HANGING_VIBRION_VINES = REGISTRY.register("hanging_vibrion_vines",
			() -> new HangingVibrionVinesBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			HangingVibrionVinesPlantBlock.registerRenderLayer();
			HangingVibrionVinesBlock.registerRenderLayer();
		}
	}
}
