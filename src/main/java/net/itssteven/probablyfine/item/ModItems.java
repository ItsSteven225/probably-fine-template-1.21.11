package net.itssteven.probablyfine.item;

import net.itssteven.probablyfine.ProbablyFine;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VILLAGER_FETUS = registerItem("villager_fetus", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ProbablyFine.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ProbablyFine.LOGGER.info("Registering mod items for {}", ProbablyFine.MOD_ID);
    }
}
