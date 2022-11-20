
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.gyula.wildaside.world.inventory.BioengineerWorkstationGuiMenu;
import net.gyula.wildaside.world.inventory.BioengineerWorkspaceRecipesMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BioengineerWorkstationGuiMenu> BIOENGINEER_WORKSTATION_GUI = register("bioengineer_workstation_gui",
			(id, inv, extraData) -> new BioengineerWorkstationGuiMenu(id, inv, extraData));
	public static final MenuType<BioengineerWorkspaceRecipesMenu> BIOENGINEER_WORKSPACE_RECIPES = register("bioengineer_workspace_recipes",
			(id, inv, extraData) -> new BioengineerWorkspaceRecipesMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
