
package sculk.item;

import sculk.init.SculkModTabs;
import sculk.init.SculkModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class SkarItem extends BucketItem {
	public SkarItem() {
		super(SculkModFluids.SKAR, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE).tab(SculkModTabs.TAB_SCULK));
	}
}
