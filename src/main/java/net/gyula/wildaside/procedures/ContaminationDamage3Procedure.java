package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.gyula.wildaside.init.WildasideModMobEffects;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class ContaminationDamage3Procedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) : false) {
			if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() > 0) {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get())
							? _livEnt.getEffect(WildasideModMobEffects.CONTAMINATION.get()).getAmplifier()
							: 0, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			} else {
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
					if (_ist.hurt(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get())
							? _livEnt.getEffect(WildasideModMobEffects.CONTAMINATION.get()).getAmplifier()
							: 0, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
			}
		}
	}
}
