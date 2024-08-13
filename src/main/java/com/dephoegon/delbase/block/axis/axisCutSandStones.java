package com.dephoegon.delbase.block.axis;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.axis.cutSandStone;
import com.dephoegon.delbase.block.baseModBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class axisCutSandStones extends baseModBlocks {
    public static final PillarBlock BLOOD_CUT_SAND_STONE = noTtCutSandStoneAid("blood_cut_sand_stone", BLOOD_SAND_STONE);
    public static final PillarBlock WHITE_CUT_SAND_STONE = noTtCutSandStoneAid("white_cut_sand_stone", WHITE_SAND_STONE);
    public static final PillarBlock ORANGE_CUT_SAND_STONE = noTtCutSandStoneAid("orange_cut_sand_stone", ORANGE_SAND_STONE);
    public static final PillarBlock MAGENTA_CUT_SAND_STONE = noTtCutSandStoneAid("magenta_cut_sand_stone", MAGENTA_SAND_STONE);
    public static final PillarBlock LIGHT_BLUE_CUT_SAND_STONE = noTtCutSandStoneAid("light_blue_cut_sand_stone", LIGHT_BLUE_SAND_STONE);
    public static final PillarBlock YELLOW_CUT_SAND_STONE = noTtCutSandStoneAid("yellow_cut_sand_stone", YELLOW_SAND_STONE);
    public static final PillarBlock LIME_CUT_SAND_STONE = noTtCutSandStoneAid("lime_cut_sand_stone", LIME_SAND_STONE);
    public static final PillarBlock PINK_CUT_SAND_STONE = noTtCutSandStoneAid("pink_cut_sand_stone", PINK_SAND_STONE);
    public static final PillarBlock GRAY_CUT_SAND_STONE = noTtCutSandStoneAid("gray_cut_sand_stone", GRAY_SAND_STONE);
    public static final PillarBlock LIGHT_GRAY_CUT_SAND_STONE = noTtCutSandStoneAid("light_gray_cut_sand_stone", LIGHT_GRAY_SAND_STONE);
    public static final PillarBlock CYAN_CUT_SAND_STONE = noTtCutSandStoneAid("cyan_cut_sand_stone", CYAN_SAND_STONE);
    public static final PillarBlock PURPLE_CUT_SAND_STONE = noTtCutSandStoneAid("purple_cut_sand_stone", PURPLE_SAND_STONE);
    public static final PillarBlock BLUE_CUT_SAND_STONE = noTtCutSandStoneAid("blue_cut_sand_stone", BLUE_SAND_STONE);
    public static final PillarBlock GREEN_CUT_SAND_STONE = noTtCutSandStoneAid("green_cut_sand_stone", GREEN_SAND_STONE);
    public static final PillarBlock BROWN_CUT_SAND_STONE = noTtCutSandStoneAid("brown_cut_sand_stone", BROWN_SAND_STONE);
    public static final PillarBlock BLACK_CUT_SAND_STONE = noTtCutSandStoneAid("black_cut_sand_stone", BLACK_SAND_STONE);

    private static PillarBlock noTtCutSandStoneAid(String name, Block block) { return cutSandStonesRegisterAid(name, block, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static PillarBlock cutSandStonesRegisterAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return  (PillarBlock) registerBlock(name, new cutSandStone(AbstractBlock.Settings.copy(block), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerCutSandStones() { Delbase.LOGGER.info("Registering Cut Sand Stones for "+Delbase.Delbase_ID); }
}