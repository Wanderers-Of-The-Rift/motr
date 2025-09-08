package com.materialsoftherift.motr.blocks.quenched;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SeagrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class QuenchedSeagrassBlock extends SeagrassBlock {

    public QuenchedSeagrassBlock(Properties p_154496_) {
        super(p_154496_);
    }

    @Override
    protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos) {
        return true;
    }

    @Override
    protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        return true;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
        return this.defaultBlockState();
    }

    @Override
    public @NotNull FluidState getFluidState(@NotNull BlockState state) {
        return Fluids.EMPTY.defaultFluidState();
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

}
