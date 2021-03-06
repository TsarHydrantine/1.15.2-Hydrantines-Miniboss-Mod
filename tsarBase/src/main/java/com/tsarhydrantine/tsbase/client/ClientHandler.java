package com.tsarhydrantine.tsbase.client;

import com.tsarhydrantine.tsbase.tsEntity.TsEntities;
import com.tsarhydrantine.tsbase.tsEntity.Cerberus.CerberusRenderer;
import com.tsarhydrantine.tsbase.tsEntity.IchorianGiant.IchorianGiantRenderer;
import com.tsarhydrantine.tsbase.tsEntity.QueenBee.QueenBeeRenderer;
import com.tsarhydrantine.tsbase.tsEntity.SkeletonVanguard.SkeletonVanguardRenderer;
import com.tsarhydrantine.tsbase.tsEntity.ToxicSpider.ToxicSpiderRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.gen.layer.Layer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;


public class ClientHandler
{
    public static void setup()
    {
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.ICHORIAN_GIANT, IchorianGiantRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.TOXIC_SPIDER, ToxicSpiderRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.QUEEN_BEE, QueenBeeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.SKELETON_VANGUARD, SkeletonVanguardRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.CERBERUS, CerberusRenderer::new);
    }
    
}
