package com.tsarhydrantine.tsbase.tsBlocks;

import com.tsarhydrantine.tsbase.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TsBlocks {
	
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	
	public static final RegistryObject<Block> HELLTHORNBLOCK = BLOCKS.register("hellthornblock", () -> new Block(Block.Properties.create(Material.LEAVES)));
	
}
