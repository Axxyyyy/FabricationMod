
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingamodaschool.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.makingamodaschool.item.TrollItem;
import net.mcreator.makingamodaschool.item.TopazSwordItem;
import net.mcreator.makingamodaschool.item.TopazShovelItem;
import net.mcreator.makingamodaschool.item.TopazPickaxeItem;
import net.mcreator.makingamodaschool.item.TopazItem;
import net.mcreator.makingamodaschool.item.TopazHoeItem;
import net.mcreator.makingamodaschool.item.TopazAxeItem;
import net.mcreator.makingamodaschool.item.TopazArmorItem;
import net.mcreator.makingamodaschool.item.EnchantedEmeraldSwordItem;
import net.mcreator.makingamodaschool.item.EmeraldSwordItem;
import net.mcreator.makingamodaschool.item.AmythestSwordItem;
import net.mcreator.makingamodaschool.item.AmethestShovelItem;
import net.mcreator.makingamodaschool.item.AmethestPickaxeItem;
import net.mcreator.makingamodaschool.item.AmethestKunaiItem;
import net.mcreator.makingamodaschool.item.AmethestKnifeItem;
import net.mcreator.makingamodaschool.item.AmethestKatanaItem;
import net.mcreator.makingamodaschool.item.AmethestHoeItem;
import net.mcreator.makingamodaschool.item.AmethestAxeItem;
import net.mcreator.makingamodaschool.MakingAModASchoolMod;

public class MakingAModASchoolModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MakingAModASchoolMod.MODID);
	public static final RegistryObject<Item> EMERALD_SWORD = REGISTRY.register("emerald_sword", () -> new EmeraldSwordItem());
	public static final RegistryObject<Item> ENCHANTED_EMERALD_SWORD = REGISTRY.register("enchanted_emerald_sword",
			() -> new EnchantedEmeraldSwordItem());
	public static final RegistryObject<Item> TROLL = REGISTRY.register("troll", () -> new TrollItem());
	public static final RegistryObject<Item> AMYTHEST_SWORD = REGISTRY.register("amythest_sword", () -> new AmythestSwordItem());
	public static final RegistryObject<Item> AMETHEST_PICKAXE = REGISTRY.register("amethest_pickaxe", () -> new AmethestPickaxeItem());
	public static final RegistryObject<Item> AMETHEST_AXE = REGISTRY.register("amethest_axe", () -> new AmethestAxeItem());
	public static final RegistryObject<Item> AMETHEST_SHOVEL = REGISTRY.register("amethest_shovel", () -> new AmethestShovelItem());
	public static final RegistryObject<Item> AMETHEST_HOE = REGISTRY.register("amethest_hoe", () -> new AmethestHoeItem());
	public static final RegistryObject<Item> AMETHEST_KUNAI = REGISTRY.register("amethest_kunai", () -> new AmethestKunaiItem());
	public static final RegistryObject<Item> AMETHEST_KATANA = REGISTRY.register("amethest_katana", () -> new AmethestKatanaItem());
	public static final RegistryObject<Item> AMETHEST_KNIFE = REGISTRY.register("amethest_knife", () -> new AmethestKnifeItem());
	public static final RegistryObject<Item> TOPAZ = REGISTRY.register("topaz", () -> new TopazItem());
	public static final RegistryObject<Item> TOPAZ_BLOCK = block(MakingAModASchoolModBlocks.TOPAZ_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TOPAZ_PICKAXE = REGISTRY.register("topaz_pickaxe", () -> new TopazPickaxeItem());
	public static final RegistryObject<Item> TOPAZ_AXE = REGISTRY.register("topaz_axe", () -> new TopazAxeItem());
	public static final RegistryObject<Item> TOPAZ_SWORD = REGISTRY.register("topaz_sword", () -> new TopazSwordItem());
	public static final RegistryObject<Item> TOPAZ_SHOVEL = REGISTRY.register("topaz_shovel", () -> new TopazShovelItem());
	public static final RegistryObject<Item> TOPAZ_HOE = REGISTRY.register("topaz_hoe", () -> new TopazHoeItem());
	public static final RegistryObject<Item> TOPAZ_ARMOR_HELMET = REGISTRY.register("topaz_armor_helmet", () -> new TopazArmorItem.Helmet());
	public static final RegistryObject<Item> TOPAZ_ARMOR_CHESTPLATE = REGISTRY.register("topaz_armor_chestplate",
			() -> new TopazArmorItem.Chestplate());
	public static final RegistryObject<Item> TOPAZ_ARMOR_LEGGINGS = REGISTRY.register("topaz_armor_leggings", () -> new TopazArmorItem.Leggings());
	public static final RegistryObject<Item> TOPAZ_ARMOR_BOOTS = REGISTRY.register("topaz_armor_boots", () -> new TopazArmorItem.Boots());
	public static final RegistryObject<Item> TOPAZ_ORE = block(MakingAModASchoolModBlocks.TOPAZ_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
