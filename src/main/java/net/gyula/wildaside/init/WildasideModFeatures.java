
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.gyula.wildaside.world.features.plants.VibrionSporeholderFeature;
import net.gyula.wildaside.world.features.plants.VibrionRootsFeature;
import net.gyula.wildaside.world.features.plants.SubstiliumSproutsFeature;
import net.gyula.wildaside.world.features.ores.OvergrownEntoriumOreFeature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr9Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr8Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr7Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr6Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr5Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr4Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr3Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr2Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr1Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr12Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr11Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr10Feature;
import net.gyula.wildaside.WildasideMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class WildasideModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WildasideMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> VIBRION_ROOTS = register("vibrion_roots", VibrionRootsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, VibrionRootsFeature.GENERATE_BIOMES, VibrionRootsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VIBRION_SPOREHOLDER = register("vibrion_sporeholder", VibrionSporeholderFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VibrionSporeholderFeature.GENERATE_BIOMES,
					VibrionSporeholderFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OVERGROWN_ENTORIUM_ORE = register("overgrown_entorium_ore", OvergrownEntoriumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OvergrownEntoriumOreFeature.GENERATE_BIOMES,
					OvergrownEntoriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_SPROUTS = register("substilium_sprouts", SubstiliumSproutsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SubstiliumSproutsFeature.GENERATE_BIOMES,
					SubstiliumSproutsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_1 = register("hanging_vibrion_vines_grower_str_1",
			HangingVibrionVinesGrowerStr1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr1Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_2 = register("hanging_vibrion_vines_grower_str_2",
			HangingVibrionVinesGrowerStr2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr2Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_3 = register("hanging_vibrion_vines_grower_str_3",
			HangingVibrionVinesGrowerStr3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr3Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_4 = register("hanging_vibrion_vines_grower_str_4",
			HangingVibrionVinesGrowerStr4Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr4Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_5 = register("hanging_vibrion_vines_grower_str_5",
			HangingVibrionVinesGrowerStr5Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr5Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_6 = register("hanging_vibrion_vines_grower_str_6",
			HangingVibrionVinesGrowerStr6Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr6Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_7 = register("hanging_vibrion_vines_grower_str_7",
			HangingVibrionVinesGrowerStr7Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr7Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_8 = register("hanging_vibrion_vines_grower_str_8",
			HangingVibrionVinesGrowerStr8Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr8Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_9 = register("hanging_vibrion_vines_grower_str_9",
			HangingVibrionVinesGrowerStr9Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr9Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_10 = register("hanging_vibrion_vines_grower_str_10",
			HangingVibrionVinesGrowerStr10Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr10Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_11 = register("hanging_vibrion_vines_grower_str_11",
			HangingVibrionVinesGrowerStr11Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr11Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_12 = register("hanging_vibrion_vines_grower_str_12",
			HangingVibrionVinesGrowerStr12Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr12Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr12Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
