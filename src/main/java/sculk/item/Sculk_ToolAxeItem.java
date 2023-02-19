
package sculk.item;

import sculk.init.SculkModTabs;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class Sculk_ToolAxeItem extends AxeItem {
	public Sculk_ToolAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.SCULK));
			}
		}, 1, -3f, new Item.Properties().tab(SculkModTabs.TAB_SCULK));
	}
}
