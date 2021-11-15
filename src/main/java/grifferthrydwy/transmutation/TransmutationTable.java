package grifferthrydwy.transmutation;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TransmutationTable extends Block {
    public TransmutationTable(Settings settings) {
        super(settings);
    }

    int requiredLevel = 0;
    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if ((player.getStackInHand(hand).getItem() == RegisterItems.LEAD_INGOT)) {
            levelRequired();
            if ((player.experienceLevel) > (requiredLevel*499))  {
                final int itemCount = player.getStackInHand(hand).getCount();
                player.addExperience((-1045970));
                ItemStack truegold = RegisterItems.TRUE_GOLD_INGOT.getDefaultStack();
                truegold.setCount(itemCount);
                player.setStackInHand(hand, truegold);
                return ActionResult.SUCCESS;
            } else  {
                return ActionResult.FAIL;
            }
        } else  {
            return ActionResult.FAIL;
        }
    }

    private void levelRequired(PlayerEntity player, Hand hand) {
        if ((player.getStackInHand(hand).getItem() == RegisterItems.LEAD_INGOT))    {
            requiredLevel++;
        }
    }
}
