
package net.gyula.wildaside.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.procedures.CheckLivingEntity27ConditionProcedure;
import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.Random;

public class EntoriumOreBlock extends Block {
	public EntoriumOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_PURPLE).sound(SoundType.GILDED_BLACKSTONE).strength(3.5f, 5f)
				.requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		if (CheckLivingEntity27ConditionProcedure.execute(world, x, y, z))
			for (int l = 0; l < 1; ++l) {
				double x0 = x + random.nextFloat();
				double y0 = y + random.nextFloat();
				double z0 = z + random.nextFloat();
				double dx = (random.nextFloat() - 0.5D) * 0.1D;
				double dy = (random.nextFloat() - 0.5D) * 0.1D;
				double dz = (random.nextFloat() - 0.5D) * 0.1D;
				world.addParticle((SimpleParticleType) (WildasideModParticleTypes.LIT_ENTORIUM_PARTICLE.get()), x0, y0, z0, dx, dy, dz);
			}
	}
}
