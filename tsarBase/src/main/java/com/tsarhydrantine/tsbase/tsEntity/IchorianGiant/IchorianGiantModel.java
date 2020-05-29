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
	private final ModelRenderer LeftFoot;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightFoot;
	private final ModelRenderer LoinClothFront;
	private final ModelRenderer LoinClothBack;
	private final ModelRenderer Bolt;

	public IchorianGiantModel() {
		this.textureWidth = 128;
		this.textureHeight = 128;

		this.Head = new ModelRenderer(this, 0, 0);
		this.Head.setRotationPoint(0.0F, -16.0F, 0.0F);
		this.Head.addBox(-4.0F, -11.0F, -4.0F, 8, 8, 8, 0.0F, false);

		this.Body = new ModelRenderer(this);
		this.Body.setRotationPoint(0.0F, -13.0F, 0.0F);
		this.Body.setTextureOffset(0, 16).addBox(-11.5F, -6.0F, -1.0F, 23, 11, 8, 0.0F, false);
		this.Body.setTextureOffset(6, 35).addBox(-7.5F, 5.0F, 0.0F, 15, 8, 6, 0.0F, false);

		this.LeftArm = new ModelRenderer(this);
		this.LeftArm.setRotationPoint(-14.0F, -16.0F, 3.0F);
		this.LeftArm.setTextureOffset(62, 18).addBox( -5.0F, -4.0F, -5.0F, 8, 6, 10, 0.0F, false);
		this.LeftArm.setTextureOffset(62, 27).addBox( -3.75F, 2.0F, -4.0F, 6, 12, 6, 0.0F, false);
		this.LeftArm.setTextureOffset(62, 47).addBox(-5.75F, 14.0F, -6.0F, 10, 12, 10, 0.0F, false);

		this.RightArm = new ModelRenderer(this);
		this.RightArm.setRotationPoint(14.0F, -16.0F, 3.0F);
		this.setRotationAngle(RightArm, 0.0F, 3.1416F, 0.0F);
		this.RightArm.setTextureOffset(62, 18).addBox(-5.0F, -4.0F, -5.0F, 8, 6, 10, 0.0F, false);
		this.RightArm.setTextureOffset(62, 27).addBox( -3.75F, 2.0F, -3.0F, 6, 12, 6, 0.0F, false);
		this.RightArm.setTextureOffset(62, 69).addBox(-5.75F, 14.0F, -5.0F, 10, 12, 10, 0.0F, false);

		this.LeftLeg = new ModelRenderer(this);
		this.LeftLeg.setRotationPoint(-4.0F, 0.0F, 3.0F);
		this.LeftLeg.setTextureOffset(6, 49).addBox( -3.0F, 0.0F, -3.0F, 6, 12, 6, 0.0F, false);

		this.LeftFoot = new ModelRenderer(this);
		this.LeftFoot.setRotationPoint(0.0F, 12.0F, -3.0F);
		this.LeftLeg.addChild(LeftFoot);
		this.LeftFoot.setTextureOffset(6, 61).addBox(-3.0F, 0.0F, 0.0F, 6, 12, 6, 0.0F, false);

		this.RightLeg = new ModelRenderer(this);
		this.RightLeg.setRotationPoint(4.0F, 0.0F, 4.0F);
		this.RightLeg.setTextureOffset(6, 49).addBox( -3.0F, 0.0F, -4.0F, 6, 12, 6, 0.0F, false);

		this.RightFoot = new ModelRenderer(this);
		this.RightFoot.setRotationPoint(0.0F, 12.0F, -4.0F);
		this.RightLeg.addChild(RightFoot);
		this.RightFoot.setTextureOffset(6, 61).addBox(-3.0F, 0.0F, 0.0F, 6, 12, 6, 0.0F, false);

		this.LoinClothFront = new ModelRenderer(this);
		this.LoinClothFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.setRotationAngle(LoinClothFront, -0.0873F, 0.0F, 0.0F);
		this.LoinClothFront.setTextureOffset(3, 81).addBox( -7.5F, 0.0F, 0.0F, 15, 9, 0, 0.0F, false);

		this.LoinClothBack = new ModelRenderer(this);
		this.LoinClothBack.setRotationPoint(0.0F, 0.0F, 6.0F);
		this.setRotationAngle(LoinClothBack, 0.0873F, 0.0F, 0.0F);
		this.LoinClothBack.setTextureOffset(3, 81).addBox( -7.5F, 0.0F, 0.0F, 15, 9, 0, 0.0F, false);

		this.Bolt = new ModelRenderer(this);
		this.Bolt.setRotationPoint(0.0F, -13.5F, 8.0F);
		this.Bolt.setTextureOffset(7, 111).addBox( -3.5F, -2.5F, -1.0F, 7, 5, 1, 0.0F, false);
		this.Bolt.setTextureOffset(7, 110).addBox(-2.5F, -3.5F, -1.0F, 5, 1, 1, 0.0F, false);
		this.Bolt.setTextureOffset(7, 110).addBox( -2.5F, 2.5F, -1.0F, 5, 1, 1, 0.0F, false);
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
		this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
		
		this.RightFoot.rotateAngleX = -(MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI)-1.0f) * 1.4f * limbSwingAmount;
		this.LeftFoot.rotateAngleX = -(MathHelper.cos(limbSwing * 0.6662f)-1.0F) * 1.4f * limbSwingAmount;
		
		this.LoinClothFront.rotateAngleX = MathHelper.cos(2f * limbSwing * 0.3332f) * 1.0f * limbSwingAmount;
		this.LoinClothBack.rotateAngleX = MathHelper.cos(2f * limbSwing * 0.3332f) * 1.0f * limbSwingAmount;
		
		this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + (float)Math.PI) * 1.4f * limbSwingAmount;
		this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		
		this.Head.rotateAngleY = netHeadYaw * 0.017f;
		this.Head.rotateAngleX = headPitch * 0.17f;
	}
	
	public ModelRenderer getArmHoldingSword() {
	      return this.RightArm;
	}

}
