package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.quartzStair;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.Blocks.*;

public class stairQuartz extends baseModBlocks {
    public static final StairsBlock CHISELED_QUARTZ_STAIR = noToolTipAid("chiseled_quartz_stair", CHISELED_QUARTZ_BLOCK);
    public static final StairsBlock QUARTZ_BRICK_STAIR = noToolTipAid("quartz_brick_stair", QUARTZ_BRICKS);
    public static final StairsBlock QUARTZ_PILLAR_STAIR = noToolTipAid("quartz_pillar_stair", QUARTZ_PILLAR);

    private static StairsBlock noToolTipAid(String name, Block block) { return quartzStairRegister(name, block, "", "", ""); }
    private static StairsBlock quartzStairRegister(String name, Block block, String norm, String Shift, String Ctrl) { return (StairsBlock) registerBlock(name, new quartzStair(block.getDefaultState(), FabricBlockSettings.copyOf(block).sounds(BlockSoundGroup.STONE), norm, Shift, Ctrl)); }
    public static void registerConcreteStair() { Delbase.LOGGER.info("Registering Concrete Stairs for "+Delbase.Delbase_ID); }
}