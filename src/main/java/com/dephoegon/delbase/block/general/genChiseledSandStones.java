package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.gen.chiseledSandStone;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.general.genSandStones.*;

public class genChiseledSandStones extends baseModBlocks {
    public static final Block BLOOD_CHISELED_SAND_STONE = noToolTipAid("blood_chiseled_sand_stone", BLOOD_SAND_STONE);
    public static final Block WHITE_CHISELED_SAND_STONE = noToolTipAid("white_chiseled_sand_stone", WHITE_SAND_STONE);
    public static final Block ORANGE_CHISELED_SAND_STONE = noToolTipAid("orange_chiseled_sand_stone", ORANGE_SAND_STONE);
    public static final Block MAGENTA_CHISELED_SAND_STONE = noToolTipAid("magenta_chiseled_sand_stone", MAGENTA_SAND_STONE);
    public static final Block LIGHT_BLUE_CHISELED_SAND_STONE = noToolTipAid("light_blue_chiseled_sand_stone", LIGHT_BLUE_SAND_STONE);
    public static final Block YELLOW_CHISELED_SAND_STONE = noToolTipAid("yellow_chiseled_sand_stone", YELLOW_SAND_STONE);
    public static final Block LIME_CHISELED_SAND_STONE = noToolTipAid("lime_chiseled_sand_stone", LIME_SAND_STONE);
    public static final Block PINK_CHISELED_SAND_STONE = noToolTipAid("pink_chiseled_sand_stone", PINK_SAND_STONE);
    public static final Block GRAY_CHISELED_SAND_STONE = noToolTipAid("gray_chiseled_sand_stone", GRAY_SAND_STONE);
    public static final Block LIGHT_GRAY_CHISELED_SAND_STONE = noToolTipAid("light_gray_chiseled_sand_stone", LIGHT_GRAY_SAND_STONE);
    public static final Block CYAN_CHISELED_SAND_STONE = noToolTipAid("cyan_chiseled_sand_stone", CYAN_SAND_STONE);
    public static final Block PURPLE_CHISELED_SAND_STONE = noToolTipAid("purple_chiseled_sand_stone", PURPLE_SAND_STONE);
    public static final Block BLUE_CHISELED_SAND_STONE = noToolTipAid("blue_chiseled_sand_stone", BLUE_SAND_STONE);
    public static final Block GREEN_CHISELED_SAND_STONE = noToolTipAid("green_chiseled_sand_stone", GREEN_SAND_STONE);
    public static final Block BROWN_CHISELED_SAND_STONE = noToolTipAid("brown_chiseled_sand_stone", BROWN_SAND_STONE);
    public static final Block BLACK_CHISELED_SAND_STONE = noToolTipAid("black_chiseled_sand_stone", BLACK_SAND_STONE);

    private static Block noToolTipAid(String name, Block block) { return genBlockRegAid(name, block, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static Block genBlockRegAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return registerBlock(name, new chiseledSandStone(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerChiseledSandStoneBlock() { Delbase.LOGGER.info("Registering Chiseled Sandstones for "+Delbase.Delbase_ID); }
}