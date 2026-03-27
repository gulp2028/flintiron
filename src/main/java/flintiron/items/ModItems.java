package flintiron.items;

import flintiron.Flintiron;
import flintiron.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import flintiron.blocks.ModBlocks;

public class ModItems {

    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registerKey =
                RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Flintiron.MOD_ID, name));
        return Registry.register(Registries.ITEM, Identifier.of(Flintiron.MOD_ID, name), factory.apply(settings));

    }
    public static final Item CRUDE_POWDER = registerItem("crude_powder", Item::new, new Item.Settings());
    public static final Item COPPER_CARTRIDGE = registerItem("copper_cartridge", Item::new, new Item.Settings());
    public static final Item IRON_CARTRIDGE = registerItem("iron_cartridge", Item::new, new Item.Settings());
    public static final Item GOLD_CARTRIDGE = registerItem("gold_cartridge", Item::new, new Item.Settings());
    public static final Item FLINTSTONE_CARTRIDGE = registerItem("flintstone_cartridge", Item::new, new Item.Settings());
    public static final Item FLINTSTONE_INGOT = registerItem("flintstone_ingot", Item::new, new Item.Settings());
    public static final Item RAW_FLINTSTONE = registerItem("raw_flintiron", Item::new, new Item.Settings());



    public static void registerModItems() {

        ItemGroupEvents.modifyEntriesEvent((ItemGroups.FUNCTIONAL)).register(content -> {
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
            content.add(ModBlocks.FLINTSTONE_ITEM);
        });




    }}