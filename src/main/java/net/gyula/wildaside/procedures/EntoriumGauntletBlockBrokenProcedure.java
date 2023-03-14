package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModParticleTypes;
import net.gyula.wildaside.init.WildasideModItems;
import net.gyula.wildaside.init.WildasideModEnchantments;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class EntoriumGauntletBlockBrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WildasideModItems.ENTORIUM_GAUNTLET.get()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), (x + 0.5), y, (z + 0.5), 5, (-0.2), 0.4, 0.2, 0.1);
			if (!(0.1 + EnchantmentHelper.getItemEnchantmentLevel(WildasideModEnchantments.RELIABLE_RESEARCH.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 0.1 > Math.random())) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				world.destroyBlock(new BlockPos(x, y, z), false);
				if (0.06 + EnchantmentHelper.getItemEnchantmentLevel(WildasideModEnchantments.RELIABLE_RESEARCH.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) * 0.05 > Math.random()) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(WildasideModItems.VIBRION.get()));
						entityToSpawn.setPickUpDelay(0);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
