package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.util.blockArrayList;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.biome.FoliageColors;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

public class blockColoring {
    private static final Block[] spruce = blockArrayList.getSpruceLeaves();
    private static final Block[] birch = blockArrayList.getBirchLeaves();
    private static final Block[] colored = blockArrayList.getColoredLeaves();
    private static final Block[] mangrove = blockArrayList.getMangroveLeaves();
    private static final Block[] misc = blockArrayList.getMiscCutout();
    private static final Block[] nonColoredLeaves = blockArrayList.getNonColoredLeaves();

    public static void setLeafColors() {
        Arrays.stream(misc).forEach(root -> BlockRenderLayerMap.INSTANCE.putBlock(root, RenderLayer.getCutoutMipped()));
        Arrays.stream(nonColoredLeaves).forEach(root -> BlockRenderLayerMap.INSTANCE.putBlock(root, RenderLayer.getCutoutMipped()));
        Arrays.stream(mangrove).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getMangroveColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getMangroveColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutoutMipped());
        });
        Arrays.stream(spruce).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getSpruceColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getSpruceColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutoutMipped());
        });
        Arrays.stream(birch).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getBirchColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getBirchColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutoutMipped());
        });
        Arrays.stream(colored).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getFoliageColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutoutMipped());
        });
    }
    public static int getSpruceColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) { return FoliageColors.getSpruceColor(); }
    public static int getMangroveColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) { return FoliageColors.getMangroveColor(); }
    public static int getBirchColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) { return FoliageColors.getBirchColor(); }
    public static int getFoliageColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
        if (world == null || pos == null) { return FoliageColors.getDefaultColor(); }
        return BiomeColors.getFoliageColor(world, pos);
    }
}