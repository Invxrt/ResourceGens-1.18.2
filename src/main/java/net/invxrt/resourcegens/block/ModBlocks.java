package net.invxrt.resourcegens.block;

import net.invxrt.resourcegens.ResourceGens;
import net.invxrt.resourcegens.item.ModCreativeModeTab;
import net.invxrt.resourcegens.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ResourceGens.MOD_ID);

public static final RegistryObject<Block> TIER_1_GENERATOR = registerBlock("tier_1_generator",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEGENS_TAB);

public static final RegistryObject<Block> TIER_2_GENERATOR = registerBlock("tier_2_generator",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEGENS_TAB);

public static final RegistryObject<Block> TIER_3_GENERATOR = registerBlock("tier_3_generator",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.RESOURCEGENS_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
