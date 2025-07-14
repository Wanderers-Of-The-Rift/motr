package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.function.Supplier;

public class MotrBlocks {

    public static class SlabInfo {
        private final DeferredBlock<SlabBlock> slab;
        private final Block baseBlock;

        public SlabInfo(DeferredBlock<SlabBlock> slab, Block baseBlock) {
            this.slab = slab;
            this.baseBlock = baseBlock;
        }

        public DeferredBlock<SlabBlock> slab() {
            return slab;
        }

        public Block baseBlock() {
            return baseBlock;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

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

        public Block baseBlock() {
            return baseBlock;
        }

        public Item getBaseItem() {
            return wall.get().asItem();
        }

        public Item getWallItem() {
            return wall.get().asItem();
        }
    }

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

        public Block baseBlock() {
            return baseBlock;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

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

        public Block baseBlock() {
            return baseBlock;
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

        public Block baseBlock() {
            return baseBlock;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }

        public Item getFenceGateItem() {
            return fenceGate.get().asItem();
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

        public Block baseBlock() {
            return baseBlock;
        }

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static final SlabInfo WHITE_CONCRETE_SLAB = registerSlabBlock("white_concrete_slab", Blocks.WHITE_CONCRETE);
    public static final SlabInfo LIGHT_GRAY_CONCRETE_SLAB = registerSlabBlock("light_gray_concrete_slab",
            Blocks.LIGHT_GRAY_CONCRETE);
    public static final SlabInfo GRAY_CONCRETE_SLAB = registerSlabBlock("gray_concrete_slab", Blocks.GRAY_CONCRETE);
    public static final SlabInfo BLACK_CONCRETE_SLAB = registerSlabBlock("black_concrete_slab", Blocks.BLACK_CONCRETE);
    public static final SlabInfo BROWN_CONCRETE_SLAB = registerSlabBlock("brown_concrete_slab", Blocks.BROWN_CONCRETE);
    public static final SlabInfo RED_CONCRETE_SLAB = registerSlabBlock("red_concrete_slab", Blocks.RED_CONCRETE);
    public static final SlabInfo ORANGE_CONCRETE_SLAB = registerSlabBlock("orange_concrete_slab",
            Blocks.ORANGE_CONCRETE);
    public static final SlabInfo YELLOW_CONCRETE_SLAB = registerSlabBlock("yellow_concrete_slab",
            Blocks.YELLOW_CONCRETE);
    public static final SlabInfo LIME_CONCRETE_SLAB = registerSlabBlock("lime_concrete_slab", Blocks.LIME_CONCRETE);
    public static final SlabInfo GREEN_CONCRETE_SLAB = registerSlabBlock("green_concrete_slab", Blocks.GREEN_CONCRETE);
    public static final SlabInfo CYAN_CONCRETE_SLAB = registerSlabBlock("cyan_concrete_slab", Blocks.CYAN_CONCRETE);
    public static final SlabInfo LIGHT_BLUE_CONCRETE_SLAB = registerSlabBlock("light_blue_concrete_slab",
            Blocks.LIGHT_BLUE_CONCRETE);
    public static final SlabInfo BLUE_CONCRETE_SLAB = registerSlabBlock("blue_concrete_slab", Blocks.BLUE_CONCRETE);
    public static final SlabInfo PURPLE_CONCRETE_SLAB = registerSlabBlock("purple_concrete_slab",
            Blocks.PURPLE_CONCRETE);
    public static final SlabInfo MAGENTA_CONCRETE_SLAB = registerSlabBlock("magenta_concrete_slab",
            Blocks.MAGENTA_CONCRETE);
    public static final SlabInfo PINK_CONCRETE_SLAB = registerSlabBlock("pink_concrete_slab", Blocks.PINK_CONCRETE);

    public static final SlabInfo WHITE_CONCRETE_POWDER_SLAB = registerSlabBlock("white_concrete_powder_slab",
            Blocks.WHITE_CONCRETE_POWDER);
    public static final SlabInfo LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerSlabBlock("light_gray_concrete_powder_slab",
            Blocks.LIGHT_GRAY_CONCRETE_POWDER);
    public static final SlabInfo GRAY_CONCRETE_POWDER_SLAB = registerSlabBlock("gray_concrete_powder_slab",
            Blocks.GRAY_CONCRETE_POWDER);
    public static final SlabInfo BLACK_CONCRETE_POWDER_SLAB = registerSlabBlock("black_concrete_powder_slab",
            Blocks.BLACK_CONCRETE_POWDER);
    public static final SlabInfo BROWN_CONCRETE_POWDER_SLAB = registerSlabBlock("brown_concrete_powder_slab",
            Blocks.BROWN_CONCRETE_POWDER);
    public static final SlabInfo RED_CONCRETE_POWDER_SLAB = registerSlabBlock("red_concrete_powder_slab",
            Blocks.RED_CONCRETE_POWDER);
    public static final SlabInfo ORANGE_CONCRETE_POWDER_SLAB = registerSlabBlock("orange_concrete_powder_slab",
            Blocks.ORANGE_CONCRETE_POWDER);
    public static final SlabInfo YELLOW_CONCRETE_POWDER_SLAB = registerSlabBlock("yellow_concrete_powder_slab",
            Blocks.YELLOW_CONCRETE_POWDER);
    public static final SlabInfo LIME_CONCRETE_POWDER_SLAB = registerSlabBlock("lime_concrete_powder_slab",
            Blocks.LIME_CONCRETE_POWDER);
    public static final SlabInfo GREEN_CONCRETE_POWDER_SLAB = registerSlabBlock("green_concrete_powder_slab",
            Blocks.GREEN_CONCRETE_POWDER);
    public static final SlabInfo CYAN_CONCRETE_POWDER_SLAB = registerSlabBlock("cyan_concrete_powder_slab",
            Blocks.CYAN_CONCRETE_POWDER);
    public static final SlabInfo LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerSlabBlock("light_blue_concrete_powder_slab",
            Blocks.LIGHT_BLUE_CONCRETE_POWDER);
    public static final SlabInfo BLUE_CONCRETE_POWDER_SLAB = registerSlabBlock("blue_concrete_powder_slab",
            Blocks.BLUE_CONCRETE_POWDER);
    public static final SlabInfo PURPLE_CONCRETE_POWDER_SLAB = registerSlabBlock("purple_concrete_powder_slab",
            Blocks.PURPLE_CONCRETE_POWDER);
    public static final SlabInfo MAGENTA_CONCRETE_POWDER_SLAB = registerSlabBlock("magenta_concrete_powder_slab",
            Blocks.MAGENTA_CONCRETE_POWDER);
    public static final SlabInfo PINK_CONCRETE_POWDER_SLAB = registerSlabBlock("pink_concrete_powder_slab",
            Blocks.PINK_CONCRETE_POWDER);

    public static final SlabInfo TUBE_CORAL_BLOCK_SLAB = registerSlabBlock("tube_coral_block_slab",
            Blocks.TUBE_CORAL_BLOCK);
    public static final SlabInfo BRAIN_CORAL_BLOCK_SLAB = registerSlabBlock("brain_coral_block_slab",
            Blocks.BRAIN_CORAL_BLOCK);
    public static final SlabInfo BUBBLE_CORAL_BLOCK_SLAB = registerSlabBlock("bubble_coral_block_slab",
            Blocks.BUBBLE_CORAL_BLOCK);
    public static final SlabInfo FIRE_CORAL_BLOCK_SLAB = registerSlabBlock("fire_coral_block_slab",
            Blocks.FIRE_CORAL_BLOCK);
    public static final SlabInfo HORN_CORAL_BLOCK_SLAB = registerSlabBlock("horn_coral_block_slab",
            Blocks.HORN_CORAL_BLOCK);

    public static final SlabInfo WARPED_WART_BLOCK_SLAB = registerSlabBlock("warped_wart_block_slab",
            Blocks.WARPED_WART_BLOCK);
    public static final SlabInfo SOUL_SAND_SLAB = registerSlabBlock("soul_sand_slab", Blocks.SOUL_SAND);
    public static final SlabInfo SOUL_SOIL_SLAB = registerSlabBlock("soul_soil_slab", Blocks.SOUL_SOIL);
    public static final SlabInfo ROOTED_DIRT_SLAB = registerSlabBlock("rooted_dirt_slab", Blocks.ROOTED_DIRT);
    public static final SlabInfo RAW_IRON_BLOCK_SLAB = registerSlabBlock("raw_iron_block_slab", Blocks.RAW_IRON_BLOCK);
    public static final SlabInfo RAW_GOLD_BLOCK_SLAB = registerSlabBlock("raw_gold_block_slab", Blocks.RAW_GOLD_BLOCK);
    public static final SlabInfo PALE_MOSS_BLOCK_SLAB = registerSlabBlock("pale_moss_block_slab",
            Blocks.PALE_MOSS_BLOCK);
    public static final SlabInfo PACKED_ICE_SLAB = registerSlabBlock("packed_ice_slab", Blocks.PACKED_ICE);
    public static final SlabInfo NETHER_WART_BLOCK_SLAB = registerSlabBlock("nether_wart_block_slab",
            Blocks.NETHER_WART_BLOCK);
    public static final SlabInfo MUD_SLAB = registerSlabBlock("mud_slab", Blocks.MUD);
    public static final SlabInfo MOSS_BLOCK_SLAB = registerSlabBlock("moss_block_slab", Blocks.MOSS_BLOCK);
    public static final SlabInfo ICE_SLAB = registerSlabBlock("ice_slab", Blocks.ICE);
    public static final SlabInfo GILDED_BLACKSTONE_SLAB = registerSlabBlock("gilded_blackstone_slab",
            Blocks.GILDED_BLACKSTONE);
    public static final SlabInfo DIRT_SLAB = registerSlabBlock("dirt_slab", Blocks.DIRT);
    public static final SlabInfo CLAY_SLAB = registerSlabBlock("clay_slab", Blocks.CLAY);
    public static final SlabInfo COARSE_DIRT_SLAB = registerSlabBlock("coarse_dirt_slab", Blocks.COARSE_DIRT);
    public static final SlabInfo BLUE_ICE_SLAB = registerSlabBlock("blue_ice_slab", Blocks.BLUE_ICE);
    public static final SlabInfo RESIN_BLOCK_SLAB = registerSlabBlock("resin_block_slab", Blocks.RESIN_BLOCK);

    public static final SlabInfo GLASS_SLAB = registerSlabBlock("glass_slab", Blocks.GLASS);
    public static final SlabInfo TINTED_GLASS_SLAB = registerSlabBlock("tinted_glass_slab", Blocks.TINTED_GLASS);
    public static final SlabInfo WHITE_STAINED_GLASS_SLAB = registerSlabBlock("white_stained_glass_slab",
            Blocks.WHITE_STAINED_GLASS);
    public static final SlabInfo LIGHT_GRAY_STAINED_GLASS_SLAB = registerSlabBlock("light_gray_stained_glass_slab",
            Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final SlabInfo GRAY_STAINED_GLASS_SLAB = registerSlabBlock("gray_stained_glass_slab",
            Blocks.GRAY_STAINED_GLASS);
    public static final SlabInfo BLACK_STAINED_GLASS_SLAB = registerSlabBlock("black_stained_glass_slab",
            Blocks.BLACK_STAINED_GLASS);
    public static final SlabInfo BROWN_STAINED_GLASS_SLAB = registerSlabBlock("brown_stained_glass_slab",
            Blocks.BROWN_STAINED_GLASS);
    public static final SlabInfo RED_STAINED_GLASS_SLAB = registerSlabBlock("red_stained_glass_slab",
            Blocks.RED_STAINED_GLASS);
    public static final SlabInfo ORANGE_STAINED_GLASS_SLAB = registerSlabBlock("orange_stained_glass_slab",
            Blocks.ORANGE_STAINED_GLASS);
    public static final SlabInfo YELLOW_STAINED_GLASS_SLAB = registerSlabBlock("yellow_stained_glass_slab",
            Blocks.YELLOW_STAINED_GLASS);
    public static final SlabInfo LIME_STAINED_GLASS_SLAB = registerSlabBlock("lime_stained_glass_slab",
            Blocks.LIME_STAINED_GLASS);
    public static final SlabInfo GREEN_STAINED_GLASS_SLAB = registerSlabBlock("green_stained_glass_slab",
            Blocks.GREEN_STAINED_GLASS);
    public static final SlabInfo CYAN_STAINED_GLASS_SLAB = registerSlabBlock("cyan_stained_glass_slab",
            Blocks.CYAN_STAINED_GLASS);
    public static final SlabInfo LIGHT_BLUE_STAINED_GLASS_SLAB = registerSlabBlock("light_blue_stained_glass_slab",
            Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final SlabInfo BLUE_STAINED_GLASS_SLAB = registerSlabBlock("blue_stained_glass_slab",
            Blocks.BLUE_STAINED_GLASS);
    public static final SlabInfo PURPLE_STAINED_GLASS_SLAB = registerSlabBlock("purple_stained_glass_slab",
            Blocks.PURPLE_STAINED_GLASS);
    public static final SlabInfo MAGENTA_STAINED_GLASS_SLAB = registerSlabBlock("magenta_stained_glass_slab",
            Blocks.MAGENTA_STAINED_GLASS);
    public static final SlabInfo PINK_STAINED_GLASS_SLAB = registerSlabBlock("pink_stained_glass_slab",
            Blocks.PINK_STAINED_GLASS);

    public static final SlabInfo PODZOL_SLAB = registerSlabBlock("podzol_slab", Blocks.PODZOL);
    public static final SlabInfo MUDDY_MANGROVE_ROOTS_SLAB = registerSlabBlock("muddy_mangrove_roots_slab",
            Blocks.MUDDY_MANGROVE_ROOTS);
    public static final SlabInfo MYCELIUM_SLAB = registerSlabBlock("mycelium_slab", Blocks.MYCELIUM);
    public static final SlabInfo DIRT_PATH_SLAB = registerSlabBlock("dirt_path_slab", Blocks.DIRT_PATH);
    public static final SlabInfo BONE_BLOCK_SLAB = registerSlabBlock("bone_block_slab", Blocks.BONE_BLOCK);

    public static final SlabInfo GOLD_BLOCK_SLAB = registerSlabBlock("gold_block_slab", Blocks.GOLD_BLOCK);
    public static final SlabInfo IRON_BLOCK_SLAB = registerSlabBlock("iron_block_slab", Blocks.IRON_BLOCK);

    public static final SlabInfo MAGMA_SLAB = registerSlabBlock("magma_slab", Blocks.MAGMA_BLOCK);
    public static final SlabInfo SNOW_SLAB = registerSlabBlock("snow_slab", Blocks.SNOW_BLOCK);

    public static final Map<String, SlabInfo> REGISTERED_STANDARD_SLABS = Map.ofEntries(
            Map.entry("white_concrete", WHITE_CONCRETE_SLAB),
            Map.entry("light_gray_concrete", LIGHT_GRAY_CONCRETE_SLAB), Map.entry("gray_concrete", GRAY_CONCRETE_SLAB),
            Map.entry("black_concrete", BLACK_CONCRETE_SLAB), Map.entry("brown_concrete", BROWN_CONCRETE_SLAB),
            Map.entry("red_concrete", RED_CONCRETE_SLAB), Map.entry("orange_concrete", ORANGE_CONCRETE_SLAB),
            Map.entry("yellow_concrete", YELLOW_CONCRETE_SLAB), Map.entry("lime_concrete", LIME_CONCRETE_SLAB),
            Map.entry("green_concrete", GREEN_CONCRETE_SLAB), Map.entry("cyan_concrete", CYAN_CONCRETE_SLAB),
            Map.entry("light_blue_concrete", LIGHT_BLUE_CONCRETE_SLAB), Map.entry("blue_concrete", BLUE_CONCRETE_SLAB),
            Map.entry("purple_concrete", PURPLE_CONCRETE_SLAB), Map.entry("magenta_concrete", MAGENTA_CONCRETE_SLAB),
            Map.entry("pink_concrete", PINK_CONCRETE_SLAB),
            Map.entry("white_concrete_powder", WHITE_CONCRETE_POWDER_SLAB),
            Map.entry("light_gray_concrete_powder", LIGHT_GRAY_CONCRETE_POWDER_SLAB),
            Map.entry("gray_concrete_powder", GRAY_CONCRETE_POWDER_SLAB),
            Map.entry("black_concrete_powder", BLACK_CONCRETE_POWDER_SLAB),
            Map.entry("brown_concrete_powder", BROWN_CONCRETE_POWDER_SLAB),
            Map.entry("red_concrete_powder", RED_CONCRETE_POWDER_SLAB),
            Map.entry("orange_concrete_powder", ORANGE_CONCRETE_POWDER_SLAB),
            Map.entry("yellow_concrete_powder", YELLOW_CONCRETE_POWDER_SLAB),
            Map.entry("lime_concrete_powder", LIME_CONCRETE_POWDER_SLAB),
            Map.entry("green_concrete_powder", GREEN_CONCRETE_POWDER_SLAB),
            Map.entry("cyan_concrete_powder", CYAN_CONCRETE_POWDER_SLAB),
            Map.entry("light_blue_concrete_powder", LIGHT_BLUE_CONCRETE_POWDER_SLAB),
            Map.entry("blue_concrete_powder", BLUE_CONCRETE_POWDER_SLAB),
            Map.entry("purple_concrete_powder", PURPLE_CONCRETE_POWDER_SLAB),
            Map.entry("magenta_concrete_powder", MAGENTA_CONCRETE_POWDER_SLAB),
            Map.entry("pink_concrete_powder", PINK_CONCRETE_POWDER_SLAB),
            Map.entry("tube_coral_block", TUBE_CORAL_BLOCK_SLAB),
            Map.entry("brain_coral_block", BRAIN_CORAL_BLOCK_SLAB),
            Map.entry("bubble_coral_block", BUBBLE_CORAL_BLOCK_SLAB),
            Map.entry("fire_coral_block", FIRE_CORAL_BLOCK_SLAB), Map.entry("horn_coral_block", HORN_CORAL_BLOCK_SLAB),
            Map.entry("warped_wart_block", WARPED_WART_BLOCK_SLAB), Map.entry("soul_sand", SOUL_SAND_SLAB),
            Map.entry("soul_soil", SOUL_SOIL_SLAB), Map.entry("rooted_dirt", ROOTED_DIRT_SLAB),
            Map.entry("raw_iron_block", RAW_IRON_BLOCK_SLAB), Map.entry("raw_gold_block", RAW_GOLD_BLOCK_SLAB),
            Map.entry("pale_moss_block", PALE_MOSS_BLOCK_SLAB), Map.entry("packed_ice", PACKED_ICE_SLAB),
            Map.entry("nether_wart_block", NETHER_WART_BLOCK_SLAB), Map.entry("mud", MUD_SLAB),
            Map.entry("moss_block", MOSS_BLOCK_SLAB), Map.entry("ice", ICE_SLAB),
            Map.entry("gilded_blackstone", GILDED_BLACKSTONE_SLAB), Map.entry("dirt", DIRT_SLAB),
            Map.entry("clay", CLAY_SLAB), Map.entry("coarse_dirt", COARSE_DIRT_SLAB),
            Map.entry("blue_ice", BLUE_ICE_SLAB), Map.entry("resin_block", RESIN_BLOCK_SLAB),
            Map.entry("magma", MAGMA_SLAB)

    );

    public static final Map<String, SlabInfo> REGISTERED_SILKTOUCH_SLABS = Map.ofEntries(
            Map.entry("snow", SNOW_SLAB)
    );

    public static final Map<String, SlabInfo> REGISTERED_GLASS_SLABS = Map.ofEntries(
            Map.entry("glass", GLASS_SLAB), Map.entry("tinted_glass", TINTED_GLASS_SLAB),
            Map.entry("white_stained_glass", WHITE_STAINED_GLASS_SLAB),
            Map.entry("light_gray_stained_glass", LIGHT_GRAY_STAINED_GLASS_SLAB),
            Map.entry("gray_stained_glass", GRAY_STAINED_GLASS_SLAB),
            Map.entry("black_stained_glass", BLACK_STAINED_GLASS_SLAB),
            Map.entry("brown_stained_glass", BROWN_STAINED_GLASS_SLAB),
            Map.entry("red_stained_glass", RED_STAINED_GLASS_SLAB),
            Map.entry("orange_stained_glass", ORANGE_STAINED_GLASS_SLAB),
            Map.entry("yellow_stained_glass", YELLOW_STAINED_GLASS_SLAB),
            Map.entry("lime_stained_glass", LIME_STAINED_GLASS_SLAB),
            Map.entry("green_stained_glass", GREEN_STAINED_GLASS_SLAB),
            Map.entry("cyan_stained_glass", CYAN_STAINED_GLASS_SLAB),
            Map.entry("light_blue_stained_glass", LIGHT_BLUE_STAINED_GLASS_SLAB),
            Map.entry("blue_stained_glass", BLUE_STAINED_GLASS_SLAB),
            Map.entry("purple_stained_glass", PURPLE_STAINED_GLASS_SLAB),
            Map.entry("magenta_stained_glass", MAGENTA_STAINED_GLASS_SLAB),
            Map.entry("pink_stained_glass", PINK_STAINED_GLASS_SLAB)
    );

    public static final Map<String, SlabInfo> REGISTERED_DIRECTIONAL_SLABS = Map.ofEntries(
            Map.entry("podzol", PODZOL_SLAB), Map.entry("muddy_mangrove_roots", MUDDY_MANGROVE_ROOTS_SLAB),
            Map.entry("mycelium", MYCELIUM_SLAB), Map.entry("dirt_path", DIRT_PATH_SLAB),
            Map.entry("bone_block", BONE_BLOCK_SLAB)
    );

    public static final Map<String, SlabInfo> REGISTERED_TRIMM_SLABS = Map.ofEntries(
            Map.entry("gold_block", GOLD_BLOCK_SLAB), Map.entry("iron_block", IRON_BLOCK_SLAB)
    );

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
            Map.entry("yellow_terracotta", YELLOW_TERRACOTTA_BUTTON),

            Map.entry("sandstone", SANDSTONE_BUTTON), Map.entry("red_sandstone", RED_SANDSTONE_BUTTON),
            Map.entry("mud", MUD_BUTTON)
    );

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
            Map.entry("yellow_terracotta", YELLOW_TERRACOTTA_FENCE),

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
            Map.entry("pink_terracotta", PINK_TERRACOTTA_FENCE_GATE),

            Map.entry("sandstone", SANDSTONE_FENCE_GATE), Map.entry("red_sandstone", RED_SANDSTONE_FENCE_GATE),
            Map.entry("mud", MUD_FENCE_GATE)
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

    public static final SlabInfo COPPER_SLAB = registerCopperSlabBlock("copper_slab", Blocks.COPPER_BLOCK);
    public static final SlabInfo EXPOSED_COPPER_SLAB = registerCopperSlabBlock("exposed_copper_slab",
            Blocks.EXPOSED_COPPER);
    public static final SlabInfo WEATHERED_COPPER_SLAB = registerCopperSlabBlock("weathered_copper_slab",
            Blocks.WEATHERED_COPPER);
    public static final SlabInfo OXIDIZED_COPPER_SLAB = registerCopperSlabBlock("oxidized_copper_slab",
            Blocks.OXIDIZED_COPPER);

    public static final SlabInfo WAXED_COPPER_SLAB = registerCopperSlabBlock("waxed_copper_slab",
            Blocks.WAXED_COPPER_BLOCK);
    public static final SlabInfo WAXED_EXPOSED_COPPER_SLAB = registerCopperSlabBlock("waxed_exposed_copper_slab",
            Blocks.WAXED_EXPOSED_COPPER);
    public static final SlabInfo WAXED_WEATHERED_COPPER_SLAB = registerCopperSlabBlock("waxed_weathered_copper_slab",
            Blocks.WAXED_WEATHERED_COPPER);
    public static final SlabInfo WAXED_OXIDIZED_COPPER_SLAB = registerCopperSlabBlock("waxed_oxidized_copper_slab",
            Blocks.WAXED_OXIDIZED_COPPER);

    public static final Map<String, SlabInfo> REGISTERED_COPPER_SLABS = Map.ofEntries(
            Map.entry("copper_block", COPPER_SLAB), Map.entry("exposed_copper", EXPOSED_COPPER_SLAB),
            Map.entry("weathered_copper", WEATHERED_COPPER_SLAB), Map.entry("oxidized_copper", OXIDIZED_COPPER_SLAB),
            Map.entry("waxed_copper_block", WAXED_COPPER_SLAB),
            Map.entry("waxed_exposed_copper", WAXED_EXPOSED_COPPER_SLAB),
            Map.entry("waxed_weathered_copper", WAXED_WEATHERED_COPPER_SLAB),
            Map.entry("waxed_oxidized_copper", WAXED_OXIDIZED_COPPER_SLAB)
    );

    public static final DeferredBlock<CarpetBlock> HAY_CARPET = registerCarpet("hay_carpet", Blocks.HAY_BLOCK);

    private static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleBlockItem(key, register);
        return register;
    }

    private static <T extends Block> DeferredBlock<T> registerDevBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleDevBlockItem(key, register);
        return register;
    }

    private static SlabInfo registerSlabBlock(String id, Block baseBlock) {
        DeferredBlock<SlabBlock> slab = registerBlock(id, () -> {
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id));

            if (baseBlock == Blocks.ICE || baseBlock == Blocks.PACKED_ICE || baseBlock == Blocks.BLUE_ICE) {
                return new IceSlabBlock(properties.friction(0.98f));
            }

            if (baseBlock == Blocks.MAGMA_BLOCK) {
                return new MagmaSlabBlock(properties);
            }

            return new SlabBlock(properties);
        });

        return new SlabInfo(slab, baseBlock);
    }

