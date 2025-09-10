package com.materialsoftherift.motr.init;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BambooStalkBlock;
import net.minecraft.world.level.block.BeetrootBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CactusBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FungusBlock;
import net.minecraft.world.level.block.GlowLichenBlock;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.PointedDripstoneBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.WitherRoseBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.function.Supplier;

public class MotrUnbound {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public record UnboundBlockInfo(DeferredBlock<Block> block, Block baseBlock) {
        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

    private static final class UnboundCommon {
        static boolean canSurvive() {
            return true;
        }

        static boolean mayPlaceOn() {
            return true;
        }

        static void tick() {
        }
    }

    public static class UnboundBambooBlock extends BambooStalkBlock {
        public UnboundBambooBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        public @Nullable BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
            return this.defaultBlockState();
        }
    }

    public static class UnboundBeetrootBlock extends BeetrootBlock {
        public UnboundBeetrootBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundCactusBlock extends CactusBlock {
        public UnboundCactusBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }
    }

    public static class UnboundCropBlock extends CropBlock {
        public UnboundCropBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundDoublePlantBlock extends DoublePlantBlock {
        public UnboundDoublePlantBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundFlowerBlock extends FlowerBlock {
        public UnboundFlowerBlock(Holder<MobEffect> effect, float seconds, Properties properties) {
            super(effect, seconds, properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundFungusBlock extends FungusBlock {
        public UnboundFungusBlock(ResourceKey<ConfiguredFeature<?, ?>> feature, Block block, BlockBehaviour.Properties properties) {
            super(feature, block, properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        public boolean isValidBonemealTarget(@NotNull LevelReader level, @NotNull BlockPos pos, @NotNull BlockState state) {
            return true;
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundGlowLichenBlock extends GlowLichenBlock {
        public UnboundGlowLichenBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }
    }

    public static class UnboundMushroomBlock extends MushroomBlock {
        public UnboundMushroomBlock(ResourceKey<ConfiguredFeature<?, ?>> feature, BlockBehaviour.Properties properties) {
            super(feature, properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundNetherWartBlock extends NetherWartBlock {
        public UnboundNetherWartBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundPointedDripstoneBlock extends PointedDripstoneBlock {
        public UnboundPointedDripstoneBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        public @Nullable BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
            return this.defaultBlockState();
        }
    }

    public static class UnboundSaplingBlock extends SaplingBlock {
        public UnboundSaplingBlock(TreeGrower grower, Properties properties) {
            super(grower, properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundSweetBerryBushBlock extends SweetBerryBushBlock {
        public UnboundSweetBerryBushBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundTallFlowerBlock extends TallFlowerBlock {
        public UnboundTallFlowerBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundTallGrassBlock extends TallGrassBlock {
        public UnboundTallGrassBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    public static class UnboundWitherRoseBlock extends WitherRoseBlock {
        public UnboundWitherRoseBlock(Holder<MobEffect> effect, float seconds, Properties properties) {
            super(effect, seconds, properties);
        }

        @Override
        protected void tick(@NotNull BlockState state, @NotNull ServerLevel level, @NotNull BlockPos pos, @NotNull RandomSource source) {
            UnboundCommon.tick();
        }

        @Override
        protected boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
            return UnboundCommon.canSurvive();
        }

        @Override
        protected boolean mayPlaceOn(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
            return UnboundCommon.mayPlaceOn();
        }
    }

    // Block registrations
    public static final UnboundBlockInfo UNBOUND_BAMBOO = registerUnboundBlock("unbound_bamboo",
            Blocks.BAMBOO, () -> new UnboundBambooBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO).setId(blockId("unbound_bamboo"))));

    public static final UnboundBlockInfo UNBOUND_BEETROOTS = registerUnboundBlock("unbound_beetroots",
            Blocks.BEETROOTS, () -> new UnboundBeetrootBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BEETROOTS).setId(blockId("unbound_beetroots"))));

    public static final UnboundBlockInfo UNBOUND_CACTUS = registerUnboundBlock("unbound_cactus",
            Blocks.CACTUS, () -> new UnboundCactusBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CACTUS).setId(blockId("unbound_cactus"))));

    public static final UnboundBlockInfo UNBOUND_CARROTS = registerUnboundBlock("unbound_carrots",
            Blocks.CARROTS, () -> new UnboundCropBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CARROTS).setId(blockId("unbound_carrots"))));

    public static final UnboundBlockInfo UNBOUND_POTATOES = registerUnboundBlock("unbound_potatoes",
            Blocks.POTATOES, () -> new UnboundCropBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTATOES).setId(blockId("unbound_potatoes"))));

    public static final UnboundBlockInfo UNBOUND_WHEAT = registerUnboundBlock("unbound_wheat",
            Blocks.WHEAT, () -> new UnboundCropBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT).setId(blockId("unbound_wheat"))));

    public static final UnboundBlockInfo UNBOUND_SUNFLOWER = registerUnboundBlock("unbound_sunflower",
            Blocks.SUNFLOWER, () -> new UnboundDoublePlantBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SUNFLOWER).setId(blockId("unbound_sunflower"))));

    public static final UnboundBlockInfo UNBOUND_LILAC = registerUnboundBlock("unbound_lilac",
            Blocks.LILAC, () -> new UnboundDoublePlantBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LILAC).setId(blockId("unbound_lilac"))));

