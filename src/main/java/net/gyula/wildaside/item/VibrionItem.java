
package net.gyula.wildaside.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.gyula.wildaside.procedures.VibrionPoisonEffectProcedure;
import net.gyula.wildaside.init.WildasideModTabs;

public class VibrionItem extends Item {
	public VibrionItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.1f).alwaysEat()

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VibrionPoisonEffectProcedure.execute(entity);
		return retval;
	}
}