    private static WallInfo registerWallBlock(String id, Block baseBlock) {
        DeferredBlock<?> wall = registerBlock(id, () -> new net.minecraft.world.level.block.WallBlock(
                BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id))));
        return new WallInfo(wall, baseBlock);
    }

    private static DeferredBlock<ButtonBlock> registerButtonBlock(String id, Block baseBlock) {
        return registerBlock(id, () -> new ButtonBlock(
                BlockSetType.STONE, 30,
                BlockBehaviour.Properties.ofFullCopy(baseBlock).noCollission().strength(0.5F).setId(blockId(id))
        ));
    }

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

    private static SlabInfo registerCopperSlabBlock(String id, Block baseBlock) {
        DeferredBlock<SlabBlock> slab = registerBlock(id, () -> {
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id));

            return new CopperSlabBlock(properties);
        });

        return new SlabInfo(slab, baseBlock);
    }

    public static class MagmaSlabBlock extends SlabBlock {

        public MagmaSlabBlock(Properties properties) {
            super(properties.lightLevel(state -> 3));
        }

        @Override
        public void stepOn(Level level, BlockPos pos, BlockState state, net.minecraft.world.entity.Entity entity) {
            if (entity instanceof LivingEntity living) {
                boolean inWater = level.getFluidState(pos.above()).is(net.minecraft.tags.FluidTags.WATER);

                if (!living.isCrouching() && !living.hasEffect(MobEffects.FIRE_RESISTANCE)
                        && (level.getBlockState(pos.above()).isAir() || inWater)) {
                    living.hurt(level.damageSources().hotFloor(), 1.0F);
                }
            }

            super.stepOn(level, pos, state, entity);
        }
//needs bubble colums
    }

    public static class IceSlabBlock extends SlabBlock {
        public IceSlabBlock(Properties properties) {
            super(properties);
        }

        @Override
        public float getFriction() {
            return 0.98f;
        }
    }

    public static class CopperSlabBlock extends SlabBlock {
        public CopperSlabBlock(BlockBehaviour.Properties properties) {
            super(properties);
        }

        // need to add oxifying and such
    }

    private static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }
}