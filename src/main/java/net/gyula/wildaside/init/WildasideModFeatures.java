
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

import net.gyula.wildaside.world.features.plants.YellowGlowingHickorySaplingFeature;
import net.gyula.wildaside.world.features.plants.VibrionSporeholderFeature;
import net.gyula.wildaside.world.features.plants.VibrionRootsFeature;
import net.gyula.wildaside.world.features.plants.SubstiliumSproutsFeature;
import net.gyula.wildaside.world.features.plants.SpottedWintergreenFeature;
import net.gyula.wildaside.world.features.plants.RedGlowingHickorySaplingFeature;
import net.gyula.wildaside.world.features.plants.PanxterFlowerFeature;
import net.gyula.wildaside.world.features.plants.HickorySaplingFeature;
import net.gyula.wildaside.world.features.plants.GreenGlowingHickorySaplingFeature;
import net.gyula.wildaside.world.features.plants.BrownGlowingHickorySaplingFeature;
import net.gyula.wildaside.world.features.ores.OvergrownEntoriumOreFeature;
import net.gyula.wildaside.world.features.ores.CompressedSubstiliumSoilFeature;
import net.gyula.wildaside.world.features.YellowGlowingHickoryTreeFeature;
import net.gyula.wildaside.world.features.TallOakTreeStr1Feature;
import net.gyula.wildaside.world.features.TallBirchTreeStr1Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr9Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr8Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr7Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr6Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr5Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr4Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr3Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr2Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr1Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr15Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr14Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr13Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr12Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr11Feature;
import net.gyula.wildaside.world.features.SubstiliumTreeGrowerStr10Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr39Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr38Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr37Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr36Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr35Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr34Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr345Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr344Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr343Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr342Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr341Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr340Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr33Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr339Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr338Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr337Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr336Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr335Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr334Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr333Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr332Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr331Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr330Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr32Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr329Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr328Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr327Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr326Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr325Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr323Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr322Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr321Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr320Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr31Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr319Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr318Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr317Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr316Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr315Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr314Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr313Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr312Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr311Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr310Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr29Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr28Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr27Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr26Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr25Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr24Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr245Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr244Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr243Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr242Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr241Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr240Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr23Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr239Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr238Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr237Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr236Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr235Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr234Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr233Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr232Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr231Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr230Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr22Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr229Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr228Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr227Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr226Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr225Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr224Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr223Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr222Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr221Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr220Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr21Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr219Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr218Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr217Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr216Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr215Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr214Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr213Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr212Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr211Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr210Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr19Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr18Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr17Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr16Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr169Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr168Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr167Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr166Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr165Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr164Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr163Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr162Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr161Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr160Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr15Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr159Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr158Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr157Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr156Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr155Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr154Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr153Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr152Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr151Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr150Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr14Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr149Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr148Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr147Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr146Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr145Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr144Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr143Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr142Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr141Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr140Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr13Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr139Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr138Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr137Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr136Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr135Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr134Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr133Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr132Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr131Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr130Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr12Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr129Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr128Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr127Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr126Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr125Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr124Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr123Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr122Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr121Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr120Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr11Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr119Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr118Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr117Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr116Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr115Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr114Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr113Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr112Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr111Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr110Feature;
import net.gyula.wildaside.world.features.RedGlowingHickoryTreeFeature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStrFeature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr9Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr8Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr7Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr6Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr5Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr4Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr3Feature;
import net.gyula.wildaside.world.features.NaturalSporeBlasterStr2Feature;
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
import net.gyula.wildaside.world.features.HickoryTreeStr32Feature;
import net.gyula.wildaside.world.features.HickoryTreeStr31Feature;
import net.gyula.wildaside.world.features.HickoryTreeStr22Feature;
import net.gyula.wildaside.world.features.HickoryTreeStr21Feature;
import net.gyula.wildaside.world.features.HickoryTreeStr12Feature;
import net.gyula.wildaside.world.features.HickoryTreeStr11Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStrFeature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr9Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr8Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr7Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr6Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr5Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr4Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr3Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr2Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr20Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr1Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr19Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr17Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr16Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr15Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr14Feature;
import net.gyula.wildaside.world.features.HangingVibrionVinesGrowerStr13Feature;
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
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr15Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr14Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr13Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr12Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr11Feature;
import net.gyula.wildaside.world.features.HangingVibrionGelGrowerStr10Feature;
import net.gyula.wildaside.world.features.GreenGlowingHickoryTreeFeature;
import net.gyula.wildaside.world.features.BrownGlowingHickoryTreeFeature;
import net.gyula.wildaside.WildasideMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class WildasideModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WildasideMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> VIBRION_ROOTS = register("vibrion_roots", VibrionRootsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VibrionRootsFeature.GENERATE_BIOMES, VibrionRootsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VIBRION_SPOREHOLDER = register("vibrion_sporeholder", VibrionSporeholderFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VibrionSporeholderFeature.GENERATE_BIOMES, VibrionSporeholderFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OVERGROWN_ENTORIUM_ORE = register("overgrown_entorium_ore", OvergrownEntoriumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OvergrownEntoriumOreFeature.GENERATE_BIOMES, OvergrownEntoriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COMPRESSED_SUBSTILIUM_SOIL = register("compressed_substilium_soil", CompressedSubstiliumSoilFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CompressedSubstiliumSoilFeature.GENERATE_BIOMES, CompressedSubstiliumSoilFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_SPROUTS = register("substilium_sprouts", SubstiliumSproutsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SubstiliumSproutsFeature.GENERATE_BIOMES, SubstiliumSproutsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_SAPLING = register("hickory_sapling", HickorySaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HickorySaplingFeature.GENERATE_BIOMES, HickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_GLOWING_HICKORY_SAPLING = register("red_glowing_hickory_sapling", RedGlowingHickorySaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RedGlowingHickorySaplingFeature.GENERATE_BIOMES, RedGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BROWN_GLOWING_HICKORY_SAPLING = register("brown_glowing_hickory_sapling", BrownGlowingHickorySaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, BrownGlowingHickorySaplingFeature.GENERATE_BIOMES, BrownGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_GLOWING_HICKORY_SAPLING = register("yellow_glowing_hickory_sapling", YellowGlowingHickorySaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, YellowGlowingHickorySaplingFeature.GENERATE_BIOMES, YellowGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEN_GLOWING_HICKORY_SAPLING = register("green_glowing_hickory_sapling", GreenGlowingHickorySaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, GreenGlowingHickorySaplingFeature.GENERATE_BIOMES, GreenGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PANXTER_FLOWER = register("panxter_flower", PanxterFlowerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, PanxterFlowerFeature.GENERATE_BIOMES, PanxterFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPOTTED_WINTERGREEN = register("spotted_wintergreen", SpottedWintergreenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SpottedWintergreenFeature.GENERATE_BIOMES, SpottedWintergreenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_1 = register("hanging_vibrion_vines_grower_str_1", HangingVibrionVinesGrowerStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr1Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_1 = register("hanging_vibrion_gel_grower_str_1", HangingVibrionGelGrowerStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr1Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_2 = register("hanging_vibrion_gel_grower_str_2", HangingVibrionGelGrowerStr2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr2Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_3 = register("hanging_vibrion_gel_grower_str_3", HangingVibrionGelGrowerStr3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr3Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_4 = register("hanging_vibrion_gel_grower_str_4", HangingVibrionGelGrowerStr4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr4Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_5 = register("hanging_vibrion_gel_grower_str_5", HangingVibrionGelGrowerStr5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr5Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_6 = register("hanging_vibrion_gel_grower_str_6", HangingVibrionGelGrowerStr6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr6Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_7 = register("hanging_vibrion_gel_grower_str_7", HangingVibrionGelGrowerStr7Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr7Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_8 = register("hanging_vibrion_gel_grower_str_8", HangingVibrionGelGrowerStr8Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr8Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_9 = register("hanging_vibrion_gel_grower_str_9", HangingVibrionGelGrowerStr9Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr9Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR = register("natural_spore_blaster_str", NaturalSporeBlasterStrFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStrFeature.GENERATE_BIOMES, NaturalSporeBlasterStrFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_2 = register("natural_spore_blaster_str_2", NaturalSporeBlasterStr2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr2Feature.GENERATE_BIOMES, NaturalSporeBlasterStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_3 = register("natural_spore_blaster_str_3", NaturalSporeBlasterStr3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr3Feature.GENERATE_BIOMES, NaturalSporeBlasterStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_4 = register("natural_spore_blaster_str_4", NaturalSporeBlasterStr4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr4Feature.GENERATE_BIOMES, NaturalSporeBlasterStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_5 = register("natural_spore_blaster_str_5", NaturalSporeBlasterStr5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr5Feature.GENERATE_BIOMES, NaturalSporeBlasterStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_6 = register("natural_spore_blaster_str_6", NaturalSporeBlasterStr6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr6Feature.GENERATE_BIOMES, NaturalSporeBlasterStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_7 = register("natural_spore_blaster_str_7", NaturalSporeBlasterStr7Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr7Feature.GENERATE_BIOMES, NaturalSporeBlasterStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_8 = register("natural_spore_blaster_str_8", NaturalSporeBlasterStr8Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr8Feature.GENERATE_BIOMES, NaturalSporeBlasterStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_9 = register("natural_spore_blaster_str_9", NaturalSporeBlasterStr9Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr9Feature.GENERATE_BIOMES, NaturalSporeBlasterStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_10 = register("natural_spore_blaster_str_10", NaturalSporeBlasterStr10Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr10Feature.GENERATE_BIOMES, NaturalSporeBlasterStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_11 = register("natural_spore_blaster_str_11", NaturalSporeBlasterStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr11Feature.GENERATE_BIOMES, NaturalSporeBlasterStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_12 = register("natural_spore_blaster_str_12", NaturalSporeBlasterStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr12Feature.GENERATE_BIOMES, NaturalSporeBlasterStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_13 = register("natural_spore_blaster_str_13", NaturalSporeBlasterStr13Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr13Feature.GENERATE_BIOMES, NaturalSporeBlasterStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_14 = register("natural_spore_blaster_str_14", NaturalSporeBlasterStr14Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr14Feature.GENERATE_BIOMES, NaturalSporeBlasterStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_15 = register("natural_spore_blaster_str_15", NaturalSporeBlasterStr15Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr15Feature.GENERATE_BIOMES, NaturalSporeBlasterStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_16 = register("natural_spore_blaster_str_16", NaturalSporeBlasterStr16Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr16Feature.GENERATE_BIOMES, NaturalSporeBlasterStr16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_17 = register("natural_spore_blaster_str_17", NaturalSporeBlasterStr17Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr17Feature.GENERATE_BIOMES, NaturalSporeBlasterStr17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_18 = register("natural_spore_blaster_str_18", NaturalSporeBlasterStr18Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr18Feature.GENERATE_BIOMES, NaturalSporeBlasterStr18Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_19 = register("natural_spore_blaster_str_19", NaturalSporeBlasterStr19Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr19Feature.GENERATE_BIOMES, NaturalSporeBlasterStr19Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_20 = register("natural_spore_blaster_str_20", NaturalSporeBlasterStr20Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr20Feature.GENERATE_BIOMES, NaturalSporeBlasterStr20Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_21 = register("natural_spore_blaster_str_21", NaturalSporeBlasterStr21Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr21Feature.GENERATE_BIOMES, NaturalSporeBlasterStr21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_22 = register("natural_spore_blaster_str_22", NaturalSporeBlasterStr22Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr22Feature.GENERATE_BIOMES, NaturalSporeBlasterStr22Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_23 = register("natural_spore_blaster_str_23", NaturalSporeBlasterStr23Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr23Feature.GENERATE_BIOMES, NaturalSporeBlasterStr23Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_24 = register("natural_spore_blaster_str_24", NaturalSporeBlasterStr24Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr24Feature.GENERATE_BIOMES, NaturalSporeBlasterStr24Feature::placedFeature));
	public static final RegistryObject<Feature<?>> NATURAL_SPORE_BLASTER_STR_25 = register("natural_spore_blaster_str_25", NaturalSporeBlasterStr25Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, NaturalSporeBlasterStr25Feature.GENERATE_BIOMES, NaturalSporeBlasterStr25Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_2 = register("hanging_vibrion_vines_grower_str_2", HangingVibrionVinesGrowerStr2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr2Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_3 = register("hanging_vibrion_vines_grower_str_3", HangingVibrionVinesGrowerStr3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr3Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_4 = register("hanging_vibrion_vines_grower_str_4", HangingVibrionVinesGrowerStr4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr4Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_5 = register("hanging_vibrion_vines_grower_str_5", HangingVibrionVinesGrowerStr5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr5Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_6 = register("hanging_vibrion_vines_grower_str_6", HangingVibrionVinesGrowerStr6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr6Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_7 = register("hanging_vibrion_vines_grower_str_7", HangingVibrionVinesGrowerStr7Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr7Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_8 = register("hanging_vibrion_vines_grower_str_8", HangingVibrionVinesGrowerStr8Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr8Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_9 = register("hanging_vibrion_vines_grower_str_9", HangingVibrionVinesGrowerStr9Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr9Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_10 = register("hanging_vibrion_vines_grower_str_10", HangingVibrionVinesGrowerStr10Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr10Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_11 = register("hanging_vibrion_vines_grower_str_11", HangingVibrionVinesGrowerStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr11Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_12 = register("hanging_vibrion_vines_grower_str_12", HangingVibrionVinesGrowerStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr12Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_13 = register("hanging_vibrion_vines_grower_str_13", HangingVibrionVinesGrowerStr13Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr13Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_14 = register("hanging_vibrion_vines_grower_str_14", HangingVibrionVinesGrowerStr14Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr14Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_11 = register("substilium_mushroom_str_11", SubstiliumMushroomStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr11Feature.GENERATE_BIOMES, SubstiliumMushroomStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_12 = register("substilium_mushroom_str_12", SubstiliumMushroomStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr12Feature.GENERATE_BIOMES, SubstiliumMushroomStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_13 = register("substilium_mushroom_str_13", SubstiliumMushroomStr13Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr13Feature.GENERATE_BIOMES, SubstiliumMushroomStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_14 = register("substilium_mushroom_str_14", SubstiliumMushroomStr14Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr14Feature.GENERATE_BIOMES, SubstiliumMushroomStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_15 = register("substilium_mushroom_str_15", SubstiliumMushroomStr15Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr15Feature.GENERATE_BIOMES, SubstiliumMushroomStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_16 = register("substilium_mushroom_str_16", SubstiliumMushroomStr16Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr16Feature.GENERATE_BIOMES, SubstiliumMushroomStr16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_17 = register("substilium_mushroom_str_17", SubstiliumMushroomStr17Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr17Feature.GENERATE_BIOMES, SubstiliumMushroomStr17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_18 = register("substilium_mushroom_str_18", SubstiliumMushroomStr18Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr18Feature.GENERATE_BIOMES, SubstiliumMushroomStr18Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_19 = register("substilium_mushroom_str_19", SubstiliumMushroomStr19Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr19Feature.GENERATE_BIOMES, SubstiliumMushroomStr19Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_110 = register("substilium_mushroom_str_110", SubstiliumMushroomStr110Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr110Feature.GENERATE_BIOMES, SubstiliumMushroomStr110Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_111 = register("substilium_mushroom_str_111", SubstiliumMushroomStr111Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr111Feature.GENERATE_BIOMES, SubstiliumMushroomStr111Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_112 = register("substilium_mushroom_str_112", SubstiliumMushroomStr112Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr112Feature.GENERATE_BIOMES, SubstiliumMushroomStr112Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_113 = register("substilium_mushroom_str_113", SubstiliumMushroomStr113Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr113Feature.GENERATE_BIOMES, SubstiliumMushroomStr113Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_114 = register("substilium_mushroom_str_114", SubstiliumMushroomStr114Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr114Feature.GENERATE_BIOMES, SubstiliumMushroomStr114Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_115 = register("substilium_mushroom_str_115", SubstiliumMushroomStr115Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr115Feature.GENERATE_BIOMES, SubstiliumMushroomStr115Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_116 = register("substilium_mushroom_str_116", SubstiliumMushroomStr116Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr116Feature.GENERATE_BIOMES, SubstiliumMushroomStr116Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_117 = register("substilium_mushroom_str_117", SubstiliumMushroomStr117Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr117Feature.GENERATE_BIOMES, SubstiliumMushroomStr117Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_118 = register("substilium_mushroom_str_118", SubstiliumMushroomStr118Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr118Feature.GENERATE_BIOMES, SubstiliumMushroomStr118Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_119 = register("substilium_mushroom_str_119", SubstiliumMushroomStr119Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr119Feature.GENERATE_BIOMES, SubstiliumMushroomStr119Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_120 = register("substilium_mushroom_str_120", SubstiliumMushroomStr120Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr120Feature.GENERATE_BIOMES, SubstiliumMushroomStr120Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_121 = register("substilium_mushroom_str_121", SubstiliumMushroomStr121Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr121Feature.GENERATE_BIOMES, SubstiliumMushroomStr121Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_122 = register("substilium_mushroom_str_122", SubstiliumMushroomStr122Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr122Feature.GENERATE_BIOMES, SubstiliumMushroomStr122Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_123 = register("substilium_mushroom_str_123", SubstiliumMushroomStr123Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr123Feature.GENERATE_BIOMES, SubstiliumMushroomStr123Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_124 = register("substilium_mushroom_str_124", SubstiliumMushroomStr124Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr124Feature.GENERATE_BIOMES, SubstiliumMushroomStr124Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_125 = register("substilium_mushroom_str_125", SubstiliumMushroomStr125Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr125Feature.GENERATE_BIOMES, SubstiliumMushroomStr125Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_126 = register("substilium_mushroom_str_126", SubstiliumMushroomStr126Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr126Feature.GENERATE_BIOMES, SubstiliumMushroomStr126Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_127 = register("substilium_mushroom_str_127", SubstiliumMushroomStr127Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr127Feature.GENERATE_BIOMES, SubstiliumMushroomStr127Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_128 = register("substilium_mushroom_str_128", SubstiliumMushroomStr128Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr128Feature.GENERATE_BIOMES, SubstiliumMushroomStr128Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_129 = register("substilium_mushroom_str_129", SubstiliumMushroomStr129Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr129Feature.GENERATE_BIOMES, SubstiliumMushroomStr129Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_130 = register("substilium_mushroom_str_130", SubstiliumMushroomStr130Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr130Feature.GENERATE_BIOMES, SubstiliumMushroomStr130Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_131 = register("substilium_mushroom_str_131", SubstiliumMushroomStr131Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr131Feature.GENERATE_BIOMES, SubstiliumMushroomStr131Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_132 = register("substilium_mushroom_str_132", SubstiliumMushroomStr132Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr132Feature.GENERATE_BIOMES, SubstiliumMushroomStr132Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_133 = register("substilium_mushroom_str_133", SubstiliumMushroomStr133Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr133Feature.GENERATE_BIOMES, SubstiliumMushroomStr133Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_134 = register("substilium_mushroom_str_134", SubstiliumMushroomStr134Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr134Feature.GENERATE_BIOMES, SubstiliumMushroomStr134Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_135 = register("substilium_mushroom_str_135", SubstiliumMushroomStr135Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr135Feature.GENERATE_BIOMES, SubstiliumMushroomStr135Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_136 = register("substilium_mushroom_str_136", SubstiliumMushroomStr136Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr136Feature.GENERATE_BIOMES, SubstiliumMushroomStr136Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_137 = register("substilium_mushroom_str_137", SubstiliumMushroomStr137Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr137Feature.GENERATE_BIOMES, SubstiliumMushroomStr137Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_138 = register("substilium_mushroom_str_138", SubstiliumMushroomStr138Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr138Feature.GENERATE_BIOMES, SubstiliumMushroomStr138Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_139 = register("substilium_mushroom_str_139", SubstiliumMushroomStr139Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr139Feature.GENERATE_BIOMES, SubstiliumMushroomStr139Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_140 = register("substilium_mushroom_str_140", SubstiliumMushroomStr140Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr140Feature.GENERATE_BIOMES, SubstiliumMushroomStr140Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_21 = register("substilium_mushroom_str_21", SubstiliumMushroomStr21Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr21Feature.GENERATE_BIOMES, SubstiliumMushroomStr21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_22 = register("substilium_mushroom_str_22", SubstiliumMushroomStr22Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr22Feature.GENERATE_BIOMES, SubstiliumMushroomStr22Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_23 = register("substilium_mushroom_str_23", SubstiliumMushroomStr23Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr23Feature.GENERATE_BIOMES, SubstiliumMushroomStr23Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_24 = register("substilium_mushroom_str_24", SubstiliumMushroomStr24Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr24Feature.GENERATE_BIOMES, SubstiliumMushroomStr24Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_25 = register("substilium_mushroom_str_25", SubstiliumMushroomStr25Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr25Feature.GENERATE_BIOMES, SubstiliumMushroomStr25Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_26 = register("substilium_mushroom_str_26", SubstiliumMushroomStr26Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr26Feature.GENERATE_BIOMES, SubstiliumMushroomStr26Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_27 = register("substilium_mushroom_str_27", SubstiliumMushroomStr27Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr27Feature.GENERATE_BIOMES, SubstiliumMushroomStr27Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_28 = register("substilium_mushroom_str_28", SubstiliumMushroomStr28Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr28Feature.GENERATE_BIOMES, SubstiliumMushroomStr28Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_29 = register("substilium_mushroom_str_29", SubstiliumMushroomStr29Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr29Feature.GENERATE_BIOMES, SubstiliumMushroomStr29Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_210 = register("substilium_mushroom_str_210", SubstiliumMushroomStr210Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr210Feature.GENERATE_BIOMES, SubstiliumMushroomStr210Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_211 = register("substilium_mushroom_str_211", SubstiliumMushroomStr211Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr211Feature.GENERATE_BIOMES, SubstiliumMushroomStr211Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_212 = register("substilium_mushroom_str_212", SubstiliumMushroomStr212Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr212Feature.GENERATE_BIOMES, SubstiliumMushroomStr212Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_213 = register("substilium_mushroom_str_213", SubstiliumMushroomStr213Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr213Feature.GENERATE_BIOMES, SubstiliumMushroomStr213Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_214 = register("substilium_mushroom_str_214", SubstiliumMushroomStr214Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr214Feature.GENERATE_BIOMES, SubstiliumMushroomStr214Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_215 = register("substilium_mushroom_str_215", SubstiliumMushroomStr215Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr215Feature.GENERATE_BIOMES, SubstiliumMushroomStr215Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_216 = register("substilium_mushroom_str_216", SubstiliumMushroomStr216Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr216Feature.GENERATE_BIOMES, SubstiliumMushroomStr216Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_217 = register("substilium_mushroom_str_217", SubstiliumMushroomStr217Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr217Feature.GENERATE_BIOMES, SubstiliumMushroomStr217Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_218 = register("substilium_mushroom_str_218", SubstiliumMushroomStr218Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr218Feature.GENERATE_BIOMES, SubstiliumMushroomStr218Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_219 = register("substilium_mushroom_str_219", SubstiliumMushroomStr219Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr219Feature.GENERATE_BIOMES, SubstiliumMushroomStr219Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_220 = register("substilium_mushroom_str_220", SubstiliumMushroomStr220Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr220Feature.GENERATE_BIOMES, SubstiliumMushroomStr220Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_221 = register("substilium_mushroom_str_221", SubstiliumMushroomStr221Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr221Feature.GENERATE_BIOMES, SubstiliumMushroomStr221Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_222 = register("substilium_mushroom_str_222", SubstiliumMushroomStr222Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr222Feature.GENERATE_BIOMES, SubstiliumMushroomStr222Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_223 = register("substilium_mushroom_str_223", SubstiliumMushroomStr223Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr223Feature.GENERATE_BIOMES, SubstiliumMushroomStr223Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_224 = register("substilium_mushroom_str_224", SubstiliumMushroomStr224Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr224Feature.GENERATE_BIOMES, SubstiliumMushroomStr224Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_225 = register("substilium_mushroom_str_225", SubstiliumMushroomStr225Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr225Feature.GENERATE_BIOMES, SubstiliumMushroomStr225Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_226 = register("substilium_mushroom_str_226", SubstiliumMushroomStr226Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr226Feature.GENERATE_BIOMES, SubstiliumMushroomStr226Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_227 = register("substilium_mushroom_str_227", SubstiliumMushroomStr227Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr227Feature.GENERATE_BIOMES, SubstiliumMushroomStr227Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_228 = register("substilium_mushroom_str_228", SubstiliumMushroomStr228Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr228Feature.GENERATE_BIOMES, SubstiliumMushroomStr228Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_229 = register("substilium_mushroom_str_229", SubstiliumMushroomStr229Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr229Feature.GENERATE_BIOMES, SubstiliumMushroomStr229Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_31 = register("substilium_mushroom_str_31", SubstiliumMushroomStr31Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr31Feature.GENERATE_BIOMES, SubstiliumMushroomStr31Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_32 = register("substilium_mushroom_str_32", SubstiliumMushroomStr32Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr32Feature.GENERATE_BIOMES, SubstiliumMushroomStr32Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_33 = register("substilium_mushroom_str_33", SubstiliumMushroomStr33Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr33Feature.GENERATE_BIOMES, SubstiliumMushroomStr33Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_34 = register("substilium_mushroom_str_34", SubstiliumMushroomStr34Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr34Feature.GENERATE_BIOMES, SubstiliumMushroomStr34Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_35 = register("substilium_mushroom_str_35", SubstiliumMushroomStr35Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr35Feature.GENERATE_BIOMES, SubstiliumMushroomStr35Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_36 = register("substilium_mushroom_str_36", SubstiliumMushroomStr36Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr36Feature.GENERATE_BIOMES, SubstiliumMushroomStr36Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_37 = register("substilium_mushroom_str_37", SubstiliumMushroomStr37Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr37Feature.GENERATE_BIOMES, SubstiliumMushroomStr37Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_38 = register("substilium_mushroom_str_38", SubstiliumMushroomStr38Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr38Feature.GENERATE_BIOMES, SubstiliumMushroomStr38Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_39 = register("substilium_mushroom_str_39", SubstiliumMushroomStr39Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr39Feature.GENERATE_BIOMES, SubstiliumMushroomStr39Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_310 = register("substilium_mushroom_str_310", SubstiliumMushroomStr310Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr310Feature.GENERATE_BIOMES, SubstiliumMushroomStr310Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_311 = register("substilium_mushroom_str_311", SubstiliumMushroomStr311Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr311Feature.GENERATE_BIOMES, SubstiliumMushroomStr311Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_312 = register("substilium_mushroom_str_312", SubstiliumMushroomStr312Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr312Feature.GENERATE_BIOMES, SubstiliumMushroomStr312Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_313 = register("substilium_mushroom_str_313", SubstiliumMushroomStr313Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr313Feature.GENERATE_BIOMES, SubstiliumMushroomStr313Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_314 = register("substilium_mushroom_str_314", SubstiliumMushroomStr314Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr314Feature.GENERATE_BIOMES, SubstiliumMushroomStr314Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_315 = register("substilium_mushroom_str_315", SubstiliumMushroomStr315Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr315Feature.GENERATE_BIOMES, SubstiliumMushroomStr315Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_316 = register("substilium_mushroom_str_316", SubstiliumMushroomStr316Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr316Feature.GENERATE_BIOMES, SubstiliumMushroomStr316Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_317 = register("substilium_mushroom_str_317", SubstiliumMushroomStr317Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr317Feature.GENERATE_BIOMES, SubstiliumMushroomStr317Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_318 = register("substilium_mushroom_str_318", SubstiliumMushroomStr318Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr318Feature.GENERATE_BIOMES, SubstiliumMushroomStr318Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_319 = register("substilium_mushroom_str_319", SubstiliumMushroomStr319Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr319Feature.GENERATE_BIOMES, SubstiliumMushroomStr319Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_320 = register("substilium_mushroom_str_320", SubstiliumMushroomStr320Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr320Feature.GENERATE_BIOMES, SubstiliumMushroomStr320Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_321 = register("substilium_mushroom_str_321", SubstiliumMushroomStr321Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr321Feature.GENERATE_BIOMES, SubstiliumMushroomStr321Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_322 = register("substilium_mushroom_str_322", SubstiliumMushroomStr322Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr322Feature.GENERATE_BIOMES, SubstiliumMushroomStr322Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_323 = register("substilium_mushroom_str_323", SubstiliumMushroomStr323Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr323Feature.GENERATE_BIOMES, SubstiliumMushroomStr323Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_325 = register("substilium_mushroom_str_325", SubstiliumMushroomStr325Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr325Feature.GENERATE_BIOMES, SubstiliumMushroomStr325Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_141 = register("substilium_mushroom_str_141", SubstiliumMushroomStr141Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr141Feature.GENERATE_BIOMES, SubstiliumMushroomStr141Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_142 = register("substilium_mushroom_str_142", SubstiliumMushroomStr142Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr142Feature.GENERATE_BIOMES, SubstiliumMushroomStr142Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_143 = register("substilium_mushroom_str_143", SubstiliumMushroomStr143Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr143Feature.GENERATE_BIOMES, SubstiliumMushroomStr143Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_144 = register("substilium_mushroom_str_144", SubstiliumMushroomStr144Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr144Feature.GENERATE_BIOMES, SubstiliumMushroomStr144Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_145 = register("substilium_mushroom_str_145", SubstiliumMushroomStr145Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr145Feature.GENERATE_BIOMES, SubstiliumMushroomStr145Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_146 = register("substilium_mushroom_str_146", SubstiliumMushroomStr146Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr146Feature.GENERATE_BIOMES, SubstiliumMushroomStr146Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_147 = register("substilium_mushroom_str_147", SubstiliumMushroomStr147Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr147Feature.GENERATE_BIOMES, SubstiliumMushroomStr147Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_148 = register("substilium_mushroom_str_148", SubstiliumMushroomStr148Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr148Feature.GENERATE_BIOMES, SubstiliumMushroomStr148Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_149 = register("substilium_mushroom_str_149", SubstiliumMushroomStr149Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr149Feature.GENERATE_BIOMES, SubstiliumMushroomStr149Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_150 = register("substilium_mushroom_str_150", SubstiliumMushroomStr150Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr150Feature.GENERATE_BIOMES, SubstiliumMushroomStr150Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_151 = register("substilium_mushroom_str_151", SubstiliumMushroomStr151Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr151Feature.GENERATE_BIOMES, SubstiliumMushroomStr151Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_152 = register("substilium_mushroom_str_152", SubstiliumMushroomStr152Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr152Feature.GENERATE_BIOMES, SubstiliumMushroomStr152Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_153 = register("substilium_mushroom_str_153", SubstiliumMushroomStr153Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr153Feature.GENERATE_BIOMES, SubstiliumMushroomStr153Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_154 = register("substilium_mushroom_str_154", SubstiliumMushroomStr154Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr154Feature.GENERATE_BIOMES, SubstiliumMushroomStr154Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_155 = register("substilium_mushroom_str_155", SubstiliumMushroomStr155Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr155Feature.GENERATE_BIOMES, SubstiliumMushroomStr155Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_156 = register("substilium_mushroom_str_156", SubstiliumMushroomStr156Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr156Feature.GENERATE_BIOMES, SubstiliumMushroomStr156Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_157 = register("substilium_mushroom_str_157", SubstiliumMushroomStr157Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr157Feature.GENERATE_BIOMES, SubstiliumMushroomStr157Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_158 = register("substilium_mushroom_str_158", SubstiliumMushroomStr158Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr158Feature.GENERATE_BIOMES, SubstiliumMushroomStr158Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_326 = register("substilium_mushroom_str_326", SubstiliumMushroomStr326Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr326Feature.GENERATE_BIOMES, SubstiliumMushroomStr326Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_327 = register("substilium_mushroom_str_327", SubstiliumMushroomStr327Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr327Feature.GENERATE_BIOMES, SubstiliumMushroomStr327Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_328 = register("substilium_mushroom_str_328", SubstiliumMushroomStr328Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr328Feature.GENERATE_BIOMES, SubstiliumMushroomStr328Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_329 = register("substilium_mushroom_str_329", SubstiliumMushroomStr329Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr329Feature.GENERATE_BIOMES, SubstiliumMushroomStr329Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_330 = register("substilium_mushroom_str_330", SubstiliumMushroomStr330Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr330Feature.GENERATE_BIOMES, SubstiliumMushroomStr330Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_331 = register("substilium_mushroom_str_331", SubstiliumMushroomStr331Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr331Feature.GENERATE_BIOMES, SubstiliumMushroomStr331Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_332 = register("substilium_mushroom_str_332", SubstiliumMushroomStr332Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr332Feature.GENERATE_BIOMES, SubstiliumMushroomStr332Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_333 = register("substilium_mushroom_str_333", SubstiliumMushroomStr333Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr333Feature.GENERATE_BIOMES, SubstiliumMushroomStr333Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_334 = register("substilium_mushroom_str_334", SubstiliumMushroomStr334Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr334Feature.GENERATE_BIOMES, SubstiliumMushroomStr334Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_335 = register("substilium_mushroom_str_335", SubstiliumMushroomStr335Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr335Feature.GENERATE_BIOMES, SubstiliumMushroomStr335Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_336 = register("substilium_mushroom_str_336", SubstiliumMushroomStr336Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr336Feature.GENERATE_BIOMES, SubstiliumMushroomStr336Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_337 = register("substilium_mushroom_str_337", SubstiliumMushroomStr337Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr337Feature.GENERATE_BIOMES, SubstiliumMushroomStr337Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_338 = register("substilium_mushroom_str_338", SubstiliumMushroomStr338Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr338Feature.GENERATE_BIOMES, SubstiliumMushroomStr338Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_339 = register("substilium_mushroom_str_339", SubstiliumMushroomStr339Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr339Feature.GENERATE_BIOMES, SubstiliumMushroomStr339Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_230 = register("substilium_mushroom_str_230", SubstiliumMushroomStr230Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr230Feature.GENERATE_BIOMES, SubstiliumMushroomStr230Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_231 = register("substilium_mushroom_str_231", SubstiliumMushroomStr231Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr231Feature.GENERATE_BIOMES, SubstiliumMushroomStr231Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_232 = register("substilium_mushroom_str_232", SubstiliumMushroomStr232Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr232Feature.GENERATE_BIOMES, SubstiliumMushroomStr232Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_233 = register("substilium_mushroom_str_233", SubstiliumMushroomStr233Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr233Feature.GENERATE_BIOMES, SubstiliumMushroomStr233Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_234 = register("substilium_mushroom_str_234", SubstiliumMushroomStr234Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr234Feature.GENERATE_BIOMES, SubstiliumMushroomStr234Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_235 = register("substilium_mushroom_str_235", SubstiliumMushroomStr235Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr235Feature.GENERATE_BIOMES, SubstiliumMushroomStr235Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_159 = register("substilium_mushroom_str_159", SubstiliumMushroomStr159Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr159Feature.GENERATE_BIOMES, SubstiliumMushroomStr159Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_160 = register("substilium_mushroom_str_160", SubstiliumMushroomStr160Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr160Feature.GENERATE_BIOMES, SubstiliumMushroomStr160Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_161 = register("substilium_mushroom_str_161", SubstiliumMushroomStr161Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr161Feature.GENERATE_BIOMES, SubstiliumMushroomStr161Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_162 = register("substilium_mushroom_str_162", SubstiliumMushroomStr162Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr162Feature.GENERATE_BIOMES, SubstiliumMushroomStr162Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_163 = register("substilium_mushroom_str_163", SubstiliumMushroomStr163Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr163Feature.GENERATE_BIOMES, SubstiliumMushroomStr163Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_164 = register("substilium_mushroom_str_164", SubstiliumMushroomStr164Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr164Feature.GENERATE_BIOMES, SubstiliumMushroomStr164Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_165 = register("substilium_mushroom_str_165", SubstiliumMushroomStr165Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr165Feature.GENERATE_BIOMES, SubstiliumMushroomStr165Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_166 = register("substilium_mushroom_str_166", SubstiliumMushroomStr166Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr166Feature.GENERATE_BIOMES, SubstiliumMushroomStr166Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_167 = register("substilium_mushroom_str_167", SubstiliumMushroomStr167Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr167Feature.GENERATE_BIOMES, SubstiliumMushroomStr167Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_168 = register("substilium_mushroom_str_168", SubstiliumMushroomStr168Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr168Feature.GENERATE_BIOMES, SubstiliumMushroomStr168Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_169 = register("substilium_mushroom_str_169", SubstiliumMushroomStr169Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr169Feature.GENERATE_BIOMES, SubstiliumMushroomStr169Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_340 = register("substilium_mushroom_str_340", SubstiliumMushroomStr340Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr340Feature.GENERATE_BIOMES, SubstiliumMushroomStr340Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_341 = register("substilium_mushroom_str_341", SubstiliumMushroomStr341Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr341Feature.GENERATE_BIOMES, SubstiliumMushroomStr341Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_342 = register("substilium_mushroom_str_342", SubstiliumMushroomStr342Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr342Feature.GENERATE_BIOMES, SubstiliumMushroomStr342Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_343 = register("substilium_mushroom_str_343", SubstiliumMushroomStr343Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr343Feature.GENERATE_BIOMES, SubstiliumMushroomStr343Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_344 = register("substilium_mushroom_str_344", SubstiliumMushroomStr344Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr344Feature.GENERATE_BIOMES, SubstiliumMushroomStr344Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_345 = register("substilium_mushroom_str_345", SubstiliumMushroomStr345Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr345Feature.GENERATE_BIOMES, SubstiliumMushroomStr345Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_236 = register("substilium_mushroom_str_236", SubstiliumMushroomStr236Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr236Feature.GENERATE_BIOMES, SubstiliumMushroomStr236Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_237 = register("substilium_mushroom_str_237", SubstiliumMushroomStr237Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr237Feature.GENERATE_BIOMES, SubstiliumMushroomStr237Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_238 = register("substilium_mushroom_str_238", SubstiliumMushroomStr238Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr238Feature.GENERATE_BIOMES, SubstiliumMushroomStr238Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_239 = register("substilium_mushroom_str_239", SubstiliumMushroomStr239Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr239Feature.GENERATE_BIOMES, SubstiliumMushroomStr239Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_240 = register("substilium_mushroom_str_240", SubstiliumMushroomStr240Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr240Feature.GENERATE_BIOMES, SubstiliumMushroomStr240Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_241 = register("substilium_mushroom_str_241", SubstiliumMushroomStr241Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr241Feature.GENERATE_BIOMES, SubstiliumMushroomStr241Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_242 = register("substilium_mushroom_str_242", SubstiliumMushroomStr242Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr242Feature.GENERATE_BIOMES, SubstiliumMushroomStr242Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_243 = register("substilium_mushroom_str_243", SubstiliumMushroomStr243Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr243Feature.GENERATE_BIOMES, SubstiliumMushroomStr243Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_244 = register("substilium_mushroom_str_244", SubstiliumMushroomStr244Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr244Feature.GENERATE_BIOMES, SubstiliumMushroomStr244Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_245 = register("substilium_mushroom_str_245", SubstiliumMushroomStr245Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumMushroomStr245Feature.GENERATE_BIOMES, SubstiliumMushroomStr245Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_11 = register("hickory_tree_str_11", HickoryTreeStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr11Feature.GENERATE_BIOMES, HickoryTreeStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_12 = register("hickory_tree_str_12", HickoryTreeStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr12Feature.GENERATE_BIOMES, HickoryTreeStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_21 = register("hickory_tree_str_21", HickoryTreeStr21Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr21Feature.GENERATE_BIOMES, HickoryTreeStr21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_22 = register("hickory_tree_str_22", HickoryTreeStr22Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr22Feature.GENERATE_BIOMES, HickoryTreeStr22Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_31 = register("hickory_tree_str_31", HickoryTreeStr31Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr31Feature.GENERATE_BIOMES, HickoryTreeStr31Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_32 = register("hickory_tree_str_32", HickoryTreeStr32Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr32Feature.GENERATE_BIOMES, HickoryTreeStr32Feature::placedFeature));
	public static final RegistryObject<Feature<?>> TALL_BIRCH_TREE_STR_1 = register("tall_birch_tree_str_1", TallBirchTreeStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, TallBirchTreeStr1Feature.GENERATE_BIOMES, TallBirchTreeStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> TALL_OAK_TREE_STR_1 = register("tall_oak_tree_str_1", TallOakTreeStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, TallOakTreeStr1Feature.GENERATE_BIOMES, TallOakTreeStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_15 = register("hanging_vibrion_vines_grower_str_15", HangingVibrionVinesGrowerStr15Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr15Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_16 = register("hanging_vibrion_vines_grower_str_16", HangingVibrionVinesGrowerStr16Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr16Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_17 = register("hanging_vibrion_vines_grower_str_17", HangingVibrionVinesGrowerStr17Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr17Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR = register("hanging_vibrion_vines_grower_str", HangingVibrionVinesGrowerStrFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStrFeature.GENERATE_BIOMES, HangingVibrionVinesGrowerStrFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_19 = register("hanging_vibrion_vines_grower_str_19", HangingVibrionVinesGrowerStr19Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr19Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr19Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_20 = register("hanging_vibrion_vines_grower_str_20", HangingVibrionVinesGrowerStr20Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionVinesGrowerStr20Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr20Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_10 = register("hanging_vibrion_gel_grower_str_10", HangingVibrionGelGrowerStr10Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr10Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_11 = register("hanging_vibrion_gel_grower_str_11", HangingVibrionGelGrowerStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr11Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_12 = register("hanging_vibrion_gel_grower_str_12", HangingVibrionGelGrowerStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr12Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_13 = register("hanging_vibrion_gel_grower_str_13", HangingVibrionGelGrowerStr13Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr13Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_14 = register("hanging_vibrion_gel_grower_str_14", HangingVibrionGelGrowerStr14Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr14Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_15 = register("hanging_vibrion_gel_grower_str_15", HangingVibrionGelGrowerStr15Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, HangingVibrionGelGrowerStr15Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_GLOWING_HICKORY_TREE = register("red_glowing_hickory_tree", RedGlowingHickoryTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RedGlowingHickoryTreeFeature.GENERATE_BIOMES, RedGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_GLOWING_HICKORY_TREE = register("yellow_glowing_hickory_tree", YellowGlowingHickoryTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, YellowGlowingHickoryTreeFeature.GENERATE_BIOMES, YellowGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BROWN_GLOWING_HICKORY_TREE = register("brown_glowing_hickory_tree", BrownGlowingHickoryTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BrownGlowingHickoryTreeFeature.GENERATE_BIOMES, BrownGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEN_GLOWING_HICKORY_TREE = register("green_glowing_hickory_tree", GreenGlowingHickoryTreeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GreenGlowingHickoryTreeFeature.GENERATE_BIOMES, GreenGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_1 = register("substilium_tree_grower_str_1", SubstiliumTreeGrowerStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr1Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_2 = register("substilium_tree_grower_str_2", SubstiliumTreeGrowerStr2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr2Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_3 = register("substilium_tree_grower_str_3", SubstiliumTreeGrowerStr3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr3Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_4 = register("substilium_tree_grower_str_4", SubstiliumTreeGrowerStr4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr4Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_5 = register("substilium_tree_grower_str_5", SubstiliumTreeGrowerStr5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr5Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_6 = register("substilium_tree_grower_str_6", SubstiliumTreeGrowerStr6Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr6Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr6Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_7 = register("substilium_tree_grower_str_7", SubstiliumTreeGrowerStr7Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr7Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr7Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_8 = register("substilium_tree_grower_str_8", SubstiliumTreeGrowerStr8Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr8Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr8Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_9 = register("substilium_tree_grower_str_9", SubstiliumTreeGrowerStr9Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr9Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr9Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_10 = register("substilium_tree_grower_str_10", SubstiliumTreeGrowerStr10Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr10Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_11 = register("substilium_tree_grower_str_11", SubstiliumTreeGrowerStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr11Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_12 = register("substilium_tree_grower_str_12", SubstiliumTreeGrowerStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr12Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_13 = register("substilium_tree_grower_str_13", SubstiliumTreeGrowerStr13Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr13Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_14 = register("substilium_tree_grower_str_14", SubstiliumTreeGrowerStr14Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr14Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_TREE_GROWER_STR_15 = register("substilium_tree_grower_str_15", SubstiliumTreeGrowerStr15Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, SubstiliumTreeGrowerStr15Feature.GENERATE_BIOMES, SubstiliumTreeGrowerStr15Feature::placedFeature));

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

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
