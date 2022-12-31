package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GlowingHickoryLeavesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.dayTime() < 12000) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip2
					? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip2)
					: -1) > 0) {
				{
					int _value = (int) (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty(
							"light") instanceof IntegerProperty _getip4 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip4) : -1) - 1);
					BlockPos _pos = new BlockPos(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _integerProp
							&& _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		} else {
			if (world.dayTime() >= 12000) {
				if (world.dayTime() >= 22500) {
					if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition().getProperty(
							"light") instanceof IntegerProperty _getip9 ? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip9) : -1) > 0) {
						{
							int _value = (int) (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition()
									.getProperty("light") instanceof IntegerProperty _getip11
											? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip11)
											: -1)
									- 1);
							BlockPos _pos = new BlockPos(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _integerProp
									&& _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				} else {
					if (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition()
							.getProperty("light") instanceof IntegerProperty _getip14
									? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip14)
									: -1) < 7) {
						{
							int _value = (int) (((world.getBlockState(new BlockPos(x, y, z))).getBlock().getStateDefinition()
									.getProperty("light") instanceof IntegerProperty _getip16
											? (world.getBlockState(new BlockPos(x, y, z))).getValue(_getip16)
											: -1)
									+ 1);
							BlockPos _pos = new BlockPos(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _integerProp
									&& _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
				}
			}
		}
	}
}
