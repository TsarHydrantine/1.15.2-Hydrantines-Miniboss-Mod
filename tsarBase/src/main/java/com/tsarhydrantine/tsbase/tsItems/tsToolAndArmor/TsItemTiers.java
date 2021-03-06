package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

public enum TsItemTiers implements IItemTier {
		GLASS(0, 1561, 2.0F, 0.0F, 31, () -> {
			return Ingredient.fromItems(Items.NETHER_STAR);
		});

		private final int harvestLevel;
		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;

		private TsItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.harvestLevel = harvestLevel;
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() { return maxUses; }

		@Override
		public float getEfficiency() { return efficiency; }

		@Override
		public float getAttackDamage() { return attackDamage; }

		@Override
		public int getHarvestLevel() { return harvestLevel; }

		@Override
		public int getEnchantability() { return enchantability; }

		@Override
		public Ingredient getRepairMaterial() { return repairMaterial.getValue(); }
}

