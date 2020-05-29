package com.tsarhydrantine.tsbase.client;

import com.tsarhydrantine.tsbase.tsEntity.TsEntities;
import com.tsarhydrantine.tsbase.tsEntity.IchorianGiant.IchorianGiantRenderer;
import com.tsarhydrantine.tsbase.tsEntity.ToxicSpider.ToxicSpiderRenderer;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ClientHandler
{
    public static void setup()
    {
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.ICHORIAN_GIANT, IchorianGiantRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(TsEntities.TOXIC_SPIDER, ToxicSpiderRenderer::new);
    }
    
}
