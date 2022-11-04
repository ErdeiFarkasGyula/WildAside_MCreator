
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
import net.gyula.wildaside.WildasideMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class WildasideModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WildasideMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> VIBRION_SPOREHOLDER = register("vibrion_sporeholder", VibrionSporeholderFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VibrionSporeholderFeature.GENERATE_BIOMES,
					VibrionSporeholderFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VIBRION_ROOTS = register("vibrion_roots", VibrionRootsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, VibrionRootsFeature.GENERATE_BIOMES, VibrionRootsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_SPROUTS = register("substilium_sprouts", SubstiliumSproutsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SubstiliumSproutsFeature.GENERATE_BIOMES,
					SubstiliumSproutsFeature::placedFeature));

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
