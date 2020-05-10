package com.tsarhydrantine.tsbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsarhydrantine.tsbase.client.ClientHandler;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tsbase")
public class TsBase {
	
	//
	public static TsBase instance;
	
	//
	public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
	
	//
	public TsBase() {
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	//
	private void setup(final FMLCommonSetupEvent event) {
		logger.info("TsBase Starting...");
	}
	
	//
	private void clientRegistries(final FMLClientSetupEvent event) {
		ClientHandler.setup();
		
	}
	
	public static ResourceLocation location(String name) {
		return new ResourceLocation(Reference.MOD_ID, name);
	}
}
