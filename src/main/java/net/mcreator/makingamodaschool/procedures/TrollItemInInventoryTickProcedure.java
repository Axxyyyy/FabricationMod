package net.mcreator.makingamodaschool.procedures;

import net.minecraft.world.item.ItemStack;

public class TrollItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).setCount(0);
	}
}
