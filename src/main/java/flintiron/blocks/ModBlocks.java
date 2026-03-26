package flintiron.blocks;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import flintiron.Flintiron;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block FLINTSTONE = Registry.register(
            Registries.BLOCK,
            Identifier.of(Flintiron.MOD_ID, "flintstone"),
            new Block(AbstractBlock.Settings.create().strength(3.5f).requiresTool())
    );

    public static final Item FLINTSTONE_ITEM = Registry.register(
            Registries.ITEM,
            Identifier.of(Flintiron.MOD_ID, "flintstone"),
            new BlockItem(FLINTSTONE, new Item.Settings())
    );

    public static void registerModBlocks() {
    }


}



