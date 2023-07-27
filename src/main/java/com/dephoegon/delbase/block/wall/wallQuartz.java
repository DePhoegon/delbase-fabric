package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.quartzWall;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class wallQuartz extends baseModBlocks {
    public static final WallBlock CHISELED_QUARTZ_WALL = noToolTipAid("chiseled_quartz_wall", CHISELED_QUARTZ_BLOCK);
    public static final WallBlock QUARTZ_BRICK_WALL = noToolTipAid("quartz_brick_wall", QUARTZ_BRICKS);
    public static final WallBlock QUARTZ_PILLAR_WALL = noToolTipAid("quartz_pillar_wall", QUARTZ_PILLAR);
    public static final WallBlock QUARTZ_WALL = noToolTipAid("quartz_wall", QUARTZ_BLOCK);
    public static final WallBlock SMOOTH_QUARTZ_WALL = noToolTipAid("smooth_quartz_wall", SMOOTH_QUARTZ);

    private static WallBlock noToolTipAid(String name, Block block) { return quartzWallRegister(name, block, "", "", ""); }
    private static WallBlock quartzWallRegister(String name, Block block, String norm, String Shift, String Ctrl) { return (WallBlock) registerBlock(name, new quartzWall(FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerConcreteWall() { Delbase.LOGGER.info("Registering Quartz Walls for "+Delbase.Delbase_ID); }
}