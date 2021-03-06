package com.tsarhydrantine.tsbase.tsEnchantments;

import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsItems.tsWeapons.TsGlaiveItem;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class TsEnchantments {
	
	public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, Reference.MOD_ID);
	
	public static final RegistryObject<Enchantment> SLASHING = ENCHANTMENTS.register("slashing", () -> new SlashingEnchantment());
	public static final RegistryObject<Enchantment> POISON_ASPECT = ENCHANTMENTS.register("poisonaspect", () -> new PoisonAspectEnchantment());
	public static final RegistryObject<Enchantment> SEPULCHER = ENCHANTMENTS.register("sepulcher", () -> new SepulcherEnchantment());
	
	public static final EnchantmentType tsGLAIVE = EnchantmentType.create("tsglaive", (item)->(item instanceof TsGlaiveItem));
	
}
