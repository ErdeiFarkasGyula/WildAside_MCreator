
package net.gyula.wildaside.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.world.inventory.BioengineerWorkspaceRecipesMenu;
import net.gyula.wildaside.procedures.PreviousPageProcedure;
import net.gyula.wildaside.procedures.NextPageProcProcedure;
import net.gyula.wildaside.procedures.CreateButtonClickedProcedure;
import net.gyula.wildaside.WildasideMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BioengineerWorkspaceRecipesButtonMessage {
	private final int buttonID, x, y, z;

	public BioengineerWorkspaceRecipesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BioengineerWorkspaceRecipesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BioengineerWorkspaceRecipesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BioengineerWorkspaceRecipesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = BioengineerWorkspaceRecipesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CreateButtonClickedProcedure.execute(entity);
		}
		if (buttonID == 1) {

			PreviousPageProcedure.execute(entity);
		}
		if (buttonID == 2) {

			NextPageProcProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		WildasideMod.addNetworkMessage(BioengineerWorkspaceRecipesButtonMessage.class, BioengineerWorkspaceRecipesButtonMessage::buffer,
				BioengineerWorkspaceRecipesButtonMessage::new, BioengineerWorkspaceRecipesButtonMessage::handler);
	}
}
