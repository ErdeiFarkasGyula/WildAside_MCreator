
package net.gyula.wildaside.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.gyula.wildaside.init.WildasideModTabs;

public class CrackedHickoryNutItem extends Item {
	public CrackedHickoryNutItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f)

						.build()));
	}
}
