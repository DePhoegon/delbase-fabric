package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.stair.concreteStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class stairConcrete extends baseModBlocks {
    public static final StairsBlock RED_CONCRETE_STAIR = noToolTipAid("red_concrete_stair", RED_CONCRETE);
    public static final StairsBlock WHITE_CONCRETE_STAIR = noToolTipAid("white_concrete_stair", WHITE_CONCRETE);
    public static final StairsBlock ORANGE_CONCRETE_STAIR = noToolTipAid("orange_concrete_stair", ORANGE_CONCRETE);
    public static final StairsBlock MAGENTA_CONCRETE_STAIR = noToolTipAid("magenta_concrete_stair", MAGENTA_CONCRETE);
    public static final StairsBlock LIGHT_BLUE_CONCRETE_STAIR = noToolTipAid("light_blue_concrete_stair", LIGHT_BLUE_CONCRETE);
    public static final StairsBlock YELLOW_CONCRETE_STAIR = noToolTipAid("yellow_concrete_stair", YELLOW_CONCRETE);
    public static final StairsBlock LIME_CONCRETE_STAIR = noToolTipAid("lime_concrete_stair", LIME_CONCRETE);
    public static final StairsBlock PINK_CONCRETE_STAIR = noToolTipAid("pink_concrete_stair", PINK_CONCRETE);
    public static final StairsBlock GRAY_CONCRETE_STAIR = noToolTipAid("gray_concrete_stair", GRAY_CONCRETE);
    public static final StairsBlock LIGHT_GRAY_CONCRETE_STAIR = noToolTipAid("light_gray_concrete_stair", LIGHT_GRAY_CONCRETE);
    public static final StairsBlock CYAN_CONCRETE_STAIR = noToolTipAid("cyan_concrete_stair", CYAN_CONCRETE);
    public static final StairsBlock PURPLE_CONCRETE_STAIR = noToolTipAid("purple_concrete_stair", PURPLE_CONCRETE);
    public static final StairsBlock BLUE_CONCRETE_STAIR = noToolTipAid("blue_concrete_stair", BLUE_CONCRETE);
    public static final StairsBlock GREEN_CONCRETE_STAIR = noToolTipAid("green_concrete_stair", GREEN_CONCRETE);
    public static final StairsBlock BROWN_CONCRETE_STAIR = noToolTipAid("brown_concrete_stair", BROWN_CONCRETE);
    public static final StairsBlock BLACK_CONCRETE_STAIR = noToolTipAid("black_concrete_stair", BLACK_CONCRETE);

    private static StairsBlock noToolTipAid(String name, Block block) { return chiseledSandStoneHelper(name, block, "", "", ""); }
    private static StairsBlock chiseledSandStoneHelper(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new concreteStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerConcreteStair() { Delbase.LOGGER.info("Registering Concrete Stairs for "+Delbase.Delbase_ID); }
}