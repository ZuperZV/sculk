
package sculk.item;

import sculk.procedures.NetheriteSculkHelmetTickEventProcedure;

import sculk.init.SculkModTabs;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class NetheriteSculkItem extends ArmorItem {
	public NetheriteSculkItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 43;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 8, 9, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.sculk_catalyst.break"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "netherite_sculk";
			}

			@Override
			public float getToughness() {
				return 0.4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.30000000000000004f;
			}
		}, slot, properties);
	}

	public static class Helmet extends NetheriteSculkItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(SculkModTabs.TAB_SCULK).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sculk:textures/models/armor/n__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NetheriteSculkHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends NetheriteSculkItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(SculkModTabs.TAB_SCULK).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sculk:textures/models/armor/n__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NetheriteSculkHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends NetheriteSculkItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(SculkModTabs.TAB_SCULK).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sculk:textures/models/armor/n__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NetheriteSculkHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends NetheriteSculkItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(SculkModTabs.TAB_SCULK).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "sculk:textures/models/armor/n__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			NetheriteSculkHelmetTickEventProcedure.execute(entity);
		}
	}
}
