package com.tsarhydrantine.tsbase.client;

import com.tsarhydrantine.tsbase.tsEntity.IchorianGiantRenderer;
import com.tsarhydrantine.tsbase.tsEntity.TsEntities;
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
    }
    
    public static void cancelPlayerModel() {
    	
    }
}
