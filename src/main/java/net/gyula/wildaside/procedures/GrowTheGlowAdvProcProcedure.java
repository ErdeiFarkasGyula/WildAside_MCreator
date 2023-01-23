package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.gyula.wildaside.network.WildasideModVariables;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class GrowTheGlowAdvProcProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
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
		if ((entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).redGlowingHickorySapling == true
				&& (entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).yellowGlowingHickorySapling == true
				&& (entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).brownGlowingHickorySapling == true
				&& (entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).greenGlowingHickorySapling == true) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("wildaside:grow_the_glow"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
