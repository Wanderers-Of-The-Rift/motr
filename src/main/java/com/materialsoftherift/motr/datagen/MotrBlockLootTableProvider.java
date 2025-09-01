package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class MotrBlockLootTableProvider extends BlockLootSubProvider {
    public MotrBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        MotrBlocks.REGISTERED_NOGRAV_BLOCKS.values().forEach(noGravInfo -> dropSelf(noGravInfo.block().get()));

        MotrBlocks.REGISTERED_STANDARD_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));
        MotrBlocks.REGISTERED_DIRECTIONAL_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));
        MotrBlocks.REGISTERED_TRIMM_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));
        MotrBlocks.REGISTERED_COPPER_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));

        MotrBlocks.REGISTERED_STANDARD_WALLS.values().forEach(wallInfo -> dropSelf(wallInfo.wall().get()));
        MotrBlocks.REGISTERED_BUTTONS.values().forEach(buttonInfo -> dropSelf(buttonInfo.button().get()));
        MotrBlocks.REGISTERED_FENCES.values().forEach(fenceInfo -> dropSelf(fenceInfo.fence().get()));
        MotrBlocks.REGISTERED_FENCE_GATES.values().forEach(fenceGateInfo -> dropSelf(fenceGateInfo.fenceGate().get()));
        MotrBlocks.REGISTERED_STANDARD_STAIRS.values().forEach(stairInfo -> dropSelf(stairInfo.stair().get()));

        MotrBlocks.REGISTERED_GLASS_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSilkTouchOnlyTable(slabInfo.slab().get()))
                );
        MotrBlocks.REGISTERED_SILKTOUCH_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSilkTouchOnlyTable(slabInfo.slab().get()))
                );

        // glass slab drops broken, need to somehow combine createSlabItemTable and createSilkTouchOnlyTable

        MotrBlocks.REGISTERED_GLASS_WALLS.values()
                .forEach(wallInfo -> add(wallInfo.wall().get(), createSilkTouchOnlyTable(wallInfo.wall().get()))
                );

        dropSelf(MotrBlocks.HAY_CARPET.get());

        dropSelf(MotrBlocks.MOTR.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return MotrBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

}