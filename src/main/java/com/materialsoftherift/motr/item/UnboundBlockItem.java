package com.materialsoftherift.motr.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class UnboundBlockItem extends BlockItem {

    public UnboundBlockItem(Block block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    public void appendHoverText(
            @NotNull ItemStack item,
            @NotNull Item.TooltipContext tooltipContext,
            @NotNull List<Component> list,
            @NotNull TooltipFlag flag) {
        list.add(Component.translatable("item.motr.unbound_placement"));
        super.appendHoverText(item, tooltipContext, list, flag);
    }

}