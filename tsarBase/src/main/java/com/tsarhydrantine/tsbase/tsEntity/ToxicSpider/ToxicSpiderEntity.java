package com.tsarhydrantine.tsbase.tsEntity.ToxicSpider;

import com.tsarhydrantine.tsbase.tsEntity.TsEntities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.ClimberPathNavigator;
import net.minecraft.pathfinding.PathNavigator;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class ToxicSpiderEntity extends SpiderEntity {
	private static final DataParameter<Byte> LEAPING = EntityDataManager.createKey(ToxicSpiderEntity.class,DataSerializers.BYTE);
	
	public ToxicSpiderEntity(World worldIn) {
		super(TsEntities.TOXIC_SPIDER, worldIn);
	}

	protected PathNavigator createNavigator(World worldIn) {
		return new ClimberPathNavigator(this, worldIn);
	}

	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(25.0D);
		this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0F);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue((double) 0.4F);
	}

	public boolean attackEntityAsMob(Entity entityIn) {
		if (super.attackEntityAsMob(entityIn)) {
			if (entityIn instanceof LivingEntity) {
				int i = 0;
				if (this.world.getDifficulty() == Difficulty.EASY) {
					i = 4;
				} else if (this.world.getDifficulty() == Difficulty.NORMAL) {
					i = 8;
				} else if (this.world.getDifficulty() == Difficulty.HARD) {
					i = 16;
				}

				if (i > 0) {
					((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.POISON, i * 16, 0));
					((LivingEntity) entityIn).addPotionEffect(new EffectInstance(Effects.WEAKNESS, i * 8, 0));
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public boolean isPotionApplicable(EffectInstance potioneffectIn) {
		if (potioneffectIn.getPotion() == Effects.POISON) {
			net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent event = new net.minecraftforge.event.entity.living.PotionEvent.PotionApplicableEvent(
					this, potioneffectIn);
			net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
			return event.getResult() == net.minecraftforge.eventbus.api.Event.Result.ALLOW;
		}
		return super.isPotionApplicable(potioneffectIn);
	}


}
