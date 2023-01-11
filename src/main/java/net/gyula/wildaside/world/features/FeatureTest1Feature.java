
package net.gyula.wildaside.world.features;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.SimpleBlockFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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

public class FeatureTest1Feature extends SimpleBlockFeature {
	public static FeatureTest1Feature FEATURE = null;
	public static Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new FeatureTest1Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("wildaside:feature_test_1", FEATURE,
				new SimpleBlockConfiguration(BlockStateProvider.simple(WildasideModBlocks.SUBSTILIUM_TREE_GROWER.get().defaultBlockState())));
		PLACED_FEATURE = PlacementUtils.register("wildaside:feature_test_1", CONFIGURED_FEATURE, List.of(RarityFilter.onAverageOnceEvery(1)));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("wildaside:vibrion_hive"));
	private final Set<ResourceKey<Level>> generateDimensions = Set.of(Level.OVERWORLD);

	public FeatureTest1Feature() {
		super(SimpleBlockConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<SimpleBlockConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generateDimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}
}
