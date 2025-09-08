package com.materialsoftherift.motr.blocks.quenched;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class QuenchedFarmlandBlock extends FarmBlock {

    public QuenchedFarmlandBlock(Properties properties) {
        super(properties);
        this.defaultBlockState().setValue(MOISTURE, 7);
    }

    @Override
    protected void randomTick(
            @NotNull BlockState state,
            @NotNull ServerLevel level,
            @NotNull BlockPos pos,
            @NotNull RandomSource source) {
    }

    @Override
    protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        return true;
    }

}