
package net.gyula.wildaside.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.gyula.wildaside.entity.model.VibrionMonsterModel;
import net.gyula.wildaside.entity.layer.VibrionMonsterLayer;
import net.gyula.wildaside.entity.VibrionMonsterEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class VibrionMonsterRenderer extends GeoEntityRenderer<VibrionMonsterEntity> {
	public VibrionMonsterRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new VibrionMonsterModel());
		this.shadowRadius = 0.8f;
		this.addLayer(new VibrionMonsterLayer(this));
	}

	@Override
	public RenderType getRenderType(VibrionMonsterEntity animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		if (!animatable.isBaby())
			stack.scale(1.0F, 1.0F, 1.0F);
		else
			stack.scale(0.5F, 0.5F, 0.5F);
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
