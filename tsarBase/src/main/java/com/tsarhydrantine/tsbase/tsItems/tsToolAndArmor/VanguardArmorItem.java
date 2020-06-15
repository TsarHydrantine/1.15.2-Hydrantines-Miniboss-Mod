package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor;

import javax.annotation.Nullable;

import com.tsarhydrantine.tsbase.tsItems.TsItems;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class VanguardArmorItem extends ArmorItem {

	public VanguardArmorItem(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builder) {
		super(materialIn, slot, builder);
	}

	@SuppressWarnings("unchecked")
	@Nullable
	@Override
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
		VanguardArmorModel model = new VanguardArmorModel(1F);
		model.Head.showModel = armorSlot == EquipmentSlotType.HEAD;
		model.Body.showModel = armorSlot == EquipmentSlotType.CHEST;
		model.Waist.showModel = armorSlot == EquipmentSlotType.LEGS;
		model.RightLeg.showModel = armorSlot == EquipmentSlotType.LEGS;
		model.LeftLeg.showModel = armorSlot == EquipmentSlotType.LEGS;

		model.isChild = _default.isChild;
		model.isSneak = _default.isSneak;
		model.isSitting = _default.isSitting;
		model.rightArmPose = _default.rightArmPose;
		model.leftArmPose = _default.leftArmPose;

		return (A) model;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
	{
		if(getArmorStyle(stack) == Style.VANGUARD) {
			return "tsbase:textures/models/armor/vanguard_armor.png";
		}else if(getArmorStyle(stack) == Style.WOLF) {
			return "tsbase:textures/models/armor/wolf_armor.png";
		}else if(getArmorStyle(stack) == Style.FOX) {
			return "tsbase:textures/models/armor/fox_armor.png";
		}
		
		return "tsbase:textures/models/armor/non_existant.png";
	}

	public Style getArmorStyle(ItemStack stack) {
		String registy = stack.getItem().getRegistryName().toString();
		if(registy.contains("vanguard")) return Style.VANGUARD;
		else if(registy.contains("wolf")) return Style.WOLF;
		else if(registy.contains("fox")) return Style.FOX;
		else return Style.NORMAL;
	}
	
	public enum Style{
		NORMAL,
		VANGUARD,
		WOLF,
		FOX
	}
}