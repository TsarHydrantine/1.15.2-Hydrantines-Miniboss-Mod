package com.tsarhydrantine.tsbase.tsEntity;

import com.tsarhydrantine.tsbase.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TsSounds {
	private static final List<SoundEvent> SOUNDS = new ArrayList<>();

	public static final SoundEvent ENTITY_ICHORIAN_GIANT_IDLE = register(Reference.MOD_ID + ":entity.ichorian_giant_idle");

	private static SoundEvent register(String name) {
		SoundEvent event = new SoundEvent(new ResourceLocation(name));
		event.setRegistryName(name);
		SOUNDS.add(event);
		return event;
	}

	@SubscribeEvent
	@SuppressWarnings("unused")
	public static void registerSounds(final RegistryEvent.Register<SoundEvent> event) {
		IForgeRegistry<SoundEvent> registry = event.getRegistry();
		SOUNDS.forEach(registry::register);
		SOUNDS.clear();
	}
}