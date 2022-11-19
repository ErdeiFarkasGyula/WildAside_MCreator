
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
import net.gyula.wildaside.world.features.NaturalSporeBlasterStrFeature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr9Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr8Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr7Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr6Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr5Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr56Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr55Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr54Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr53Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr52Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr51Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr50Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr4Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr49Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr48Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr47Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr46Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr45Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr44Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr43Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr42Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr41Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr40Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr3Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr39Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr38Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr37Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr36Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr35Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr34Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr33Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr32Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr31Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr30Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr2Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr29Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr28Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr27Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr26Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr25Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr24Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr23Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr22Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr21Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr20Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr19Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr18Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr17Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr16Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr15Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr14Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr13Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr12Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr11Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr10Feature;
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
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr9Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr8Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr7Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr6Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr5Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr4Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr3Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr2Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr1Feature;
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
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_1 = register("hanging_vibrion_gel_grower_str_1",
			HangingVibrionGelGrowerStr1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr1Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_2 = register("hanging_vibrion_gel_grower_str_2",
			HangingVibrionGelGrowerStr2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr2Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_3 = register("hanging_vibrion_gel_grower_str_3",
			HangingVibrionGelGrowerStr3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr3Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_4 = register("hanging_vibrion_gel_grower_str_4",
			HangingVibrionGelGrowerStr4Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr4Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_5 = register("hanging_vibrion_gel_grower_str_5",
			HangingVibrionGelGrowerStr5Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr5Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_6 = register("hanging_vibrion_gel_grower_str_6",
			HangingVibrionGelGrowerStr6Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr6Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_7 = register("hanging_vibrion_gel_grower_str_7",
			HangingVibrionGelGrowerStr7Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr7Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_8 = register("hanging_vibrion_gel_grower_str_8",
			HangingVibrionGelGrowerStr8Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr8Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_9 = register("hanging_vibrion_gel_grower_str_9",
			HangingVibrionGelGrowerStr9Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr9Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR = register("natural_spore_blaster_str",
			NaturalSporeBlasterStrFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStrFeature.GENERATE_BIOMES, NaturalSporeBlasterStrFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_2 = register("natural_spore_blaster_str_2",
			NaturalSporeBlasterStr2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr2Feature.GENERATE_BIOMES, NaturalSporeBlasterStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_3 = register("natural_spore_blaster_str_3",
			NaturalSporeBlasterStr3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr3Feature.GENERATE_BIOMES, NaturalSporeBlasterStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_4 = register("natural_spore_blaster_str_4",
			NaturalSporeBlasterStr4Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr4Feature.GENERATE_BIOMES, NaturalSporeBlasterStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_5 = register("natural_spore_blaster_str_5",
			NaturalSporeBlasterStr5Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr5Feature.GENERATE_BIOMES, NaturalSporeBlasterStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_6 = register("natural_spore_blaster_str_6",
			NaturalSporeBlasterStr6Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr6Feature.GENERATE_BIOMES, NaturalSporeBlasterStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_7 = register("natural_spore_blaster_str_7",
			NaturalSporeBlasterStr7Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr7Feature.GENERATE_BIOMES, NaturalSporeBlasterStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_8 = register("natural_spore_blaster_str_8",
			NaturalSporeBlasterStr8Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr8Feature.GENERATE_BIOMES, NaturalSporeBlasterStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_9 = register("natural_spore_blaster_str_9",
			NaturalSporeBlasterStr9Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr9Feature.GENERATE_BIOMES, NaturalSporeBlasterStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_10 = register("natural_spore_blaster_str_10",
			NaturalSporeBlasterStr10Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr10Feature.GENERATE_BIOMES, NaturalSporeBlasterStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_11 = register("natural_spore_blaster_str_11",
			NaturalSporeBlasterStr11Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr11Feature.GENERATE_BIOMES, NaturalSporeBlasterStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_12 = register("natural_spore_blaster_str_12",
			NaturalSporeBlasterStr12Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr12Feature.GENERATE_BIOMES, NaturalSporeBlasterStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_13 = register("natural_spore_blaster_str_13",
			NaturalSporeBlasterStr13Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr13Feature.GENERATE_BIOMES, NaturalSporeBlasterStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_14 = register("natural_spore_blaster_str_14",
			NaturalSporeBlasterStr14Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr14Feature.GENERATE_BIOMES, NaturalSporeBlasterStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_15 = register("natural_spore_blaster_str_15",
			NaturalSporeBlasterStr15Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr15Feature.GENERATE_BIOMES, NaturalSporeBlasterStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_16 = register("natural_spore_blaster_str_16",
			NaturalSporeBlasterStr16Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr16Feature.GENERATE_BIOMES, NaturalSporeBlasterStr16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_17 = register("natural_spore_blaster_str_17",
			NaturalSporeBlasterStr17Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr17Feature.GENERATE_BIOMES, NaturalSporeBlasterStr17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_18 = register("natural_spore_blaster_str_18",
			NaturalSporeBlasterStr18Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr18Feature.GENERATE_BIOMES, NaturalSporeBlasterStr18Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_19 = register("natural_spore_blaster_str_19",
			NaturalSporeBlasterStr19Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr19Feature.GENERATE_BIOMES, NaturalSporeBlasterStr19Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_20 = register("natural_spore_blaster_str_20",
			NaturalSporeBlasterStr20Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr20Feature.GENERATE_BIOMES, NaturalSporeBlasterStr20Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_21 = register("natural_spore_blaster_str_21",
			NaturalSporeBlasterStr21Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr21Feature.GENERATE_BIOMES, NaturalSporeBlasterStr21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_22 = register("natural_spore_blaster_str_22",
			NaturalSporeBlasterStr22Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr22Feature.GENERATE_BIOMES, NaturalSporeBlasterStr22Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_23 = register("natural_spore_blaster_str_23",
			NaturalSporeBlasterStr23Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr23Feature.GENERATE_BIOMES, NaturalSporeBlasterStr23Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_24 = register("natural_spore_blaster_str_24",
			NaturalSporeBlasterStr24Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr24Feature.GENERATE_BIOMES, NaturalSporeBlasterStr24Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_25 = register("natural_spore_blaster_str_25",
			NaturalSporeBlasterStr25Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr25Feature.GENERATE_BIOMES, NaturalSporeBlasterStr25Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_26 = register("natural_spore_blaster_str_26",
			NaturalSporeBlasterStr26Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr26Feature.GENERATE_BIOMES, NaturalSporeBlasterStr26Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_27 = register("natural_spore_blaster_str_27",
			NaturalSporeBlasterStr27Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr27Feature.GENERATE_BIOMES, NaturalSporeBlasterStr27Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_28 = register("natural_spore_blaster_str_28",
			NaturalSporeBlasterStr28Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr28Feature.GENERATE_BIOMES, NaturalSporeBlasterStr28Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_29 = register("natural_spore_blaster_str_29",
			NaturalSporeBlasterStr29Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr29Feature.GENERATE_BIOMES, NaturalSporeBlasterStr29Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_30 = register("natural_spore_blaster_str_30",
			NaturalSporeBlasterStr30Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr30Feature.GENERATE_BIOMES, NaturalSporeBlasterStr30Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_31 = register("natural_spore_blaster_str_31",
			NaturalSporeBlasterStr31Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr31Feature.GENERATE_BIOMES, NaturalSporeBlasterStr31Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_32 = register("natural_spore_blaster_str_32",
			NaturalSporeBlasterStr32Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr32Feature.GENERATE_BIOMES, NaturalSporeBlasterStr32Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_33 = register("natural_spore_blaster_str_33",
			NaturalSporeBlasterStr33Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr33Feature.GENERATE_BIOMES, NaturalSporeBlasterStr33Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_34 = register("natural_spore_blaster_str_34",
			NaturalSporeBlasterStr34Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr34Feature.GENERATE_BIOMES, NaturalSporeBlasterStr34Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_35 = register("natural_spore_blaster_str_35",
			NaturalSporeBlasterStr35Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr35Feature.GENERATE_BIOMES, NaturalSporeBlasterStr35Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_36 = register("natural_spore_blaster_str_36",
			NaturalSporeBlasterStr36Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr36Feature.GENERATE_BIOMES, NaturalSporeBlasterStr36Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_37 = register("natural_spore_blaster_str_37",
			NaturalSporeBlasterStr37Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr37Feature.GENERATE_BIOMES, NaturalSporeBlasterStr37Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_38 = register("natural_spore_blaster_str_38",
			NaturalSporeBlasterStr38Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr38Feature.GENERATE_BIOMES, NaturalSporeBlasterStr38Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_39 = register("natural_spore_blaster_str_39",
			NaturalSporeBlasterStr39Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr39Feature.GENERATE_BIOMES, NaturalSporeBlasterStr39Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_40 = register("natural_spore_blaster_str_40",
			NaturalSporeBlasterStr40Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr40Feature.GENERATE_BIOMES, NaturalSporeBlasterStr40Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_41 = register("natural_spore_blaster_str_41",
			NaturalSporeBlasterStr41Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr41Feature.GENERATE_BIOMES, NaturalSporeBlasterStr41Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_42 = register("natural_spore_blaster_str_42",
			NaturalSporeBlasterStr42Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr42Feature.GENERATE_BIOMES, NaturalSporeBlasterStr42Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_43 = register("natural_spore_blaster_str_43",
			NaturalSporeBlasterStr43Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr43Feature.GENERATE_BIOMES, NaturalSporeBlasterStr43Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_44 = register("natural_spore_blaster_str_44",
			NaturalSporeBlasterStr44Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr44Feature.GENERATE_BIOMES, NaturalSporeBlasterStr44Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_45 = register("natural_spore_blaster_str_45",
			NaturalSporeBlasterStr45Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr45Feature.GENERATE_BIOMES, NaturalSporeBlasterStr45Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_46 = register("natural_spore_blaster_str_46",
			NaturalSporeBlasterStr46Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr46Feature.GENERATE_BIOMES, NaturalSporeBlasterStr46Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_47 = register("natural_spore_blaster_str_47",
			NaturalSporeBlasterStr47Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr47Feature.GENERATE_BIOMES, NaturalSporeBlasterStr47Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_48 = register("natural_spore_blaster_str_48",
			NaturalSporeBlasterStr48Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr48Feature.GENERATE_BIOMES, NaturalSporeBlasterStr48Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_49 = register("natural_spore_blaster_str_49",
			NaturalSporeBlasterStr49Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr49Feature.GENERATE_BIOMES, NaturalSporeBlasterStr49Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_50 = register("natural_spore_blaster_str_50",
			NaturalSporeBlasterStr50Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr50Feature.GENERATE_BIOMES, NaturalSporeBlasterStr50Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_52 = register("natural_spore_blaster_str_52",
			NaturalSporeBlasterStr52Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr52Feature.GENERATE_BIOMES, NaturalSporeBlasterStr52Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_51 = register("natural_spore_blaster_str_51",
			NaturalSporeBlasterStr51Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr51Feature.GENERATE_BIOMES, NaturalSporeBlasterStr51Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_53 = register("natural_spore_blaster_str_53",
			NaturalSporeBlasterStr53Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr53Feature.GENERATE_BIOMES, NaturalSporeBlasterStr53Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_54 = register("natural_spore_blaster_str_54",
			NaturalSporeBlasterStr54Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr54Feature.GENERATE_BIOMES, NaturalSporeBlasterStr54Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_55 = register("natural_spore_blaster_str_55",
			NaturalSporeBlasterStr55Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr55Feature.GENERATE_BIOMES, NaturalSporeBlasterStr55Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_56 = register("natural_spore_blaster_str_56",
			NaturalSporeBlasterStr56Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					NaturalSporeBlasterStr56Feature.GENERATE_BIOMES, NaturalSporeBlasterStr56Feature::placedFeature));

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
