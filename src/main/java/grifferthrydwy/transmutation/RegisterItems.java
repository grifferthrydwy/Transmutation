package grifferthrydwy.transmutation;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public static final ArmorMaterial TRUE_GOLD = new TrueGoldArmorMaterial();
    public static final Item TRUE_GOLD_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item LEAD_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_LEAD = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item TRUE_GOLD_HELMET = new ArmorItem(TRUE_GOLD, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TRUE_GOLD_CHESTPLATE = new ArmorItem(TRUE_GOLD, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TRUE_GOLD_LEGGINGS = new ArmorItem(TRUE_GOLD, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item TRUE_GOLD_BOOTS = new ArmorItem(TRUE_GOLD, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem TRUE_GOLD_SHOVEL = new ShovelItem(TrueGoldToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TRUE_GOLD_SWORD = new SwordItem(TrueGoldToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem TRUE_GOLD_PICKAXE = new TrueGoldPickaxeItem(TrueGoldToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TRUE_GOLD_AXE = new TrueGoldAxeItem(TrueGoldToolMaterial.INSTANCE, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TRUE_GOLD_HOE = new TrueGoldHoeItem(TrueGoldToolMaterial.INSTANCE, -4, 0.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final Block EXTRACTION_TABLE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block TRANSMUTATION_TABLE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block BLOCK_OF_LEAD = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final Block BLOCK_OF_TRUE_GOLD = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold"), TRUE_GOLD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_helmet"), TRUE_GOLD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_chestplate"), TRUE_GOLD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_leggings"), TRUE_GOLD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_boots"), TRUE_GOLD_BOOTS);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "raw_lead"), RAW_LEAD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_shovel"), TRUE_GOLD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_sword"), TRUE_GOLD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_axe"), TRUE_GOLD_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_hoe"), TRUE_GOLD_HOE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_pickaxe"), TRUE_GOLD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "extraction_table"), new BlockItem(EXTRACTION_TABLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "transmutation_table"), new BlockItem(TRANSMUTATION_TABLE, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "lead_block"), new BlockItem(BLOCK_OF_LEAD, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "true_gold_block"), new BlockItem(BLOCK_OF_TRUE_GOLD, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
