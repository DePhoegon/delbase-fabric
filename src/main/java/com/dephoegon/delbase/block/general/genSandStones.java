package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.gen.normSandStone;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class genSandStones extends baseModBlocks {
    public static Block BLOOD_SAND_STONE = noToolTipAid("blood_sand_stone", RED_TERRACOTTA);
    public static Block WHITE_SAND_STONE = noToolTipAid("white_sand_stone", WHITE_TERRACOTTA);
    public static Block ORANGE_SAND_STONE = noToolTipAid("orange_sand_stone", ORANGE_TERRACOTTA);
    public static Block MAGENTA_SAND_STONE = noToolTipAid("magenta_sand_stone", MAGENTA_TERRACOTTA);
    public static Block LIGHT_BLUE_SAND_STONE = noToolTipAid("light_blue_sand_stone", LIGHT_BLUE_TERRACOTTA);
    public static Block YELLOW_SAND_STONE = noToolTipAid("yellow_sand_stone", YELLOW_TERRACOTTA);
    public static Block LIME_SAND_STONE = noToolTipAid("lime_sand_stone", LIME_TERRACOTTA);
    public static Block PINK_SAND_STONE = noToolTipAid("pink_sand_stone", PINK_TERRACOTTA);
    public static Block GRAY_SAND_STONE = noToolTipAid("gray_sand_stone", GREEN_TERRACOTTA);
    public static Block LIGHT_GRAY_SAND_STONE = noToolTipAid("light_gray_sand_stone", LIGHT_GRAY_TERRACOTTA);
    public static Block CYAN_SAND_STONE = noToolTipAid("cyan_sand_stone", CYAN_TERRACOTTA);
    public static Block PURPLE_SAND_STONE = noToolTipAid("purple_sand_stone", PURPLE_TERRACOTTA);
    public static Block BLUE_SAND_STONE = noToolTipAid("blue_sand_stone", BLUE_TERRACOTTA);
    public static Block GREEN_SAND_STONE = noToolTipAid("green_sand_stone", GREEN_TERRACOTTA);
    public static Block BROWN_SAND_STONE = noToolTipAid("brown_sand_stone", BROWN_TERRACOTTA);
    public static Block BLACK_SAND_STONE = noToolTipAid("black_sand_stone", BLACK_TERRACOTTA);

    private static Block noToolTipAid(String name, Block block) { return genBlockRegAid(name, block, "", "", ""); }
    @SuppressWarnings("SameParameterValue")
    private static Block genBlockRegAid(String name, Block block, String NormToolTip, String ShiftToolTip, String CtrlToolTip) {
        return registerBlock(name, new normSandStone(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), NormToolTip, ShiftToolTip, CtrlToolTip));
    }
    public static void registerSandStone() { Delbase.LOGGER.info("Registering SandStones for "+Delbase.Delbase_ID); }
}
