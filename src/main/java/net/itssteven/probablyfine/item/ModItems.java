package net.itssteven.probablyfine.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.itssteven.probablyfine.ProbablyFine;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.function.Function;

public class ModItems {

    // TU ITEM
    public static final Item VILLAGER_FETUS = register(
            "villager_fetus",
            Item::new,
            new Item.Settings()
    );

    public static <T extends Item> T register(String name, Function<Item.Settings, T> itemFactory, FabricItem.Settings settings) {

        Resource<Item> itemKey = ResourceKey.create(
                Registries.ITEM,
                new ResourceLocation(ProbablyFine.MOD_ID, name)
        );

        T item = itemFactory.apply(settings);

        Registry.register(BuiltInRegistries.ITEM, itemKey.location(), item);

        return item;
    }

    public static void registerModItems() {
    }
}