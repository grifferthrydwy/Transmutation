package grifferthrydwy.transmutation;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class TrueGoldArmorMaterial implements ArmorMaterial {
        private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
        private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};


        public int getDurability(EquipmentSlot slot) {
                return BASE_DURABILITY[slot.getEntitySlotId()] * 37;
        }
        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
                return PROTECTION_VALUES[slot.getEntitySlotId()];
        }
        @Override
        public int getEnchantability() {
                return 30;
        }

        @Override
        public SoundEvent getEquipSound() {
                return SoundEvents.ITEM_ARMOR_EQUIP_GOLD;
        }

        @Override
        public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(RegisterItems.TRUE_GOLD_INGOT);
        }

        @Override
        public String getName() {
                return "true_gold";
        }

        @Override
        public float getToughness() {
                return 3.0F;
        }

        @Override
        public float getKnockbackResistance() {
                return 0.0F;
        }
}
