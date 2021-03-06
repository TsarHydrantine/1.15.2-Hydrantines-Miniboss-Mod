package com.tsarhydrantine.tsbase.tsEntity.IchorianGiant;

import java.util.function.Predicate;

import com.tsarhydrantine.tsbase.tsEntity.TsEntities;

import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.DefendVillageTargetGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.MoveThroughVillageGoal;
import net.minecraft.entity.ai.goal.MoveTowardsTargetGoal;
import net.minecraft.entity.ai.goal.MoveTowardsVillageGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.RangedAttackGoal;
import net.minecraft.entity.ai.goal.ShowVillagerFlowerGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

/**
 * Author: MrCrayfish
 */
public class IchorianGiantEntity extends CreatureEntity {

	// Delays attacks
	private int attackTimer;

	// Sets up avoidance
	public static final Predicate<LivingEntity> NOT_PASSIVE = (p_213797_0_) -> {
		return p_213797_0_.getCreatureAttribute() != CreatureAttribute.UNDEFINED && p_213797_0_.attackable();
	};

	public IchorianGiantEntity(World worldIn) {
		super(TsEntities.ICHORIAN_GIANT, worldIn);
	}

	protected void registerGoals() {
	      this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0D, true));
	      this.goalSelector.addGoal(2, new MoveTowardsTargetGoal(this, 0.9D, 32.0F));
	      this.goalSelector.addGoal(6, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
	      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
	      this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
	      this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
	      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, MobEntity.class, 5, false, false, (p_213619_0_) -> {
	         return p_213619_0_ instanceof IMob && !(p_213619_0_ instanceof CreeperEntity);
	      }));
	   }

	protected void registerAttributes() {
		super.registerAttributes();
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(150.0D);
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20D);
		this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
		this.getAttributes().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.0D);
	}

	//
	public boolean isNonBoss() {
		return false;
	}
	
	//
	protected boolean shouldDrown() {
	      return false;
	}
	
	//
	public boolean onLivingFall(float distance, float damageMultiplier) {
		return false;
	}

	//
	public boolean canDespawn(double distanceToClosestPlayer) {
		return false;
	}
	
	protected void setEquipmentBasedOnDifficulty(DifficultyInstance difficulty) {  
		this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
	}

	@Override
	protected boolean shouldExchangeEquipment(ItemStack candidate, ItemStack existing, EquipmentSlotType slotTypeIn) {
		return false;
	}
	
}
