package grifferthrydwy.transmutation;

import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import dev.emi.trinkets.api.TrinketsApi;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CarrotPendant extends TrinketItem {
    public CarrotPendant(Item.Settings settings) {
        super(settings);
    }

    @Override
    public void tick(ItemStack stack, SlotReference slot, LivingEntity entity) {
        if (entity instanceof PlayerEntity playerEntity) {
            int xp = playerEntity.totalExperience;
                if (TrinketsApi.getTrinketComponent((LivingEntity) entity).isPresent() && (TrinketsApi.getTrinketComponent(entity).get().isEquipped(RegisterItems.CARROT_PENDANT)) && (playerEntity.canConsume(false)) && xp > 0) {
                    playerEntity.addExperience(-1);
                    playerEntity.addExhaustion(-1);
                    playerEntity.getHungerManager().add(2, 20);
                }
            }
        }
    }

