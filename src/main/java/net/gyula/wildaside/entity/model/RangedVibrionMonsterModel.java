package net.gyula.wildaside.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.gyula.wildaside.entity.RangedVibrionMonsterEntity;

public class RangedVibrionMonsterModel extends AnimatedGeoModel<RangedVibrionMonsterEntity> {
	@Override
	public ResourceLocation getAnimationFileLocation(RangedVibrionMonsterEntity entity) {
		return new ResourceLocation("wildaside", "animations/vibrion_monster.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(RangedVibrionMonsterEntity entity) {
		return new ResourceLocation("wildaside", "geo/vibrion_monster.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(RangedVibrionMonsterEntity entity) {
		return new ResourceLocation("wildaside", "textures/entities/vibrion_monster.png");
	}

}
