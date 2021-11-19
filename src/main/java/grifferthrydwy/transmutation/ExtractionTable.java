package grifferthrydwy.transmutation;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.LeadItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ExtractionTable extends Block {
    public ExtractionTable(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!(player.getStackInHand(hand).getItem() instanceof LeadItem)) {
        final int itemCount = player.getStackInHand(hand).getCount();
        player.addExperience((itemCount));
        ItemStack lead = RegisterItems.LEAD_SCRAP.getDefaultStack();
        lead.setCount(itemCount);
        player.setStackInHand(hand, lead);
        return ActionResult.SUCCESS;
        } else {
            return ActionResult.FAIL;
        }
    }
}
