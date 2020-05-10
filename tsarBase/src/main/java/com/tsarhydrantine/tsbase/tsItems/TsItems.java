package com.tsarhydrantine.tsbase.tsItems;

import com.tsarhydrantine.tsbase.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TsItems {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
	
	public static final RegistryObject<Item> HELLTHORN =  ITEMS.register("hellthorn", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
}
