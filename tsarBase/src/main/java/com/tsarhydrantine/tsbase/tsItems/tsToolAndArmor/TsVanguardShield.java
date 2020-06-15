package com.tsarhydrantine.tsbase.tsItems.tsToolAndArmor;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class TsVanguardShield extends ShieldItem{

	public TsVanguardShield(Properties builder) {
		super(builder);
	}
	
	@Override
	public boolean isShield(ItemStack stack, LivingEntity entity) {
		return true;
	}
	
}
