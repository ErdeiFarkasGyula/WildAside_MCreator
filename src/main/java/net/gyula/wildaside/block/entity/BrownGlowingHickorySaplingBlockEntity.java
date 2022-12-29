package net.gyula.wildaside.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlockEntities;

public class BrownGlowingHickorySaplingBlockEntity extends BlockEntity {
	public BrownGlowingHickorySaplingBlockEntity(BlockPos pos, BlockState state) {
		super(WildasideModBlockEntities.BROWN_GLOWING_HICKORY_SAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
