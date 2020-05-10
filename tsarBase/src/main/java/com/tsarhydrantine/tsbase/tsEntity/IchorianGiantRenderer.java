package com.tsarhydrantine.tsbase.tsEntity;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.TsBase;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.util.ResourceLocation;

public class IchorianGiantRenderer extends MobRenderer<IchorianGiantEntity, IchorianGiantModel>{
	
	private static final ResourceLocation IchorianGiantTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/ichorian_giant.png");
	
	private final float scale = 10.0f;
	
	public IchorianGiantRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new IchorianGiantModel(), 1.0f);
		this.addLayer(new HeldItemLayer<>(this));
	}
	
	protected void preRenderCallback(GiantEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
	      matrixStackIn.scale(this.scale, this.scale, this.scale);
	   }
	
	@Override
    public void render(IchorianGiantEntity entity, float f1, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light)
    {
        super.render(entity, f1, partialTicks, matrixStack, renderTypeBuffer, light);
    }
	
	@Override
	public ResourceLocation getEntityTexture(IchorianGiantEntity entity) {
		return IchorianGiantTexture;
	}

}
