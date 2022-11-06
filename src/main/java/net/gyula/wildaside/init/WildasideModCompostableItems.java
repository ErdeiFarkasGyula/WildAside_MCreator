
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(WildasideModItems.VIBRION.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_BLOCK.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.SUBSTILIUM_SHROOM.get().asItem(), 0.4f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.HANGING_VIBRION_VINES.get().asItem(), 0.15f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_SPOREHOLDER.get().asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_GEL.get().asItem(), 0.85f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.LIT_VIBRION_GEL.get().asItem(), 0.85f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_ROOTS.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.SUBSTILIUM_SPROUTS.get().asItem(), 0.5f);
	}
}
