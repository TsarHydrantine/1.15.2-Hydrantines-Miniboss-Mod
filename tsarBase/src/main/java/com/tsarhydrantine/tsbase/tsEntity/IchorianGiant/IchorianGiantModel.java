package com.tsarhydrantine.tsbase.tsEntity.IchorianGiant;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.IHasArm;
import net.minecraft.client.renderer.entity.model.IHasHead;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class IchorianGiantModel extends SegmentedModel<IchorianGiantEntity> implements IHasArm, IHasHead{
	
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LoinClothFront;
	private final ModelRenderer LoinClothBack;
	private final ModelRenderer Bolt;

	public IchorianGiantModel() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -16.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -13.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-11.5F, -6.0F, -1.0F, 23.0F, 11.0F, 8.0F, 0.0F, false);
		Body.setTextureOffset(6, 35).addBox(-7.5F, 5.0F, 0.0F, 15.0F, 8.0F, 6.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-14.0F, -16.0F, 3.0F);
		LeftArm.setTextureOffset(62, 18).addBox(-5.0F, -4.0F, -5.0F, 8.0F, 6.0F, 10.0F, 0.0F, false);
		LeftArm.setTextureOffset(62, 27).addBox(-3.75F, 2.0F, -4.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		LeftArm.setTextureOffset(62, 47).addBox(-5.75F, 14.0F, -6.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(14.0F, -16.0F, 3.0F);
		setRotationAngle(RightArm, 0.0F, 3.1416F, 0.0F);
		RightArm.setTextureOffset(62, 18).addBox(-5.0F, -4.0F, -5.0F, 8.0F, 6.0F, 10.0F, 0.0F, false);
		RightArm.setTextureOffset(62, 27).addBox(-3.75F, 2.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		RightArm.setTextureOffset(62, 69).addBox(-5.75F, 14.0F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-4.0F, 0.0F, 3.0F);
		LeftLeg.setTextureOffset(6, 49).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);
		
		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(4.0F, 0.0F, 4.0F);
		RightLeg.setTextureOffset(6, 49).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);
		

		LoinClothFront = new ModelRenderer(this);
		LoinClothFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(LoinClothFront, -0.0873F, 0.0F, 0.0F);
		LoinClothFront.setTextureOffset(3, 81).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 9.0F, 0.0F, 0.0F, false);

		LoinClothBack = new ModelRenderer(this);
		LoinClothBack.setRotationPoint(0.0F, 0.0F, 6.0F);
		setRotationAngle(LoinClothBack, 0.0873F, 0.0F, 0.0F);
		LoinClothBack.setTextureOffset(3, 81).addBox(-7.5F, 0.0F, 0.0F, 15.0F, 9.0F, 0.0F, 0.0F, false);

		Bolt = new ModelRenderer(this);
		Bolt.setRotationPoint(0.0F, -13.5F, 8.0F);
		Bolt.setTextureOffset(7, 111).addBox(-3.5F, -2.5F, -1.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		Bolt.setTextureOffset(7, 110).addBox(-2.5F, -3.5F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Bolt.setTextureOffset(7, 110).addBox(-2.5F, 2.5F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
	}
	
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	@Override
	public ModelRenderer getModelHead() {
		return Head;
	}

	@Override
	public void translateHand(HandSide sideIn, MatrixStack matrixStackIn) {
		
	}

	@Override
	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(Head, Body, LeftArm, RightArm, LeftLeg, RightLeg, LoinClothFront, LoinClothBack, Bolt);
	}

	@Override
	public void setRotationAngles(IchorianGiantEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
		
		LoinClothFront.rotateAngleX = -MathHelper.abs(LeftLeg.rotateAngleX) - (float)0.1;
		LoinClothBack.rotateAngleX = MathHelper.abs(LeftLeg.rotateAngleX) + (float)0.1; 
		
		RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
		LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		
		Head.rotateAngleY = netHeadYaw * 0.017f;
		Head.rotateAngleX = headPitch * 0.17f;
	}
	
	public ModelRenderer getArmHoldingSword() {
	      return RightArm;
	}

}
