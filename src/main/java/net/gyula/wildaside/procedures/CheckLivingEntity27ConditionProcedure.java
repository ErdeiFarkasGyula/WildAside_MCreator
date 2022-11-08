package net.gyula.wildaside.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;

public class CheckLivingEntity27ConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 27, 27, 27), e -> true).isEmpty()) {
			return true;
		}
		return false;
	}
}
