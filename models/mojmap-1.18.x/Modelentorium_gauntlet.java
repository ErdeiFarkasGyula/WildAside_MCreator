// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelentorium_gauntlet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "entorium_gauntlet"), "main");
	private final ModelPart gaunletRight;
	private final ModelPart gaunletLeft;

	public Modelentorium_gauntlet(ModelPart root) {
		this.gaunletRight = root.getChild("gaunletRight");
		this.gaunletLeft = root.getChild("gaunletLeft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gaunletRight = partdefinition.addOrReplaceChild("gaunletRight",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.5F, -17.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.75F, -12.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition finger1_r1 = gaunletRight.addOrReplaceChild("finger1_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, 6.6F, 2.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition gaunletLeft = partdefinition.addOrReplaceChild("gaunletLeft",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.5F, -17.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.75F, -12.0F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition finger2_r1 = gaunletLeft.addOrReplaceChild("finger2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -16.0F, 6.35F, 2.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 0.0F, -8.0F, 0.0F, 0.0F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		gaunletRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gaunletLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.gaunletRight.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.gaunletLeft.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}