package com.dephoegon.delbase.block.axis;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.axis.cutSandStone;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.CUT_SANDSTONE;

public class axisCutSandStones extends baseModBlocks {
    public static PillarBlock BLOOD_CUT_SAND_STONE = noTtCutSandStoneAid("blood_cut_sand_stone");
    public static PillarBlock WHITE_CUT_SAND_STONE = noTtCutSandStoneAid("white_cut_sand_stone");
    public static PillarBlock ORANGE_CUT_SAND_STONE = noTtCutSandStoneAid("orange_cut_sand_stone");
    public static PillarBlock MAGENTA_CUT_SAND_STONE = noTtCutSandStoneAid("magenta_cut_sand_stone");
    public static PillarBlock LIGHT_BLUE_CUT_SAND_STONE = noTtCutSandStoneAid("light_blue_cut_sand_stone");
    public static PillarBlock YELLOW_CUT_SAND_STONE = noTtCutSandStoneAid("yellow_cut_sand_stone");
    public static PillarBlock LIME_CUT_SAND_STONE = noTtCutSandStoneAid("lime_cut_sand_stone");
    public static PillarBlock PINK_CUT_SAND_STONE = noTtCutSandStoneAid("pink_cut_sand_stone");
    public static PillarBlock GRAY_CUT_SAND_STONE = noTtCutSandStoneAid("gray_cut_sand_stone");
    public static PillarBlock LIGHT_GRAY_CUT_SAND_STONE = noTtCutSandStoneAid("light_gray_cut_sand_stone");
    public static PillarBlock CYAN_CUT_SAND_STONE = noTtCutSandStoneAid("cyan_cut_sand_stone");
    public static PillarBlock PURPLE_CUT_SAND_STONE = noTtCutSandStoneAid("purple_cut_sand_stone");
    public static PillarBlock BLUE_CUT_SAND_STONE = noTtCutSandStoneAid("blue_cut_sand_stone");
    public static PillarBlock GREEN_CUT_SAND_STONE = noTtCutSandStoneAid("green_cut_sand_stone");
    public static PillarBlock BROWN_CUT_SAND_STONE = noTtCutSandStoneAid("brown_cut_sand_stone");
    public static PillarBlock BLACK_CUT_SAND_STONE = noTtCutSandStoneAid("black_cut_sand_stone");

    private static PillarBlock noTtCutSandStoneAid(String name) { return cutSandStonesRegisterAid(name, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static PillarBlock cutSandStonesRegisterAid(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (PillarBlock) registerBlock(name, new cutSandStone(FabricBlockSettings.copyOf(CUT_SANDSTONE).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerCutSandStones() { Delbase.LOGGER.info("Registering Cut Sand Stones for "+Delbase.Delbase_ID); }
}
