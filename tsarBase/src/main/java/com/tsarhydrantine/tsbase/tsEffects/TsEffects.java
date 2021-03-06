package com.tsarhydrantine.tsbase.tsEffects;

import java.util.function.Supplier;

import com.tsarhydrantine.tsbase.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TsEffects {
	
	public static final DeferredRegister<Potion> POTIONS = new DeferredRegister<>(ForgeRegistries.POTION_TYPES, Reference.MOD_ID);
	
	public static Effect frozen_effect = null;
	
	public static final RegistryObject<Potion> FROZEN = POTIONS.register("frozen", () -> new Potion(new EffectInstance(frozen_effect)));
	
	public static class Frozen extends Effect{

		public Frozen(EffectType typeIn, int liquidColorIn) {
			super(typeIn, liquidColorIn);
		}
		
	}
}
