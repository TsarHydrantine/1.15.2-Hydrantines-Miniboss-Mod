package com.tsarhydrantine.tsbase.tsEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.tsarhydrantine.tsbase.Reference;
import com.tsarhydrantine.tsbase.tsEntity.Cerberus.CerberusEntity;
import com.tsarhydrantine.tsbase.tsEntity.IchorianGiant.IchorianGiantEntity;
import com.tsarhydrantine.tsbase.tsEntity.QueenBee.QueenBeeEntity;
import com.tsarhydrantine.tsbase.tsEntity.SkeletonVanguard.SkeletonVanguardEntity;
import com.tsarhydrantine.tsbase.tsEntity.ToxicSpider.ToxicSpiderEntity;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TsEntities
{
    private static final List<EntityType<?>> ENTITY_TYPES = new ArrayList<>();

    public static final EntityType<IchorianGiantEntity> ICHORIAN_GIANT = build(new ResourceLocation(Reference.MOD_ID, "ichorian_giant"), IchorianGiantEntity::new, 2.0F, 2.0F);
    public static final EntityType<ToxicSpiderEntity> TOXIC_SPIDER = build(new ResourceLocation(Reference.MOD_ID, "toxic_spider"), ToxicSpiderEntity::new, 2.0F, 1.0F);
    public static final EntityType<QueenBeeEntity> QUEEN_BEE = build(new ResourceLocation(Reference.MOD_ID, "queen_bee"), QueenBeeEntity::new, 2.0F, 2.0F);
    public static final EntityType<SkeletonVanguardEntity> SKELETON_VANGUARD = build(new ResourceLocation(Reference.MOD_ID, "skeleton_vanguard"), SkeletonVanguardEntity::new, 2.0F, 2.0F);
    public static final EntityType<CerberusEntity> CERBERUS = build(new ResourceLocation(Reference.MOD_ID, "cerberus"), CerberusEntity::new, 1.0F, 1.0F);
    
    private static <T extends Entity> EntityType<T> build(ResourceLocation id, Function<World, T> function, float width, float height)
    {
        EntityType<T> type = EntityType.Builder.<T>create((entityType, world) -> function.apply(world), EntityClassification.CREATURE).size(width, height).setCustomClientFactory((spawnEntity, world) -> function.apply(world)).build(id.toString());
        type.setRegistryName(id);
        ENTITY_TYPES.add(type);
        return type;
    }

    @SubscribeEvent
    public static void registerTypes(final RegistryEvent.Register<EntityType<?>> event)
    {
        IForgeRegistry<EntityType<?>> registry = event.getRegistry();
        ENTITY_TYPES.forEach(registry::register);
    }
}
