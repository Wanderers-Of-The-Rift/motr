package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.init.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Stream;

public class MotrBlockLootTableProvider extends BlockLootSubProvider {
    public MotrBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        MotrNoGrav.REGISTERED_NOGRAV_BLOCKS.values().forEach(noGravInfo -> dropSelf(noGravInfo.block().get()));

        MotrQuenched.REGISTERED_QUENCHED_BLOCKS.values().forEach(blockInfo -> dropSelf(blockInfo.block().get()));

        MotrUnbound.REGISTERED_UNBOUND_BLOCKS.values().forEach(blockInfo -> dropSelf(blockInfo.block().get()));

        MotrSlabs.REGISTERED_STANDARD_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));
        MotrSlabs.REGISTERED_DIRECTIONAL_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));
        MotrSlabs.REGISTERED_TRIMM_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));
        MotrSlabs.REGISTERED_COPPER_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSlabItemTable(slabInfo.slab().get())));

        MotrWalls.REGISTERED_STANDARD_WALLS.values().forEach(wallInfo -> dropSelf(wallInfo.wall().get()));
        MotrButtons.REGISTERED_BUTTONS.values().forEach(buttonInfo -> dropSelf(buttonInfo.button().get()));
        MotrFenceAndGate.REGISTERED_FENCES.values().forEach(fenceInfo -> dropSelf(fenceInfo.fence().get()));
        MotrFenceAndGate.REGISTERED_FENCE_GATES.values()
                .forEach(fenceGateInfo -> dropSelf(fenceGateInfo.fenceGate().get()));
        MotrStairs.REGISTERED_STANDARD_STAIRS.values().forEach(stairInfo -> dropSelf(stairInfo.stair().get()));

        MotrSlabs.REGISTERED_GLASS_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSilkTouchOnlyTable(slabInfo.slab().get()))
                );
        MotrSlabs.REGISTERED_SILKTOUCH_SLABS.values()
                .forEach(slabInfo -> add(slabInfo.slab().get(), createSilkTouchOnlyTable(slabInfo.slab().get()))
                );

        // glass slab drops broken, need to somehow combine createSlabItemTable and createSilkTouchOnlyTable

        MotrWalls.REGISTERED_GLASS_WALLS.values()
                .forEach(wallInfo -> add(wallInfo.wall().get(), createSilkTouchOnlyTable(wallInfo.wall().get()))
                );

        dropSelf(MotrBlocks.HAY_CARPET.get());

        dropSelf(MotrBlocks.MOTR.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        Stream<Block> all = Stream.of(
                MotrBlocks.BLOCKS.getEntries().stream().map(Holder::value),
                MotrNoGrav.BLOCKS.getEntries().stream().map(Holder::value),
                MotrQuenched.BLOCKS.getEntries().stream().map(Holder::value),
                MotrUnbound.BLOCKS.getEntries().stream().map(Holder::value), // Added this line!
                MotrSlabs.REGISTERED_STANDARD_SLABS.values().stream().map(info -> info.slab().get()),
                MotrSlabs.REGISTERED_DIRECTIONAL_SLABS.values().stream().map(info -> info.slab().get()),
                MotrSlabs.REGISTERED_TRIMM_SLABS.values().stream().map(info -> info.slab().get()),
                MotrSlabs.REGISTERED_COPPER_SLABS.values().stream().map(info -> info.slab().get()),
                MotrSlabs.REGISTERED_GLASS_SLABS.values().stream().map(info -> info.slab().get()),
                MotrSlabs.REGISTERED_SILKTOUCH_SLABS.values().stream().map(info -> info.slab().get()),
                MotrWalls.REGISTERED_STANDARD_WALLS.values().stream().map(i -> (Block) i.wall().get()),
                MotrWalls.REGISTERED_GLASS_WALLS.values().stream().map(i -> (Block) i.wall().get()),
                MotrFenceAndGate.REGISTERED_FENCES.values().stream().map(i -> (Block) i.fence().get()),
                MotrFenceAndGate.REGISTERED_FENCE_GATES.values().stream().map(i -> (Block) i.fenceGate().get()),
                MotrStairs.REGISTERED_STANDARD_STAIRS.values().stream().map(i -> (Block) i.stair().get()),
                MotrButtons.REGISTERED_BUTTONS.values().stream().map(info -> (Block) info.button().get())
        ).flatMap(s -> s);

        return all::iterator;
    }

}