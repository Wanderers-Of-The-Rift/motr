package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class MotrFenceAndGate {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static class FenceInfo {
        private final DeferredBlock<FenceBlock> fence;
        private final Block baseBlock;

        public FenceInfo(DeferredBlock<FenceBlock> fence, Block baseBlock) {
            this.fence = fence;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<FenceBlock> fence() {
            return fence;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    public static class FenceGateInfo {
        private final DeferredBlock<FenceGateBlock> fenceGate;
        private final Block baseBlock;

        public FenceGateInfo(DeferredBlock<FenceGateBlock> fenceGate, Block baseBlock) {
            this.fenceGate = fenceGate;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<FenceGateBlock> fenceGate() {
            return fenceGate;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }

    }

    public static final FenceInfo WHITE_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("white_concrete_fence", Blocks.WHITE_CONCRETE), Blocks.WHITE_CONCRETE);
    public static final FenceInfo LIGHT_GRAY_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("light_gray_concrete_fence", Blocks.LIGHT_GRAY_CONCRETE), Blocks.LIGHT_GRAY_CONCRETE);
    public static final FenceInfo GRAY_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("gray_concrete_fence", Blocks.GRAY_CONCRETE), Blocks.GRAY_CONCRETE);
    public static final FenceInfo BLACK_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("black_concrete_fence", Blocks.BLACK_CONCRETE), Blocks.BLACK_CONCRETE);
    public static final FenceInfo BROWN_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("brown_concrete_fence", Blocks.BROWN_CONCRETE), Blocks.BROWN_CONCRETE);
    public static final FenceInfo RED_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("red_concrete_fence", Blocks.RED_CONCRETE), Blocks.RED_CONCRETE);
    public static final FenceInfo ORANGE_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("orange_concrete_fence", Blocks.ORANGE_CONCRETE), Blocks.ORANGE_CONCRETE);
    public static final FenceInfo YELLOW_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("yellow_concrete_fence", Blocks.YELLOW_CONCRETE), Blocks.YELLOW_CONCRETE);
    public static final FenceInfo LIME_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("lime_concrete_fence", Blocks.LIME_CONCRETE), Blocks.LIME_CONCRETE);
    public static final FenceInfo GREEN_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("green_concrete_fence", Blocks.GREEN_CONCRETE), Blocks.GREEN_CONCRETE);
    public static final FenceInfo CYAN_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("cyan_concrete_fence", Blocks.CYAN_CONCRETE), Blocks.CYAN_CONCRETE);
    public static final FenceInfo LIGHT_BLUE_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("light_blue_concrete_fence", Blocks.LIGHT_BLUE_CONCRETE), Blocks.LIGHT_BLUE_CONCRETE);
    public static final FenceInfo BLUE_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("blue_concrete_fence", Blocks.BLUE_CONCRETE), Blocks.BLUE_CONCRETE);
    public static final FenceInfo PURPLE_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("purple_concrete_fence", Blocks.PURPLE_CONCRETE), Blocks.PURPLE_CONCRETE);
    public static final FenceInfo MAGENTA_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("magenta_concrete_fence", Blocks.MAGENTA_CONCRETE), Blocks.MAGENTA_CONCRETE);
    public static final FenceInfo PINK_CONCRETE_FENCE = new FenceInfo(
            registerFenceBlock("pink_concrete_fence", Blocks.PINK_CONCRETE), Blocks.PINK_CONCRETE);

    public static final FenceInfo TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("terracotta_fence", Blocks.TERRACOTTA), Blocks.TERRACOTTA);
    public static final FenceInfo WHITE_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("white_terracotta_fence", Blocks.WHITE_TERRACOTTA), Blocks.WHITE_TERRACOTTA);
    public static final FenceInfo LIGHT_GRAY_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("light_gray_terracotta_fence", Blocks.LIGHT_GRAY_TERRACOTTA),
            Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final FenceInfo GRAY_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("gray_terracotta_fence", Blocks.GRAY_TERRACOTTA), Blocks.GRAY_TERRACOTTA);
    public static final FenceInfo BLACK_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("black_terracotta_fence", Blocks.BLACK_TERRACOTTA), Blocks.BLACK_TERRACOTTA);
    public static final FenceInfo BROWN_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("brown_terracotta_fence", Blocks.BROWN_TERRACOTTA), Blocks.BROWN_TERRACOTTA);
    public static final FenceInfo RED_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("red_terracotta_fence", Blocks.RED_TERRACOTTA), Blocks.RED_TERRACOTTA);
    public static final FenceInfo ORANGE_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("orange_terracotta_fence", Blocks.ORANGE_TERRACOTTA), Blocks.ORANGE_TERRACOTTA);
    public static final FenceInfo YELLOW_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("yellow_terracotta_fence", Blocks.YELLOW_TERRACOTTA), Blocks.YELLOW_TERRACOTTA);
    public static final FenceInfo LIME_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("lime_terracotta_fence", Blocks.LIME_TERRACOTTA), Blocks.LIME_TERRACOTTA);
    public static final FenceInfo GREEN_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("green_terracotta_fence", Blocks.GREEN_TERRACOTTA), Blocks.GREEN_TERRACOTTA);
    public static final FenceInfo CYAN_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("cyan_terracotta_fence", Blocks.CYAN_TERRACOTTA), Blocks.CYAN_TERRACOTTA);
    public static final FenceInfo LIGHT_BLUE_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("light_blue_terracotta_fence", Blocks.LIGHT_BLUE_TERRACOTTA),
            Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final FenceInfo BLUE_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("blue_terracotta_fence", Blocks.BLUE_TERRACOTTA), Blocks.BLUE_TERRACOTTA);
    public static final FenceInfo PURPLE_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("purple_terracotta_fence", Blocks.PURPLE_TERRACOTTA), Blocks.PURPLE_TERRACOTTA);
    public static final FenceInfo MAGENTA_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("magenta_terracotta_fence", Blocks.MAGENTA_TERRACOTTA), Blocks.MAGENTA_TERRACOTTA);
    public static final FenceInfo PINK_TERRACOTTA_FENCE = new FenceInfo(
            registerFenceBlock("pink_terracotta_fence", Blocks.PINK_TERRACOTTA), Blocks.PINK_TERRACOTTA);

    public static final FenceInfo SANDSTONE_FENCE = new FenceInfo(
            registerFenceBlock("sandstone_fence", Blocks.SANDSTONE), Blocks.SANDSTONE);
    public static final FenceInfo RED_SANDSTONE_FENCE = new FenceInfo(
            registerFenceBlock("red_sandstone_fence", Blocks.RED_SANDSTONE), Blocks.RED_SANDSTONE);
    public static final FenceInfo MUD_FENCE = new FenceInfo(
            registerFenceBlock("mud_fence", Blocks.MUD), Blocks.MUD);

    public static final Map<String, FenceInfo> REGISTERED_FENCES = Map.ofEntries(
            Map.entry("black_concrete", BLACK_CONCRETE_FENCE), Map.entry("blue_concrete", BLUE_CONCRETE_FENCE),
            Map.entry("brown_concrete", BROWN_CONCRETE_FENCE), Map.entry("cyan_concrete", CYAN_CONCRETE_FENCE),
            Map.entry("gray_concrete", GRAY_CONCRETE_FENCE), Map.entry("green_concrete", GREEN_CONCRETE_FENCE),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_FENCE),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_FENCE),
            Map.entry("lime_concrete", LIME_CONCRETE_FENCE), Map.entry("magenta_concrete", MAGENTA_CONCRETE_FENCE),
            Map.entry("orange_concrete", ORANGE_CONCRETE_FENCE), Map.entry("pink_concrete", PINK_CONCRETE_FENCE),
            Map.entry("purple_concrete", PURPLE_CONCRETE_FENCE), Map.entry("red_concrete", RED_CONCRETE_FENCE),
            Map.entry("white_concrete", WHITE_CONCRETE_FENCE), Map.entry("yellow_concrete", YELLOW_CONCRETE_FENCE),

            Map.entry("black_terracotta", BLACK_TERRACOTTA_FENCE), Map.entry("blue_terracotta", BLUE_TERRACOTTA_FENCE),
            Map.entry("brown_terracotta", BROWN_TERRACOTTA_FENCE), Map.entry("cyan_terracotta", CYAN_TERRACOTTA_FENCE),
            Map.entry("gray_terracotta", GRAY_TERRACOTTA_FENCE), Map.entry("green_terracotta", GREEN_TERRACOTTA_FENCE),
            Map.entry("light_blue_terracotta", LIGHT_BLUE_TERRACOTTA_FENCE),
            Map.entry("light_gray_terracotta", LIGHT_GRAY_TERRACOTTA_FENCE),
            Map.entry("lime_terracotta", LIME_TERRACOTTA_FENCE),
            Map.entry("magenta_terracotta", MAGENTA_TERRACOTTA_FENCE),
            Map.entry("orange_terracotta", ORANGE_TERRACOTTA_FENCE),
            Map.entry("pink_terracotta", PINK_TERRACOTTA_FENCE),
            Map.entry("purple_terracotta", PURPLE_TERRACOTTA_FENCE), Map.entry("red_terracotta", RED_TERRACOTTA_FENCE),
            Map.entry("white_terracotta", WHITE_TERRACOTTA_FENCE),
            Map.entry("yellow_terracotta", YELLOW_TERRACOTTA_FENCE), Map.entry("terracotta", TERRACOTTA_FENCE),

            Map.entry("sandstone", SANDSTONE_FENCE), Map.entry("red_sandstone", RED_SANDSTONE_FENCE),
            Map.entry("mud", MUD_FENCE)
    );

    public static final FenceGateInfo WHITE_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("white_concrete_fence_gate", Blocks.WHITE_CONCRETE), Blocks.WHITE_CONCRETE);
    public static final FenceGateInfo LIGHT_GRAY_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("light_gray_concrete_fence_gate", Blocks.LIGHT_GRAY_CONCRETE),
            Blocks.LIGHT_GRAY_CONCRETE);
    public static final FenceGateInfo GRAY_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("gray_concrete_fence_gate", Blocks.GRAY_CONCRETE), Blocks.GRAY_CONCRETE);
    public static final FenceGateInfo BLACK_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("black_concrete_fence_gate", Blocks.BLACK_CONCRETE), Blocks.BLACK_CONCRETE);
    public static final FenceGateInfo BROWN_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("brown_concrete_fence_gate", Blocks.BROWN_CONCRETE), Blocks.BROWN_CONCRETE);
    public static final FenceGateInfo RED_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("red_concrete_fence_gate", Blocks.RED_CONCRETE), Blocks.RED_CONCRETE);
    public static final FenceGateInfo ORANGE_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("orange_concrete_fence_gate", Blocks.ORANGE_CONCRETE), Blocks.ORANGE_CONCRETE);
    public static final FenceGateInfo YELLOW_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("yellow_concrete_fence_gate", Blocks.YELLOW_CONCRETE), Blocks.YELLOW_CONCRETE);
    public static final FenceGateInfo LIME_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("lime_concrete_fence_gate", Blocks.LIME_CONCRETE), Blocks.LIME_CONCRETE);
    public static final FenceGateInfo GREEN_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("green_concrete_fence_gate", Blocks.GREEN_CONCRETE), Blocks.GREEN_CONCRETE);
    public static final FenceGateInfo CYAN_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("cyan_concrete_fence_gate", Blocks.CYAN_CONCRETE), Blocks.CYAN_CONCRETE);
    public static final FenceGateInfo LIGHT_BLUE_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("light_blue_concrete_fence_gate", Blocks.LIGHT_BLUE_CONCRETE),
            Blocks.LIGHT_BLUE_CONCRETE);
    public static final FenceGateInfo BLUE_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("blue_concrete_fence_gate", Blocks.BLUE_CONCRETE), Blocks.BLUE_CONCRETE);
    public static final FenceGateInfo PURPLE_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("purple_concrete_fence_gate", Blocks.PURPLE_CONCRETE), Blocks.PURPLE_CONCRETE);
    public static final FenceGateInfo MAGENTA_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("magenta_concrete_fence_gate", Blocks.MAGENTA_CONCRETE), Blocks.MAGENTA_CONCRETE);
    public static final FenceGateInfo PINK_CONCRETE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("pink_concrete_fence_gate", Blocks.PINK_CONCRETE), Blocks.PINK_CONCRETE);

    public static final FenceGateInfo TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("terracotta_fence_gate", Blocks.TERRACOTTA), Blocks.TERRACOTTA);
    public static final FenceGateInfo WHITE_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("white_terracotta_fence_gate", Blocks.WHITE_TERRACOTTA), Blocks.WHITE_TERRACOTTA);
    public static final FenceGateInfo LIGHT_GRAY_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("light_gray_terracotta_fence_gate", Blocks.LIGHT_GRAY_TERRACOTTA),
            Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final FenceGateInfo GRAY_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("gray_terracotta_fence_gate", Blocks.GRAY_TERRACOTTA), Blocks.GRAY_TERRACOTTA);
    public static final FenceGateInfo BLACK_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("black_terracotta_fence_gate", Blocks.BLACK_TERRACOTTA), Blocks.BLACK_TERRACOTTA);
    public static final FenceGateInfo BROWN_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("brown_terracotta_fence_gate", Blocks.BROWN_TERRACOTTA), Blocks.BROWN_TERRACOTTA);
    public static final FenceGateInfo RED_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("red_terracotta_fence_gate", Blocks.RED_TERRACOTTA), Blocks.RED_TERRACOTTA);
    public static final FenceGateInfo ORANGE_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("orange_terracotta_fence_gate", Blocks.ORANGE_TERRACOTTA), Blocks.ORANGE_TERRACOTTA);
    public static final FenceGateInfo YELLOW_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("yellow_terracotta_fence_gate", Blocks.YELLOW_TERRACOTTA), Blocks.YELLOW_TERRACOTTA);
    public static final FenceGateInfo LIME_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("lime_terracotta_fence_gate", Blocks.LIME_TERRACOTTA), Blocks.LIME_TERRACOTTA);
    public static final FenceGateInfo GREEN_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("green_terracotta_fence_gate", Blocks.GREEN_TERRACOTTA), Blocks.GREEN_TERRACOTTA);
    public static final FenceGateInfo CYAN_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("cyan_terracotta_fence_gate", Blocks.CYAN_TERRACOTTA), Blocks.CYAN_TERRACOTTA);
    public static final FenceGateInfo LIGHT_BLUE_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("light_blue_terracotta_fence_gate", Blocks.LIGHT_BLUE_TERRACOTTA),
            Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final FenceGateInfo BLUE_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("blue_terracotta_fence_gate", Blocks.BLUE_TERRACOTTA), Blocks.BLUE_TERRACOTTA);
    public static final FenceGateInfo PURPLE_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("purple_terracotta_fence_gate", Blocks.PURPLE_TERRACOTTA), Blocks.PURPLE_TERRACOTTA);
    public static final FenceGateInfo MAGENTA_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("magenta_terracotta_fence_gate", Blocks.MAGENTA_TERRACOTTA),
            Blocks.MAGENTA_TERRACOTTA);
    public static final FenceGateInfo PINK_TERRACOTTA_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("pink_terracotta_fence_gate", Blocks.PINK_TERRACOTTA), Blocks.PINK_TERRACOTTA);

    public static final FenceGateInfo SANDSTONE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("sandstone_fence_gate", Blocks.SANDSTONE), Blocks.SANDSTONE);
    public static final FenceGateInfo RED_SANDSTONE_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("red_sandstone_fence_gate", Blocks.RED_SANDSTONE), Blocks.RED_SANDSTONE);
    public static final FenceGateInfo MUD_FENCE_GATE = new FenceGateInfo(
            registerFenceGateBlock("mud_fence_gate", Blocks.MUD), Blocks.MUD);

    public static final Map<String, FenceGateInfo> REGISTERED_FENCE_GATES = Map.ofEntries(
            Map.entry("white_concrete", WHITE_CONCRETE_FENCE_GATE),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_FENCE_GATE),
            Map.entry("gray_concrete", GRAY_CONCRETE_FENCE_GATE),
            Map.entry("black_concrete", BLACK_CONCRETE_FENCE_GATE),
            Map.entry("brown_concrete", BROWN_CONCRETE_FENCE_GATE), Map.entry("red_concrete", RED_CONCRETE_FENCE_GATE),
            Map.entry("orange_concrete", ORANGE_CONCRETE_FENCE_GATE),
            Map.entry("yellow_concrete", YELLOW_CONCRETE_FENCE_GATE),
            Map.entry("lime_concrete", LIME_CONCRETE_FENCE_GATE),
            Map.entry("green_concrete", GREEN_CONCRETE_FENCE_GATE),
            Map.entry("cyan_concrete", CYAN_CONCRETE_FENCE_GATE),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_FENCE_GATE),
            Map.entry("blue_concrete", BLUE_CONCRETE_FENCE_GATE),
            Map.entry("purple_concrete", PURPLE_CONCRETE_FENCE_GATE),
            Map.entry("magenta_concrete", MAGENTA_CONCRETE_FENCE_GATE),
            Map.entry("pink_concrete", PINK_CONCRETE_FENCE_GATE),

            Map.entry("white_terracotta", WHITE_TERRACOTTA_FENCE_GATE),
            Map.entry("light_gray_terracotta", LIGHT_GRAY_TERRACOTTA_FENCE_GATE),
            Map.entry("gray_terracotta", GRAY_TERRACOTTA_FENCE_GATE),
            Map.entry("black_terracotta", BLACK_TERRACOTTA_FENCE_GATE),
            Map.entry("brown_terracotta", BROWN_TERRACOTTA_FENCE_GATE),
            Map.entry("red_terracotta", RED_TERRACOTTA_FENCE_GATE),
            Map.entry("orange_terracotta", ORANGE_TERRACOTTA_FENCE_GATE),
            Map.entry("yellow_terracotta", YELLOW_TERRACOTTA_FENCE_GATE),
            Map.entry("lime_terracotta", LIME_TERRACOTTA_FENCE_GATE),
            Map.entry("green_terracotta", GREEN_TERRACOTTA_FENCE_GATE),
            Map.entry("cyan_terracotta", CYAN_TERRACOTTA_FENCE_GATE),
            Map.entry("light_blue_terracotta", LIGHT_BLUE_TERRACOTTA_FENCE_GATE),
            Map.entry("blue_terracotta", BLUE_TERRACOTTA_FENCE_GATE),
            Map.entry("purple_terracotta", PURPLE_TERRACOTTA_FENCE_GATE),
            Map.entry("magenta_terracotta", MAGENTA_TERRACOTTA_FENCE_GATE),
            Map.entry("pink_terracotta", PINK_TERRACOTTA_FENCE_GATE), Map.entry("terracotta", TERRACOTTA_FENCE_GATE),

            Map.entry("sandstone", SANDSTONE_FENCE_GATE), Map.entry("red_sandstone", RED_SANDSTONE_FENCE_GATE),
            Map.entry("mud", MUD_FENCE_GATE)
    );

    private static DeferredBlock<FenceBlock> registerFenceBlock(String id, Block baseBlock) {
        return registerBlock(id, () -> new FenceBlock(
                BlockBehaviour.Properties.ofFullCopy(baseBlock).strength(2.0F, 3.0F).setId(blockId(id))));
    }

    private static DeferredBlock<FenceGateBlock> registerFenceGateBlock(String id, Block baseBlock) {
        return registerBlock(id, () -> new FenceGateBlock(
                WoodType.OAK, // This seems silly but is needed.
                BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id))
        ));
    }

    public static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleBlockItem(key, register);
        return register;
    }

    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }

}
