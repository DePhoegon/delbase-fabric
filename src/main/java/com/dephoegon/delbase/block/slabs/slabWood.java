package com.dephoegon.delbase.block.slabs;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.alt.woodSlab;
import com.dephoegon.delbase.block.baseModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class slabWood extends baseModBlocks {
    public static final SlabBlock SPRUCE_WOOD_SLAB = woodSlabHelper("spruce_wood_slab", "", "", "", null, 3001, 5, 10);
    public static final SlabBlock SPRUCE_LOG_SLAB = woodSlabHelper("spruce_log_slab", "", "", "", null, 3001, 5, 10);

    public static final SlabBlock WARPED_HYPHAE_SLAB = woodSlabHelper("warped_hyphae_slab", "","","", null);
    public static final SlabBlock WARPED_STEM_SLAB = woodSlabHelper("warped_stem_slab", "","","", null);


    @SuppressWarnings("SameParameterValue")
    private static SlabBlock woodSlabHelper(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip, SlabBlock strippedSlab) { return woodSlabHelper(name, NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab, 0, 0, 0); }
    @SuppressWarnings("SameParameterValue")
    private static SlabBlock woodSlabHelper(String name, String NormToolTip, String ShiftToolTip, String CtrlToolTip, SlabBlock strippedSlab, int fuelTime, int burnChance, int burnSpread) {
        SlabBlock hold;
        if (fuelTime > 0) {
            hold = (SlabBlock) registerBlock(name,
                    new woodSlab(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab), true, fuelTime, burnChance, burnSpread);
        } else {
            hold = (SlabBlock) registerBlock(name,
                    new woodSlab(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD), NormToolTip, ShiftToolTip, CtrlToolTip, strippedSlab)
            );
        }
        return hold;
    }
    public static void registerWoodSlabs() { Delbase.LOGGER.info("Registering Wood Slabs for "+Delbase.Delbase_ID); }
}
