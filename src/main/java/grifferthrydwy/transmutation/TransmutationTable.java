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

    ItemStack resultitem;
    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).getItem()==RegisterItems.LEAD_INGOT) {
            ItemStack resultitem = RegisterItems.TRUE_GOLD_INGOT.getDefaultStack();
            final int itemCount = player.getStackInHand(hand).getCount();
            final int experience = player.totalExperience;
            final int expcost = 1;
            final int totalcost = expcost*itemCount;
            if (totalcost<experience) {
                player.addExperience(-totalcost);
                resultitem.setCount(itemCount);
                player.setStackInHand(hand, resultitem);
                return ActionResult.SUCCESS;
            } else {
                return ActionResult.FAIL;
            }
        }

        return null;
    }
}
