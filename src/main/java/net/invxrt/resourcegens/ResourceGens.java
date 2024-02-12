package net.invxrt.resourcegens;

import net.invxrt.resourcegens.block.ModBlocks;
import net.invxrt.resourcegens.block.entity.ModBlockEntities;
import net.invxrt.resourcegens.item.ModItems;
import net.invxrt.resourcegens.screen.ModMenuTypes;
import net.invxrt.resourcegens.screen.Tier1GenScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ResourceGens.MOD_ID)
public class ResourceGens {
    public static final String MOD_ID = "resourcegens";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    // Add a comment
    public ResourceGens() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        MenuScreens.register(ModMenuTypes.TIER_1_GEN_MENU.get(), Tier1GenScreen::new);
    }
    private void clientSetup (final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TIER_1_GENERATOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TIER_2_GENERATOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TIER_3_GENERATOR.get(), RenderType.cutout());


    }
}
