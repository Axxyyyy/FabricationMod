
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingamodaschool.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.makingamodaschool.client.gui.ForgeGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MakingAModASchoolModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MakingAModASchoolModMenus.FORGE_GUI.get(), ForgeGuiScreen::new);
		});
	}
}
