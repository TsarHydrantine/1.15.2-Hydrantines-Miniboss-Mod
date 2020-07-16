package com.tsarhydrantine.tsbase.tsEntity.Cerberus;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.math.MathHelper;

public class CerberusModel<T extends CerberusEntity> extends EntityModel<CerberusEntity> {
	private final ModelRenderer head;
	private final ModelRenderer head2;
	private final ModelRenderer body;
	private final ModelRenderer upperBody;
	private final ModelRenderer leg0;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer tail;

	public CerberusModel(){
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(2.0F, 10.5F, -12.0F);
		setRotationAngle(head, 0.0F, -0.0873F, 0.0F);
		head.setTextureOffset(30, 0).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(50, 3).addBox(-1.5F, -0.0156F, -5.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(-4.0F, 9.5F, -10.0F);
		setRotationAngle(head2, 0.0F, 0.0873F, 0.0F);
		head2.setTextureOffset(30, 10).addBox(-3.0F, -2.0F, -4.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head2.setTextureOffset(0, 3).addBox(1.0F, -4.0F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head2.setTextureOffset(50, 13).addBox(-1.5F, 0.9844F, -7.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(0, 42).addBox(-5.5F, -3.5F, -0.5F, 9.0F, 14.0F, 8.0F, 0.0F, false);

		upperBody = new ModelRenderer(this);
		upperBody.setRotationPoint(-1.0F, 14.0F, 2.0F);
		setRotationAngle(upperBody, -1.5708F, 0.0F, 0.0F);
		upperBody.setTextureOffset(0, 23).addBox(-5.0F, 3.0F, -8.0F, 10.0F, 9.0F, 10.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(-2.5F, 16.0F, 7.0F);
		leg0.setTextureOffset(40, 38).addBox(-2.75F, -2.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.5F, 16.0F, 7.0F);
		leg1.setTextureOffset(40, 51).addBox(-0.25F, -2.0F, -1.0F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.5F, 16.0F, -4.0F);
		leg2.setTextureOffset(40, 51).addBox(-3.25F, -2.0F, -4.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.5F, 16.0F, -4.0F);
		leg3.setTextureOffset(40, 38).addBox(0.25F, -2.0F, -4.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
		setRotationAngle(tail, 0.9599F, 0.0F, 0.0F);
		tail.setTextureOffset(52, 49).addBox(-1.5F, 0.7367F, 2.6782F, 3.0F, 12.0F, 3.0F, 0.0F, false);
	}
	
	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(this.head, this.body, this.leg0, this.leg1, this.leg2, this.leg3, this.upperBody, this.tail);
	}
	
	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		upperBody.render(matrixStack, buffer, packedLight, packedOverlay);
		leg0.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(CerberusEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
	    this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	    this.head2.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
	    this.head2.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void setLivingAnimations(CerberusEntity entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
		if (entityIn.isAggressive()) {
			this.tail.rotateAngleY = 0.0F;
		} else {
			this.tail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		}
		
		this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.leg0.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
		this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
	}
}