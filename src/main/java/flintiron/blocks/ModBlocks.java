package flintiron.blocks;

import flintiron.Flintiron;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FLINTSTONE = registerBlock("flintstone", 3.5f);
    public static final Item FLINTSTONE_ITEM = registerBlockItem("flintstone", FLINTSTONE);


    private static Block registerBlock(String name, float strength) {
        Identifier id = Identifier.of(Flintiron.MOD_ID, name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);

        return Registry.register(
                Registries.BLOCK,
                id,
                new Block(AbstractBlock.Settings.create()
                        .registryKey(key)
                        .strength(strength)
                        .requiresTool())
        );
    }

    private static Item registerBlockItem(String name, Block block) {
        Identifier id = Identifier.of(Flintiron.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        return Registry.register(
                Registries.ITEM,
                id,
                new BlockItem(block, new Item.Settings()
                        .registryKey(key))
        );
    }

    public static void registerModBlocks() {}
}



