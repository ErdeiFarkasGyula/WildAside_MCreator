
package net.gyula.wildaside.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.gyula.wildaside.procedures.EntoriumSporebombUsedProcedure;
import net.gyula.wildaside.init.WildasideModTabs;
import net.gyula.wildaside.entity.EntoriumSporebombEntity;

public class EntoriumSporebombItem extends Item {
	public EntoriumSporebombItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILD_ASIDE_TAB).stacksTo(8));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				EntoriumSporebombEntity entityarrow = EntoriumSporebombEntity.shoot(world, entity, world.getRandom(), 0.8f, 0, 1);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;

				EntoriumSporebombUsedProcedure.execute(entity, itemstack);
			}
		}
	}
}
