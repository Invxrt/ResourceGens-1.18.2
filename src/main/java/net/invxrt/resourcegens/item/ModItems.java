package net.invxrt.resourcegens.item;

import net.invxrt.resourcegens.ResourceGens;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ResourceGens.MOD_ID);


    public static final RegistryObject<Item> TIER1CATALYST = ITEMS.register("tier1catalyst",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEGENS_TAB)));
    public static final RegistryObject<Item> TIER2CATALYST = ITEMS.register("tier2catalyst",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEGENS_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> TIER3CATALYST = ITEMS.register("tier3catalyst",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEGENS_TAB).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> TIER1SHARD = ITEMS.register("tier1shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEGENS_TAB)));
    public static final RegistryObject<Item> TIER2SHARD = ITEMS.register("tier2shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEGENS_TAB).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> TIER3SHARD = ITEMS.register("tier3shard",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RESOURCEGENS_TAB).rarity(Rarity.EPIC)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
