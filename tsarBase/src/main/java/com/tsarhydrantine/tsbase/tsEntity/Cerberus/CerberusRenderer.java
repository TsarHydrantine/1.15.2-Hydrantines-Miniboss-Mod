package com.tsarhydrantine.tsbase.tsEntity.Cerberus;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsEntity.Cerberus.CerberusEntity;
import com.tsarhydrantine.tsbase.tsEntity.Cerberus.CerberusModel;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CerberusRenderer extends MobRenderer<CerberusEntity, CerberusModel<CerberusEntity>>{
	
	private static final ResourceLocation CerberusTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/cerberus.png");
	
	public CerberusRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new CerberusModel(), 1.0f);
	}
	
	@Override
    public void render(CerberusEntity entity, float f1, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light)
    {
        super.render(entity, f1, partialTicks, matrixStack, renderTypeBuffer, light);
    }
	
	@Override
	public ResourceLocation getEntityTexture(CerberusEntity entity) {
		return CerberusTexture;
	}
}