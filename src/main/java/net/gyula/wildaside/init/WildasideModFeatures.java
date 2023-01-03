
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
import net.gyula.wildaside.world.features.plants.FallenYellowGlowingHickoryLeavesFeature;
import net.gyula.wildaside.world.features.plants.FallenRedGlowingHickoryLeavesFeature;
import net.gyula.wildaside.world.features.plants.FallenHickoryLeavesFeature;
import net.gyula.wildaside.world.features.plants.FallenGreenGlwoingHickoryLeavesFeature;
import net.gyula.wildaside.world.features.plants.FallenBrownGlowingHickoryLeavesFeature;
import net.gyula.wildaside.world.features.plants.BrownGlowingHickorySaplingFeature;
import net.gyula.wildaside.world.features.ores.OvergrownEntoriumOreFeature;
import net.gyula.wildaside.world.features.ores.CompressedSubstiliumSoilFeature;
import net.gyula.wildaside.world.features.YellowGlowingHickoryTreeFeature;
import net.gyula.wildaside.world.features.TallOakTreeStr1Feature;
import net.gyula.wildaside.world.features.TallBirchTreeStr1Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr59Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr58Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr57Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr56Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr569Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr568Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr567Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr55Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr54Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr547Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr546Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr545Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr544Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr543Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr542Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr541Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr540Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr53Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr536Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr535Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr534Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr533Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr532Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr531Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr530Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr52Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr529Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr528Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr527Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr526Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr525Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr524Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr523Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr522Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr521Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr520Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr51Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr519Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr518Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr517Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr516Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr515Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr514Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr513Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr512Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr511Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr510Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr49Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr48Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr47Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr46Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr469Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr468Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr467Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr466Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr465Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr464Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr463Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr462Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr461Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr460Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr45Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr459Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr458Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr457Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr456Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr455Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr454Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr453Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr452Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr451Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr450Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr44Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr449Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr448Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr447Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr446Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr445Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr444Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr443Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr442Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr441Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr440Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr43Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr439Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr438Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr437Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr436Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr435Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr434Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr433Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr432Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr431Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr430Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr42Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr429Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr428Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr427Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr426Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr425Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr424Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr423Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr422Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr421Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr420Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr41Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr419Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr418Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr417Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr416Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr415Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr414Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr413Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr412Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr411Feature;
import net.gyula.wildaside.world.features.SubstiliumMushroomStr410Feature;
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
	public static final RegistryObject<Feature<?>> VIBRION_ROOTS = register("vibrion_roots", VibrionRootsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, VibrionRootsFeature.GENERATE_BIOMES, VibrionRootsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VIBRION_SPOREHOLDER = register("vibrion_sporeholder", VibrionSporeholderFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, VibrionSporeholderFeature.GENERATE_BIOMES,
					VibrionSporeholderFeature::placedFeature));
	public static final RegistryObject<Feature<?>> OVERGROWN_ENTORIUM_ORE = register("overgrown_entorium_ore", OvergrownEntoriumOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OvergrownEntoriumOreFeature.GENERATE_BIOMES,
					OvergrownEntoriumOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COMPRESSED_SUBSTILIUM_SOIL = register("compressed_substilium_soil",
			CompressedSubstiliumSoilFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					CompressedSubstiliumSoilFeature.GENERATE_BIOMES, CompressedSubstiliumSoilFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_SPROUTS = register("substilium_sprouts", SubstiliumSproutsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SubstiliumSproutsFeature.GENERATE_BIOMES,
					SubstiliumSproutsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_SAPLING = register("hickory_sapling", HickorySaplingFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, HickorySaplingFeature.GENERATE_BIOMES,
					HickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_GLOWING_HICKORY_SAPLING = register("red_glowing_hickory_sapling",
			RedGlowingHickorySaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					RedGlowingHickorySaplingFeature.GENERATE_BIOMES, RedGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_GLOWING_HICKORY_SAPLING = register("yellow_glowing_hickory_sapling",
			YellowGlowingHickorySaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					YellowGlowingHickorySaplingFeature.GENERATE_BIOMES, YellowGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BROWN_GLOWING_HICKORY_SAPLING = register("brown_glowing_hickory_sapling",
			BrownGlowingHickorySaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					BrownGlowingHickorySaplingFeature.GENERATE_BIOMES, BrownGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEN_GLOWING_HICKORY_SAPLING = register("green_glowing_hickory_sapling",
			GreenGlowingHickorySaplingFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					GreenGlowingHickorySaplingFeature.GENERATE_BIOMES, GreenGlowingHickorySaplingFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PANXTER_FLOWER = register("panxter_flower", PanxterFlowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.VEGETAL_DECORATION, PanxterFlowerFeature.GENERATE_BIOMES, PanxterFlowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPOTTED_WINTERGREEN = register("spotted_wintergreen", SpottedWintergreenFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, SpottedWintergreenFeature.GENERATE_BIOMES,
					SpottedWintergreenFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_1 = register("hanging_vibrion_vines_grower_str_1",
			HangingVibrionVinesGrowerStr1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr1Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr1Feature::placedFeature));
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
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_13 = register("hanging_vibrion_vines_grower_str_13",
			HangingVibrionVinesGrowerStr13Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr13Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_14 = register("hanging_vibrion_vines_grower_str_14",
			HangingVibrionVinesGrowerStr14Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr14Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_11 = register("substilium_mushroom_str_11",
			SubstiliumMushroomStr11Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr11Feature.GENERATE_BIOMES, SubstiliumMushroomStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_12 = register("substilium_mushroom_str_12",
			SubstiliumMushroomStr12Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr12Feature.GENERATE_BIOMES, SubstiliumMushroomStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_13 = register("substilium_mushroom_str_13",
			SubstiliumMushroomStr13Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr13Feature.GENERATE_BIOMES, SubstiliumMushroomStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_14 = register("substilium_mushroom_str_14",
			SubstiliumMushroomStr14Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr14Feature.GENERATE_BIOMES, SubstiliumMushroomStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_15 = register("substilium_mushroom_str_15",
			SubstiliumMushroomStr15Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr15Feature.GENERATE_BIOMES, SubstiliumMushroomStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_16 = register("substilium_mushroom_str_16",
			SubstiliumMushroomStr16Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr16Feature.GENERATE_BIOMES, SubstiliumMushroomStr16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_17 = register("substilium_mushroom_str_17",
			SubstiliumMushroomStr17Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr17Feature.GENERATE_BIOMES, SubstiliumMushroomStr17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_18 = register("substilium_mushroom_str_18",
			SubstiliumMushroomStr18Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr18Feature.GENERATE_BIOMES, SubstiliumMushroomStr18Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_19 = register("substilium_mushroom_str_19",
			SubstiliumMushroomStr19Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr19Feature.GENERATE_BIOMES, SubstiliumMushroomStr19Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_110 = register("substilium_mushroom_str_110",
			SubstiliumMushroomStr110Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr110Feature.GENERATE_BIOMES, SubstiliumMushroomStr110Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_111 = register("substilium_mushroom_str_111",
			SubstiliumMushroomStr111Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr111Feature.GENERATE_BIOMES, SubstiliumMushroomStr111Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_112 = register("substilium_mushroom_str_112",
			SubstiliumMushroomStr112Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr112Feature.GENERATE_BIOMES, SubstiliumMushroomStr112Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_113 = register("substilium_mushroom_str_113",
			SubstiliumMushroomStr113Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr113Feature.GENERATE_BIOMES, SubstiliumMushroomStr113Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_114 = register("substilium_mushroom_str_114",
			SubstiliumMushroomStr114Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr114Feature.GENERATE_BIOMES, SubstiliumMushroomStr114Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_115 = register("substilium_mushroom_str_115",
			SubstiliumMushroomStr115Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr115Feature.GENERATE_BIOMES, SubstiliumMushroomStr115Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_116 = register("substilium_mushroom_str_116",
			SubstiliumMushroomStr116Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr116Feature.GENERATE_BIOMES, SubstiliumMushroomStr116Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_117 = register("substilium_mushroom_str_117",
			SubstiliumMushroomStr117Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr117Feature.GENERATE_BIOMES, SubstiliumMushroomStr117Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_118 = register("substilium_mushroom_str_118",
			SubstiliumMushroomStr118Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr118Feature.GENERATE_BIOMES, SubstiliumMushroomStr118Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_119 = register("substilium_mushroom_str_119",
			SubstiliumMushroomStr119Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr119Feature.GENERATE_BIOMES, SubstiliumMushroomStr119Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_120 = register("substilium_mushroom_str_120",
			SubstiliumMushroomStr120Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr120Feature.GENERATE_BIOMES, SubstiliumMushroomStr120Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_121 = register("substilium_mushroom_str_121",
			SubstiliumMushroomStr121Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr121Feature.GENERATE_BIOMES, SubstiliumMushroomStr121Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_122 = register("substilium_mushroom_str_122",
			SubstiliumMushroomStr122Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr122Feature.GENERATE_BIOMES, SubstiliumMushroomStr122Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_123 = register("substilium_mushroom_str_123",
			SubstiliumMushroomStr123Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr123Feature.GENERATE_BIOMES, SubstiliumMushroomStr123Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_124 = register("substilium_mushroom_str_124",
			SubstiliumMushroomStr124Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr124Feature.GENERATE_BIOMES, SubstiliumMushroomStr124Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_125 = register("substilium_mushroom_str_125",
			SubstiliumMushroomStr125Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr125Feature.GENERATE_BIOMES, SubstiliumMushroomStr125Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_126 = register("substilium_mushroom_str_126",
			SubstiliumMushroomStr126Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr126Feature.GENERATE_BIOMES, SubstiliumMushroomStr126Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_127 = register("substilium_mushroom_str_127",
			SubstiliumMushroomStr127Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr127Feature.GENERATE_BIOMES, SubstiliumMushroomStr127Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_128 = register("substilium_mushroom_str_128",
			SubstiliumMushroomStr128Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr128Feature.GENERATE_BIOMES, SubstiliumMushroomStr128Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_129 = register("substilium_mushroom_str_129",
			SubstiliumMushroomStr129Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr129Feature.GENERATE_BIOMES, SubstiliumMushroomStr129Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_130 = register("substilium_mushroom_str_130",
			SubstiliumMushroomStr130Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr130Feature.GENERATE_BIOMES, SubstiliumMushroomStr130Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_131 = register("substilium_mushroom_str_131",
			SubstiliumMushroomStr131Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr131Feature.GENERATE_BIOMES, SubstiliumMushroomStr131Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_132 = register("substilium_mushroom_str_132",
			SubstiliumMushroomStr132Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr132Feature.GENERATE_BIOMES, SubstiliumMushroomStr132Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_133 = register("substilium_mushroom_str_133",
			SubstiliumMushroomStr133Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr133Feature.GENERATE_BIOMES, SubstiliumMushroomStr133Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_134 = register("substilium_mushroom_str_134",
			SubstiliumMushroomStr134Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr134Feature.GENERATE_BIOMES, SubstiliumMushroomStr134Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_135 = register("substilium_mushroom_str_135",
			SubstiliumMushroomStr135Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr135Feature.GENERATE_BIOMES, SubstiliumMushroomStr135Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_136 = register("substilium_mushroom_str_136",
			SubstiliumMushroomStr136Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr136Feature.GENERATE_BIOMES, SubstiliumMushroomStr136Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_137 = register("substilium_mushroom_str_137",
			SubstiliumMushroomStr137Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr137Feature.GENERATE_BIOMES, SubstiliumMushroomStr137Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_138 = register("substilium_mushroom_str_138",
			SubstiliumMushroomStr138Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr138Feature.GENERATE_BIOMES, SubstiliumMushroomStr138Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_139 = register("substilium_mushroom_str_139",
			SubstiliumMushroomStr139Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr139Feature.GENERATE_BIOMES, SubstiliumMushroomStr139Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_140 = register("substilium_mushroom_str_140",
			SubstiliumMushroomStr140Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr140Feature.GENERATE_BIOMES, SubstiliumMushroomStr140Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_21 = register("substilium_mushroom_str_21",
			SubstiliumMushroomStr21Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr21Feature.GENERATE_BIOMES, SubstiliumMushroomStr21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_22 = register("substilium_mushroom_str_22",
			SubstiliumMushroomStr22Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr22Feature.GENERATE_BIOMES, SubstiliumMushroomStr22Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_23 = register("substilium_mushroom_str_23",
			SubstiliumMushroomStr23Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr23Feature.GENERATE_BIOMES, SubstiliumMushroomStr23Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_24 = register("substilium_mushroom_str_24",
			SubstiliumMushroomStr24Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr24Feature.GENERATE_BIOMES, SubstiliumMushroomStr24Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_25 = register("substilium_mushroom_str_25",
			SubstiliumMushroomStr25Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr25Feature.GENERATE_BIOMES, SubstiliumMushroomStr25Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_26 = register("substilium_mushroom_str_26",
			SubstiliumMushroomStr26Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr26Feature.GENERATE_BIOMES, SubstiliumMushroomStr26Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_27 = register("substilium_mushroom_str_27",
			SubstiliumMushroomStr27Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr27Feature.GENERATE_BIOMES, SubstiliumMushroomStr27Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_28 = register("substilium_mushroom_str_28",
			SubstiliumMushroomStr28Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr28Feature.GENERATE_BIOMES, SubstiliumMushroomStr28Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_29 = register("substilium_mushroom_str_29",
			SubstiliumMushroomStr29Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr29Feature.GENERATE_BIOMES, SubstiliumMushroomStr29Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_210 = register("substilium_mushroom_str_210",
			SubstiliumMushroomStr210Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr210Feature.GENERATE_BIOMES, SubstiliumMushroomStr210Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_211 = register("substilium_mushroom_str_211",
			SubstiliumMushroomStr211Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr211Feature.GENERATE_BIOMES, SubstiliumMushroomStr211Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_212 = register("substilium_mushroom_str_212",
			SubstiliumMushroomStr212Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr212Feature.GENERATE_BIOMES, SubstiliumMushroomStr212Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_213 = register("substilium_mushroom_str_213",
			SubstiliumMushroomStr213Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr213Feature.GENERATE_BIOMES, SubstiliumMushroomStr213Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_214 = register("substilium_mushroom_str_214",
			SubstiliumMushroomStr214Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr214Feature.GENERATE_BIOMES, SubstiliumMushroomStr214Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_215 = register("substilium_mushroom_str_215",
			SubstiliumMushroomStr215Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr215Feature.GENERATE_BIOMES, SubstiliumMushroomStr215Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_216 = register("substilium_mushroom_str_216",
			SubstiliumMushroomStr216Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr216Feature.GENERATE_BIOMES, SubstiliumMushroomStr216Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_217 = register("substilium_mushroom_str_217",
			SubstiliumMushroomStr217Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr217Feature.GENERATE_BIOMES, SubstiliumMushroomStr217Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_218 = register("substilium_mushroom_str_218",
			SubstiliumMushroomStr218Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr218Feature.GENERATE_BIOMES, SubstiliumMushroomStr218Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_219 = register("substilium_mushroom_str_219",
			SubstiliumMushroomStr219Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr219Feature.GENERATE_BIOMES, SubstiliumMushroomStr219Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_220 = register("substilium_mushroom_str_220",
			SubstiliumMushroomStr220Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr220Feature.GENERATE_BIOMES, SubstiliumMushroomStr220Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_221 = register("substilium_mushroom_str_221",
			SubstiliumMushroomStr221Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr221Feature.GENERATE_BIOMES, SubstiliumMushroomStr221Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_222 = register("substilium_mushroom_str_222",
			SubstiliumMushroomStr222Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr222Feature.GENERATE_BIOMES, SubstiliumMushroomStr222Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_223 = register("substilium_mushroom_str_223",
			SubstiliumMushroomStr223Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr223Feature.GENERATE_BIOMES, SubstiliumMushroomStr223Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_224 = register("substilium_mushroom_str_224",
			SubstiliumMushroomStr224Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr224Feature.GENERATE_BIOMES, SubstiliumMushroomStr224Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_225 = register("substilium_mushroom_str_225",
			SubstiliumMushroomStr225Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr225Feature.GENERATE_BIOMES, SubstiliumMushroomStr225Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_226 = register("substilium_mushroom_str_226",
			SubstiliumMushroomStr226Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr226Feature.GENERATE_BIOMES, SubstiliumMushroomStr226Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_227 = register("substilium_mushroom_str_227",
			SubstiliumMushroomStr227Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr227Feature.GENERATE_BIOMES, SubstiliumMushroomStr227Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_228 = register("substilium_mushroom_str_228",
			SubstiliumMushroomStr228Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr228Feature.GENERATE_BIOMES, SubstiliumMushroomStr228Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_229 = register("substilium_mushroom_str_229",
			SubstiliumMushroomStr229Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr229Feature.GENERATE_BIOMES, SubstiliumMushroomStr229Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_31 = register("substilium_mushroom_str_31",
			SubstiliumMushroomStr31Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr31Feature.GENERATE_BIOMES, SubstiliumMushroomStr31Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_32 = register("substilium_mushroom_str_32",
			SubstiliumMushroomStr32Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr32Feature.GENERATE_BIOMES, SubstiliumMushroomStr32Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_33 = register("substilium_mushroom_str_33",
			SubstiliumMushroomStr33Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr33Feature.GENERATE_BIOMES, SubstiliumMushroomStr33Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_34 = register("substilium_mushroom_str_34",
			SubstiliumMushroomStr34Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr34Feature.GENERATE_BIOMES, SubstiliumMushroomStr34Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_35 = register("substilium_mushroom_str_35",
			SubstiliumMushroomStr35Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr35Feature.GENERATE_BIOMES, SubstiliumMushroomStr35Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_36 = register("substilium_mushroom_str_36",
			SubstiliumMushroomStr36Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr36Feature.GENERATE_BIOMES, SubstiliumMushroomStr36Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_37 = register("substilium_mushroom_str_37",
			SubstiliumMushroomStr37Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr37Feature.GENERATE_BIOMES, SubstiliumMushroomStr37Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_38 = register("substilium_mushroom_str_38",
			SubstiliumMushroomStr38Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr38Feature.GENERATE_BIOMES, SubstiliumMushroomStr38Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_39 = register("substilium_mushroom_str_39",
			SubstiliumMushroomStr39Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr39Feature.GENERATE_BIOMES, SubstiliumMushroomStr39Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_310 = register("substilium_mushroom_str_310",
			SubstiliumMushroomStr310Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr310Feature.GENERATE_BIOMES, SubstiliumMushroomStr310Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_311 = register("substilium_mushroom_str_311",
			SubstiliumMushroomStr311Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr311Feature.GENERATE_BIOMES, SubstiliumMushroomStr311Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_312 = register("substilium_mushroom_str_312",
			SubstiliumMushroomStr312Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr312Feature.GENERATE_BIOMES, SubstiliumMushroomStr312Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_313 = register("substilium_mushroom_str_313",
			SubstiliumMushroomStr313Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr313Feature.GENERATE_BIOMES, SubstiliumMushroomStr313Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_314 = register("substilium_mushroom_str_314",
			SubstiliumMushroomStr314Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr314Feature.GENERATE_BIOMES, SubstiliumMushroomStr314Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_315 = register("substilium_mushroom_str_315",
			SubstiliumMushroomStr315Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr315Feature.GENERATE_BIOMES, SubstiliumMushroomStr315Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_316 = register("substilium_mushroom_str_316",
			SubstiliumMushroomStr316Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr316Feature.GENERATE_BIOMES, SubstiliumMushroomStr316Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_317 = register("substilium_mushroom_str_317",
			SubstiliumMushroomStr317Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr317Feature.GENERATE_BIOMES, SubstiliumMushroomStr317Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_318 = register("substilium_mushroom_str_318",
			SubstiliumMushroomStr318Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr318Feature.GENERATE_BIOMES, SubstiliumMushroomStr318Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_319 = register("substilium_mushroom_str_319",
			SubstiliumMushroomStr319Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr319Feature.GENERATE_BIOMES, SubstiliumMushroomStr319Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_320 = register("substilium_mushroom_str_320",
			SubstiliumMushroomStr320Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr320Feature.GENERATE_BIOMES, SubstiliumMushroomStr320Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_321 = register("substilium_mushroom_str_321",
			SubstiliumMushroomStr321Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr321Feature.GENERATE_BIOMES, SubstiliumMushroomStr321Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_322 = register("substilium_mushroom_str_322",
			SubstiliumMushroomStr322Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr322Feature.GENERATE_BIOMES, SubstiliumMushroomStr322Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_323 = register("substilium_mushroom_str_323",
			SubstiliumMushroomStr323Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr323Feature.GENERATE_BIOMES, SubstiliumMushroomStr323Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_325 = register("substilium_mushroom_str_325",
			SubstiliumMushroomStr325Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr325Feature.GENERATE_BIOMES, SubstiliumMushroomStr325Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_41 = register("substilium_mushroom_str_41",
			SubstiliumMushroomStr41Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr41Feature.GENERATE_BIOMES, SubstiliumMushroomStr41Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_42 = register("substilium_mushroom_str_42",
			SubstiliumMushroomStr42Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr42Feature.GENERATE_BIOMES, SubstiliumMushroomStr42Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_43 = register("substilium_mushroom_str_43",
			SubstiliumMushroomStr43Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr43Feature.GENERATE_BIOMES, SubstiliumMushroomStr43Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_44 = register("substilium_mushroom_str_44",
			SubstiliumMushroomStr44Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr44Feature.GENERATE_BIOMES, SubstiliumMushroomStr44Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_45 = register("substilium_mushroom_str_45",
			SubstiliumMushroomStr45Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr45Feature.GENERATE_BIOMES, SubstiliumMushroomStr45Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_46 = register("substilium_mushroom_str_46",
			SubstiliumMushroomStr46Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr46Feature.GENERATE_BIOMES, SubstiliumMushroomStr46Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_47 = register("substilium_mushroom_str_47",
			SubstiliumMushroomStr47Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr47Feature.GENERATE_BIOMES, SubstiliumMushroomStr47Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_48 = register("substilium_mushroom_str_48",
			SubstiliumMushroomStr48Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr48Feature.GENERATE_BIOMES, SubstiliumMushroomStr48Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_49 = register("substilium_mushroom_str_49",
			SubstiliumMushroomStr49Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr49Feature.GENERATE_BIOMES, SubstiliumMushroomStr49Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_410 = register("substilium_mushroom_str_410",
			SubstiliumMushroomStr410Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr410Feature.GENERATE_BIOMES, SubstiliumMushroomStr410Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_411 = register("substilium_mushroom_str_411",
			SubstiliumMushroomStr411Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr411Feature.GENERATE_BIOMES, SubstiliumMushroomStr411Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_412 = register("substilium_mushroom_str_412",
			SubstiliumMushroomStr412Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr412Feature.GENERATE_BIOMES, SubstiliumMushroomStr412Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_413 = register("substilium_mushroom_str_413",
			SubstiliumMushroomStr413Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr413Feature.GENERATE_BIOMES, SubstiliumMushroomStr413Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_414 = register("substilium_mushroom_str_414",
			SubstiliumMushroomStr414Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr414Feature.GENERATE_BIOMES, SubstiliumMushroomStr414Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_415 = register("substilium_mushroom_str_415",
			SubstiliumMushroomStr415Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr415Feature.GENERATE_BIOMES, SubstiliumMushroomStr415Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_416 = register("substilium_mushroom_str_416",
			SubstiliumMushroomStr416Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr416Feature.GENERATE_BIOMES, SubstiliumMushroomStr416Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_417 = register("substilium_mushroom_str_417",
			SubstiliumMushroomStr417Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr417Feature.GENERATE_BIOMES, SubstiliumMushroomStr417Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_418 = register("substilium_mushroom_str_418",
			SubstiliumMushroomStr418Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr418Feature.GENERATE_BIOMES, SubstiliumMushroomStr418Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_419 = register("substilium_mushroom_str_419",
			SubstiliumMushroomStr419Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr419Feature.GENERATE_BIOMES, SubstiliumMushroomStr419Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_420 = register("substilium_mushroom_str_420",
			SubstiliumMushroomStr420Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr420Feature.GENERATE_BIOMES, SubstiliumMushroomStr420Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_421 = register("substilium_mushroom_str_421",
			SubstiliumMushroomStr421Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr421Feature.GENERATE_BIOMES, SubstiliumMushroomStr421Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_422 = register("substilium_mushroom_str_422",
			SubstiliumMushroomStr422Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr422Feature.GENERATE_BIOMES, SubstiliumMushroomStr422Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_423 = register("substilium_mushroom_str_423",
			SubstiliumMushroomStr423Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr423Feature.GENERATE_BIOMES, SubstiliumMushroomStr423Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_424 = register("substilium_mushroom_str_424",
			SubstiliumMushroomStr424Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr424Feature.GENERATE_BIOMES, SubstiliumMushroomStr424Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_425 = register("substilium_mushroom_str_425",
			SubstiliumMushroomStr425Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr425Feature.GENERATE_BIOMES, SubstiliumMushroomStr425Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_426 = register("substilium_mushroom_str_426",
			SubstiliumMushroomStr426Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr426Feature.GENERATE_BIOMES, SubstiliumMushroomStr426Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_427 = register("substilium_mushroom_str_427",
			SubstiliumMushroomStr427Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr427Feature.GENERATE_BIOMES, SubstiliumMushroomStr427Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_428 = register("substilium_mushroom_str_428",
			SubstiliumMushroomStr428Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr428Feature.GENERATE_BIOMES, SubstiliumMushroomStr428Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_429 = register("substilium_mushroom_str_429",
			SubstiliumMushroomStr429Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr429Feature.GENERATE_BIOMES, SubstiliumMushroomStr429Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_430 = register("substilium_mushroom_str_430",
			SubstiliumMushroomStr430Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr430Feature.GENERATE_BIOMES, SubstiliumMushroomStr430Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_431 = register("substilium_mushroom_str_431",
			SubstiliumMushroomStr431Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr431Feature.GENERATE_BIOMES, SubstiliumMushroomStr431Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_432 = register("substilium_mushroom_str_432",
			SubstiliumMushroomStr432Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr432Feature.GENERATE_BIOMES, SubstiliumMushroomStr432Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_433 = register("substilium_mushroom_str_433",
			SubstiliumMushroomStr433Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr433Feature.GENERATE_BIOMES, SubstiliumMushroomStr433Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_434 = register("substilium_mushroom_str_434",
			SubstiliumMushroomStr434Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr434Feature.GENERATE_BIOMES, SubstiliumMushroomStr434Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_435 = register("substilium_mushroom_str_435",
			SubstiliumMushroomStr435Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr435Feature.GENERATE_BIOMES, SubstiliumMushroomStr435Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_436 = register("substilium_mushroom_str_436",
			SubstiliumMushroomStr436Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr436Feature.GENERATE_BIOMES, SubstiliumMushroomStr436Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_437 = register("substilium_mushroom_str_437",
			SubstiliumMushroomStr437Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr437Feature.GENERATE_BIOMES, SubstiliumMushroomStr437Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_438 = register("substilium_mushroom_str_438",
			SubstiliumMushroomStr438Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr438Feature.GENERATE_BIOMES, SubstiliumMushroomStr438Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_439 = register("substilium_mushroom_str_439",
			SubstiliumMushroomStr439Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr439Feature.GENERATE_BIOMES, SubstiliumMushroomStr439Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_440 = register("substilium_mushroom_str_440",
			SubstiliumMushroomStr440Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr440Feature.GENERATE_BIOMES, SubstiliumMushroomStr440Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_441 = register("substilium_mushroom_str_441",
			SubstiliumMushroomStr441Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr441Feature.GENERATE_BIOMES, SubstiliumMushroomStr441Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_442 = register("substilium_mushroom_str_442",
			SubstiliumMushroomStr442Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr442Feature.GENERATE_BIOMES, SubstiliumMushroomStr442Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_51 = register("substilium_mushroom_str_51",
			SubstiliumMushroomStr51Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr51Feature.GENERATE_BIOMES, SubstiliumMushroomStr51Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_52 = register("substilium_mushroom_str_52",
			SubstiliumMushroomStr52Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr52Feature.GENERATE_BIOMES, SubstiliumMushroomStr52Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_53 = register("substilium_mushroom_str_53",
			SubstiliumMushroomStr53Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr53Feature.GENERATE_BIOMES, SubstiliumMushroomStr53Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_54 = register("substilium_mushroom_str_54",
			SubstiliumMushroomStr54Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr54Feature.GENERATE_BIOMES, SubstiliumMushroomStr54Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_55 = register("substilium_mushroom_str_55",
			SubstiliumMushroomStr55Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr55Feature.GENERATE_BIOMES, SubstiliumMushroomStr55Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_56 = register("substilium_mushroom_str_56",
			SubstiliumMushroomStr56Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr56Feature.GENERATE_BIOMES, SubstiliumMushroomStr56Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_57 = register("substilium_mushroom_str_57",
			SubstiliumMushroomStr57Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr57Feature.GENERATE_BIOMES, SubstiliumMushroomStr57Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_58 = register("substilium_mushroom_str_58",
			SubstiliumMushroomStr58Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr58Feature.GENERATE_BIOMES, SubstiliumMushroomStr58Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_59 = register("substilium_mushroom_str_59",
			SubstiliumMushroomStr59Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr59Feature.GENERATE_BIOMES, SubstiliumMushroomStr59Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_510 = register("substilium_mushroom_str_510",
			SubstiliumMushroomStr510Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr510Feature.GENERATE_BIOMES, SubstiliumMushroomStr510Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_511 = register("substilium_mushroom_str_511",
			SubstiliumMushroomStr511Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr511Feature.GENERATE_BIOMES, SubstiliumMushroomStr511Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_512 = register("substilium_mushroom_str_512",
			SubstiliumMushroomStr512Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr512Feature.GENERATE_BIOMES, SubstiliumMushroomStr512Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_513 = register("substilium_mushroom_str_513",
			SubstiliumMushroomStr513Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr513Feature.GENERATE_BIOMES, SubstiliumMushroomStr513Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_514 = register("substilium_mushroom_str_514",
			SubstiliumMushroomStr514Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr514Feature.GENERATE_BIOMES, SubstiliumMushroomStr514Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_515 = register("substilium_mushroom_str_515",
			SubstiliumMushroomStr515Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr515Feature.GENERATE_BIOMES, SubstiliumMushroomStr515Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_516 = register("substilium_mushroom_str_516",
			SubstiliumMushroomStr516Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr516Feature.GENERATE_BIOMES, SubstiliumMushroomStr516Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_517 = register("substilium_mushroom_str_517",
			SubstiliumMushroomStr517Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr517Feature.GENERATE_BIOMES, SubstiliumMushroomStr517Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_518 = register("substilium_mushroom_str_518",
			SubstiliumMushroomStr518Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr518Feature.GENERATE_BIOMES, SubstiliumMushroomStr518Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_519 = register("substilium_mushroom_str_519",
			SubstiliumMushroomStr519Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr519Feature.GENERATE_BIOMES, SubstiliumMushroomStr519Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_520 = register("substilium_mushroom_str_520",
			SubstiliumMushroomStr520Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr520Feature.GENERATE_BIOMES, SubstiliumMushroomStr520Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_521 = register("substilium_mushroom_str_521",
			SubstiliumMushroomStr521Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr521Feature.GENERATE_BIOMES, SubstiliumMushroomStr521Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_522 = register("substilium_mushroom_str_522",
			SubstiliumMushroomStr522Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr522Feature.GENERATE_BIOMES, SubstiliumMushroomStr522Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_523 = register("substilium_mushroom_str_523",
			SubstiliumMushroomStr523Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr523Feature.GENERATE_BIOMES, SubstiliumMushroomStr523Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_524 = register("substilium_mushroom_str_524",
			SubstiliumMushroomStr524Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr524Feature.GENERATE_BIOMES, SubstiliumMushroomStr524Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_525 = register("substilium_mushroom_str_525",
			SubstiliumMushroomStr525Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr525Feature.GENERATE_BIOMES, SubstiliumMushroomStr525Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_141 = register("substilium_mushroom_str_141",
			SubstiliumMushroomStr141Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr141Feature.GENERATE_BIOMES, SubstiliumMushroomStr141Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_142 = register("substilium_mushroom_str_142",
			SubstiliumMushroomStr142Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr142Feature.GENERATE_BIOMES, SubstiliumMushroomStr142Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_143 = register("substilium_mushroom_str_143",
			SubstiliumMushroomStr143Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr143Feature.GENERATE_BIOMES, SubstiliumMushroomStr143Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_144 = register("substilium_mushroom_str_144",
			SubstiliumMushroomStr144Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr144Feature.GENERATE_BIOMES, SubstiliumMushroomStr144Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_145 = register("substilium_mushroom_str_145",
			SubstiliumMushroomStr145Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr145Feature.GENERATE_BIOMES, SubstiliumMushroomStr145Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_146 = register("substilium_mushroom_str_146",
			SubstiliumMushroomStr146Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr146Feature.GENERATE_BIOMES, SubstiliumMushroomStr146Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_147 = register("substilium_mushroom_str_147",
			SubstiliumMushroomStr147Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr147Feature.GENERATE_BIOMES, SubstiliumMushroomStr147Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_148 = register("substilium_mushroom_str_148",
			SubstiliumMushroomStr148Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr148Feature.GENERATE_BIOMES, SubstiliumMushroomStr148Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_149 = register("substilium_mushroom_str_149",
			SubstiliumMushroomStr149Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr149Feature.GENERATE_BIOMES, SubstiliumMushroomStr149Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_150 = register("substilium_mushroom_str_150",
			SubstiliumMushroomStr150Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr150Feature.GENERATE_BIOMES, SubstiliumMushroomStr150Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_151 = register("substilium_mushroom_str_151",
			SubstiliumMushroomStr151Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr151Feature.GENERATE_BIOMES, SubstiliumMushroomStr151Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_152 = register("substilium_mushroom_str_152",
			SubstiliumMushroomStr152Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr152Feature.GENERATE_BIOMES, SubstiliumMushroomStr152Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_153 = register("substilium_mushroom_str_153",
			SubstiliumMushroomStr153Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr153Feature.GENERATE_BIOMES, SubstiliumMushroomStr153Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_154 = register("substilium_mushroom_str_154",
			SubstiliumMushroomStr154Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr154Feature.GENERATE_BIOMES, SubstiliumMushroomStr154Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_155 = register("substilium_mushroom_str_155",
			SubstiliumMushroomStr155Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr155Feature.GENERATE_BIOMES, SubstiliumMushroomStr155Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_156 = register("substilium_mushroom_str_156",
			SubstiliumMushroomStr156Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr156Feature.GENERATE_BIOMES, SubstiliumMushroomStr156Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_157 = register("substilium_mushroom_str_157",
			SubstiliumMushroomStr157Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr157Feature.GENERATE_BIOMES, SubstiliumMushroomStr157Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_158 = register("substilium_mushroom_str_158",
			SubstiliumMushroomStr158Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr158Feature.GENERATE_BIOMES, SubstiliumMushroomStr158Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_443 = register("substilium_mushroom_str_443",
			SubstiliumMushroomStr443Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr443Feature.GENERATE_BIOMES, SubstiliumMushroomStr443Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_444 = register("substilium_mushroom_str_444",
			SubstiliumMushroomStr444Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr444Feature.GENERATE_BIOMES, SubstiliumMushroomStr444Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_445 = register("substilium_mushroom_str_445",
			SubstiliumMushroomStr445Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr445Feature.GENERATE_BIOMES, SubstiliumMushroomStr445Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_446 = register("substilium_mushroom_str_446",
			SubstiliumMushroomStr446Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr446Feature.GENERATE_BIOMES, SubstiliumMushroomStr446Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_447 = register("substilium_mushroom_str_447",
			SubstiliumMushroomStr447Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr447Feature.GENERATE_BIOMES, SubstiliumMushroomStr447Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_448 = register("substilium_mushroom_str_448",
			SubstiliumMushroomStr448Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr448Feature.GENERATE_BIOMES, SubstiliumMushroomStr448Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_449 = register("substilium_mushroom_str_449",
			SubstiliumMushroomStr449Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr449Feature.GENERATE_BIOMES, SubstiliumMushroomStr449Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_450 = register("substilium_mushroom_str_450",
			SubstiliumMushroomStr450Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr450Feature.GENERATE_BIOMES, SubstiliumMushroomStr450Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_451 = register("substilium_mushroom_str_451",
			SubstiliumMushroomStr451Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr451Feature.GENERATE_BIOMES, SubstiliumMushroomStr451Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_452 = register("substilium_mushroom_str_452",
			SubstiliumMushroomStr452Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr452Feature.GENERATE_BIOMES, SubstiliumMushroomStr452Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_453 = register("substilium_mushroom_str_453",
			SubstiliumMushroomStr453Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr453Feature.GENERATE_BIOMES, SubstiliumMushroomStr453Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_454 = register("substilium_mushroom_str_454",
			SubstiliumMushroomStr454Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr454Feature.GENERATE_BIOMES, SubstiliumMushroomStr454Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_455 = register("substilium_mushroom_str_455",
			SubstiliumMushroomStr455Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr455Feature.GENERATE_BIOMES, SubstiliumMushroomStr455Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_456 = register("substilium_mushroom_str_456",
			SubstiliumMushroomStr456Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr456Feature.GENERATE_BIOMES, SubstiliumMushroomStr456Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_457 = register("substilium_mushroom_str_457",
			SubstiliumMushroomStr457Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr457Feature.GENERATE_BIOMES, SubstiliumMushroomStr457Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_458 = register("substilium_mushroom_str_458",
			SubstiliumMushroomStr458Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr458Feature.GENERATE_BIOMES, SubstiliumMushroomStr458Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_459 = register("substilium_mushroom_str_459",
			SubstiliumMushroomStr459Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr459Feature.GENERATE_BIOMES, SubstiliumMushroomStr459Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_460 = register("substilium_mushroom_str_460",
			SubstiliumMushroomStr460Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr460Feature.GENERATE_BIOMES, SubstiliumMushroomStr460Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_461 = register("substilium_mushroom_str_461",
			SubstiliumMushroomStr461Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr461Feature.GENERATE_BIOMES, SubstiliumMushroomStr461Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_462 = register("substilium_mushroom_str_462",
			SubstiliumMushroomStr462Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr462Feature.GENERATE_BIOMES, SubstiliumMushroomStr462Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_463 = register("substilium_mushroom_str_463",
			SubstiliumMushroomStr463Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr463Feature.GENERATE_BIOMES, SubstiliumMushroomStr463Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_464 = register("substilium_mushroom_str_464",
			SubstiliumMushroomStr464Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr464Feature.GENERATE_BIOMES, SubstiliumMushroomStr464Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_326 = register("substilium_mushroom_str_326",
			SubstiliumMushroomStr326Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr326Feature.GENERATE_BIOMES, SubstiliumMushroomStr326Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_327 = register("substilium_mushroom_str_327",
			SubstiliumMushroomStr327Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr327Feature.GENERATE_BIOMES, SubstiliumMushroomStr327Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_328 = register("substilium_mushroom_str_328",
			SubstiliumMushroomStr328Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr328Feature.GENERATE_BIOMES, SubstiliumMushroomStr328Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_329 = register("substilium_mushroom_str_329",
			SubstiliumMushroomStr329Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr329Feature.GENERATE_BIOMES, SubstiliumMushroomStr329Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_330 = register("substilium_mushroom_str_330",
			SubstiliumMushroomStr330Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr330Feature.GENERATE_BIOMES, SubstiliumMushroomStr330Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_331 = register("substilium_mushroom_str_331",
			SubstiliumMushroomStr331Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr331Feature.GENERATE_BIOMES, SubstiliumMushroomStr331Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_332 = register("substilium_mushroom_str_332",
			SubstiliumMushroomStr332Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr332Feature.GENERATE_BIOMES, SubstiliumMushroomStr332Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_333 = register("substilium_mushroom_str_333",
			SubstiliumMushroomStr333Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr333Feature.GENERATE_BIOMES, SubstiliumMushroomStr333Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_334 = register("substilium_mushroom_str_334",
			SubstiliumMushroomStr334Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr334Feature.GENERATE_BIOMES, SubstiliumMushroomStr334Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_335 = register("substilium_mushroom_str_335",
			SubstiliumMushroomStr335Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr335Feature.GENERATE_BIOMES, SubstiliumMushroomStr335Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_336 = register("substilium_mushroom_str_336",
			SubstiliumMushroomStr336Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr336Feature.GENERATE_BIOMES, SubstiliumMushroomStr336Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_337 = register("substilium_mushroom_str_337",
			SubstiliumMushroomStr337Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr337Feature.GENERATE_BIOMES, SubstiliumMushroomStr337Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_338 = register("substilium_mushroom_str_338",
			SubstiliumMushroomStr338Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr338Feature.GENERATE_BIOMES, SubstiliumMushroomStr338Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_339 = register("substilium_mushroom_str_339",
			SubstiliumMushroomStr339Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr339Feature.GENERATE_BIOMES, SubstiliumMushroomStr339Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_526 = register("substilium_mushroom_str_526",
			SubstiliumMushroomStr526Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr526Feature.GENERATE_BIOMES, SubstiliumMushroomStr526Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_527 = register("substilium_mushroom_str_527",
			SubstiliumMushroomStr527Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr527Feature.GENERATE_BIOMES, SubstiliumMushroomStr527Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_528 = register("substilium_mushroom_str_528",
			SubstiliumMushroomStr528Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr528Feature.GENERATE_BIOMES, SubstiliumMushroomStr528Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_529 = register("substilium_mushroom_str_529",
			SubstiliumMushroomStr529Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr529Feature.GENERATE_BIOMES, SubstiliumMushroomStr529Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_530 = register("substilium_mushroom_str_530",
			SubstiliumMushroomStr530Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr530Feature.GENERATE_BIOMES, SubstiliumMushroomStr530Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_531 = register("substilium_mushroom_str_531",
			SubstiliumMushroomStr531Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr531Feature.GENERATE_BIOMES, SubstiliumMushroomStr531Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_532 = register("substilium_mushroom_str_532",
			SubstiliumMushroomStr532Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr532Feature.GENERATE_BIOMES, SubstiliumMushroomStr532Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_533 = register("substilium_mushroom_str_533",
			SubstiliumMushroomStr533Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr533Feature.GENERATE_BIOMES, SubstiliumMushroomStr533Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_534 = register("substilium_mushroom_str_534",
			SubstiliumMushroomStr534Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr534Feature.GENERATE_BIOMES, SubstiliumMushroomStr534Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_535 = register("substilium_mushroom_str_535",
			SubstiliumMushroomStr535Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr535Feature.GENERATE_BIOMES, SubstiliumMushroomStr535Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_230 = register("substilium_mushroom_str_230",
			SubstiliumMushroomStr230Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr230Feature.GENERATE_BIOMES, SubstiliumMushroomStr230Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_231 = register("substilium_mushroom_str_231",
			SubstiliumMushroomStr231Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr231Feature.GENERATE_BIOMES, SubstiliumMushroomStr231Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_232 = register("substilium_mushroom_str_232",
			SubstiliumMushroomStr232Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr232Feature.GENERATE_BIOMES, SubstiliumMushroomStr232Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_233 = register("substilium_mushroom_str_233",
			SubstiliumMushroomStr233Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr233Feature.GENERATE_BIOMES, SubstiliumMushroomStr233Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_234 = register("substilium_mushroom_str_234",
			SubstiliumMushroomStr234Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr234Feature.GENERATE_BIOMES, SubstiliumMushroomStr234Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_235 = register("substilium_mushroom_str_235",
			SubstiliumMushroomStr235Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr235Feature.GENERATE_BIOMES, SubstiliumMushroomStr235Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_159 = register("substilium_mushroom_str_159",
			SubstiliumMushroomStr159Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr159Feature.GENERATE_BIOMES, SubstiliumMushroomStr159Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_160 = register("substilium_mushroom_str_160",
			SubstiliumMushroomStr160Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr160Feature.GENERATE_BIOMES, SubstiliumMushroomStr160Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_161 = register("substilium_mushroom_str_161",
			SubstiliumMushroomStr161Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr161Feature.GENERATE_BIOMES, SubstiliumMushroomStr161Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_162 = register("substilium_mushroom_str_162",
			SubstiliumMushroomStr162Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr162Feature.GENERATE_BIOMES, SubstiliumMushroomStr162Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_163 = register("substilium_mushroom_str_163",
			SubstiliumMushroomStr163Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr163Feature.GENERATE_BIOMES, SubstiliumMushroomStr163Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_164 = register("substilium_mushroom_str_164",
			SubstiliumMushroomStr164Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr164Feature.GENERATE_BIOMES, SubstiliumMushroomStr164Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_165 = register("substilium_mushroom_str_165",
			SubstiliumMushroomStr165Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr165Feature.GENERATE_BIOMES, SubstiliumMushroomStr165Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_166 = register("substilium_mushroom_str_166",
			SubstiliumMushroomStr166Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr166Feature.GENERATE_BIOMES, SubstiliumMushroomStr166Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_167 = register("substilium_mushroom_str_167",
			SubstiliumMushroomStr167Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr167Feature.GENERATE_BIOMES, SubstiliumMushroomStr167Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_168 = register("substilium_mushroom_str_168",
			SubstiliumMushroomStr168Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr168Feature.GENERATE_BIOMES, SubstiliumMushroomStr168Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_169 = register("substilium_mushroom_str_169",
			SubstiliumMushroomStr169Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr169Feature.GENERATE_BIOMES, SubstiliumMushroomStr169Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_465 = register("substilium_mushroom_str_465",
			SubstiliumMushroomStr465Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr465Feature.GENERATE_BIOMES, SubstiliumMushroomStr465Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_466 = register("substilium_mushroom_str_466",
			SubstiliumMushroomStr466Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr466Feature.GENERATE_BIOMES, SubstiliumMushroomStr466Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_467 = register("substilium_mushroom_str_467",
			SubstiliumMushroomStr467Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr467Feature.GENERATE_BIOMES, SubstiliumMushroomStr467Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_468 = register("substilium_mushroom_str_468",
			SubstiliumMushroomStr468Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr468Feature.GENERATE_BIOMES, SubstiliumMushroomStr468Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_469 = register("substilium_mushroom_str_469",
			SubstiliumMushroomStr469Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr469Feature.GENERATE_BIOMES, SubstiliumMushroomStr469Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_536 = register("substilium_mushroom_str_536",
			SubstiliumMushroomStr536Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr536Feature.GENERATE_BIOMES, SubstiliumMushroomStr536Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_567 = register("substilium_mushroom_str_567",
			SubstiliumMushroomStr567Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr567Feature.GENERATE_BIOMES, SubstiliumMushroomStr567Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_568 = register("substilium_mushroom_str_568",
			SubstiliumMushroomStr568Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr568Feature.GENERATE_BIOMES, SubstiliumMushroomStr568Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_569 = register("substilium_mushroom_str_569",
			SubstiliumMushroomStr569Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr569Feature.GENERATE_BIOMES, SubstiliumMushroomStr569Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_540 = register("substilium_mushroom_str_540",
			SubstiliumMushroomStr540Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr540Feature.GENERATE_BIOMES, SubstiliumMushroomStr540Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_541 = register("substilium_mushroom_str_541",
			SubstiliumMushroomStr541Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr541Feature.GENERATE_BIOMES, SubstiliumMushroomStr541Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_542 = register("substilium_mushroom_str_542",
			SubstiliumMushroomStr542Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr542Feature.GENERATE_BIOMES, SubstiliumMushroomStr542Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_543 = register("substilium_mushroom_str_543",
			SubstiliumMushroomStr543Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr543Feature.GENERATE_BIOMES, SubstiliumMushroomStr543Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_544 = register("substilium_mushroom_str_544",
			SubstiliumMushroomStr544Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr544Feature.GENERATE_BIOMES, SubstiliumMushroomStr544Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_545 = register("substilium_mushroom_str_545",
			SubstiliumMushroomStr545Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr545Feature.GENERATE_BIOMES, SubstiliumMushroomStr545Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_546 = register("substilium_mushroom_str_546",
			SubstiliumMushroomStr546Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr546Feature.GENERATE_BIOMES, SubstiliumMushroomStr546Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_547 = register("substilium_mushroom_str_547",
			SubstiliumMushroomStr547Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr547Feature.GENERATE_BIOMES, SubstiliumMushroomStr547Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_340 = register("substilium_mushroom_str_340",
			SubstiliumMushroomStr340Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr340Feature.GENERATE_BIOMES, SubstiliumMushroomStr340Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_341 = register("substilium_mushroom_str_341",
			SubstiliumMushroomStr341Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr341Feature.GENERATE_BIOMES, SubstiliumMushroomStr341Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_342 = register("substilium_mushroom_str_342",
			SubstiliumMushroomStr342Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr342Feature.GENERATE_BIOMES, SubstiliumMushroomStr342Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_343 = register("substilium_mushroom_str_343",
			SubstiliumMushroomStr343Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr343Feature.GENERATE_BIOMES, SubstiliumMushroomStr343Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_344 = register("substilium_mushroom_str_344",
			SubstiliumMushroomStr344Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr344Feature.GENERATE_BIOMES, SubstiliumMushroomStr344Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_345 = register("substilium_mushroom_str_345",
			SubstiliumMushroomStr345Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr345Feature.GENERATE_BIOMES, SubstiliumMushroomStr345Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_236 = register("substilium_mushroom_str_236",
			SubstiliumMushroomStr236Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr236Feature.GENERATE_BIOMES, SubstiliumMushroomStr236Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_237 = register("substilium_mushroom_str_237",
			SubstiliumMushroomStr237Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr237Feature.GENERATE_BIOMES, SubstiliumMushroomStr237Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_238 = register("substilium_mushroom_str_238",
			SubstiliumMushroomStr238Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr238Feature.GENERATE_BIOMES, SubstiliumMushroomStr238Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_239 = register("substilium_mushroom_str_239",
			SubstiliumMushroomStr239Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr239Feature.GENERATE_BIOMES, SubstiliumMushroomStr239Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_240 = register("substilium_mushroom_str_240",
			SubstiliumMushroomStr240Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr240Feature.GENERATE_BIOMES, SubstiliumMushroomStr240Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_241 = register("substilium_mushroom_str_241",
			SubstiliumMushroomStr241Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr241Feature.GENERATE_BIOMES, SubstiliumMushroomStr241Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_242 = register("substilium_mushroom_str_242",
			SubstiliumMushroomStr242Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr242Feature.GENERATE_BIOMES, SubstiliumMushroomStr242Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_243 = register("substilium_mushroom_str_243",
			SubstiliumMushroomStr243Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr243Feature.GENERATE_BIOMES, SubstiliumMushroomStr243Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_244 = register("substilium_mushroom_str_244",
			SubstiliumMushroomStr244Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr244Feature.GENERATE_BIOMES, SubstiliumMushroomStr244Feature::placedFeature));
	public static final RegistryObject<Feature<?>> SUBSTILIUM_MUSHROOM_STR_245 = register("substilium_mushroom_str_245",
			SubstiliumMushroomStr245Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					SubstiliumMushroomStr245Feature.GENERATE_BIOMES, SubstiliumMushroomStr245Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_11 = register("hickory_tree_str_11", HickoryTreeStr11Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr11Feature.GENERATE_BIOMES,
					HickoryTreeStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_12 = register("hickory_tree_str_12", HickoryTreeStr12Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr12Feature.GENERATE_BIOMES,
					HickoryTreeStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_21 = register("hickory_tree_str_21", HickoryTreeStr21Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr21Feature.GENERATE_BIOMES,
					HickoryTreeStr21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_22 = register("hickory_tree_str_22", HickoryTreeStr22Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr22Feature.GENERATE_BIOMES,
					HickoryTreeStr22Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_31 = register("hickory_tree_str_31", HickoryTreeStr31Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr31Feature.GENERATE_BIOMES,
					HickoryTreeStr31Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HICKORY_TREE_STR_32 = register("hickory_tree_str_32", HickoryTreeStr32Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HickoryTreeStr32Feature.GENERATE_BIOMES,
					HickoryTreeStr32Feature::placedFeature));
	public static final RegistryObject<Feature<?>> TALL_BIRCH_TREE_STR_1 = register("tall_birch_tree_str_1", TallBirchTreeStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, TallBirchTreeStr1Feature.GENERATE_BIOMES,
					TallBirchTreeStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> TALL_OAK_TREE_STR_1 = register("tall_oak_tree_str_1", TallOakTreeStr1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, TallOakTreeStr1Feature.GENERATE_BIOMES,
					TallOakTreeStr1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_15 = register("hanging_vibrion_vines_grower_str_15",
			HangingVibrionVinesGrowerStr15Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr15Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_16 = register("hanging_vibrion_vines_grower_str_16",
			HangingVibrionVinesGrowerStr16Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr16Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_17 = register("hanging_vibrion_vines_grower_str_17",
			HangingVibrionVinesGrowerStr17Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr17Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR = register("hanging_vibrion_vines_grower_str",
			HangingVibrionVinesGrowerStrFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStrFeature.GENERATE_BIOMES, HangingVibrionVinesGrowerStrFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_19 = register("hanging_vibrion_vines_grower_str_19",
			HangingVibrionVinesGrowerStr19Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr19Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr19Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_VINES_GROWER_STR_20 = register("hanging_vibrion_vines_grower_str_20",
			HangingVibrionVinesGrowerStr20Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionVinesGrowerStr20Feature.GENERATE_BIOMES, HangingVibrionVinesGrowerStr20Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_10 = register("hanging_vibrion_gel_grower_str_10",
			HangingVibrionGelGrowerStr10Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr10Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr10Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_11 = register("hanging_vibrion_gel_grower_str_11",
			HangingVibrionGelGrowerStr11Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr11Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr11Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_12 = register("hanging_vibrion_gel_grower_str_12",
			HangingVibrionGelGrowerStr12Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr12Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr12Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_13 = register("hanging_vibrion_gel_grower_str_13",
			HangingVibrionGelGrowerStr13Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr13Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr13Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_14 = register("hanging_vibrion_gel_grower_str_14",
			HangingVibrionGelGrowerStr14Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr14Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> HANGING_VIBRION_GEL_GROWER_STR_15 = register("hanging_vibrion_gel_grower_str_15",
			HangingVibrionGelGrowerStr15Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES,
					HangingVibrionGelGrowerStr15Feature.GENERATE_BIOMES, HangingVibrionGelGrowerStr15Feature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_GLOWING_HICKORY_TREE = register("red_glowing_hickory_tree",
			RedGlowingHickoryTreeFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					RedGlowingHickoryTreeFeature.GENERATE_BIOMES, RedGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_GLOWING_HICKORY_TREE = register("yellow_glowing_hickory_tree",
			YellowGlowingHickoryTreeFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					YellowGlowingHickoryTreeFeature.GENERATE_BIOMES, YellowGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BROWN_GLOWING_HICKORY_TREE = register("brown_glowing_hickory_tree",
			BrownGlowingHickoryTreeFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					BrownGlowingHickoryTreeFeature.GENERATE_BIOMES, BrownGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEN_GLOWING_HICKORY_TREE = register("green_glowing_hickory_tree",
			GreenGlowingHickoryTreeFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
					GreenGlowingHickoryTreeFeature.GENERATE_BIOMES, GreenGlowingHickoryTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALLEN_HICKORY_LEAVES = register("fallen_hickory_leaves", FallenHickoryLeavesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FallenHickoryLeavesFeature.GENERATE_BIOMES,
					FallenHickoryLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALLEN_RED_GLOWING_HICKORY_LEAVES = register("fallen_red_glowing_hickory_leaves",
			FallenRedGlowingHickoryLeavesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					FallenRedGlowingHickoryLeavesFeature.GENERATE_BIOMES, FallenRedGlowingHickoryLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALLEN_YELLOW_GLOWING_HICKORY_LEAVES = register("fallen_yellow_glowing_hickory_leaves",
			FallenYellowGlowingHickoryLeavesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					FallenYellowGlowingHickoryLeavesFeature.GENERATE_BIOMES, FallenYellowGlowingHickoryLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALLEN_BROWN_GLOWING_HICKORY_LEAVES = register("fallen_brown_glowing_hickory_leaves",
			FallenBrownGlowingHickoryLeavesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					FallenBrownGlowingHickoryLeavesFeature.GENERATE_BIOMES, FallenBrownGlowingHickoryLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FALLEN_GREEN_GLWOING_HICKORY_LEAVES = register("fallen_green_glwoing_hickory_leaves",
			FallenGreenGlwoingHickoryLeavesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION,
					FallenGreenGlwoingHickoryLeavesFeature.GENERATE_BIOMES, FallenGreenGlwoingHickoryLeavesFeature::placedFeature));

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
