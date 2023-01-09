
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.makingamodaschool.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.makingamodaschool.block.TopazOreBlock;
import net.mcreator.makingamodaschool.block.TopazBlockBlock;
import net.mcreator.makingamodaschool.MakingAModASchoolMod;

public class MakingAModASchoolModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MakingAModASchoolMod.MODID);
	public static final RegistryObject<Block> TOPAZ_BLOCK = REGISTRY.register("topaz_block", () -> new TopazBlockBlock());
	public static final RegistryObject<Block> TOPAZ_ORE = REGISTRY.register("topaz_ore", () -> new TopazOreBlock());
}
