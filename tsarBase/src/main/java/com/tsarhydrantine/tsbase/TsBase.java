package com.tsarhydrantine.tsbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsarhydrantine.tsbase.client.ClientHandler;
import com.tsarhydrantine.tsbase.tsBlocks.Hellthorn;
import com.tsarhydrantine.tsbase.tsBlocks.TsBlocks;
import com.tsarhydrantine.tsbase.tsEffects.TsEffects;
import com.tsarhydrantine.tsbase.tsItems.TsItems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

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
