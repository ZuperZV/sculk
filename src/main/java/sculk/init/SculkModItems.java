
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.item.SculkStoneItem;
import sculk.item.SculkCrossbowItem;
import sculk.item.SculkArmorItem;

import sculk.SculkMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class SculkModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SculkMod.MODID);
	public static final RegistryObject<Item> SCULK_ARMOR_HELMET = REGISTRY.register("sculk_armor_helmet", () -> new SculkArmorItem.Helmet());
	public static final RegistryObject<Item> SCULK_ARMOR_CHESTPLATE = REGISTRY.register("sculk_armor_chestplate",
			() -> new SculkArmorItem.Chestplate());
	public static final RegistryObject<Item> SCULK_ARMOR_LEGGINGS = REGISTRY.register("sculk_armor_leggings", () -> new SculkArmorItem.Leggings());
	public static final RegistryObject<Item> SCULK_ARMOR_BOOTS = REGISTRY.register("sculk_armor_boots", () -> new SculkArmorItem.Boots());
	public static final RegistryObject<Item> SCULK_CROSSBOW = REGISTRY.register("sculk_crossbow", () -> new SculkCrossbowItem());
	public static final RegistryObject<Item> SCULK_STONE = REGISTRY.register("sculk_stone", () -> new SculkStoneItem());
	public static final RegistryObject<Item> SCULK_CRUSHER = block(SculkModBlocks.SCULK_CRUSHER, SculkModTabs.TAB_SCULK);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
