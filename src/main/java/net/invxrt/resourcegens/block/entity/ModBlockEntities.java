package net.invxrt.resourcegens.block.entity;

import net.invxrt.resourcegens.ResourceGens;
import net.invxrt.resourcegens.block.ModBlocks;
import net.invxrt.resourcegens.block.entity.custom.Tier1GenBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ResourceGens.MOD_ID);

    public static final RegistryObject<BlockEntityType<Tier1GenBlockEntity>> TIER_1_RESOURCE_GEN_ENTITY =
            BLOCK_ENTITIES.register("tier_1_resource_gen_entity", () ->
                    BlockEntityType.Builder.of(Tier1GenBlockEntity::new,
                            ModBlocks.TIER_1_GENERATOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
