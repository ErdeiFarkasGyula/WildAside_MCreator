package net.gyula.wildaside.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlockEntities;

public class HickorySaplingBlockEntity extends BlockEntity {
	public HickorySaplingBlockEntity(BlockPos pos, BlockState state) {
		super(WildasideModBlockEntities.HICKORY_SAPLING.get(), pos, state);
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
