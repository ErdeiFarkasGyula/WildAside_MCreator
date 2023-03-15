package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModItems;
import net.gyula.wildaside.init.WildasideModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GlowingEssenceGetProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEY_BOTTLE) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("wildaside:glowing_hickory_leaves")))) {
				if (world.getBlockState(new BlockPos(x, y, z)).getLightEmission(world, new BlockPos(x, y, z)) >= 7) {
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES.get()) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WildasideModItems.RED_GLOWING_ESSENCE.get()));
							entityToSpawn.setPickUpDelay(0);
							entityToSpawn.setUnlimitedLifetime();
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES.get()) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WildasideModItems.YELLOW_GLOWING_ESSENCE.get()));
								entityToSpawn.setPickUpDelay(0);
								entityToSpawn.setUnlimitedLifetime();
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES.get()) {
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WildasideModItems.BROWN_GLOWING_ESSENCE.get()));
									entityToSpawn.setPickUpDelay(0);
									entityToSpawn.setUnlimitedLifetime();
									_level.addFreshEntity(entityToSpawn);
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES.get()) {
									if (world instanceof Level _level && !_level.isClientSide()) {
										ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WildasideModItems.GREEN_GLOWING_ESSENCE.get()));
										entityToSpawn.setPickUpDelay(0);
										entityToSpawn.setUnlimitedLifetime();
										_level.addFreshEntity(entityToSpawn);
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
