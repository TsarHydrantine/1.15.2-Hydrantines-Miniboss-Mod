package com.tsarhydrantine.tsbase.tsEnchantments;

import java.util.Random;

import com.tsarhydrantine.tsbase.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class SepulcherEnchantment extends Enchantment {

	protected SepulcherEnchantment() {
		super(Rarity.UNCOMMON, TsEnchantments.tsGLAIVE, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
	}
	
	/**
	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return 1 + (enchantmentLevel - 1) * 11;
	}

	public int getMaxEnchantability(int enchantmentLevel) {
		return this.getMinEnchantability(enchantmentLevel) + 20;
	}
	*/
	
	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return ench.equals(TsEnchantments.POISON_ASPECT.get()) ? false : true;
	}

	@Override
	public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
		if (creatureType == CreatureAttribute.UNDEAD) {
			return 2.0F + (float) (level - 1) * 0.5F;
		} else {
			return (float) (level - 1) * 0.5F;
		}
	}

	
}
