
package sculk.item;

import sculk.init.SculkModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Upgrad5Item extends Item {
	public Upgrad5Item() {
		super(new Item.Properties().tab(SculkModTabs.TAB_UPGRADO).stacksTo(1).rarity(Rarity.COMMON));
	}
}
