
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.client.gui.FScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SculkModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SculkModMenus.F.get(), FScreen::new);
		});
	}
}
