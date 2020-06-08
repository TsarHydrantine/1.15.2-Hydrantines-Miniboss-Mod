package com.tsarhydrantine.tsbase.tsEntity.QueenBee;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

// Made with Blockbench 3.5.2
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class QueenBeeModel extends EntityModel<QueenBeeEntity> {
	private final ModelRenderer Body;
	private final ModelRenderer Legs;
	private final ModelRenderer Thorax;
	private final ModelRenderer LeftWing;
	private final ModelRenderer RightWing;
	private final ModelRenderer Head;
	private final ModelRenderer Crown;
	private final ModelRenderer Antenae;

	public QueenBeeModel() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-0.5F, 3.0F, -3.0F);
		setRotationAngle(Body, -0.8727F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 14).addBox(-4.0F, -3.0F, -2.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		Body.setTextureOffset(43, 3).addBox(1.0F, 5.0153F, 18.2883F, -1.0F, 1.0F, 1.0F, 0.0F, false);

		Legs = new ModelRenderer(this);
		Legs.setRotationPoint(0.5F, 6.8085F, 0.1607F);
		Body.addChild(Legs);
		setRotationAngle(Legs, -0.5236F, 0.0F, 0.0F);
		Legs.setTextureOffset(30, 18).addBox(-3.0F, 1.0F, -1.5F, 7.0F, 0.0F, 2.0F, 0.0F, false);
		Legs.setTextureOffset(30, 20).addBox(-3.0F, 0.1888F, -0.3415F, 7.0F, 0.0F, 2.0F, 0.0F, false);
		Legs.setTextureOffset(30, 22).addBox(-3.0F, -0.6223F, 0.8169F, 7.0F, 0.0F, 2.0F, 0.0F, false);

		Thorax = new ModelRenderer(this);
		Thorax.setRotationPoint(1.0F, 3.0F, 6.0F);
		Body.addChild(Thorax);
		setRotationAngle(Thorax, 1.309F, 0.0F, 0.0F);
		Thorax.setTextureOffset(0, 34).addBox(-6.5F, -1.0F, -5.5F, 13.0F, 14.0F, 13.0F, 0.0F, false);

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(-1.0F, 5.5912F, 2.8767F);
		Body.addChild(LeftWing);
		LeftWing.setTextureOffset(41, 12).addBox(-9.5F, -13.3572F, -1.234F, 7.0F, 6.0F, 0.0F, 0.0F, false);

		RightWing = new ModelRenderer(this);
		RightWing.setRotationPoint(0.0F, 7.0F, 3.0F);
		Body.addChild(RightWing);
		setRotationAngle(RightWing, 0.0F, 3.1416F, 0.0F);
		RightWing.setTextureOffset(41, 12).addBox(-12.5F, -14.5195F, 1.4605F, 7.0F, 6.0F, 0.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.5F, 1.0F, -1.0F);
		Body.addChild(Head);
		setRotationAngle(Head, 0.8727F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -7.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		Crown = new ModelRenderer(this);
		Crown.setRotationPoint(0.5F, 4.0F, -4.0F);
		Head.addChild(Crown);
		Crown.setTextureOffset(28, 3).addBox(-1.5F, -11.0F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Crown.setTextureOffset(28, 1).addBox(-1.5F, -11.5F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Crown.setTextureOffset(28, 1).addBox(0.5F, -11.5F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Crown.setTextureOffset(29, 1).addBox(0.5F, -11.5F, -2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		Crown.setTextureOffset(29, 1).addBox(-1.5F, -11.5F, -2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		Antenae = new ModelRenderer(this);
		Antenae.setRotationPoint(1.0F, -3.0F, -2.0F);
		Head.addChild(Antenae);
		Antenae.setTextureOffset(48, 2).addBox(-2.0F, -3.0F, -8.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
		Antenae.setTextureOffset(48, 2).addBox(1.0F, -3.0F, -8.0F, 0.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(QueenBeeEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		
	}
}