package com.tsarhydrantine.tsbase.tsItems;

import java.util.function.Supplier;

import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.TsArmorMaterials;
import com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.TsItemTiers;
import com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.TsVanguardShield;
import com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor.VanguardArmorItem;
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
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TsItems {
	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
	
	public static final RegistryObject<Item> HELLTHORN =  ITEMS.register("hellthorn", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> ENCHANTED_GLASS_SWORD =  ITEMS.register("enchanted_glass_sword", () -> new SwordItem(TsItemTiers.GLASS, 1, 6F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> IRON_GLAIVE =  ITEMS.register("iron_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VENOM_GLAIVE =  ITEMS.register("venom_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> GRAVE_GLAIVE =  ITEMS.register("grave_glaive", () -> new TsGlaiveItem(ItemTier.IRON, 8, -3.4F, (new Item.Properties()).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> VANGUARD_HELMET =  ITEMS.register("vanguard_helmet", () -> new VanguardArmorItem(TsArmorMaterials.VANGUARD, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VANGUARD_CHESTPLATE =  ITEMS.register("vanguard_chestplate", () -> new VanguardArmorItem(TsArmorMaterials.VANGUARD, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> VANGUARD_LEGGINGS =  ITEMS.register("vanguard_leggings", () -> new VanguardArmorItem(TsArmorMaterials.VANGUARD, EquipmentSlotType.LEGS, (new Item.Properties()).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> VANGUARD_SHEILD=  ITEMS.register("vanguard_shield", () -> new TsVanguardShield((new Item.Properties()).defaultMaxDamage(4).group(ItemGroup.COMBAT).setISTER(() -> TsSheildRenderer::new)));
	
	public static final RegistryObject<Item> WOLF_HELMET =  ITEMS.register("wolf_helmet", () -> new VanguardArmorItem(TsArmorMaterials.VANGUARD, EquipmentSlotType.HEAD, (new Item.Properties()).group(ItemGroup.COMBAT)));
	public static final RegistryObject<Item> WOLF_CHESTPLATE =  ITEMS.register("wolf_chestplate", () -> new VanguardArmorItem(TsArmorMaterials.VANGUARD, EquipmentSlotType.CHEST, (new Item.Properties()).group(ItemGroup.COMBAT)));
	

}