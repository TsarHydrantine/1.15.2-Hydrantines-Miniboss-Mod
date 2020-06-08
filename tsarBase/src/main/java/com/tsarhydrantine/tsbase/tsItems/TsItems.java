package com.tsarhydrantine.tsbase.tsItems;

import java.util.function.Supplier;

import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsItems.tsWeapons.TsGlaiveItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TsItems {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
	
	public static final RegistryObject<Item> HELLTHORN =  ITEMS.register("hellthorn", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> IRON_GLAIVE =  ITEMS.register("iron_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VENOM_GLAIVE =  ITEMS.register("venom_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> GRAVE_GLAIVE =  ITEMS.register("grave_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> VANGAURD_HELMET =  ITEMS.register("vanguard_helmet", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VANGAURD_CHESTPLATE =  ITEMS.register("vanguard_chestplate", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VANGAURD_LEGGINGS =  ITEMS.register("vanguard_leggings", () -> new ArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));	
}