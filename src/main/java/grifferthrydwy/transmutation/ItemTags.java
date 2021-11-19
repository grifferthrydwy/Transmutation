package grifferthrydwy.transmutation;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ItemTags {
    public static final Tag<Item> LEAD = TagFactory.ITEM.create(new Identifier(Main.MOD_ID, "lead"));
}