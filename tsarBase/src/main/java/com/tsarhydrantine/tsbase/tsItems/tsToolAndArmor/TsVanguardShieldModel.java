package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TsVanguardShieldModel extends Model {
	private final ModelRenderer vangaurd_shield;

	public TsVanguardShieldModel() {
		super(RenderType::getEntitySolid);
		this.textureWidth = 32;
		this.textureHeight = 32;

		vangaurd_shield = new ModelRenderer(this);
		vangaurd_shield.setRotationPoint(1.0F, 8.5F, 3.0F);
		vangaurd_shield.setTextureOffset(0, 10).addBox(-3.0F, -23.5F, -4.0F, 6.0F, 10.0F, 1.0F, 0.0F, false);
		vangaurd_shield.setTextureOffset(7, 21).addBox(3.0F, -21.5F, -4.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		vangaurd_shield.setTextureOffset(0, 21).addBox(-6.0F, -21.5F, -4.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
		vangaurd_shield.setTextureOffset(0, 0).addBox(-5.0F, -13.5F, -4.0F, 10.0F, 9.0F, 1.0F, 0.0F, false);
		vangaurd_shield.setTextureOffset(16, 13).addBox(6.0F, -18.5F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		vangaurd_shield.setTextureOffset(23, 13).addBox(-8.0F, -18.5F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
	}

	public ModelRenderer getShieldFace() {
		return this.vangaurd_shield;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		vangaurd_shield.render(matrixStack, buffer, packedLight, packedOverlay);
	}
}