    public static final UnboundBlockInfo UNBOUND_ROSE_BUSH = registerUnboundBlock("unbound_rose_bush",
            Blocks.ROSE_BUSH, () -> new UnboundDoublePlantBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH).setId(blockId("unbound_rose_bush"))));

    public static final UnboundBlockInfo UNBOUND_PEONY = registerUnboundBlock("unbound_peony",
            Blocks.PEONY, () -> new UnboundDoublePlantBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PEONY).setId(blockId("unbound_peony"))));

    public static final UnboundBlockInfo UNBOUND_TALL_GRASS = registerUnboundBlock("unbound_tall_grass",
            Blocks.TALL_GRASS, () -> new UnboundDoublePlantBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.TALL_GRASS).setId(blockId("unbound_tall_grass"))));

    public static final UnboundBlockInfo UNBOUND_LARGE_FERN = registerUnboundBlock("unbound_large_fern",
            Blocks.LARGE_FERN, () -> new UnboundDoublePlantBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LARGE_FERN).setId(blockId("unbound_large_fern"))));

    public static final UnboundBlockInfo UNBOUND_DANDELION = registerUnboundBlock("unbound_dandelion",
            Blocks.DANDELION, () -> new UnboundFlowerBlock(MobEffects.SATURATION, 7.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DANDELION).setId(blockId("unbound_dandelion"))));

    public static final UnboundBlockInfo UNBOUND_POPPY = registerUnboundBlock("unbound_poppy",
            Blocks.POPPY, () -> new UnboundFlowerBlock(MobEffects.NIGHT_VISION, 5.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).setId(blockId("unbound_poppy"))));

    public static final UnboundBlockInfo UNBOUND_BLUE_ORCHID = registerUnboundBlock("unbound_blue_orchid",
            Blocks.BLUE_ORCHID, () -> new UnboundFlowerBlock(MobEffects.SATURATION, 7.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_ORCHID).setId(blockId("unbound_blue_orchid"))));

    public static final UnboundBlockInfo UNBOUND_ALLIUM = registerUnboundBlock("unbound_allium",
            Blocks.ALLIUM, () -> new UnboundFlowerBlock(MobEffects.FIRE_RESISTANCE, 4.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM).setId(blockId("unbound_allium"))));

    public static final UnboundBlockInfo UNBOUND_AZURE_BLUET = registerUnboundBlock("unbound_azure_bluet",
            Blocks.AZURE_BLUET, () -> new UnboundFlowerBlock(MobEffects.BLINDNESS, 8.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.AZURE_BLUET).setId(blockId("unbound_azure_bluet"))));

    public static final UnboundBlockInfo UNBOUND_RED_TULIP = registerUnboundBlock("unbound_red_tulip",
            Blocks.RED_TULIP, () -> new UnboundFlowerBlock(MobEffects.WEAKNESS, 9.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TULIP).setId(blockId("unbound_red_tulip"))));

    public static final UnboundBlockInfo UNBOUND_ORANGE_TULIP = registerUnboundBlock("unbound_orange_tulip",
            Blocks.ORANGE_TULIP, () -> new UnboundFlowerBlock(MobEffects.WEAKNESS, 9.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TULIP).setId(blockId("unbound_orange_tulip"))));

    public static final UnboundBlockInfo UNBOUND_WHITE_TULIP = registerUnboundBlock("unbound_white_tulip",
            Blocks.WHITE_TULIP, () -> new UnboundFlowerBlock(MobEffects.WEAKNESS, 9.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TULIP).setId(blockId("unbound_white_tulip"))));

    public static final UnboundBlockInfo UNBOUND_PINK_TULIP = registerUnboundBlock("unbound_pink_tulip",
            Blocks.PINK_TULIP, () -> new UnboundFlowerBlock(MobEffects.WEAKNESS, 9.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TULIP).setId(blockId("unbound_pink_tulip"))));

    public static final UnboundBlockInfo UNBOUND_OXEYE_DAISY = registerUnboundBlock("unbound_oxeye_daisy",
            Blocks.OXEYE_DAISY, () -> new UnboundFlowerBlock(MobEffects.REGENERATION, 8.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OXEYE_DAISY).setId(blockId("unbound_oxeye_daisy"))));

    public static final UnboundBlockInfo UNBOUND_CORNFLOWER = registerUnboundBlock("unbound_cornflower",
            Blocks.CORNFLOWER, () -> new UnboundFlowerBlock(MobEffects.JUMP, 6.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CORNFLOWER).setId(blockId("unbound_cornflower"))));

    public static final UnboundBlockInfo UNBOUND_LILY_OF_THE_VALLEY = registerUnboundBlock("unbound_lily_of_the_valley",
            Blocks.LILY_OF_THE_VALLEY, () -> new UnboundFlowerBlock(MobEffects.POISON, 12.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.LILY_OF_THE_VALLEY).setId(blockId("unbound_lily_of_the_valley"))));

    public static final UnboundBlockInfo UNBOUND_WITHER_ROSE = registerUnboundBlock("unbound_wither_rose",
            Blocks.WITHER_ROSE, () -> new UnboundWitherRoseBlock(MobEffects.WITHER, 8.0F,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WITHER_ROSE).setId(blockId("unbound_wither_rose"))));

    public static final UnboundBlockInfo UNBOUND_GLOW_LICHEN = registerUnboundBlock("unbound_glow_lichen",
            Blocks.GLOW_LICHEN, () -> new UnboundGlowLichenBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).setId(blockId("unbound_glow_lichen"))));

    public static final UnboundBlockInfo UNBOUND_BROWN_MUSHROOM = registerUnboundBlock("unbound_brown_mushroom",
            Blocks.BROWN_MUSHROOM, () -> new UnboundMushroomBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_MUSHROOM).setId(blockId("unbound_brown_mushroom"))));

    public static final UnboundBlockInfo UNBOUND_RED_MUSHROOM = registerUnboundBlock("unbound_red_mushroom",
            Blocks.RED_MUSHROOM, () -> new UnboundMushroomBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.RED_MUSHROOM).setId(blockId("unbound_red_mushroom"))));

    public static final UnboundBlockInfo UNBOUND_NETHER_WART = registerUnboundBlock("unbound_nether_wart",
            Blocks.NETHER_WART, () -> new UnboundNetherWartBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_WART).setId(blockId("unbound_nether_wart"))));

    public static final UnboundBlockInfo UNBOUND_POINTED_DRIPSTONE = registerUnboundBlock("unbound_pointed_dripstone",
            Blocks.POINTED_DRIPSTONE, () -> new UnboundPointedDripstoneBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POINTED_DRIPSTONE).setId(blockId("unbound_pointed_dripstone"))));

    public static final UnboundBlockInfo UNBOUND_SWEET_BERRY_BUSH = registerUnboundBlock("unbound_sweet_berry_bush",
            Blocks.SWEET_BERRY_BUSH, () -> new UnboundSweetBerryBushBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH).setId(blockId("unbound_sweet_berry_bush"))));

    public static final UnboundBlockInfo UNBOUND_CRIMSON_FUNGUS = registerUnboundBlock("unbound_crimson_fungus",
            Blocks.CRIMSON_FUNGUS, () -> new UnboundFungusBlock(null, Blocks.CRIMSON_NYLIUM,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS).setId(blockId("unbound_crimson_fungus"))));

    public static final UnboundBlockInfo UNBOUND_WARPED_FUNGUS = registerUnboundBlock("unbound_warped_fungus",
            Blocks.WARPED_FUNGUS, () -> new UnboundFungusBlock(null, Blocks.WARPED_NYLIUM,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS).setId(blockId("unbound_warped_fungus"))));

    // Saplings (using null for TreeGrower as they won't grow)
    public static final UnboundBlockInfo UNBOUND_OAK_SAPLING = registerUnboundBlock("unbound_oak_sapling",
            Blocks.OAK_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING).setId(blockId("unbound_oak_sapling"))));

    public static final UnboundBlockInfo UNBOUND_SPRUCE_SAPLING = registerUnboundBlock("unbound_spruce_sapling",
            Blocks.SPRUCE_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_SAPLING).setId(blockId("unbound_spruce_sapling"))));

    public static final UnboundBlockInfo UNBOUND_BIRCH_SAPLING = registerUnboundBlock("unbound_birch_sapling",
            Blocks.BIRCH_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_SAPLING).setId(blockId("unbound_birch_sapling"))));

    public static final UnboundBlockInfo UNBOUND_JUNGLE_SAPLING = registerUnboundBlock("unbound_jungle_sapling",
            Blocks.JUNGLE_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_SAPLING).setId(blockId("unbound_jungle_sapling"))));

    public static final UnboundBlockInfo UNBOUND_ACACIA_SAPLING = registerUnboundBlock("unbound_acacia_sapling",
            Blocks.ACACIA_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SAPLING).setId(blockId("unbound_acacia_sapling"))));

    public static final UnboundBlockInfo UNBOUND_DARK_OAK_SAPLING = registerUnboundBlock("unbound_dark_oak_sapling",
            Blocks.DARK_OAK_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_SAPLING).setId(blockId("unbound_dark_oak_sapling"))));

    public static final UnboundBlockInfo UNBOUND_MANGROVE_PROPAGULE = registerUnboundBlock("unbound_mangrove_propagule",
            Blocks.MANGROVE_PROPAGULE, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PROPAGULE).setId(blockId("unbound_mangrove_propagule"))));

    public static final UnboundBlockInfo UNBOUND_CHERRY_SAPLING = registerUnboundBlock("unbound_cherry_sapling",
            Blocks.CHERRY_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING).setId(blockId("unbound_cherry_sapling"))));

    public static final UnboundBlockInfo UNBOUND_PALE_OAK_SAPLING = registerUnboundBlock("unbound_pale_oak_sapling",
            Blocks.PALE_OAK_SAPLING, () -> new UnboundSaplingBlock(null,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_SAPLING).setId(blockId("unbound_pale_oak_sapling"))));

    // Registry map for all unbound blocks
    public static final Map<String, UnboundBlockInfo> REGISTERED_UNBOUND_BLOCKS = Map.ofEntries(
            Map.entry("bamboo", UNBOUND_BAMBOO),
            Map.entry("beetroots", UNBOUND_BEETROOTS),
            Map.entry("cactus", UNBOUND_CACTUS),
            Map.entry("carrots", UNBOUND_CARROTS),
            Map.entry("potatoes", UNBOUND_POTATOES),
            Map.entry("wheat", UNBOUND_WHEAT),
            Map.entry("sunflower", UNBOUND_SUNFLOWER),
            Map.entry("lilac", UNBOUND_LILAC),
            Map.entry("rose_bush", UNBOUND_ROSE_BUSH),
            Map.entry("peony", UNBOUND_PEONY),
            Map.entry("tall_grass", UNBOUND_TALL_GRASS),
            Map.entry("large_fern", UNBOUND_LARGE_FERN),
            Map.entry("dandelion", UNBOUND_DANDELION),
            Map.entry("poppy", UNBOUND_POPPY),
            Map.entry("blue_orchid", UNBOUND_BLUE_ORCHID),
            Map.entry("allium", UNBOUND_ALLIUM),
            Map.entry("azure_bluet", UNBOUND_AZURE_BLUET),
            Map.entry("red_tulip", UNBOUND_RED_TULIP),
            Map.entry("orange_tulip", UNBOUND_ORANGE_TULIP),
            Map.entry("white_tulip", UNBOUND_WHITE_TULIP),
            Map.entry("pink_tulip", UNBOUND_PINK_TULIP),
            Map.entry("oxeye_daisy", UNBOUND_OXEYE_DAISY),
            Map.entry("cornflower", UNBOUND_CORNFLOWER),
            Map.entry("lily_of_the_valley", UNBOUND_LILY_OF_THE_VALLEY),
            Map.entry("wither_rose", UNBOUND_WITHER_ROSE),
            Map.entry("glow_lichen", UNBOUND_GLOW_LICHEN),
            Map.entry("brown_mushroom", UNBOUND_BROWN_MUSHROOM),
            Map.entry("red_mushroom", UNBOUND_RED_MUSHROOM),
            Map.entry("nether_wart", UNBOUND_NETHER_WART),
            Map.entry("pointed_dripstone", UNBOUND_POINTED_DRIPSTONE),
            Map.entry("sweet_berry_bush", UNBOUND_SWEET_BERRY_BUSH),
            Map.entry("crimson_fungus", UNBOUND_CRIMSON_FUNGUS),
            Map.entry("warped_fungus", UNBOUND_WARPED_FUNGUS),
            Map.entry("oak_sapling", UNBOUND_OAK_SAPLING),
            Map.entry("spruce_sapling", UNBOUND_SPRUCE_SAPLING),
            Map.entry("birch_sapling", UNBOUND_BIRCH_SAPLING),
            Map.entry("jungle_sapling", UNBOUND_JUNGLE_SAPLING),
            Map.entry("acacia_sapling", UNBOUND_ACACIA_SAPLING),
            Map.entry("dark_oak_sapling", UNBOUND_DARK_OAK_SAPLING),
            Map.entry("mangrove_propagule", UNBOUND_MANGROVE_PROPAGULE),
            Map.entry("cherry_sapling", UNBOUND_CHERRY_SAPLING),
            Map.entry("pale_oak_sapling", UNBOUND_PALE_OAK_SAPLING)
    );

    private static UnboundBlockInfo registerUnboundBlock(
            String id,
            Block baseBlock,
            Supplier<Block> blockSupplier) {

        DeferredBlock<Block> block = BLOCKS.register(id, blockSupplier);
        MotrItems.registerUnboundBlockItem(id, block);
        return new UnboundBlockInfo(block, baseBlock);
    }

    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }
}