package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.util.blockArrayList;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Objects;

public class blockColoring {
    private static final Block[] spruce = blockArrayList.getSpruceLeaves();
    private static final Block[] birch = blockArrayList.getBirchLeaves();
    private static final Block[] colored = blockArrayList.getColoredLeaves();

    public static void setLeafColors() {
        Arrays.stream(spruce).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getSpruceColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getSpruceColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutout());
        });
        Arrays.stream(birch).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getBirchColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getBirchColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutout());
        });
        Arrays.stream(colored).forEach(leaf -> {
            ColorProviderRegistry.BLOCK.register(blockColoring::getFoliageColor, leaf);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), leaf);
            BlockRenderLayerMap.INSTANCE.putBlock(leaf, RenderLayer.getCutout());
        });
    }
    public static int getSpruceColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) { return FoliageColors.getSpruceColor(); }
    public static int getBirchColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) { return FoliageColors.getBirchColor(); }
    public static int getFoliageColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex) {
        if (world == null || pos == null) { return FoliageColors.getDefaultColor(); }
        return BiomeColors.getFoliageColor(world, pos);
    }
}