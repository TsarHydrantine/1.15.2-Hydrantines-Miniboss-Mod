package com.tsarhydrantine.tsbase.tsEntity.QueenBee;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsEntity.QueenBee.QueenBeeEntity;
import com.tsarhydrantine.tsbase.tsEntity.QueenBee.QueenBeeModel;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.util.ResourceLocation;

public class QueenBeeRenderer extends MobRenderer<QueenBeeEntity, QueenBeeModel>{
	
	private static final ResourceLocation QueenBeeTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/queen_bee.png");
	
	public QueenBeeRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new QueenBeeModel(), 1.0f);
	}
	
	@Override
    public void render(QueenBeeEntity entity, float f1, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light)
    {
        super.render(entity, f1, partialTicks, matrixStack, renderTypeBuffer, light);
    }
	
	@Override
	public ResourceLocation getEntityTexture(QueenBeeEntity entity) {
		return QueenBeeTexture;
	}

}