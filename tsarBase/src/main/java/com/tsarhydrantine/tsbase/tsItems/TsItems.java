package com.tsarhydrantine.tsbase.tsItems;

import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsItems.tsWeapons.TsGlaiveItem;


import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TsItems {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
	
	public static final RegistryObject<Item> HELLTHORN =  ITEMS.register("hellthorn", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	public static final RegistryObject<Item> IRON_GLAIVE =  ITEMS.register("iron_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VENOM_GLAIVE =  ITEMS.register("venom_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> GRAVE_GLAIVE =  ITEMS.register("grave_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
}
