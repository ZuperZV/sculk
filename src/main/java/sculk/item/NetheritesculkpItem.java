
package sculk.item;

import sculk.init.SculkModTabs;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class NetheritesculkpItem extends PickaxeItem {
	public NetheritesculkpItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 16.5f;
			}

			public float getAttackDamageBonus() {
				return 1.3000000000000003f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.SCULK));
			}
		}, 1, -3.2999999999999999f, new Item.Properties().tab(SculkModTabs.TAB_SCULK).fireResistant());
	}
}
