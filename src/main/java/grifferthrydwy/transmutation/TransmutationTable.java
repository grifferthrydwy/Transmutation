package grifferthrydwy.transmutation;

import java.util.HashMap;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TransmutationTable extends Block {

    // A list of input recipes and their outputs
    private static final HashMap<Item, Item> RECIPES = new HashMap<>() {{
        put(RegisterItems.LEAD_INGOT, RegisterItems.TRUE_GOLD_INGOT);
        put(Items.ACACIA_LOG, Items.CRIMSON_STEM);
        put(Items.SPRUCE_LOG, Items.ACACIA_LOG);
        put(Items.DARK_OAK_LOG, Items.SPRUCE_LOG);
        put(Items.BIRCH_LOG, Items.DARK_OAK_LOG);
        put(Items.OAK_LOG, Items.BIRCH_LOG);
        put(Items.CRIMSON_STEM, Items.WARPED_STEM);
        put(Items.WARPED_STEM, Items.OAK_LOG);
    }};

    public TransmutationTable(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player instanceof ServerPlayerEntity) {
            int xpneeded = requiredExperience(player, hand);
            if (player.totalExperience > xpneeded - 1 || player.isCreative()) {
                player.addExperience((-xpneeded));
                ItemStack result = recipe(player.getStackInHand(hand).getItem()).getDefaultStack();
                result.setCount(player.getStackInHand(hand).getCount());
                player.setStackInHand(hand, result);
                return ActionResult.SUCCESS;
            }
        }
        // A replacement for the if else statements
        return ActionResult.FAIL;
    }


    private int requiredExperience(PlayerEntity player, Hand hand) {
        if ((player.getStackInHand(hand).getItem() == RegisterItems.LEAD_INGOT)) {
            return 1045970;
        } else {
            return 1;
        }
    }

    private static Item recipe(Item input) {
        // Looks up the input, and if it can't find a result, it returns the input.
        return RECIPES.getOrDefault(input, input);
    }
}
