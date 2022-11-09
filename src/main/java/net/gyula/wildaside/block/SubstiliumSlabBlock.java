
package net.gyula.wildaside.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.gyula.wildaside.init.WildasideModBlocks;

public class SubstiliumSlabBlock extends SlabBlock {
	public SubstiliumSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_CYAN).sound(SoundType.WOOD).strength(2f, 1.5f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false).noDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(WildasideModBlocks.SUBSTILIUM_SLAB.get(), renderType -> renderType == RenderType.cutout());
	}

}
