
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.world.inventory.FMenu;

import sculk.SculkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class SculkModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SculkMod.MODID);
	public static final RegistryObject<MenuType<FMenu>> F = REGISTRY.register("f", () -> IForgeMenuType.create(FMenu::new));
}
