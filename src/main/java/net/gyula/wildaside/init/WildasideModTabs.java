
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WildasideModTabs {
	public static CreativeModeTab TAB_WILD_ASIDE_TAB;

	public static void load() {
		TAB_WILD_ASIDE_TAB = new CreativeModeTab("tabwild_aside_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WildasideModBlocks.VIBRION_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
