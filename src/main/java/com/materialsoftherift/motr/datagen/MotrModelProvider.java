package com.materialsoftherift.motr.datagen;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import com.materialsoftherift.motr.init.MotrBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.blockstates.Variant;
import net.minecraft.client.data.models.blockstates.VariantProperties;
import net.minecraft.client.data.models.model.ItemModelUtils;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.client.model.generators.template.ExtendedModelTemplateBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class MotrModelProvider extends ModelProvider {

    private static final Map<String, String> COPPER_TEXTURE_OVERRIDES = Map.ofEntries(
            Map.entry("waxed_copper_block", "copper_block"), Map.entry("waxed_exposed_copper", "exposed_copper"),
            Map.entry("waxed_weathered_copper", "weathered_copper"),
            Map.entry("waxed_oxidized_copper", "oxidized_copper")
    );

    public MotrModelProvider(PackOutput output) {
        super(output, MaterialsOfTheRift.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, @NotNull ItemModelGenerators itemModels) {

        blockModels.createTrivialBlock(MotrBlocks.HAY_CARPET.get(), TexturedModel.CARPET.updateTexture(
                mapping -> mapping.put(TextureSlot.WOOL, ResourceLocation.withDefaultNamespace("block/hay_block_top"))
        ));

        MotrBlocks.REGISTERED_STANDARD_SLABS.forEach((textureName, slabInfo) -> {
            registerStandardSlabModel(blockModels, slabInfo.slab().get(), textureName);
        });

        MotrBlocks.REGISTERED_GLASS_SLABS.forEach((textureId, slabInfo) -> {
            registerGlassSlabModel(blockModels, slabInfo.slab().get(), textureId);
        });

        MotrBlocks.REGISTERED_COPPER_SLABS.forEach((id, slabInfo) -> {
            String textureName = COPPER_TEXTURE_OVERRIDES.getOrDefault(id, id);
            registerTrimmSlabModel(blockModels, slabInfo.slab().get(), textureName, textureName, textureName);
        });

        MotrBlocks.REGISTERED_SILKTOUCH_SLABS.forEach((textureId, slabInfo) -> {
            registerGlassSlabModel(blockModels, slabInfo.slab().get(), textureId);
        });

        MotrBlocks.REGISTERED_TRIMM_SLABS.forEach((id, slabInfo) -> {
            registerTrimmSlabModel(blockModels, slabInfo.slab().get(), id, id, id);
        });

        MotrBlocks.REGISTERED_DIRECTIONAL_SLABS.forEach((id, slabInfo) -> {
            {
                String side = id;
                String top = id;
                String bottom = id;
                switch (id) {
                    case "bone_block" -> {
                        side = "bone_block_side";
                        top = "bone_block_top";
                        bottom = "bone_block_top";
                    }
                    case "muddy_mangrove_roots" -> {
                        side = "muddy_mangrove_roots_side";
                        top = "muddy_mangrove_roots_top";
                        bottom = "muddy_mangrove_roots_top";
                    }
                    case "podzol", "mycelium", "dirt_path" -> {
                        side = id + "_side";
                        top = id + "_top";
                        bottom = "dirt";
                    }
                }
                registerDirectionalSlabModel(blockModels, slabInfo.slab().get(), side, top, bottom);
            }
        });

        MotrBlocks.REGISTERED_STANDARD_WALLS.forEach((textureName, wallInfo) -> {
            registerWallModel(blockModels, wallInfo.wall().get(), textureName);

            ResourceLocation itemModel = ModelTemplates.WALL_INVENTORY.create(
                    wallInfo.wall().get(),
                    new TextureMapping().put(TextureSlot.WALL,
                            ResourceLocation.withDefaultNamespace("block/" + textureName)),
                    itemModels.modelOutput
            );

            itemModels.itemModelOutput.accept(
                    wallInfo.wall().get().asItem(), ItemModelUtils.plainModel(itemModel)
            );

        });

        MotrBlocks.REGISTERED_GLASS_WALLS.forEach((textureName, wallInfo) -> {
            Block wall = wallInfo.wall().get();

            registerGlassWallModel(blockModels, wall, textureName);

            // Create translucent wall inventory model
            ResourceLocation itemModel = ExtendedModelTemplateBuilder.builder()
                    .parent(ResourceLocation.withDefaultNamespace("block/wall_inventory"))
                    .suffix("_inventory")
                    .requiredTextureSlot(TextureSlot.WALL)
                    .renderType("translucent")
                    .build()
                    .create(wall,
                            new TextureMapping().put(TextureSlot.WALL,
                                    ResourceLocation.withDefaultNamespace("block/" + textureName)),
                            blockModels.modelOutput);

            itemModels.itemModelOutput.accept(
                    wall.asItem(), ItemModelUtils.plainModel(itemModel)
            );
        });

        MotrBlocks.REGISTERED_BUTTONS.forEach((textureName, buttonInfo) -> {
            registerButtonModel(blockModels, itemModels, buttonInfo.button().get(), textureName);
        });

        MotrBlocks.REGISTERED_FENCES.forEach((textureName, fenceInfo) -> {
            registerFenceModel(blockModels, itemModels, fenceInfo.fence().get(), textureName);
        });

        MotrBlocks.REGISTERED_FENCE_GATES.forEach((textureName, fenceGateInfo) -> {
            registerFenceGateModel(blockModels, itemModels, fenceGateInfo.fenceGate().get(), textureName);
        });

        MotrBlocks.REGISTERED_STANDARD_STAIRS.forEach((textureName, stairInfo) -> {
            registerStandardStairModel(blockModels, stairInfo.stair().get(), textureName);
        });
    }

    private void registerStandardSlabModel(BlockModelGenerators blockModels, Block slab, String textureName) {
        TextureMapping mapping = TextureMapping.cube(ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, blockModels.modelOutput);
        ResourceLocation top = ModelTemplates.SLAB_TOP.createWithSuffix(slab, "_top", mapping, blockModels.modelOutput);
        ResourceLocation cube = ModelTemplates.CUBE_ALL.createWithSuffix(slab, "_double", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerStandardStairModel(BlockModelGenerators blockModels, Block stair, String textureName) {
        TextureMapping mapping = TextureMapping.cube(ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation inner = ModelTemplates.STAIRS_INNER.create(stair, mapping, blockModels.modelOutput);
        ResourceLocation straight = ModelTemplates.STAIRS_STRAIGHT.create(stair, mapping, blockModels.modelOutput);
        ResourceLocation outer = ModelTemplates.STAIRS_OUTER.create(stair, mapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(BlockModelGenerators.createStairs(stair, inner, straight, outer));
    }

    private void registerDirectionalSlabModel(
            BlockModelGenerators blockModels,
            Block slab,
            String sideTex,
            String topTex,
            String bottomTex) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/" + sideTex))
                .put(TextureSlot.TOP, ResourceLocation.withDefaultNamespace("block/" + topTex))
                .put(TextureSlot.BOTTOM, ResourceLocation.withDefaultNamespace("block/" + bottomTex));

        ResourceLocation bottom = ModelTemplates.SLAB_BOTTOM.create(slab, mapping, blockModels.modelOutput);
        ResourceLocation top = ModelTemplates.SLAB_TOP.createWithSuffix(slab, "_top", mapping, blockModels.modelOutput);
        ResourceLocation cube = ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(slab, "_double", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerGlassSlabModel(BlockModelGenerators blockModels, Block slab, String textureId) {
        ResourceLocation texture = ResourceLocation.withDefaultNamespace("block/" + textureId);

        TextureMapping slabMapping = new TextureMapping().put(TextureSlot.SIDE, texture)
                .put(TextureSlot.TOP, texture)
                .put(TextureSlot.BOTTOM, texture);

        TextureMapping cubeMapping = new TextureMapping().put(TextureSlot.ALL, texture);

        ResourceLocation bottom = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_bottom"))
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.SIDE)
                .renderType("translucent")
                .build()
                .create(slab, slabMapping, blockModels.modelOutput);

        ResourceLocation top = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_top"))
                .suffix("_top")
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.SIDE)
                .renderType("translucent")
                .build()
                .create(slab, slabMapping, blockModels.modelOutput);

        ResourceLocation cube = ExtendedModelTemplateBuilder.builder()
                .parent(ResourceLocation.fromNamespaceAndPath("minecraft", "block/cube_all"))
                .suffix("_double")
                .requiredTextureSlot(TextureSlot.ALL)
                .renderType("translucent")
                .build()
                .create(slab, cubeMapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerTrimmSlabModel(
            BlockModelGenerators blockModels,
            Block slab,
            String sideTex,
            String topTex,
            String bottomTex) {
        TextureMapping mapping = new TextureMapping()
                .put(TextureSlot.SIDE, ResourceLocation.withDefaultNamespace("block/" + sideTex))
                .put(TextureSlot.TOP, ResourceLocation.withDefaultNamespace("block/" + topTex))
                .put(TextureSlot.BOTTOM, ResourceLocation.withDefaultNamespace("block/" + bottomTex));

        ResourceLocation bottom = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_bottom"))
                .requiredTextureSlot(TextureSlot.SIDE)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .build()
                .create(slab, mapping, blockModels.modelOutput);

        ResourceLocation top = ExtendedModelTemplateBuilder.builder()
                .parent(MaterialsOfTheRift.id("block/texture_slab_top"))
                .suffix("_top")
                .requiredTextureSlot(TextureSlot.SIDE)
                .requiredTextureSlot(TextureSlot.TOP)
                .requiredTextureSlot(TextureSlot.BOTTOM)
                .build()
                .create(slab, mapping, blockModels.modelOutput);

        ResourceLocation cube = ModelTemplates.CUBE_BOTTOM_TOP.createWithSuffix(slab, "_double", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(MultiVariantGenerator.multiVariant(slab)
                .with(PropertyDispatch.property(BlockStateProperties.SLAB_TYPE)
                        .select(SlabType.BOTTOM, Variant.variant().with(VariantProperties.MODEL, bottom))
                        .select(SlabType.TOP, Variant.variant().with(VariantProperties.MODEL, top))
                        .select(SlabType.DOUBLE, Variant.variant().with(VariantProperties.MODEL, cube))));
    }

    private void registerWallModel(BlockModelGenerators blockModels, Block wall, String textureName) {
        TextureMapping mapping = new TextureMapping().put(TextureSlot.WALL,
                ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation post = ModelTemplates.WALL_POST.create(wall, mapping, blockModels.modelOutput);
        ResourceLocation lowSide = ModelTemplates.WALL_LOW_SIDE.create(wall, mapping, blockModels.modelOutput);
        ResourceLocation tallSide = ModelTemplates.WALL_TALL_SIDE.create(wall, mapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createWall(wall, post, lowSide, tallSide)
        );

    }

    private void registerGlassWallModel(BlockModelGenerators blockModels, Block wall, String textureName) {
        ResourceLocation texture = ResourceLocation.withDefaultNamespace("block/" + textureName);
        TextureMapping mapping = new TextureMapping().put(TextureSlot.WALL, texture);

        ResourceLocation post = ExtendedModelTemplateBuilder.builder()
                .parent(ResourceLocation.withDefaultNamespace("block/template_wall_post"))
                .requiredTextureSlot(TextureSlot.WALL)
                .renderType("translucent")
                .build()
                .create(wall, mapping, blockModels.modelOutput);

        ResourceLocation lowSide = ExtendedModelTemplateBuilder.builder()
                .parent(ResourceLocation.withDefaultNamespace("block/template_wall_side"))
                .requiredTextureSlot(TextureSlot.WALL)
                .renderType("translucent")
                .build()
                .createWithSuffix(wall, "_side", mapping, blockModels.modelOutput);

        ResourceLocation tallSide = ExtendedModelTemplateBuilder.builder()
                .parent(ResourceLocation.withDefaultNamespace("block/template_wall_side_tall"))
                .requiredTextureSlot(TextureSlot.WALL)
                .renderType("translucent")
                .build()
                .createWithSuffix(wall, "_side_tall", mapping, blockModels.modelOutput);

        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createWall(wall, post, lowSide, tallSide)
        );
    }

    private void registerButtonModel(
            BlockModelGenerators blockModels,
            ItemModelGenerators itemModels,
            Block button,
            String textureName) {
        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE,
                ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation pressed = ModelTemplates.BUTTON_PRESSED.createWithSuffix(button, "_pressed", mapping,
                blockModels.modelOutput);
        ResourceLocation unpressed = ModelTemplates.BUTTON.create(button, mapping, blockModels.modelOutput);
        ResourceLocation inventory = ModelTemplates.BUTTON_INVENTORY.createWithSuffix(button, "_inventory", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createButton(button, unpressed, pressed)
        );

        itemModels.itemModelOutput.accept(
                button.asItem(), ItemModelUtils.plainModel(inventory)
        );
    }

    private void registerFenceModel(
            BlockModelGenerators blockModels,
            ItemModelGenerators itemModels,
            Block fence,
            String textureName) {
        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE,
                ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation post = ModelTemplates.FENCE_POST.create(fence, mapping, blockModels.modelOutput);
        ResourceLocation side = ModelTemplates.FENCE_SIDE.create(fence, mapping, blockModels.modelOutput);
        ResourceLocation inventory = ModelTemplates.FENCE_INVENTORY.createWithSuffix(fence, "_inventory", mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createFence(fence, post, side)
        );

        itemModels.itemModelOutput.accept(
                fence.asItem(), ItemModelUtils.plainModel(inventory)
        );
    }

    private void registerFenceGateModel(
            BlockModelGenerators blockModels,
            ItemModelGenerators itemModels,
            Block fenceGate,
            String textureName) {
        TextureMapping mapping = new TextureMapping().put(TextureSlot.TEXTURE,
                ResourceLocation.withDefaultNamespace("block/" + textureName));

        ResourceLocation closed = ModelTemplates.FENCE_GATE_CLOSED.create(fenceGate, mapping, blockModels.modelOutput);
        ResourceLocation open = ModelTemplates.FENCE_GATE_OPEN.create(fenceGate, mapping, blockModels.modelOutput);
        ResourceLocation wall = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGate, mapping,
                blockModels.modelOutput);
        ResourceLocation wallOpen = ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGate, mapping,
                blockModels.modelOutput);

        blockModels.blockStateOutput.accept(
                BlockModelGenerators.createFenceGate(fenceGate, open, closed, wallOpen, wall, true)
        );

        itemModels.itemModelOutput.accept(
                fenceGate.asItem(), ItemModelUtils.plainModel(closed)
        );
    }

}
