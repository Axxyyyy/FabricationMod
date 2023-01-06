
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingamodaschool.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.makingamodaschool.item.TrollItem;
import net.mcreator.makingamodaschool.item.TopazSwordItem;
import net.mcreator.makingamodaschool.item.TopazPickazeItem;
import net.mcreator.makingamodaschool.item.TopazItem;
import net.mcreator.makingamodaschool.item.EnchantedEmeraldSwordItem;
import net.mcreator.makingamodaschool.item.EmeraldSwordItem;
import net.mcreator.makingamodaschool.MakingAModASchoolMod;

public class MakingAModASchoolModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MakingAModASchoolMod.MODID);
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> ENCHANTED_EMERALD_SWORD = REGISTRY.register("enchanted_emerald_sword",
			() -> new EnchantedEmeraldSwordItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> TOPAZ_SWORD = REGISTRY.register("topaz_sword", () -> new TopazSwordItem());
	public static final RegistryObject<Item> TROLL = REGISTRY.register("troll", () -> new TrollItem());
	public static final RegistryObject<Item> TOPAZ_PICKAZE = REGISTRY.register("topaz_pickaze", () -> new TopazPickazeItem());
}
