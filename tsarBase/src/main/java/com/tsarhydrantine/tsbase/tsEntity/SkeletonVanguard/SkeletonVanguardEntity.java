package com.tsarhydrantine.tsbase.tsEntity.SkeletonVanguard;

import java.util.Random;

import javax.annotation.Nullable;

import com.tsarhydrantine.tsbase.tsEnchantments.TsEnchantments;
import com.tsarhydrantine.tsbase.tsEntity.TsEntities;
import com.tsarhydrantine.tsbase.tsItems.TsItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class SkeletonVanguardEntity extends AbstractSkeletonEntity {

	public SkeletonVanguardEntity(World worldIn) {
		super(TsEntities.SKELETON_VANGUARD, worldIn);
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return SoundEvents.ENTITY_SKELETON_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return SoundEvents.ENTITY_SKELETON_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return SoundEvents.ENTITY_SKELETON_DEATH;
	}

	@Override
	protected SoundEvent getStepSound() {
		return SoundEvents.ENTITY_SKELETON_STEP;
	}

	@Override
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {
		this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(TsItems.VANGUARD_HELMET.get()));
		this.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(TsItems.VANGUARD_CHESTPLATE.get()));
		this.setItemStackToSlot(EquipmentSlotType.LEGS, new ItemStack(TsItems.VANGUARD_LEGGINGS.get()));
		this.setItemStackToSlot(EquipmentSlotType.OFFHAND, new ItemStack(TsItems.VANGUARD_SHEILD.get()));
	}

	@Override
	@Nullable
	public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason,
			@Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
		spawnDataIn = super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);

		this.setEquipmentBasedOnDifficulty(difficultyIn);
		this.giveMagicalToolBasedOnDifficulty(difficultyIn);
		this.addMagicalToolEnchatments();
		return spawnDataIn;
	}

	protected void giveMagicalToolBasedOnDifficulty(DifficultyInstance difficultyIn) {
		float difficulty = difficultyIn.getClampedAdditionalDifficulty();
		double random = Math.random();
		//HasL00t
		if (random < 0.55D * difficulty) {
			if (random < 0.15D * difficulty) {
				 this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(TsItems.GRAVE_GLAIVE.get()));
			}else{
				 this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(TsItems.VENOM_GLAIVE.get()));
			}
		}else {
			 this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(TsItems.IRON_GLAIVE.get()));
		}
	}

	protected void addMagicalToolEnchatments() {
		ItemStack held = this.getHeldItemMainhand();
		if (!held.isEmpty()) {
			if (held == TsItems.GRAVE_GLAIVE.get().getDefaultInstance()) {
				held.addEnchantment(TsEnchantments.SEPULCHER.get(), 5);
			} else if (held == TsItems.VENOM_GLAIVE.get().getDefaultInstance()) {
				held.addEnchantment(TsEnchantments.POISON_ASPECT.get(), 5);
			}
		}
	}

	@Override
	protected void dropSpecialItems(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropSpecialItems(source, looting, recentlyHitIn);
		Entity entity = source.getTrueSource();
		if (entity instanceof CreeperEntity) {
			CreeperEntity creeperentity = (CreeperEntity) entity;
			if (creeperentity.ableToCauseSkullDrop()) {
				creeperentity.incrementDroppedSkulls();
				this.entityDropItem(Items.SKELETON_SKULL);
			}
		}

	}

}
