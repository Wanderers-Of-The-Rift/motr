package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class MotrBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static class ButtonInfo {
        private final DeferredBlock<ButtonBlock> button;
        private final Block baseBlock;

        public ButtonInfo(DeferredBlock<ButtonBlock> button, Block baseBlock) {
            this.button = button;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<ButtonBlock> button() {
            return button;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    public static class StairInfo {
        private final DeferredBlock<StairBlock> stair;
        private final Block baseBlock;

        public StairInfo(DeferredBlock<StairBlock> stair, Block baseBlock) {
            this.stair = stair;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<StairBlock> stair() {
            return stair;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    public static final DeferredBlock<Block> MOTR = registerDevBlock("motr",
            () -> new Block(BlockBehaviour.Properties.of().setId(blockId("motr"))));

    public static final ButtonInfo WHITE_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("white_concrete_button", Blocks.WHITE_CONCRETE), Blocks.WHITE_CONCRETE);
    public static final ButtonInfo LIGHT_GRAY_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("light_gray_concrete_button", Blocks.LIGHT_GRAY_CONCRETE), Blocks.LIGHT_GRAY_CONCRETE);
    public static final ButtonInfo GRAY_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("gray_concrete_button", Blocks.GRAY_CONCRETE), Blocks.GRAY_CONCRETE);
    public static final ButtonInfo BLACK_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("black_concrete_button", Blocks.BLACK_CONCRETE), Blocks.BLACK_CONCRETE);
    public static final ButtonInfo BROWN_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("brown_concrete_button", Blocks.BROWN_CONCRETE), Blocks.BROWN_CONCRETE);
    public static final ButtonInfo RED_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("red_concrete_button", Blocks.RED_CONCRETE), Blocks.RED_CONCRETE);
    public static final ButtonInfo ORANGE_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("orange_concrete_button", Blocks.ORANGE_CONCRETE), Blocks.ORANGE_CONCRETE);
    public static final ButtonInfo YELLOW_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("yellow_concrete_button", Blocks.YELLOW_CONCRETE), Blocks.YELLOW_CONCRETE);
    public static final ButtonInfo LIME_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("lime_concrete_button", Blocks.LIME_CONCRETE), Blocks.LIME_CONCRETE);
    public static final ButtonInfo GREEN_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("green_concrete_button", Blocks.GREEN_CONCRETE), Blocks.GREEN_CONCRETE);
    public static final ButtonInfo CYAN_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("cyan_concrete_button", Blocks.CYAN_CONCRETE), Blocks.CYAN_CONCRETE);
    public static final ButtonInfo LIGHT_BLUE_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("light_blue_concrete_button", Blocks.LIGHT_BLUE_CONCRETE), Blocks.LIGHT_BLUE_CONCRETE);
    public static final ButtonInfo BLUE_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("blue_concrete_button", Blocks.BLUE_CONCRETE), Blocks.BLUE_CONCRETE);
    public static final ButtonInfo PURPLE_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("purple_concrete_button", Blocks.PURPLE_CONCRETE), Blocks.PURPLE_CONCRETE);
    public static final ButtonInfo MAGENTA_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("magenta_concrete_button", Blocks.MAGENTA_CONCRETE), Blocks.MAGENTA_CONCRETE);
    public static final ButtonInfo PINK_CONCRETE_BUTTON = new ButtonInfo(
            registerButtonBlock("pink_concrete_button", Blocks.PINK_CONCRETE), Blocks.PINK_CONCRETE);

    public static final ButtonInfo TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("terracotta_button", Blocks.TERRACOTTA), Blocks.TERRACOTTA);
    public static final ButtonInfo WHITE_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("white_terracotta_button", Blocks.WHITE_TERRACOTTA), Blocks.WHITE_TERRACOTTA);
    public static final ButtonInfo LIGHT_GRAY_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("light_gray_terracotta_button", Blocks.LIGHT_GRAY_TERRACOTTA),
            Blocks.LIGHT_GRAY_TERRACOTTA);
    public static final ButtonInfo GRAY_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("gray_terracotta_button", Blocks.GRAY_TERRACOTTA), Blocks.GRAY_TERRACOTTA);
    public static final ButtonInfo BLACK_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("black_terracotta_button", Blocks.BLACK_TERRACOTTA), Blocks.BLACK_TERRACOTTA);
    public static final ButtonInfo BROWN_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("brown_terracotta_button", Blocks.BROWN_TERRACOTTA), Blocks.BROWN_TERRACOTTA);
    public static final ButtonInfo RED_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("red_terracotta_button", Blocks.RED_TERRACOTTA), Blocks.RED_TERRACOTTA);
    public static final ButtonInfo ORANGE_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("orange_terracotta_button", Blocks.ORANGE_TERRACOTTA), Blocks.ORANGE_TERRACOTTA);
    public static final ButtonInfo YELLOW_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("yellow_terracotta_button", Blocks.YELLOW_TERRACOTTA), Blocks.YELLOW_TERRACOTTA);
    public static final ButtonInfo LIME_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("lime_terracotta_button", Blocks.LIME_TERRACOTTA), Blocks.LIME_TERRACOTTA);
    public static final ButtonInfo GREEN_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("green_terracotta_button", Blocks.GREEN_TERRACOTTA), Blocks.GREEN_TERRACOTTA);
    public static final ButtonInfo CYAN_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("cyan_terracotta_button", Blocks.CYAN_TERRACOTTA), Blocks.CYAN_TERRACOTTA);
    public static final ButtonInfo LIGHT_BLUE_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("light_blue_terracotta_button", Blocks.LIGHT_BLUE_TERRACOTTA),
            Blocks.LIGHT_BLUE_TERRACOTTA);
    public static final ButtonInfo BLUE_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("blue_terracotta_button", Blocks.BLUE_TERRACOTTA), Blocks.BLUE_TERRACOTTA);
    public static final ButtonInfo PURPLE_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("purple_terracotta_button", Blocks.PURPLE_TERRACOTTA), Blocks.PURPLE_TERRACOTTA);
    public static final ButtonInfo MAGENTA_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("magenta_terracotta_button", Blocks.MAGENTA_TERRACOTTA), Blocks.MAGENTA_TERRACOTTA);
    public static final ButtonInfo PINK_TERRACOTTA_BUTTON = new ButtonInfo(
            registerButtonBlock("pink_terracotta_button", Blocks.PINK_TERRACOTTA), Blocks.PINK_TERRACOTTA);

    public static final ButtonInfo SANDSTONE_BUTTON = new ButtonInfo(
            registerButtonBlock("sandstone_button", Blocks.SANDSTONE), Blocks.SANDSTONE);
    public static final ButtonInfo RED_SANDSTONE_BUTTON = new ButtonInfo(
            registerButtonBlock("red_sandstone_button", Blocks.RED_SANDSTONE), Blocks.RED_SANDSTONE);
    public static final ButtonInfo MUD_BUTTON = new ButtonInfo(
            registerButtonBlock("mud_button", Blocks.MUD), Blocks.MUD);

    public static final Map<String, ButtonInfo> REGISTERED_BUTTONS = Map.ofEntries(
            Map.entry("black_concrete", BLACK_CONCRETE_BUTTON), Map.entry("blue_concrete", BLUE_CONCRETE_BUTTON),
            Map.entry("brown_concrete", BROWN_CONCRETE_BUTTON), Map.entry("cyan_concrete", CYAN_CONCRETE_BUTTON),
            Map.entry("gray_concrete", GRAY_CONCRETE_BUTTON), Map.entry("green_concrete", GREEN_CONCRETE_BUTTON),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_BUTTON),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_BUTTON),
            Map.entry("lime_concrete", LIME_CONCRETE_BUTTON), Map.entry("magenta_concrete", MAGENTA_CONCRETE_BUTTON),
            Map.entry("orange_concrete", ORANGE_CONCRETE_BUTTON), Map.entry("pink_concrete", PINK_CONCRETE_BUTTON),
            Map.entry("purple_concrete", PURPLE_CONCRETE_BUTTON), Map.entry("red_concrete", RED_CONCRETE_BUTTON),
            Map.entry("white_concrete", WHITE_CONCRETE_BUTTON), Map.entry("yellow_concrete", YELLOW_CONCRETE_BUTTON),

            Map.entry("black_terracotta", BLACK_TERRACOTTA_BUTTON),
            Map.entry("blue_terracotta", BLUE_TERRACOTTA_BUTTON),
            Map.entry("brown_terracotta", BROWN_TERRACOTTA_BUTTON),
            Map.entry("cyan_terracotta", CYAN_TERRACOTTA_BUTTON), Map.entry("gray_terracotta", GRAY_TERRACOTTA_BUTTON),
            Map.entry("green_terracotta", GREEN_TERRACOTTA_BUTTON),
            Map.entry("light_blue_terracotta", LIGHT_BLUE_TERRACOTTA_BUTTON),
            Map.entry("light_gray_terracotta", LIGHT_GRAY_TERRACOTTA_BUTTON),
            Map.entry("lime_terracotta", LIME_TERRACOTTA_BUTTON),
            Map.entry("magenta_terracotta", MAGENTA_TERRACOTTA_BUTTON),
            Map.entry("orange_terracotta", ORANGE_TERRACOTTA_BUTTON),
            Map.entry("pink_terracotta", PINK_TERRACOTTA_BUTTON),
            Map.entry("purple_terracotta", PURPLE_TERRACOTTA_BUTTON),
            Map.entry("red_terracotta", RED_TERRACOTTA_BUTTON), Map.entry("white_terracotta", WHITE_TERRACOTTA_BUTTON),
            Map.entry("yellow_terracotta", YELLOW_TERRACOTTA_BUTTON), Map.entry("terracotta", TERRACOTTA_BUTTON),

            Map.entry("sandstone", SANDSTONE_BUTTON), Map.entry("red_sandstone", RED_SANDSTONE_BUTTON),
            Map.entry("mud", MUD_BUTTON)
    );

    public static final StairInfo WHITE_CONCRETE_STAIRS = registerStairBlock("white_concrete_stairs",
            Blocks.WHITE_CONCRETE);
    public static final StairInfo LIGHT_GRAY_CONCRETE_STAIRS = registerStairBlock("light_gray_concrete_stairs",
            Blocks.LIGHT_GRAY_CONCRETE);
    public static final StairInfo GRAY_CONCRETE_STAIRS = registerStairBlock("gray_concrete_stairs",
            Blocks.GRAY_CONCRETE);
    public static final StairInfo BLACK_CONCRETE_STAIRS = registerStairBlock("black_concrete_stairs",
            Blocks.BLACK_CONCRETE);
    public static final StairInfo BROWN_CONCRETE_STAIRS = registerStairBlock("brown_concrete_stairs",
            Blocks.BROWN_CONCRETE);
    public static final StairInfo RED_CONCRETE_STAIRS = registerStairBlock("red_concrete_stairs", Blocks.RED_CONCRETE);
    public static final StairInfo ORANGE_CONCRETE_STAIRS = registerStairBlock("orange_concrete_stairs",
            Blocks.ORANGE_CONCRETE);
    public static final StairInfo YELLOW_CONCRETE_STAIRS = registerStairBlock("yellow_concrete_stairs",
            Blocks.YELLOW_CONCRETE);
    public static final StairInfo LIME_CONCRETE_STAIRS = registerStairBlock("lime_concrete_stairs",
            Blocks.LIME_CONCRETE);
    public static final StairInfo GREEN_CONCRETE_STAIRS = registerStairBlock("green_concrete_stairs",
            Blocks.GREEN_CONCRETE);
    public static final StairInfo CYAN_CONCRETE_STAIRS = registerStairBlock("cyan_concrete_stairs",
            Blocks.CYAN_CONCRETE);
    public static final StairInfo LIGHT_BLUE_CONCRETE_STAIRS = registerStairBlock("light_blue_concrete_stairs",
            Blocks.LIGHT_BLUE_CONCRETE);
    public static final StairInfo BLUE_CONCRETE_STAIRS = registerStairBlock("blue_concrete_stairs",
            Blocks.BLUE_CONCRETE);
    public static final StairInfo PURPLE_CONCRETE_STAIRS = registerStairBlock("purple_concrete_stairs",
            Blocks.PURPLE_CONCRETE);
    public static final StairInfo MAGENTA_CONCRETE_STAIRS = registerStairBlock("magenta_concrete_stairs",
            Blocks.MAGENTA_CONCRETE);
    public static final StairInfo PINK_CONCRETE_STAIRS = registerStairBlock("pink_concrete_stairs",
            Blocks.PINK_CONCRETE);

    public static final StairInfo GILDED_BLACKSTONE_STAIRS = registerStairBlock("gilded_blackstone_stairs",
            Blocks.GILDED_BLACKSTONE);
    public static final StairInfo RESIN_BLOCK_STAIRS = registerStairBlock("resin_block_stairs", Blocks.RESIN_BLOCK);
    public static final StairInfo GOLD_BLOCK_STAIRS = registerStairBlock("gold_block_stairs", Blocks.GOLD_BLOCK);
    public static final StairInfo RAW_GOLD_BLOCK_STAIRS = registerStairBlock("raw_gold_block_stairs",
            Blocks.RAW_GOLD_BLOCK);
    public static final StairInfo IRON_BLOCK_STAIRS = registerStairBlock("iron_block_stairs", Blocks.IRON_BLOCK);
    public static final StairInfo RAW_IRON_BLOCK_STAIRS = registerStairBlock("raw_iron_block_stairs",
            Blocks.RAW_IRON_BLOCK);

    public static final Map<String, StairInfo> REGISTERED_STANDARD_STAIRS = Map.ofEntries(
            Map.entry("white_concrete", WHITE_CONCRETE_STAIRS),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_STAIRS),
            Map.entry("gray_concrete", GRAY_CONCRETE_STAIRS), Map.entry("black_concrete", BLACK_CONCRETE_STAIRS),
            Map.entry("brown_concrete", BROWN_CONCRETE_STAIRS), Map.entry("red_concrete", RED_CONCRETE_STAIRS),
            Map.entry("orange_concrete", ORANGE_CONCRETE_STAIRS), Map.entry("yellow_concrete", YELLOW_CONCRETE_STAIRS),
            Map.entry("lime_concrete", LIME_CONCRETE_STAIRS), Map.entry("green_concrete", GREEN_CONCRETE_STAIRS),
            Map.entry("cyan_concrete", CYAN_CONCRETE_STAIRS),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_STAIRS),
            Map.entry("blue_concrete", BLUE_CONCRETE_STAIRS), Map.entry("purple_concrete", PURPLE_CONCRETE_STAIRS),
            Map.entry("magenta_concrete", MAGENTA_CONCRETE_STAIRS), Map.entry("pink_concrete", PINK_CONCRETE_STAIRS),

            Map.entry("resin_block", RESIN_BLOCK_STAIRS), Map.entry("gilded_blackstone", GILDED_BLACKSTONE_STAIRS),
            Map.entry("gold_block", GOLD_BLOCK_STAIRS), Map.entry("raw_gold_block", RAW_GOLD_BLOCK_STAIRS),
            Map.entry("iron_block", IRON_BLOCK_STAIRS), Map.entry("raw_iron_block", RAW_IRON_BLOCK_STAIRS)

    );

    public static final DeferredBlock<CarpetBlock> HAY_CARPET = registerCarpet("hay_carpet", Blocks.HAY_BLOCK);

    public static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleBlockItem(key, register);
        return register;
    }

    private static <T extends Block> DeferredBlock<T> registerDevBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleDevBlockItem(key, register);
        return register;
    }

    private static DeferredBlock<ButtonBlock> registerButtonBlock(String id, Block baseBlock) {
        return registerBlock(id, () -> new ButtonBlock(
                BlockSetType.STONE, 30,
                BlockBehaviour.Properties.ofFullCopy(baseBlock).noCollission().strength(0.5F).setId(blockId(id))
        ));
    }

    private static StairInfo registerStairBlock(String id, Block baseBlock) {
        DeferredBlock<StairBlock> stair = registerDevBlock(id, () -> new StairBlock(baseBlock.defaultBlockState(),
                BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id))));
        return new StairInfo(stair, baseBlock);
    }

    private static DeferredBlock<CarpetBlock> registerCarpet(String id, Block baseBlock) {
        return registerDevBlock(id, () -> new CarpetBlock(
                BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id))
        ));
    }

    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }
}