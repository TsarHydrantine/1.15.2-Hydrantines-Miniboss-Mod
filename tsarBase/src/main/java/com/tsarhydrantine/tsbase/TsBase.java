package com.tsarhydrantine.tsbase;

import com.tsarhydrantine.tsbase.client.ClientHandler;
import com.tsarhydrantine.tsbase.tsBlocks.TsBlocks;
import com.tsarhydrantine.tsbase.tsItems.TsItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tsbase")
public class TsBase {
	
	//
	public static TsBase instance;
	
	//
	public TsBase() {
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::clientRegistries);
		
		TsItems.ITEMS.register(modEventBus);
		TsBlocks.BLOCKS.register(modEventBus);
		
		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	//
	private void setup(final FMLCommonSetupEvent event) {
		TsRegistry.logger.info("TsBase Starting...");
	}
	
	//
	private void clientRegistries(final FMLClientSetupEvent event) {
		ClientHandler.setup();
		
	}
	
}
