package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.init.MotrBlocks;
import com.materialsoftherift.motr.init.MotrNoGrav;
import com.materialsoftherift.motr.init.MotrSlabs;
import com.materialsoftherift.motr.init.MotrWalls;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

/* Handles Data Generation for Recipes of the Wotr mod */
public class MotrRecipeProvider extends RecipeProvider {

    // Construct the provider to run
    protected MotrRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
        super(provider, output);
    }

    @Override
    protected void buildRecipes() {
        HolderGetter<Item> getter = this.registries.lookupOrThrow(Registries.ITEM);

        MotrNoGrav.REGISTERED_NOGRAV_BLOCKS.forEach((id, noGravInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, noGravInfo.block().get(), 8)
                    .pattern("GGG")
                    .pattern("GHG")
                    .pattern("GGG")
                    .define('G', noGravInfo.getBaseItem())
                    .define('H', Items.CHORUS_FRUIT)
                    .unlockedBy("has_" + id, this.has(noGravInfo.getBaseItem()))
                    .unlockedBy("has_chorus_fruit", this.has(Items.CHORUS_FRUIT))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_QUENCHED_BLOCKS.forEach((id, blockInfo) -> {
            ItemLike quenchedBlock = blockInfo.block().get();
            ItemLike vanillaBlock = blockInfo.getBaseItem();
            if (vanillaBlock == Items.AIR) {
                return;
            }

            ShapelessRecipeBuilder.shapeless(getter, RecipeCategory.BUILDING_BLOCKS, quenchedBlock, 1)
                    .requires(vanillaBlock)
                    .requires(Items.PRISMARINE_CRYSTALS)
                    .unlockedBy("has_" + id, has(vanillaBlock))
                    .save(this.output, "quenched_" + id + "_from_prismarine_crystals");

            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, quenchedBlock, 8)
                    .pattern("###")
                    .pattern("#W#")
                    .pattern("###")
                    .define('#', vanillaBlock)
                    .define('W', Items.WET_SPONGE)
                    .unlockedBy("has_" + id, has(vanillaBlock))
                    .save(this.output, "quenched_" + id + "_from_wet_sponge");

            ShapelessRecipeBuilder.shapeless(getter, RecipeCategory.BUILDING_BLOCKS, vanillaBlock, 1)
                    .requires(quenchedBlock)
                    .unlockedBy("has_" + id, has(vanillaBlock))
                    .save(this.output, id + "_from_quenched");
        });

        MotrSlabs.REGISTERED_STANDARD_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrSlabs.REGISTERED_GLASS_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrSlabs.REGISTERED_DIRECTIONAL_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrSlabs.REGISTERED_TRIMM_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrSlabs.REGISTERED_SILKTOUCH_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrSlabs.REGISTERED_COPPER_SLABS.forEach((id, slabInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, slabInfo.slab().get(), 6)
                    .pattern("###")
                    .define('#', slabInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(slabInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrWalls.REGISTERED_STANDARD_WALLS.forEach((id, wallInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, wallInfo.wall().get(), 6)
                    .pattern("###")
                    .pattern("###")
                    .define('#', wallInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(wallInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrWalls.REGISTERED_GLASS_WALLS.forEach((id, wallInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, wallInfo.wall().get(), 6)
                    .pattern("###")
                    .pattern("###")
                    .define('#', wallInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(wallInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_FENCES.forEach((id, fenceInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, fenceInfo.fence().get(), 3)
                    .pattern("#S#")
                    .pattern("#S#")
                    .define('#', fenceInfo.getBaseItem())
                    .define('S', Items.STICK)
                    .unlockedBy("has_" + id, has(fenceInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_BUTTONS.forEach((id, buttonInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, buttonInfo.button().get(), 1)
                    .pattern("#")
                    .define('#', buttonInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(buttonInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_FENCE_GATES.forEach((id, fenceGateInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, fenceGateInfo.fenceGate().get(), 3)
                    .pattern("S#S")
                    .pattern("S#S")
                    .define('#', fenceGateInfo.getBaseItem())
                    .define('S', Items.STICK)
                    .unlockedBy("has_" + id, has(fenceGateInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrBlocks.REGISTERED_STANDARD_STAIRS.forEach((id, stairInfo) -> {
            ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, stairInfo.stair().get(), 4)
                    .pattern("#  ")
                    .pattern("## ")
                    .pattern("###")
                    .define('#', stairInfo.getBaseItem())
                    .unlockedBy("has_" + id, has(stairInfo.getBaseItem()))
                    .save(this.output);
        });

        MotrSlabs.REGISTERED_WAXED_COPPER_SLABS.forEach((id, waxedSlabInfo) -> {
            String nonWaxedId = id.replace("waxed_", "");
            MotrSlabs.SlabInfo nonWaxedSlabInfo = MotrSlabs.REGISTERED_COPPER_SLABS.get(nonWaxedId);

            if (nonWaxedSlabInfo != null) {
                ShapelessRecipeBuilder.shapeless(getter, RecipeCategory.BUILDING_BLOCKS, waxedSlabInfo.slab().get())
                        .requires(nonWaxedSlabInfo.slab().get())
                        .requires(Items.HONEYCOMB)
                        .unlockedBy("has_" + nonWaxedId, has(nonWaxedSlabInfo.slab().get()))
                        .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
                        .save(this.output, id + "_from_honeycomb");
            }
        });

        ShapedRecipeBuilder.shaped(getter, RecipeCategory.BUILDING_BLOCKS, MotrBlocks.HAY_CARPET.get(), 4)
                .pattern("GG")
                .define('G', Items.HAY_BLOCK)
                .unlockedBy("has_hay_block", this.has(Items.HAY_BLOCK))
                .save(this.output);

    }

    // The runner to add to the data generator
    public static class Runner extends RecipeProvider.Runner {
        // Get the parameters from the `GatherDataEvent`s.
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected @NotNull RecipeProvider createRecipeProvider(
                HolderLookup.@NotNull Provider provider,
                @NotNull RecipeOutput output) {
            return new MotrRecipeProvider(provider, output);
        }

        @Override
        public @NotNull String getName() {
            return "Materials of the Rift's Recipes";
        }
    }
}
