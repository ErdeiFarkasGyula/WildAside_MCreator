
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class WildasideModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == WildasideModBlocks.HICKORY_SAPLING.get().asItem())
			event.setBurnTime(100);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_LOG.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_BLOCK.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_PLANKS.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_STAIRS.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_SLAB.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_FENCE.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_FENCE_GATE.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.HICKORY_BUTTON.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.STRIPPED_HICKORY_LOG.get().asItem())
			event.setBurnTime(600);
		else if (itemstack.getItem() == WildasideModBlocks.STRIPPED_HICKORY_BLOCK.get().asItem())
			event.setBurnTime(600);
	}
}
