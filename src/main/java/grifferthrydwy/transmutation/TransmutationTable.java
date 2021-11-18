package grifferthrydwy.transmutation;

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
    private Object PlayerEntity;
    private Object Hand;

    public TransmutationTable(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player instanceof ServerPlayerEntity) {
            int xpneeded = requiredExperience((net.minecraft.entity.player.PlayerEntity) PlayerEntity, (net.minecraft.util.Hand) Hand);
            if ((player.experienceLevel) > (xpneeded - 1)) {
                final int itemCount = player.getStackInHand(hand).getCount();
                player.addExperience((-xpneeded));
                ItemStack result = resultItem((net.minecraft.entity.player.PlayerEntity) PlayerEntity, (net.minecraft.util.Hand) Hand).getDefaultStack();
                result.setCount(itemCount);
                player.setStackInHand(hand, result);
                return ActionResult.SUCCESS;
                } else {
                    return ActionResult.FAIL;
                }
        } else {
                return ActionResult.FAIL;
        }
    }


    private int requiredExperience(PlayerEntity player, Hand hand) {
        if ((player.getStackInHand(hand).getItem() == RegisterItems.LEAD_INGOT)) {
            return 1045970;
        } else {
            return 1;
        }
    }

    private Item resultItem(PlayerEntity player, Hand hand) {
        if ((player.getStackInHand(hand).getItem() == RegisterItems.LEAD_INGOT)) {
            return RegisterItems.TRUE_GOLD_INGOT;
        } else if ((player.getStackInHand(hand).getItem() == Items.ACACIA_LOG)) {
            return Items.CRIMSON_STEM;
        } else if ((player.getStackInHand(hand).getItem() == Items.SPRUCE_LOG)) {
            return Items.ACACIA_LOG;
        } else if ((player.getStackInHand(hand).getItem() == Items.DARK_OAK_LOG)) {
            return Items.SPRUCE_LOG;
        } else if ((player.getStackInHand(hand).getItem() == Items.BIRCH_LOG)) {
            return Items.DARK_OAK_LOG;
        } else if ((player.getStackInHand(hand).getItem() == Items.OAK_LOG)) {
            return Items.BIRCH_LOG;
        } else if ((player.getStackInHand(hand).getItem() == Items.CRIMSON_STEM)) {
            return Items.WARPED_STEM;
        } else if ((player.getStackInHand(hand).getItem() == Items.WARPED_STEM)) {
            return Items.OAK_LOG;
        } else  {
            return null;
        }

    }
}
