package net.gyula.wildaside.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.gyula.wildaside.entity.VibrionMonsterEntity;

public class VibrionMonsterModel extends AnimatedGeoModel<VibrionMonsterEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(VibrionMonsterEntity entity) {
		return new ResourceLocation("wildaside", "animations/vibrion_monster.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(VibrionMonsterEntity entity) {
		return new ResourceLocation("wildaside", "geo/vibrion_monster.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(VibrionMonsterEntity entity) {
		return new ResourceLocation("wildaside", "textures/entities/vibrion_monster.png");
	}

}
