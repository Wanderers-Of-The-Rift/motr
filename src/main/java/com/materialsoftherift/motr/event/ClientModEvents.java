package com.materialsoftherift.motr.event;

import com.materialsoftherift.motr.MaterialsOfTheRift;
import com.materialsoftherift.motr.init.MotrQuenched;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.GrassColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = MaterialsOfTheRift.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MotrQuenched.REGISTERED_QUENCHED_BLOCKS
                .forEach((name, info) -> ItemBlockRenderTypes.setRenderLayer(info.block().get(), RenderType.cutout()));
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register(
                (state, level, pos, tintIndex) -> {
                    if (level != null && pos != null) {
                        return BiomeColors.getAverageGrassColor(level, pos);
                    } else {
                        return GrassColor.getDefaultColor();
                    }
                }, MotrQuenched.QUENCHED_SUGAR_CANE.block().get()
        );
    }

}