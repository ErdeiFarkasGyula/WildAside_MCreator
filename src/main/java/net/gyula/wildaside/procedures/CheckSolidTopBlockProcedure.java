package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CheckSolidTopBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() == false) {
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
