
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingamodaschool.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.makingamodaschool.world.inventory.ForgeGuiMenu;
import net.mcreator.makingamodaschool.MakingAModASchoolMod;

public class MakingAModASchoolModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MakingAModASchoolMod.MODID);
	public static final RegistryObject<MenuType<ForgeGuiMenu>> FORGE_GUI = REGISTRY.register("forge_gui",
			() -> IForgeMenuType.create(ForgeGuiMenu::new));
}
