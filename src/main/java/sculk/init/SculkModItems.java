
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import sculk.item.UpgradItem;
import sculk.item.Upgrad5Item;
import sculk.item.Upgrad4Item;
import sculk.item.Upgrad2Item;
import sculk.item.Upgrad1Item;
import sculk.item.SkarItem;
import sculk.item.SculkkillerItem;
import sculk.item.Sculk_ToolSwordItem;
import sculk.item.Sculk_ToolShovelItem;
import sculk.item.Sculk_ToolPickaxeItem;
import sculk.item.Sculk_ToolHoeItem;
import sculk.item.Sculk_ToolAxeItem;
import sculk.item.SculkStoneItem;
import sculk.item.SculkCrossbowItem;
import sculk.item.SculkArmorItem;
import sculk.item.NetheritesculkshItem;
import sculk.item.NetheritesculkpItem;
import sculk.item.NetheritesculkhItem;
import sculk.item.NetheritesculkaItem;
import sculk.item.NetheritesculkSItem;
import sculk.item.NetheriteSculkItem;
import sculk.item.Diamond3Item;

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
	public static final RegistryObject<Item> SCULK_ARMOR_CHESTPLATE = REGISTRY.register("sculk_armor_chestplate", () -> new SculkArmorItem.Chestplate());
	public static final RegistryObject<Item> SCULK_ARMOR_LEGGINGS = REGISTRY.register("sculk_armor_leggings", () -> new SculkArmorItem.Leggings());
	public static final RegistryObject<Item> SCULK_ARMOR_BOOTS = REGISTRY.register("sculk_armor_boots", () -> new SculkArmorItem.Boots());
	public static final RegistryObject<Item> SCULK_CROSSBOW = REGISTRY.register("sculk_crossbow", () -> new SculkCrossbowItem());
	public static final RegistryObject<Item> WARDEN_HEART = REGISTRY.register("warden_heart", () -> new SculkStoneItem());
	public static final RegistryObject<Item> SCULK_CRUSHER = block(SculkModBlocks.SCULK_CRUSHER, SculkModTabs.TAB_SCULK);
	public static final RegistryObject<Item> SCULK_TOOL_PICKAXE = REGISTRY.register("sculk_tool_pickaxe", () -> new Sculk_ToolPickaxeItem());
	public static final RegistryObject<Item> SCULK_TOOL_AXE = REGISTRY.register("sculk_tool_axe", () -> new Sculk_ToolAxeItem());
	public static final RegistryObject<Item> SCULK_TOOL_SWORD = REGISTRY.register("sculk_tool_sword", () -> new Sculk_ToolSwordItem());
	public static final RegistryObject<Item> SCULK_TOOL_SHOVEL = REGISTRY.register("sculk_tool_shovel", () -> new Sculk_ToolShovelItem());
	public static final RegistryObject<Item> SCULK_TOOL_HOE = REGISTRY.register("sculk_tool_hoe", () -> new Sculk_ToolHoeItem());
	public static final RegistryObject<Item> SKAR_BUCKET = REGISTRY.register("skar_bucket", () -> new SkarItem());
	public static final RegistryObject<Item> SCULKKILLER = REGISTRY.register("sculkkiller", () -> new SculkkillerItem());
	public static final RegistryObject<Item> NETHERITE_SCULK_HELMET = REGISTRY.register("netherite_sculk_helmet", () -> new NetheriteSculkItem.Helmet());
	public static final RegistryObject<Item> NETHERITE_SCULK_CHESTPLATE = REGISTRY.register("netherite_sculk_chestplate", () -> new NetheriteSculkItem.Chestplate());
	public static final RegistryObject<Item> NETHERITE_SCULK_LEGGINGS = REGISTRY.register("netherite_sculk_leggings", () -> new NetheriteSculkItem.Leggings());
	public static final RegistryObject<Item> NETHERITE_SCULK_BOOTS = REGISTRY.register("netherite_sculk_boots", () -> new NetheriteSculkItem.Boots());
	public static final RegistryObject<Item> NETHERITESCULKP = REGISTRY.register("netheritesculkp", () -> new NetheritesculkpItem());
	public static final RegistryObject<Item> NETHERITESCULKA = REGISTRY.register("netheritesculka", () -> new NetheritesculkaItem());
	public static final RegistryObject<Item> NETHERITESCULK_S = REGISTRY.register("netheritesculk_s", () -> new NetheritesculkSItem());
	public static final RegistryObject<Item> NETHERITESCULKSH = REGISTRY.register("netheritesculksh", () -> new NetheritesculkshItem());
	public static final RegistryObject<Item> NETHERITESCULKH = REGISTRY.register("netheritesculkh", () -> new NetheritesculkhItem());
	public static final RegistryObject<Item> UPGRAD = REGISTRY.register("upgrad", () -> new UpgradItem());
	public static final RegistryObject<Item> UPGRAD_1 = REGISTRY.register("upgrad_1", () -> new Upgrad1Item());
	public static final RegistryObject<Item> UPGRAD_2 = REGISTRY.register("upgrad_2", () -> new Upgrad2Item());
	public static final RegistryObject<Item> DIAMOND_3 = REGISTRY.register("diamond_3", () -> new Diamond3Item());
	public static final RegistryObject<Item> UPGRAD_4 = REGISTRY.register("upgrad_4", () -> new Upgrad4Item());
	public static final RegistryObject<Item> UPGRAD_5 = REGISTRY.register("upgrad_5", () -> new Upgrad5Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
