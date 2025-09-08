package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class MotrWalls {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static class WallInfo {
        private final DeferredBlock<?> wall;
        private final Block baseBlock;

        public WallInfo(DeferredBlock<?> wall, Block baseBlock) {
            this.wall = wall;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<?> wall() {
            return wall;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }

    }

    public static final WallInfo WHITE_CONCRETE_WALL = registerWallBlock("white_concrete_wall", Blocks.WHITE_CONCRETE);
    public static final WallInfo LIGHT_GRAY_CONCRETE_WALL = registerWallBlock("light_gray_concrete_wall",
            Blocks.LIGHT_GRAY_CONCRETE);
    public static final WallInfo GRAY_CONCRETE_WALL = registerWallBlock("gray_concrete_wall", Blocks.GRAY_CONCRETE);
    public static final WallInfo BLACK_CONCRETE_WALL = registerWallBlock("black_concrete_wall", Blocks.BLACK_CONCRETE);
    public static final WallInfo BROWN_CONCRETE_WALL = registerWallBlock("brown_concrete_wall", Blocks.BROWN_CONCRETE);
    public static final WallInfo RED_CONCRETE_WALL = registerWallBlock("red_concrete_wall", Blocks.RED_CONCRETE);
    public static final WallInfo ORANGE_CONCRETE_WALL = registerWallBlock("orange_concrete_wall",
            Blocks.ORANGE_CONCRETE);
    public static final WallInfo YELLOW_CONCRETE_WALL = registerWallBlock("yellow_concrete_wall",
            Blocks.YELLOW_CONCRETE);
    public static final WallInfo LIME_CONCRETE_WALL = registerWallBlock("lime_concrete_wall", Blocks.LIME_CONCRETE);
    public static final WallInfo GREEN_CONCRETE_WALL = registerWallBlock("green_concrete_wall", Blocks.GREEN_CONCRETE);
    public static final WallInfo CYAN_CONCRETE_WALL = registerWallBlock("cyan_concrete_wall", Blocks.CYAN_CONCRETE);
    public static final WallInfo LIGHT_BLUE_CONCRETE_WALL = registerWallBlock("light_blue_concrete_wall",
            Blocks.LIGHT_BLUE_CONCRETE);
    public static final WallInfo BLUE_CONCRETE_WALL = registerWallBlock("blue_concrete_wall", Blocks.BLUE_CONCRETE);
    public static final WallInfo PURPLE_CONCRETE_WALL = registerWallBlock("purple_concrete_wall",
            Blocks.PURPLE_CONCRETE);
    public static final WallInfo MAGENTA_CONCRETE_WALL = registerWallBlock("magenta_concrete_wall",
            Blocks.MAGENTA_CONCRETE);
    public static final WallInfo PINK_CONCRETE_WALL = registerWallBlock("pink_concrete_wall", Blocks.PINK_CONCRETE);

    public static final WallInfo GILDED_BLACKSTONE_WALL = registerWallBlock("gilded_blackstone",
            Blocks.GILDED_BLACKSTONE);
    public static final WallInfo GOLD_BLOCK_WALL = registerWallBlock("gold_block_wall", Blocks.GOLD_BLOCK);
    public static final WallInfo RAW_GOLD_BLOCK_WALL = registerWallBlock("raw_gold_block_wall", Blocks.RAW_GOLD_BLOCK);
    public static final WallInfo IRON_BLOCK_WALL = registerWallBlock("iron_block_wall", Blocks.IRON_BLOCK);
    public static final WallInfo RAW_IRON_BLOCK_WALL = registerWallBlock("raw_iron_block_wall", Blocks.RAW_IRON_BLOCK);
    public static final WallInfo BRAIN_CORAL_BLOCK_WALL = registerWallBlock("brain_coral_block_wall",
            Blocks.BRAIN_CORAL_BLOCK);
    public static final WallInfo BUBBLE_CORAL_BLOCK_WALL = registerWallBlock("bubble_coral_block_wall",
            Blocks.BUBBLE_CORAL_BLOCK);
    public static final WallInfo DEAD_FIRE_CORAL_BLOCK_WALL = registerWallBlock("dead_fire_coral_block_wall",
            Blocks.DEAD_FIRE_CORAL_BLOCK);
    public static final WallInfo DEAD_TUBE_CORAL_BLOCK_WALL = registerWallBlock("dead_tube_coral_block_wall",
            Blocks.DEAD_TUBE_CORAL_BLOCK);
    public static final WallInfo FIRE_CORAL_BLOCK_WALL = registerWallBlock("fire_coral_block_wall",
            Blocks.FIRE_CORAL_BLOCK);
    public static final WallInfo HORN_CORAL_BLOCK_WALL = registerWallBlock("horn_coral_block_wall",
            Blocks.HORN_CORAL_BLOCK);
    public static final WallInfo TUBE_CORAL_BLOCK_WALL = registerWallBlock("tube_coral_block_wall",
            Blocks.TUBE_CORAL_BLOCK);

    public static final WallInfo GLASS_WALL = registerWallBlock("glass_wall", Blocks.GLASS);
    public static final WallInfo TINTED_GLASS_WALL = registerWallBlock("tinted_glass_wall", Blocks.TINTED_GLASS);
    public static final WallInfo WHITE_STAINED_GLASS_WALL = registerWallBlock("white_stained_glass_wall",
            Blocks.WHITE_STAINED_GLASS);
    public static final WallInfo LIGHT_GRAY_STAINED_GLASS_WALL = registerWallBlock("light_gray_stained_glass_wall",
            Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final WallInfo GRAY_STAINED_GLASS_WALL = registerWallBlock("gray_stained_glass_wall",
            Blocks.GRAY_STAINED_GLASS);
    public static final WallInfo BLACK_STAINED_GLASS_WALL = registerWallBlock("black_stained_glass_wall",
            Blocks.BLACK_STAINED_GLASS);
    public static final WallInfo BROWN_STAINED_GLASS_WALL = registerWallBlock("brown_stained_glass_wall",
            Blocks.BROWN_STAINED_GLASS);
    public static final WallInfo RED_STAINED_GLASS_WALL = registerWallBlock("red_stained_glass_wall",
            Blocks.RED_STAINED_GLASS);
    public static final WallInfo ORANGE_STAINED_GLASS_WALL = registerWallBlock("orange_stained_glass_wall",
            Blocks.ORANGE_STAINED_GLASS);
    public static final WallInfo YELLOW_STAINED_GLASS_WALL = registerWallBlock("yellow_stained_glass_wall",
            Blocks.YELLOW_STAINED_GLASS);
    public static final WallInfo LIME_STAINED_GLASS_WALL = registerWallBlock("lime_stained_glass_wall",
            Blocks.LIME_STAINED_GLASS);
    public static final WallInfo GREEN_STAINED_GLASS_WALL = registerWallBlock("green_stained_glass_wall",
            Blocks.GREEN_STAINED_GLASS);
    public static final WallInfo CYAN_STAINED_GLASS_WALL = registerWallBlock("cyan_stained_glass_wall",
            Blocks.CYAN_STAINED_GLASS);
    public static final WallInfo LIGHT_BLUE_STAINED_GLASS_WALL = registerWallBlock("light_blue_stained_glass_wall",
            Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final WallInfo BLUE_STAINED_GLASS_WALL = registerWallBlock("blue_stained_glass_wall",
            Blocks.BLUE_STAINED_GLASS);
    public static final WallInfo PURPLE_STAINED_GLASS_WALL = registerWallBlock("purple_stained_glass_wall",
            Blocks.PURPLE_STAINED_GLASS);
    public static final WallInfo MAGENTA_STAINED_GLASS_WALL = registerWallBlock("magenta_stained_glass_wall",
            Blocks.MAGENTA_STAINED_GLASS);
    public static final WallInfo PINK_STAINED_GLASS_WALL = registerWallBlock("pink_stained_glass_wall",
            Blocks.PINK_STAINED_GLASS);

    public static final Map<String, WallInfo> REGISTERED_STANDARD_WALLS = Map.ofEntries(
            Map.entry("white_concrete", WHITE_CONCRETE_WALL),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_WALL), Map.entry("gray_concrete", GRAY_CONCRETE_WALL),
            Map.entry("black_concrete", BLACK_CONCRETE_WALL), Map.entry("brown_concrete", BROWN_CONCRETE_WALL),
            Map.entry("red_concrete", RED_CONCRETE_WALL), Map.entry("orange_concrete", ORANGE_CONCRETE_WALL),
            Map.entry("yellow_concrete", YELLOW_CONCRETE_WALL), Map.entry("lime_concrete", LIME_CONCRETE_WALL),
            Map.entry("green_concrete", GREEN_CONCRETE_WALL), Map.entry("cyan_concrete", CYAN_CONCRETE_WALL),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_WALL), Map.entry("blue_concrete", BLUE_CONCRETE_WALL),
            Map.entry("purple_concrete", PURPLE_CONCRETE_WALL), Map.entry("magenta_concrete", MAGENTA_CONCRETE_WALL),
            Map.entry("pink_concrete", PINK_CONCRETE_WALL), Map.entry("gilded_blackstone", GILDED_BLACKSTONE_WALL),
            Map.entry("gold_block", GOLD_BLOCK_WALL), Map.entry("raw_gold_block", RAW_GOLD_BLOCK_WALL),
            Map.entry("iron_block", IRON_BLOCK_WALL), Map.entry("raw_iron_block", RAW_IRON_BLOCK_WALL),
            Map.entry("brain_coral_block", BRAIN_CORAL_BLOCK_WALL),
            Map.entry("bubble_coral_block", BUBBLE_CORAL_BLOCK_WALL),
            Map.entry("dead_fire_coral_block", DEAD_FIRE_CORAL_BLOCK_WALL),
            Map.entry("dead_tube_coral_block", DEAD_TUBE_CORAL_BLOCK_WALL),
            Map.entry("fire_coral_block", FIRE_CORAL_BLOCK_WALL), Map.entry("horn_coral_block", HORN_CORAL_BLOCK_WALL),
            Map.entry("tube_coral_block", TUBE_CORAL_BLOCK_WALL)
    );

    public static final Map<String, WallInfo> REGISTERED_GLASS_WALLS = Map.ofEntries(
            Map.entry("glass", GLASS_WALL), Map.entry("tinted_glass", TINTED_GLASS_WALL),
            Map.entry("white_stained_glass", WHITE_STAINED_GLASS_WALL),
            Map.entry("light_gray_stained_glass", LIGHT_GRAY_STAINED_GLASS_WALL),
            Map.entry("gray_stained_glass", GRAY_STAINED_GLASS_WALL),
            Map.entry("black_stained_glass", BLACK_STAINED_GLASS_WALL),
            Map.entry("brown_stained_glass", BROWN_STAINED_GLASS_WALL),
            Map.entry("red_stained_glass", RED_STAINED_GLASS_WALL),
            Map.entry("orange_stained_glass", ORANGE_STAINED_GLASS_WALL),
            Map.entry("yellow_stained_glass", YELLOW_STAINED_GLASS_WALL),
            Map.entry("lime_stained_glass", LIME_STAINED_GLASS_WALL),
            Map.entry("green_stained_glass", GREEN_STAINED_GLASS_WALL),
            Map.entry("cyan_stained_glass", CYAN_STAINED_GLASS_WALL),
            Map.entry("light_blue_stained_glass", LIGHT_BLUE_STAINED_GLASS_WALL),
            Map.entry("blue_stained_glass", BLUE_STAINED_GLASS_WALL),
            Map.entry("purple_stained_glass", PURPLE_STAINED_GLASS_WALL),
            Map.entry("magenta_stained_glass", MAGENTA_STAINED_GLASS_WALL),
            Map.entry("pink_stained_glass", PINK_STAINED_GLASS_WALL)
    );

    private static WallInfo registerWallBlock(String id, Block baseBlock) {
        DeferredBlock<?> wall = registerBlock(id, () -> new net.minecraft.world.level.block.WallBlock(
                BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id))));
        return new WallInfo(wall, baseBlock);
    }

    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }

    public static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleBlockItem(key, register);
        return register;
    }
}
