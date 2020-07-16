package com.tsarhydrantine.tsbase.tsStruct;

import java.util.List;
import java.util.function.Function;

import com.google.common.collect.Lists;
import com.mojang.datafixers.Dynamic;

import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.ScatteredStructure;

public class StoneBrickPillarStructure extends ScatteredStructure<NoFeatureConfig> {
	private static final List<Biome.SpawnListEntry> FRENS = Lists.newArrayList(new Biome.SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 1, 1, 1));
	
	public StoneBrickPillarStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51413_1_) {
		super(p_i51413_1_);
	}

	@Override
	protected int getSeedModifier() {
		return 0;
	}

	@Override
	public IStartFactory getStartFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStructureName() {
		return "Stone_Brick_Pillar";
	}

	@Override
	public int getSize() {
		return 1;
	}

}