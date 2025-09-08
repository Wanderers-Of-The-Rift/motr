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
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class MotrSlabs {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MaterialsOfTheRift.MODID);

    public static <T extends Block> DeferredBlock<T> registerBlock(String key, Supplier<T> sup) {
        DeferredBlock<T> register = BLOCKS.register(key, sup);
        MotrItems.registerSimpleBlockItem(key, register);
        return register;
    }

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

        public Item getBaseItem() {
            return baseBlock.asItem();
        }
    }

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

    public static final SlabInfo DIRT_SLAB = registerSlabBlock("dirt_slab", Blocks.DIRT);
    public static final SlabInfo COARSE_DIRT_SLAB = registerSlabBlock("coarse_dirt_slab", Blocks.COARSE_DIRT);
    public static final SlabInfo ROOTED_DIRT_SLAB = registerSlabBlock("rooted_dirt_slab", Blocks.ROOTED_DIRT);
    public static final SlabInfo DIRT_PATH_SLAB = registerSlabBlock("dirt_path_slab", Blocks.DIRT_PATH);
    public static final SlabInfo PODZOL_SLAB = registerSlabBlock("podzol_slab", Blocks.PODZOL);
    public static final SlabInfo MYCELIUM_SLAB = registerSlabBlock("mycelium_slab", Blocks.MYCELIUM);
    public static final SlabInfo MUD_SLAB = registerSlabBlock("mud_slab", Blocks.MUD);
    public static final SlabInfo MUDDY_MANGROVE_ROOTS_SLAB = registerSlabBlock("muddy_mangrove_roots_slab",
            Blocks.MUDDY_MANGROVE_ROOTS);

    public static final SlabInfo SOUL_SAND_SLAB = registerSlabBlock("soul_sand_slab", Blocks.SOUL_SAND);
    public static final SlabInfo SOUL_SOIL_SLAB = registerSlabBlock("soul_soil_slab", Blocks.SOUL_SOIL);
    public static final SlabInfo NETHER_WART_BLOCK_SLAB = registerSlabBlock("nether_wart_block_slab",
            Blocks.NETHER_WART_BLOCK);
    public static final SlabInfo WARPED_WART_BLOCK_SLAB = registerSlabBlock("warped_wart_block_slab",
            Blocks.WARPED_WART_BLOCK);
    public static final SlabInfo MAGMA_SLAB = registerSlabBlock("magma_slab", Blocks.MAGMA_BLOCK);

    public static final SlabInfo MOSS_BLOCK_SLAB = registerSlabBlock("moss_block_slab", Blocks.MOSS_BLOCK);
    public static final SlabInfo PALE_MOSS_BLOCK_SLAB = registerSlabBlock("pale_moss_block_slab",
            Blocks.PALE_MOSS_BLOCK);

    public static final SlabInfo SNOW_SLAB = registerSlabBlock("snow_slab", Blocks.SNOW_BLOCK);
    public static final SlabInfo ICE_SLAB = registerSlabBlock("ice_slab", Blocks.ICE);
    public static final SlabInfo PACKED_ICE_SLAB = registerSlabBlock("packed_ice_slab", Blocks.PACKED_ICE);
    public static final SlabInfo BLUE_ICE_SLAB = registerSlabBlock("blue_ice_slab", Blocks.BLUE_ICE);

    public static final SlabInfo CLAY_SLAB = registerSlabBlock("clay_slab", Blocks.CLAY);
    public static final SlabInfo RESIN_BLOCK_SLAB = registerSlabBlock("resin_block_slab", Blocks.RESIN_BLOCK);
    public static final SlabInfo GILDED_BLACKSTONE_SLAB = registerSlabBlock("gilded_blackstone_slab",
            Blocks.GILDED_BLACKSTONE);

    public static final SlabInfo RAW_IRON_BLOCK_SLAB = registerSlabBlock("raw_iron_block_slab", Blocks.RAW_IRON_BLOCK);
    public static final SlabInfo RAW_GOLD_BLOCK_SLAB = registerSlabBlock("raw_gold_block_slab", Blocks.RAW_GOLD_BLOCK);
    public static final SlabInfo GOLD_BLOCK_SLAB = registerSlabBlock("gold_block_slab", Blocks.GOLD_BLOCK);
    public static final SlabInfo IRON_BLOCK_SLAB = registerSlabBlock("iron_block_slab", Blocks.IRON_BLOCK);

    public static final SlabInfo BONE_BLOCK_SLAB = registerSlabBlock("bone_block_slab", Blocks.BONE_BLOCK);

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
    public static final SlabInfo COPPER_BULB_SLAB = registerCopperSlabBlock("copper_bulb_slab", Blocks.COPPER_BULB);
    public static final SlabInfo EXPOSED_COPPER_BULB_SLAB = registerCopperSlabBlock("exposed_copper_bulb_slab",
            Blocks.EXPOSED_COPPER_BULB);
    public static final SlabInfo WEATHERED_COPPER_BULB_SLAB = registerCopperSlabBlock("weathered_copper_bulb_slab",
            Blocks.WEATHERED_COPPER_BULB);
    public static final SlabInfo OXIDIZED_COPPER_BULB_SLAB = registerCopperSlabBlock("oxidized_copper_bulb_slab",
            Blocks.OXIDIZED_COPPER_BULB);
    public static final SlabInfo WAXED_COPPER_BULB_SLAB = registerCopperSlabBlock("waxed_copper_bulb_slab",
            Blocks.WAXED_COPPER_BULB);
    public static final SlabInfo WAXED_EXPOSED_COPPER_BULB_SLAB = registerCopperSlabBlock(
            "waxed_exposed_copper_bulb_slab", Blocks.WAXED_EXPOSED_COPPER_BULB);
    public static final SlabInfo WAXED_WEATHERED_COPPER_BULB_SLAB = registerCopperSlabBlock(
            "waxed_weathered_copper_bulb_slab", Blocks.WAXED_WEATHERED_COPPER_BULB);
    public static final SlabInfo WAXED_OXIDIZED_COPPER_BULB_SLAB = registerCopperSlabBlock(
            "waxed_oxidized_copper_bulb_slab", Blocks.WAXED_OXIDIZED_COPPER_BULB);

    public static final Map<String, SlabInfo> REGISTERED_COPPER_SLABS = Map.ofEntries(
            Map.entry("copper_block", COPPER_SLAB), Map.entry("exposed_copper", EXPOSED_COPPER_SLAB),
            Map.entry("weathered_copper", WEATHERED_COPPER_SLAB), Map.entry("oxidized_copper", OXIDIZED_COPPER_SLAB),
            Map.entry("waxed_copper_block", WAXED_COPPER_SLAB),
            Map.entry("waxed_exposed_copper", WAXED_EXPOSED_COPPER_SLAB),
            Map.entry("waxed_weathered_copper", WAXED_WEATHERED_COPPER_SLAB),
            Map.entry("waxed_oxidized_copper", WAXED_OXIDIZED_COPPER_SLAB), Map.entry("copper_bulb", COPPER_BULB_SLAB),
            Map.entry("exposed_copper_bulb", EXPOSED_COPPER_BULB_SLAB),
            Map.entry("weathered_copper_bulb", WEATHERED_COPPER_BULB_SLAB),
            Map.entry("oxidized_copper_bulb", OXIDIZED_COPPER_BULB_SLAB),
            Map.entry("waxed_copper_bulb", WAXED_COPPER_BULB_SLAB),
            Map.entry("waxed_exposed_copper_bulb", WAXED_EXPOSED_COPPER_BULB_SLAB),
            Map.entry("waxed_weathered_copper_bulb", WAXED_WEATHERED_COPPER_BULB_SLAB),
            Map.entry("waxed_oxidized_copper_bulb", WAXED_OXIDIZED_COPPER_BULB_SLAB)
    );

    // Used only for getting a second recipe for waxed versions.
    public static final Map<String, SlabInfo> REGISTERED_WAXED_COPPER_SLABS = Map.ofEntries(
            Map.entry("waxed_copper_block", WAXED_COPPER_SLAB),
            Map.entry("waxed_exposed_copper", WAXED_EXPOSED_COPPER_SLAB),
            Map.entry("waxed_weathered_copper", WAXED_WEATHERED_COPPER_SLAB),
            Map.entry("waxed_oxidized_copper", WAXED_OXIDIZED_COPPER_SLAB),
            Map.entry("waxed_copper_bulb", WAXED_COPPER_BULB_SLAB),
            Map.entry("waxed_exposed_copper_bulb", WAXED_EXPOSED_COPPER_BULB_SLAB),
            Map.entry("waxed_weathered_copper_bulb", WAXED_WEATHERED_COPPER_BULB_SLAB),
            Map.entry("waxed_oxidized_copper_bulb", WAXED_OXIDIZED_COPPER_BULB_SLAB)
    );

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
            Map.entry("snow", SNOW_SLAB), Map.entry("tube_coral_block", TUBE_CORAL_BLOCK_SLAB),
            Map.entry("brain_coral_block", BRAIN_CORAL_BLOCK_SLAB),
            Map.entry("bubble_coral_block", BUBBLE_CORAL_BLOCK_SLAB),
            Map.entry("fire_coral_block", FIRE_CORAL_BLOCK_SLAB), Map.entry("horn_coral_block", HORN_CORAL_BLOCK_SLAB)
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

    private static SlabInfo registerSlabBlock(String id, Block baseBlock) {
        DeferredBlock<SlabBlock> slab = registerBlock(id, () -> {
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id));

            if (baseBlock == Blocks.ICE || baseBlock == Blocks.PACKED_ICE || baseBlock == Blocks.BLUE_ICE) {
                return new MotrSlabs.IceSlabBlock(properties.friction(0.98f));
            }

            if (baseBlock == Blocks.MAGMA_BLOCK) {
                return new MotrSlabs.MagmaSlabBlock(properties);
            }

            return new SlabBlock(properties);
        });

        return new SlabInfo(slab, baseBlock);
    }

    private static SlabInfo registerCopperSlabBlock(String id, Block baseBlock) {
        DeferredBlock<SlabBlock> slab = registerBlock(id, () -> {
            BlockBehaviour.Properties properties = BlockBehaviour.Properties.ofFullCopy(baseBlock).setId(blockId(id));
            WeatheringCopper.WeatherState weatherState = getWeatherStateFromBlock(baseBlock);

            if (id.contains("bulb")) {
                return new CopperBulbSlabBlock(weatherState,
                        properties.lightLevel(state -> state.getValue(CopperBulbSlabBlock.LIT) ? 15 : 0));
            }

            return new CopperSlabBlock(weatherState, properties);
        });

        return new SlabInfo(slab, baseBlock);
    }

    public static class CopperBulbSlabBlock extends CopperSlabBlock {
        public static final BooleanProperty LIT = BlockStateProperties.LIT;
        public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

        public CopperBulbSlabBlock(WeatherState state, Properties properties) {
            super(state, properties);
            this.registerDefaultState(this.stateDefinition.any().setValue(LIT, false).setValue(POWERED, false));
        }

        @Override
        protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
            super.createBlockStateDefinition(builder);
            builder.add(LIT, POWERED);
        }

        @Override
        public void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
            super.onPlace(state, level, pos, oldState, movedByPiston);
            if (!level.isClientSide) {
                checkRedstoneSignal(state, level, pos);
            }
        }

        @Override
        public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
            if (!level.isClientSide) {
                checkRedstoneSignal(state, level, pos);
            }
        }

        private void checkRedstoneSignal(BlockState state, Level level, BlockPos pos) {
            boolean receivingPower = level.hasNeighborSignal(pos);
            boolean wasPowered = state.getValue(POWERED);

            if (receivingPower && !wasPowered) {
                boolean currentlyLit = state.getValue(LIT);
                level.setBlock(pos, state.setValue(LIT, !currentlyLit).setValue(POWERED, true), 3);
            } else if (!receivingPower && wasPowered) {
                level.setBlock(pos, state.setValue(POWERED, false), 3);
            }

            level.scheduleTick(pos, this, 1);
        }
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

    public static class CopperSlabBlock extends SlabBlock implements WeatheringCopper {
        private final WeatheringCopper.WeatherState weatherState;

        public CopperSlabBlock(WeatheringCopper.WeatherState weatherState, BlockBehaviour.Properties properties) {
            super(properties);
            this.weatherState = weatherState;
        }

        @Override
        public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
            this.changeOverTime(state, level, pos, random);
        }

        @Override
        public boolean isRandomlyTicking(BlockState state) {
            return WeatheringCopper.getNext(state.getBlock()).isPresent();
        }

        @Override
        public WeatherState getAge() {
            return this.weatherState;
        }

        @Override
        public Optional<BlockState> getNext(BlockState state) {
            return WeatheringCopper.getNext(state.getBlock()).map(block -> block.withPropertiesOf(state));
        }

        @Override
        protected InteractionResult useItemOn(
                ItemStack stack,
                BlockState state,
                Level level,
                BlockPos pos,
                Player player,
                InteractionHand hand,
                BlockHitResult hitResult) {
            if (stack.is(Items.HONEYCOMB)) {
                Optional<BlockState> waxed = getWaxedVersion(state);
                if (waxed.isPresent()) {
                    if (!level.isClientSide) {
                        level.setBlock(pos, waxed.get(), 11);
                        if (!player.getAbilities().instabuild) {
                            stack.shrink(1);
                        }
                        level.playSound(null, pos, SoundEvents.HONEYCOMB_WAX_ON, SoundSource.BLOCKS, 1.0F, 1.0F);
                    } else {
                        level.levelEvent(3003, pos, 0);
                    }
                    return InteractionResult.SUCCESS;
                }
            }

            if (stack.getItem() instanceof AxeItem) {
                Optional<BlockState> dewaxed = getDewaxedVersion(state);
                if (dewaxed.isPresent()) {
                    if (!level.isClientSide) {
                        level.setBlock(pos, dewaxed.get(), 11);
                        level.playSound(null, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                        stack.hurtAndBreak(1, player, player.getEquipmentSlotForItem(stack));
                    } else {
                        level.levelEvent(3004, pos, 0);
                    }
                    return InteractionResult.SUCCESS;
                }

                Optional<BlockState> scraped = WeatheringCopper.getPrevious(state.getBlock())
                        .map(block -> block.withPropertiesOf(state));
                if (scraped.isPresent()) {
                    if (!level.isClientSide) {
                        level.setBlock(pos, scraped.get(), 11);
                        level.playSound(null, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
                        stack.hurtAndBreak(1, player, player.getEquipmentSlotForItem(stack));
                    } else {
                        level.levelEvent(3005, pos, 0);
                    }
                    return InteractionResult.SUCCESS;
                }
            }

            return InteractionResult.PASS;
        }

        private Optional<BlockState> getWaxedVersion(BlockState state) {
            Block block = state.getBlock();

            if (block == COPPER_SLAB.slab().get()) {
                return Optional.of(WAXED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == EXPOSED_COPPER_SLAB.slab().get()) {
                return Optional.of(WAXED_EXPOSED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WEATHERED_COPPER_SLAB.slab().get()) {
                return Optional.of(WAXED_WEATHERED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == OXIDIZED_COPPER_SLAB.slab().get()) {
                return Optional.of(WAXED_OXIDIZED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            }

            else if (block == COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(WAXED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == EXPOSED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(WAXED_EXPOSED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WEATHERED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(WAXED_WEATHERED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == OXIDIZED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(WAXED_OXIDIZED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            }

            return Optional.empty();
        }

        private Optional<BlockState> getDewaxedVersion(BlockState state) {
            Block block = state.getBlock();

            if (block == WAXED_COPPER_SLAB.slab().get()) {
                return Optional.of(COPPER_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WAXED_EXPOSED_COPPER_SLAB.slab().get()) {
                return Optional.of(EXPOSED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WAXED_WEATHERED_COPPER_SLAB.slab().get()) {
                return Optional.of(WEATHERED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WAXED_OXIDIZED_COPPER_SLAB.slab().get()) {
                return Optional.of(OXIDIZED_COPPER_SLAB.slab().get().withPropertiesOf(state));
            }

            else if (block == WAXED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WAXED_EXPOSED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(EXPOSED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WAXED_WEATHERED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(WEATHERED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            } else if (block == WAXED_OXIDIZED_COPPER_BULB_SLAB.slab().get()) {
                return Optional.of(OXIDIZED_COPPER_BULB_SLAB.slab().get().withPropertiesOf(state));
            }

            return Optional.empty();
        }

    }

    private static WeatheringCopper.WeatherState getWeatherStateFromBlock(Block baseBlock) {
        if (baseBlock == Blocks.COPPER_BLOCK || baseBlock == Blocks.WAXED_COPPER_BLOCK) {
            return WeatheringCopper.WeatherState.UNAFFECTED;
        } else if (baseBlock == Blocks.EXPOSED_COPPER || baseBlock == Blocks.WAXED_EXPOSED_COPPER) {
            return WeatheringCopper.WeatherState.EXPOSED;
        } else if (baseBlock == Blocks.WEATHERED_COPPER || baseBlock == Blocks.WAXED_WEATHERED_COPPER) {
            return WeatheringCopper.WeatherState.WEATHERED;
        } else if (baseBlock == Blocks.OXIDIZED_COPPER || baseBlock == Blocks.WAXED_OXIDIZED_COPPER) {
            return WeatheringCopper.WeatherState.OXIDIZED;
        }

        else if (baseBlock == Blocks.COPPER_BULB || baseBlock == Blocks.WAXED_COPPER_BULB) {
            return WeatheringCopper.WeatherState.UNAFFECTED;
        } else if (baseBlock == Blocks.EXPOSED_COPPER_BULB || baseBlock == Blocks.WAXED_EXPOSED_COPPER_BULB) {
            return WeatheringCopper.WeatherState.EXPOSED;
        } else if (baseBlock == Blocks.WEATHERED_COPPER_BULB || baseBlock == Blocks.WAXED_WEATHERED_COPPER_BULB) {
            return WeatheringCopper.WeatherState.WEATHERED;
        } else if (baseBlock == Blocks.OXIDIZED_COPPER_BULB || baseBlock == Blocks.WAXED_OXIDIZED_COPPER_BULB) {
            return WeatheringCopper.WeatherState.OXIDIZED;
        }

        return WeatheringCopper.WeatherState.UNAFFECTED;
    }

    public static ResourceKey<Block> blockId(String name) {
        return ResourceKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath(MaterialsOfTheRift.MODID, name));
    }
}
