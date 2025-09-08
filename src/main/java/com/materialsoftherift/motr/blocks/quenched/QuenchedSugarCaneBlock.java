package com.materialsoftherift.motr.blocks.quenched;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SugarCaneBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class QuenchedSugarCaneBlock extends SugarCaneBlock {

    public QuenchedSugarCaneBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        return true;
    }

}