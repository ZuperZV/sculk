
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sculk.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SculkModTabs {
	public static CreativeModeTab TAB_SCULK;

	public static void load() {
		TAB_SCULK = new CreativeModeTab("tabsculk") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SculkModItems.SCULK_ARMOR_CHESTPLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
