
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.item.SculkArmorItem;

import sculk.SculkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class SculkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SculkMod.MODID);
	public static final RegistryObject<Item> SCULK_ARMOR_HELMET = REGISTRY.register("sculk_armor_helmet", () -> new SculkArmorItem.Helmet());
	public static final RegistryObject<Item> SCULK_ARMOR_CHESTPLATE = REGISTRY.register("sculk_armor_chestplate",
			() -> new SculkArmorItem.Chestplate());
	public static final RegistryObject<Item> SCULK_ARMOR_LEGGINGS = REGISTRY.register("sculk_armor_leggings", () -> new SculkArmorItem.Leggings());
	public static final RegistryObject<Item> SCULK_ARMOR_BOOTS = REGISTRY.register("sculk_armor_boots", () -> new SculkArmorItem.Boots());
}
