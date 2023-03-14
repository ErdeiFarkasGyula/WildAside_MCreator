
package net.gyula.wildaside.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.gyula.wildaside.init.WildasideModTabs;

public class GreenGlowingEssenceItem extends Item {
	public GreenGlowingEssenceItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
