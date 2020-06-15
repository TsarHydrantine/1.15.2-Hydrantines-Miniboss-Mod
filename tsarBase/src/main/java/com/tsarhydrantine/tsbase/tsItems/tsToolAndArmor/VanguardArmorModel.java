// Made with Blockbench 3.5.2
package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class VanguardArmorModel extends BipedModel<LivingEntity> {
	public final ModelRenderer Head;
	public final ModelRenderer Body;
	public final ModelRenderer Waist;
	public final ModelRenderer RightLeg;
	public final ModelRenderer LeftLeg;

	public VanguardArmorModel(float size) {
		super(size);
		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		Head.setTextureOffset(35, 0).addBox(-1.0F, -8.75F, -5.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		this.bipedHeadwear.addChild(Head);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

		this.bipedBody.addChild(Body);
		
		Waist = new ModelRenderer(this);
		Waist.setRotationPoint(0.0F, 0.0F, 0.0F);
		Waist.setTextureOffset(40, 25).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 3.0F, 4.0F, 0.3F, false);
		
		this.bipedBody.addChild(Waist);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(24, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		this.bipedRightLeg.addChild(RightLeg);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(24, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

		this.bipedLeftLeg.addChild(LeftLeg);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Waist.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setRotationAngles(LivingEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.Head.copyModelAngles(this.bipedHead);
		this.Body.copyModelAngles(this.bipedBody);
		this.RightLeg.copyModelAngles(this.bipedRightLeg);
		this.LeftLeg.copyModelAngles(this.bipedLeftLeg);
	}
}