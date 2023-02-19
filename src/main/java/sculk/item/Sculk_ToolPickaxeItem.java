
package sculk.item;

import sculk.init.SculkModTabs;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class Sculk_ToolPickaxeItem extends PickaxeItem {
	public Sculk_ToolPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
