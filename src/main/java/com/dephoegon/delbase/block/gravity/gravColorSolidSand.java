package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.SandBlock;
import net.minecraft.sound.BlockSoundGroup;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static net.minecraft.block.Blocks.RED_SAND;
import static net.minecraft.block.Blocks.SAND;

public class gravColorSolidSand extends baseModBlocks {
    public static final SandBlock SOLID_SAND = colorSolidSandHelper(14406560, "solid_sand", SAND);
    public static final SandBlock RED_SOLID_SAND = colorSolidSandHelper(11098145, "red_solid_sand", RED_SAND);
    public static final SandBlock BLOOD_SOLID_SAND = colorSolidSandHelper(0xff0000, "blood_solid_sand", BLOOD_SAND);
    public static final SandBlock WHITE_SOLID_SAND = colorSolidSandHelper(0xffffff, "white_solid_sand", WHITE_SAND);
    public static final SandBlock ORANGE_SOLID_SAND = colorSolidSandHelper(0xffa500, "orange_solid_sand", ORANGE_SAND);
    public static final SandBlock MAGENTA_SOLID_SAND = colorSolidSandHelper(0xff00ff, "magenta_solid_sand", MAGENTA_SAND);
    public static final SandBlock LIGHT_BLUE_SOLID_SAND = colorSolidSandHelper(0xff00ff, "light_blue_solid_sand", LIGHT_BLUE_SAND);
    public static final SandBlock LIGHT_GRAY_SOLID_SAND = colorSolidSandHelper(0xd3d3d3, "light_gray_solid_sand", LIGHT_GRAY_SAND);
    public static final SandBlock YELLOW_SOLID_SAND = colorSolidSandHelper(0xffff00, "yellow_solid_sand", YELLOW_SAND);
    public static final SandBlock LIME_SOLID_SAND = colorSolidSandHelper(0x00ff00, "lime_solid_sand", LIME_SAND);
    public static final SandBlock PINK_SOLID_SAND = colorSolidSandHelper(0xffc0cb, "pink_solid_sand", PINK_SAND);
    public static final SandBlock GRAY_SOLID_SAND = colorSolidSandHelper(0x808080, "gray_solid_sand", GRAY_SAND);
    public static final SandBlock PURPLE_SOLID_SAND = colorSolidSandHelper(0x800080, "purple_solid_sand", PURPLE_SAND);
    public static final SandBlock CYAN_SOLID_SAND = colorSolidSandHelper(0x00ffff, "cyan_solid_sand", CYAN_SAND);
    public static final SandBlock BLUE_SOLID_SAND = colorSolidSandHelper(0x0000ff, "blue_solid_sand", BLUE_SAND);
    public static final SandBlock GREEN_SOLID_SAND = colorSolidSandHelper(0x008000, "green_solid_sand", GREEN_SAND);
    public static final SandBlock BROWN_SOLID_SAND = colorSolidSandHelper(0x714e32, "brown_solid_sand", BROWN_SAND);
    public static final SandBlock BLACK_SOLID_SAND = colorSolidSandHelper(0x000000, "black_solid_sand", BLACK_SAND);

    private static SandBlock colorSolidSandHelper(int dustColor, String name, Block block) {
        return (SandBlock) registerBlock(name, new solidSandBlock(dustColor, FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.SAND), "tooltip.delbase.info.more", "tooltip.delbase.sand.solid.info", "tooltip.delbase.sand.solid.flavor", false));
    }
    public static void registerColoredSands() { Delbase.LOGGER.info("Registering Colored Sands for "+Delbase.Delbase_ID); }
}