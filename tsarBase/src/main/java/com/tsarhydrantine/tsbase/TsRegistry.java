package com.tsarhydrantine.tsbase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.IForgeRegistry;

public class TsRegistry {
	
	public static final Logger logger = LogManager.getLogger(Reference.MOD_ID);
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		//Automatically generate "BlockItem's"
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
	
	@SubscribeEvent
	public static void onRegisterPotions(final RegistryEvent.Register<Potion> potionEvent, final RegistryEvent.Register<Effect> effectEvent) {
		
		final IForgeRegistry<Potion> potionRegistry = potionEvent.getRegistry();
		
		potionRegistry.registerAll(
				
		);
		
		
		final IForgeRegistry<Effect> effectRegistry = effectEvent.getRegistry();
		effectRegistry.registerAll(
				TsEffects.frozen_effect = new TsEffects.Frozen(EffectType.HARMFUL, 0x99f0dd).setRegistryName(new ResourceLocation(Reference.MOD_ID, "frozen"))
		);
		
		logger.debug("Registered Potions!");
	}
}
