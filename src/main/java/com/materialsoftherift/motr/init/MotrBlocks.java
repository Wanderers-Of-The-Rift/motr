package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CarpetBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class MotrBlocks {

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


    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }
}