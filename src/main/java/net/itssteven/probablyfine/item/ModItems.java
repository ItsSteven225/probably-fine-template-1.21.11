package net.itssteven.probablyfine.item;

import net.itssteven.probablyfine.ProbablyFine;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item VILLAGER_FETUS = registerItem("villager_fetus", Item::new);

    private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory) {
        Identifier id = Identifier.of(ProbablyFine.MOD_ID, name);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings().registryKey(itemKey);

        Item item = itemFactory.apply(settings);
        return Registry.register(Registries.ITEM, itemKey, item);
    }

    public static void registerModItems() {
        ProbablyFine.LOGGER.info("Registering mod items for {}", ProbablyFine.MOD_ID);
    }
}
