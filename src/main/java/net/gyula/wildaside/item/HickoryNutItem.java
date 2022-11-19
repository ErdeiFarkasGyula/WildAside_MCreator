
package net.gyula.wildaside.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.gyula.wildaside.init.WildasideModTabs;

public class HickoryNutItem extends Item {
	public HickoryNutItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
