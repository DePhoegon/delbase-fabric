package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.gen.smoothSandStone;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class genSmoothSandStones extends baseModBlocks {
    public static final Block BLOOD_SMOOTH_SAND_STONE = noToolTipAid("blood_smooth_sand_stone", BLOOD_SAND_STONE);
    public static final Block WHITE_SMOOTH_SAND_STONE = noToolTipAid("white_smooth_sand_stone", WHITE_SAND_STONE);
    public static final Block ORANGE_SMOOTH_SAND_STONE = noToolTipAid("orange_smooth_sand_stone", ORANGE_SAND_STONE);
    public static final Block MAGENTA_SMOOTH_SAND_STONE = noToolTipAid("magenta_smooth_sand_stone", MAGENTA_SAND_STONE);
    public static final Block LIGHT_BLUE_SMOOTH_SAND_STONE = noToolTipAid("light_blue_smooth_sand_stone", LIGHT_BLUE_SAND_STONE);
    public static final Block YELLOW_SMOOTH_SAND_STONE = noToolTipAid("yellow_smooth_sand_stone", YELLOW_SAND_STONE);
    public static final Block LIME_SMOOTH_SAND_STONE = noToolTipAid("lime_smooth_sand_stone", LIME_SAND_STONE);
    public static final Block PINK_SMOOTH_SAND_STONE = noToolTipAid("pink_smooth_sand_stone", PINK_SAND_STONE);
    public static final Block GRAY_SMOOTH_SAND_STONE = noToolTipAid("gray_smooth_sand_stone", GRAY_SAND_STONE);
    public static final Block LIGHT_GRAY_SMOOTH_SAND_STONE = noToolTipAid("light_gray_smooth_sand_stone", LIGHT_GRAY_SAND_STONE);
    public static final Block CYAN_SMOOTH_SAND_STONE = noToolTipAid("cyan_smooth_sand_stone", CYAN_SAND_STONE);
    public static final Block PURPLE_SMOOTH_SAND_STONE = noToolTipAid("purple_smooth_sand_stone", PURPLE_SAND_STONE);
    public static final Block BLUE_SMOOTH_SAND_STONE = noToolTipAid("blue_smooth_sand_stone", BLUE_SAND_STONE);
    public static final Block GREEN_SMOOTH_SAND_STONE = noToolTipAid("green_smooth_sand_stone", GREEN_SAND_STONE);
    public static final Block BROWN_SMOOTH_SAND_STONE = noToolTipAid("brown_smooth_sand_stone", BROWN_SAND_STONE);
    public static final Block BLACK_SMOOTH_SAND_STONE = noToolTipAid("black_smooth_sand_stone", BLACK_SAND_STONE);

    private static Block noToolTipAid(String name, Block block) { return genBlockRegAid(name, block, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static Block genBlockRegAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return registerBlock(name, new smoothSandStone(AbstractBlock.Settings.copy(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerSmoothSandStoneBlock() { Delbase.LOGGER.info("Registering Smooth Sandstones for "+Delbase.Delbase_ID); }
}