package com.tsarhydrantine.tsbase.tsEnchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PoisonAspectEnchantment extends Enchantment{
	protected PoisonAspectEnchantment() {
		super(Rarity.COMMON, TsEnchantments.tsGLAIVE, new EquipmentSlotType[] { EquipmentSlotType.MAINHAND });
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
	public void onEntityDamaged(LivingEntity user, Entity target, int level) {
		if (target instanceof LivingEntity) {
			LivingEntity livingTarget = (LivingEntity)target;
			livingTarget.addPotionEffect(new EffectInstance(Effects.POISON, 24+level*24, 1));
		}

	}

	@Override
	public float calcDamageByCreature(int level, CreatureAttribute creatureType) {
		return -level;
	}

	
}
