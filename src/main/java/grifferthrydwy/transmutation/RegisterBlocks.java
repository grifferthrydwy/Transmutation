package grifferthrydwy.transmutation;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterBlocks {
    public static final ExtractionTable EXTRACTION_TABLE = new ExtractionTable(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TRANSMUTATION_TABLE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block BLOCK_OF_LEAD = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block BLOCK_OF_TRUE_GOLD = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "extraction_table"), EXTRACTION_TABLE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "transmutation_table"), TRANSMUTATION_TABLE);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "lead_block"), BLOCK_OF_LEAD);
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "true_gold_block"), BLOCK_OF_TRUE_GOLD);

    }

}
