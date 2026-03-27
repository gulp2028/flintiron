package flintiron.items;

import flintiron.Flintiron;
import flintiron.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {


    public static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        Identifier id = Identifier.of(Flintiron.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        return Registry.register(
                Registries.ITEM,
                id,
                factory.apply(new Item.Settings().registryKey(key))
        );
    }

    public static final Item CRUDE_POWDER = registerItem("crude_powder", Item::new);
    public static final Item COPPER_CARTRIDGE = registerItem("copper_cartridge", Item::new);
    public static final Item IRON_CARTRIDGE = registerItem("iron_cartridge", Item::new);
    public static final Item GOLD_CARTRIDGE = registerItem("gold_cartridge", Item::new);
    public static final Item FLINTSTONE_CARTRIDGE = registerItem("flintstone_cartridge", Item::new);
    public static final Item FLINTSTONE_INGOT = registerItem("flintstone_ingot", Item::new);
    public static final Item RAW_FLINTSTONE = registerItem("raw_flintstone", Item::new); // fixed name


    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.add(FLINTSTONE_INGOT);
            content.add(CRUDE_POWDER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(COPPER_CARTRIDGE);
            content.add(IRON_CARTRIDGE);
            content.add(GOLD_CARTRIDGE);
            content.add(FLINTSTONE_CARTRIDGE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.add(ModBlocks.FLINTSTONE_ORE);
        });
    }
}