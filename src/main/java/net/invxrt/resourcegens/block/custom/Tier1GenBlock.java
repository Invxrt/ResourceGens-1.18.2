package net.invxrt.resourcegens.block.custom;

import net.invxrt.resourcegens.block.entity.custom.Tier1GenBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class Tier1GenBlock extends BaseEntityBlock {
    public Tier1GenBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new Tier1GenBlockEntity(pos, state);
    }
}