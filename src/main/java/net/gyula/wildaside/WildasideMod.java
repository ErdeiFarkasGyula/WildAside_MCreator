/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.gyula.wildaside;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.gyula.wildaside.init.WildasideModTabs;
import net.gyula.wildaside.init.WildasideModPotions;
import net.gyula.wildaside.init.WildasideModParticleTypes;
import net.gyula.wildaside.init.WildasideModMobEffects;
import net.gyula.wildaside.init.WildasideModItems;
import net.gyula.wildaside.init.WildasideModFeatures;
import net.gyula.wildaside.init.WildasideModEntities;
import net.gyula.wildaside.init.WildasideModEnchantments;
import net.gyula.wildaside.init.WildasideModBlocks;
import net.gyula.wildaside.init.WildasideModBiomes;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("wildaside")
public class WildasideMod {
	public static final Logger LOGGER = LogManager.getLogger(WildasideMod.class);
	public static final String MODID = "wildaside";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public WildasideMod() {
		WildasideModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		WildasideModBlocks.REGISTRY.register(bus);
		WildasideModItems.REGISTRY.register(bus);
		WildasideModEntities.REGISTRY.register(bus);

		WildasideModFeatures.REGISTRY.register(bus);

		WildasideModEnchantments.REGISTRY.register(bus);
		WildasideModMobEffects.REGISTRY.register(bus);
		WildasideModPotions.REGISTRY.register(bus);
		WildasideModBiomes.REGISTRY.register(bus);
		WildasideModParticleTypes.REGISTRY.register(bus);
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
