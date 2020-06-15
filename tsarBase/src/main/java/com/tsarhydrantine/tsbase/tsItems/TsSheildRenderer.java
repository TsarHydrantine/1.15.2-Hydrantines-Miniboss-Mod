package com.tsarhydrantine.tsbase.tsItems;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsItems.TsItems;
import com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.TsVanguardShieldModel;

import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.tileentity.ItemStackTileEntityRenderer;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.model.Material;
import net.minecraft.client.renderer.texture.AtlasTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class TsSheildRenderer extends ItemStackTileEntityRenderer {

	public final TsVanguardShieldModel modelShield = new TsVanguardShieldModel();
	public static final ResourceLocation VanguardSheildTexture = new ResourceLocation(Reference.MOD_ID, "textures/models/shield/vangaurd_sheild.png");

	@Override
	public void render(ItemStack itemStackIn, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		Item item = itemStackIn.getItem();
		if (item == TsItems.VANGUARD_SHEILD.get()) {
			matrixStackIn.push();
			matrixStackIn.scale(1.0F, -1.0F, -1.0F);
			Material material = new Material(AtlasTexture.LOCATION_BLOCKS_TEXTURE, VanguardSheildTexture);
			IVertexBuilder ivertexbuilder = material.getSprite().wrapBuffer(ItemRenderer.getBuffer(bufferIn, this.modelShield.getRenderType(material.getAtlasLocation()), false, itemStackIn.hasEffect()));
			this.modelShield.getShieldFace().render(matrixStackIn, ivertexbuilder, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
			matrixStackIn.pop();
		}

	}

	public ResourceLocation getEntityTexture(ItemEntity entity) {
		return VanguardSheildTexture;
	}
}
