package com.tsarhydrantine.tsbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tsarhydrantine.tsbase.client.ClientHandler;
import com.tsarhydrantine.tsbase.tsBlocks.Hellthorn;
import com.tsarhydrantine.tsbase.tsBlocks.TsBlocks;
import com.tsarhydrantine.tsbase.tsItems.TsItems;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
	public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
	
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
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		TsBlocks.BLOCKS.getEntries().stream().filter(block -> !(block.get() instanceof Hellthorn)).map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ItemGroup.BUILDING_BLOCKS);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
		Item hellthorn = TsItems.HELLTHORN.get();
		Block hellthornblock = TsBlocks.HELLTHORNBLOCK.get();
		
		logger.debug("Registered BlockItems!");
	}
	
	//
	private void setup(final FMLCommonSetupEvent event) {
		logger.info("TsBase Starting...");
	}
	
	//
	private void clientRegistries(final FMLClientSetupEvent event) {
		ClientHandler.setup();
		
	}
}
