package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.gyula.wildaside.init.WildasideModItems;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class CreateButtonClickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double loop1 = 0;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(12)).getItem()
				: ItemStack.EMPTY).getItem() == WildasideModBlocks.SUBSTILIUM_SOIL.get().asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(13)).getItem() : ItemStack.EMPTY)
						.getItem() == WildasideModBlocks.SUBSTILIUM_SOIL.get().asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(14)).getItem() : ItemStack.EMPTY)
						.getItem() == WildasideModBlocks.SUBSTILIUM_SOIL.get().asItem()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(9)).getItem() : ItemStack.EMPTY)
					.getItem() == WildasideModItems.ENTORIUM.get()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(11)).getItem() : ItemStack.EMPTY)
							.getItem() == WildasideModItems.ENTORIUM.get()) {
				if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == WildasideModBlocks.SUBSTILIUM_SOIL.get().asItem()
						&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
								.getItem() == WildasideModBlocks.SUBSTILIUM_SOIL.get().asItem()) {
					if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
							&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(10)).getItem() : ItemStack.EMPTY).getItem() == Items.REDSTONE) {
						if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
								.getItem() == Blocks.DISPENSER.asItem()) {
							if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
									.getItem() == WildasideModItems.VIBRION.get()
									&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
											&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
											.getItem() == WildasideModItems.VIBRION.get()) {
								if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
										&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
										.getItem() == WildasideModItems.ENTORIUM_SPOREBOMB.get()) {
									if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
											&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
											.getItem() == WildasideModItems.VIBRION.get()
											&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
													&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
													.getItem() == WildasideModBlocks.VIBRION_BLOCK.get().asItem()
											&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
													&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
													.getItem() == WildasideModItems.VIBRION.get()) {
										for (int index0 = 0; index0 < (int) (16); index0++) {
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												ItemStack _setstack = (entity instanceof ServerPlayer _plrSlotItem
														&& _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
																? ((Slot) _slt.get((int) loop1)).getItem()
																: ItemStack.EMPTY);
												_setstack.setCount((int) (new Object() {
													public int getAmount(int sltid) {
														if (entity instanceof ServerPlayer _player
																&& _player.containerMenu instanceof Supplier _current
																&& _current.get() instanceof Map _slots) {
															ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
															if (stack != null)
																return stack.getCount();
														}
														return 0;
													}
												}.getAmount((int) loop1) - 1));
												((Slot) _slots.get((int) loop1)).set(_setstack);
												_player.containerMenu.broadcastChanges();
											}
											loop1 = loop1 + 1;
										}
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack _setstack = new ItemStack(WildasideModBlocks.SPORE_BLASTER.get());
											_setstack.setCount((int) (new Object() {
												public int getAmount(int sltid) {
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
														if (stack != null)
															return stack.getCount();
													}
													return 0;
												}
											}.getAmount(15) + 2));
											((Slot) _slots.get(15)).set(_setstack);
											_player.containerMenu.broadcastChanges();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
