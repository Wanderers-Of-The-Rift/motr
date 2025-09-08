package com.materialsoftherift.motr.blocks.quenched;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SeaPickleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

public class QuenchedSeaPickleBlock extends SeaPickleBlock {

    public QuenchedSeaPickleBlock(Properties properties) {
        super(properties);
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
    public boolean canBeHydrated(
            @NotNull BlockState state,
            @NotNull BlockGetter getter,
            @NotNull BlockPos pos,
            @NotNull FluidState fluid,
            @NotNull BlockPos fluidPos) {
        return true;
    }

}