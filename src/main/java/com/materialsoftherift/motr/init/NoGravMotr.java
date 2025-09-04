package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;

import static com.materialsoftherift.motr.init.MotrBlocks.blockId;

public class NoGravMotr {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static class NoGravInfo {
        private final DeferredBlock<Block> block;
        private final Block baseBlock;

        public NoGravInfo(DeferredBlock<Block> block, Block baseBlock) {
            this.block = block;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<Block> block() {
            return block;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    public static final NoGravInfo NOGRAV_GRAVEL = registerNoGravBlock("nograv_gravel", Blocks.GRAVEL);
    public static final NoGravInfo NOGRAV_SAND = registerNoGravBlock("nograv_sand", Blocks.SAND);
    public static final NoGravInfo NOGRAV_RED_SAND = registerNoGravBlock("nograv_red_sand", Blocks.RED_SAND);

    public static final NoGravInfo NOGRAV_WHITE_CONCRETE_POWDER = registerNoGravBlock("nograv_white_concrete_powder",
            Blocks.WHITE_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_LIGHT_GRAY_CONCRETE_POWDER = registerNoGravBlock(
            "nograv_light_gray_concrete_powder", Blocks.LIGHT_GRAY_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_GRAY_CONCRETE_POWDER = registerNoGravBlock("nograv_gray_concrete_powder",
            Blocks.GRAY_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_BLACK_CONCRETE_POWDER = registerNoGravBlock("nograv_black_concrete_powder",
            Blocks.BLACK_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_BROWN_CONCRETE_POWDER = registerNoGravBlock("nograv_brown_concrete_powder",
            Blocks.BROWN_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_RED_CONCRETE_POWDER = registerNoGravBlock("nograv_red_concrete_powder",
            Blocks.RED_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_ORANGE_CONCRETE_POWDER = registerNoGravBlock("nograv_orange_concrete_powder",
            Blocks.ORANGE_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_YELLOW_CONCRETE_POWDER = registerNoGravBlock("nograv_yellow_concrete_powder",
            Blocks.YELLOW_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_LIME_CONCRETE_POWDER = registerNoGravBlock("nograv_lime_concrete_powder",
            Blocks.LIME_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_GREEN_CONCRETE_POWDER = registerNoGravBlock("nograv_green_concrete_powder",
            Blocks.GREEN_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_CYAN_CONCRETE_POWDER = registerNoGravBlock("nograv_cyan_concrete_powder",
            Blocks.CYAN_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_LIGHT_BLUE_CONCRETE_POWDER = registerNoGravBlock(
            "nograv_light_blue_concrete_powder", Blocks.LIGHT_BLUE_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_BLUE_CONCRETE_POWDER = registerNoGravBlock("nograv_blue_concrete_powder",
            Blocks.BLUE_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_PURPLE_CONCRETE_POWDER = registerNoGravBlock("nograv_purple_concrete_powder",
            Blocks.PURPLE_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_MAGENTA_CONCRETE_POWDER = registerNoGravBlock(
            "nograv_magenta_concrete_powder", Blocks.MAGENTA_CONCRETE_POWDER);
    public static final NoGravInfo NOGRAV_PINK_CONCRETE_POWDER = registerNoGravBlock("nograv_pink_concrete_powder",
            Blocks.PINK_CONCRETE_POWDER);

    public static final Map<String, NoGravInfo> REGISTERED_NOGRAV_BLOCKS = Map.ofEntries(
            Map.entry("gravel", NOGRAV_GRAVEL), Map.entry("sand", NOGRAV_SAND), Map.entry("red_sand", NOGRAV_RED_SAND),

            Map.entry("white_concrete_powder", NOGRAV_WHITE_CONCRETE_POWDER),
            Map.entry("light_gray_concrete_powder", NOGRAV_LIGHT_GRAY_CONCRETE_POWDER),
            Map.entry("gray_concrete_powder", NOGRAV_GRAY_CONCRETE_POWDER),
            Map.entry("black_concrete_powder", NOGRAV_BLACK_CONCRETE_POWDER),
            Map.entry("brown_concrete_powder", NOGRAV_BROWN_CONCRETE_POWDER),
            Map.entry("red_concrete_powder", NOGRAV_RED_CONCRETE_POWDER),
            Map.entry("orange_concrete_powder", NOGRAV_ORANGE_CONCRETE_POWDER),
            Map.entry("yellow_concrete_powder", NOGRAV_YELLOW_CONCRETE_POWDER),
            Map.entry("lime_concrete_powder", NOGRAV_LIME_CONCRETE_POWDER),
            Map.entry("green_concrete_powder", NOGRAV_GREEN_CONCRETE_POWDER),
            Map.entry("cyan_concrete_powder", NOGRAV_CYAN_CONCRETE_POWDER),
            Map.entry("light_blue_concrete_powder", NOGRAV_LIGHT_BLUE_CONCRETE_POWDER),
            Map.entry("blue_concrete_powder", NOGRAV_BLUE_CONCRETE_POWDER),
            Map.entry("purple_concrete_powder", NOGRAV_PURPLE_CONCRETE_POWDER),
            Map.entry("magenta_concrete_powder", NOGRAV_MAGENTA_CONCRETE_POWDER),
            Map.entry("pink_concrete_powder", NOGRAV_PINK_CONCRETE_POWDER)
    );

    private static NoGravInfo registerNoGravBlock(String id, Block baseBlock) {
        DeferredBlock<Block> reg = BLOCKS.register(id,
                () -> new Block(BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id)))
        );

        MotrItems.registerSimpleBlockItem(id, reg);

        return new NoGravInfo(reg, baseBlock);
    }

}
