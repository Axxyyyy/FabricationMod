package net.mcreator.makingamodaschool.procedures;

import net.minecraft.world.entity.Entity;

public class TopazSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
