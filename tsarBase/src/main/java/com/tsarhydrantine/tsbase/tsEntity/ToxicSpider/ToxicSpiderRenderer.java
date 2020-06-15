package com.tsarhydrantine.tsbase.tsEntity.ToxicSpider;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsEntity.IchorianGiant.IchorianGiantEntity;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpiderRenderer;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.util.ResourceLocation;

public class ToxicSpiderRenderer extends SpiderRenderer<ToxicSpiderEntity> {
	private static final ResourceLocation ToxicSpiderTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/toxic_spider.png");

	public ToxicSpiderRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn);
		this.shadowSize *= 1.2F;
	}

	protected void preRenderCallback(ToxicSpiderEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
		matrixStackIn.scale(1.2F, 1.2F, 1.2F);
	}

	@Override
	public void render(ToxicSpiderEntity entity, float f1, float partialTicks, MatrixStack matrixStack,
			IRenderTypeBuffer renderTypeBuffer, int light) {
		super.render(entity, f1, partialTicks, matrixStack, renderTypeBuffer, light);
	}

	/**
	 * Returns the location of an entity's texture.
	 */
	public ResourceLocation getEntityTexture(ToxicSpiderEntity entity) {
		return ToxicSpiderTexture;
	}
}