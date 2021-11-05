package grifferthrydwy.transmutation;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TrueGoldToolMaterial implements ToolMaterial {
    @Override
    public int getDurability()  {
        return 2031;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
    }
    @Override
    public float getAttackDamage() {
        return 4.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 30;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegisterItems.TRUE_GOLD_INGOT);
    }

    public static final TrueGoldToolMaterial INSTANCE = new TrueGoldToolMaterial();
    }

