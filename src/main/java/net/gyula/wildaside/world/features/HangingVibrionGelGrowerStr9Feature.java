
package net.gyula.wildaside.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.procedures.HangingVibrionVinesGrowerStrOnGeneratedProcedure;
import net.gyula.wildaside.procedures.HangingVibrionVinesGrowerStrConditionProcedure;

import java.util.Set;
import java.util.List;

public class HangingVibrionGelGrowerStr9Feature extends Feature<NoneFeatureConfiguration> {
	public static HangingVibrionGelGrowerStr9Feature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new HangingVibrionGelGrowerStr9Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("wildaside:hanging_vibrion_gel_grower_str_9", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("wildaside:hanging_vibrion_gel_grower_str_9", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("wildaside:vibrion_hive"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private StructureTemplate template = null;

	public HangingVibrionGelGrowerStr9Feature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager()
					.getOrCreate(new ResourceLocation("wildaside", "hanging_vibrion_gel_grower_str"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 1000000) {
			int count = context.random().nextInt(1) + 16;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.WORLD_SURFACE_WG, i, k);
				j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));
				BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
				WorldGenLevel world = context.level();
				int x = spawnTo.getX();
				int y = spawnTo.getY();
				int z = spawnTo.getZ();
				if (!HangingVibrionVinesGrowerStrConditionProcedure.execute(world, x, y, z))
					continue;
				if (template.placeInWorld(
						context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE)
								.setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false),
						context.random(), 2)) {

					HangingVibrionVinesGrowerStrOnGeneratedProcedure.execute(world, x, y, z);
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
