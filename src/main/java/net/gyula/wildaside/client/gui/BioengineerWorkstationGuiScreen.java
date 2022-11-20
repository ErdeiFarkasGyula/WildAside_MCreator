
package net.gyula.wildaside.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.world.inventory.BioengineerWorkstationGuiMenu;
import net.gyula.wildaside.network.BioengineerWorkstationGuiButtonMessage;
import net.gyula.wildaside.WildasideMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BioengineerWorkstationGuiScreen extends AbstractContainerScreen<BioengineerWorkstationGuiMenu> {
	private final static HashMap<String, Object> guistate = BioengineerWorkstationGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BioengineerWorkstationGuiScreen(BioengineerWorkstationGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("wildaside:textures/screens/bioengineer_workstation_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("wildaside:textures/screens/arrow.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 61, 0, 0, 22, 15, 22, 15);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Bioengineer Workspace", 32, 8, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 95, this.topPos + 87, 56, 20, new TextComponent("create"), e -> {
			if (true) {
				WildasideMod.PACKET_HANDLER.sendToServer(new BioengineerWorkstationGuiButtonMessage(0, x, y, z));
				BioengineerWorkstationGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 92, this.topPos + 33, 61, 20, new TextComponent("recipes"), e -> {
			if (true) {
				WildasideMod.PACKET_HANDLER.sendToServer(new BioengineerWorkstationGuiButtonMessage(1, x, y, z));
				BioengineerWorkstationGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
