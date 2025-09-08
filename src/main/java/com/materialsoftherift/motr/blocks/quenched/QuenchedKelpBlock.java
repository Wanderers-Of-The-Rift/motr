package com.materialsoftherift.motr.blocks.quenched;

import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.KelpBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QuenchedKelpBlock extends KelpBlock {

    public QuenchedKelpBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canGrowInto(@NotNull BlockState state) {
        return true;
    }

    @Override
    protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        return true;
    }

    @Override
    protected @NotNull Block getBodyBlock() {
        return MotrBlocks.QUENCHED_KELP_PLANT.block().get();
    }

    @Override
    public @Nullable BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
        return this.defaultBlockState();
    }

    @Override
    public boolean canBeHydrated(
            @NotNull BlockState state,
            @NotNull BlockGetter getter,
            @NotNull BlockPos pos,
            @NotNull FluidState fluid,
            @NotNull BlockPos fluidPos) {
        return true;
    }

    @Override
    public @NotNull FluidState getFluidState(@NotNull BlockState state) {
        return Fluids.EMPTY.defaultFluidState();
    }

}