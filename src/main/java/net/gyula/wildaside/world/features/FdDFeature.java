
package net.gyula.wildaside.world.features;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.HugeFungusFeature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;

import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.Set;
import java.util.List;

public class FdDFeature extends HugeFungusFeature {
	public static FdDFeature FEATURE = null;
	public static Holder<ConfiguredFeature<HugeFungusConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new FdDFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("wildaside:fd_d", FEATURE, new HugeFungusConfiguration(Blocks.GRASS_BLOCK.defaultBlockState(), WildasideModBlocks.SUBSTILIUM_STEM.get().defaultBlockState(),
				WildasideModBlocks.SUBSTILIUM_SHROOM.get().defaultBlockState(), WildasideModBlocks.VIBRION_BLOCK.get().defaultBlockState(), false));
		PLACED_FEATURE = PlacementUtils.register("wildaside:fd_d", CONFIGURED_FEATURE, List.of(RarityFilter.onAverageOnceEvery(1)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

	public FdDFeature() {
		super(HugeFungusConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<HugeFungusConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
