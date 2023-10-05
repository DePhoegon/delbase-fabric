package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.aid.block.colorshift.grav.solidSandBlock;
import com.dephoegon.delbase.aid.block.grav.nonColoredSolidSandBlock;
import com.dephoegon.delbase.aid.block.stock.energySlab;
import net.minecraft.block.Block;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.dephoegon.delbase.block.fence.fenceMisc.*;
import static com.dephoegon.delbase.block.fence.leafFences.*;
import static com.dephoegon.delbase.block.slabs.slabLeaves.*;
import static com.dephoegon.delbase.block.slabs.slabMisc.GLOWSTONE_SLAB;
import static com.dephoegon.delbase.block.slabs.slabMisc.MANGROVE_ROOT_SLAB;
import static com.dephoegon.delbase.block.stair.stairLeaves.*;
import static com.dephoegon.delbase.block.stair.stairMisc.GLOWSTONE_STAIR;
import static com.dephoegon.delbase.block.stair.stairMisc.MANGROVE_ROOT_STAIR;
import static com.dephoegon.delbase.block.wall.hedgeLeaves.*;
import static com.dephoegon.delbase.block.wall.wallMisc.GLOWSTONE_WALL;
import static com.dephoegon.delbase.block.wall.wallMisc.MANGROVE_ROOT_WALL;
import static net.minecraft.block.Blocks.*;

public abstract class blockArrayList {
    private static ArrayList<Object> terracotta_list = new ArrayList<>();
    private static ArrayList<Object> concrete_list = new ArrayList<>();
    private static ArrayList<Object> slab_list = new ArrayList<>();
    private static ArrayList<Object> stair_list = new ArrayList<>();
    private static ArrayList<Object> general_list = new ArrayList<>();
    private static ArrayList<Object> gravity_list = new ArrayList<>();
    private static ArrayList<Object> wall_list = new ArrayList<>();
    private static ArrayList<Object> axis_list = new ArrayList<>();
    private static ArrayList<Object> fall_hold = new ArrayList<>();
    private static ArrayList<Object> concretePowder_list = new ArrayList<>();
    private static ArrayList<Object> sand_list = new ArrayList<>();
    @Contract(value = " -> new", pure = true)
    public static Block @NotNull [] getBirchLeaves() {
        return new Block[]{BIRCH_HEDGE, BIRCH_LEAF_FENCE, BIRCH_LEAF_FENCE_GATE, BIRCH_LEAF_SLAB, BIRCH_LEAF_STAIR};
    }
    @Contract(value = " -> new", pure = true)
    public static Block @NotNull [] getSpruceLeaves() {
        return new Block[]{SPRUCE_HEDGE, SPRUCE_LEAF_FENCE, SPRUCE_LEAF_FENCE_GATE, SPRUCE_LEAF_SLAB, SPRUCE_LEAF_STAIR};
    }
    @Contract(value = " -> new", pure = true)
    public static Block @NotNull [] getColoredLeaves() {
        return new Block[]{OAK_HEDGE, JUNGLE_HEDGE, ACACIA_HEDGE, DARK_OAK_HEDGE, OAK_LEAF_FENCE, JUNGLE_LEAF_FENCE, ACACIA_LEAF_FENCE, DARK_OAK_LEAF_FENCE, OAK_LEAF_FENCE_GATE, ACACIA_LEAF_FENCE_GATE, JUNGLE_LEAF_FENCE_GATE, DARK_OAK_LEAF_FENCE_GATE, OAK_LEAF_SLAB, JUNGLE_LEAF_SLAB, ACACIA_LEAF_SLAB, DARK_OAK_LEAF_SLAB, OAK_LEAF_STAIR, JUNGLE_LEAF_STAIR, ACACIA_LEAF_STAIR, DARK_OAK_LEAF_STAIR};
    }
    @Contract(value = " -> new", pure = true)
    public static Block @NotNull [] getMangroveLeaves() {
        return new Block[]{MANGROVE_HEDGE, MANGROVE_LEAF_FENCE, MANGROVE_LEAF_SLAB, MANGROVE_LEAF_STAIR, MANGROVE_LEAF_FENCE_GATE};
    }
    @Contract(value = " -> new", pure = true)
    public static Block @NotNull [] getMiscCutout() {
        return new Block[]{MANGROVE_ROOT_FENCE, MANGROVE_ROOT_FENCE_GATE, MANGROVE_ROOT_SLAB, MANGROVE_ROOT_STAIR, MANGROVE_ROOT_WALL};
    }
    @Contract(value = " -> new", pure = true)
    public static Block @NotNull [] getNonColoredLeaves() {
        return new Block[] {AZALEA_HEDGE, AZALEA_LEAF_FENCE, AZALEA_LEAF_SLAB, AZALEA_LEAF_FENCE_GATE, AZALEA_LEAF_STAIR, FLOWERING_AZALEA_HEDGE, FLOWERING_AZALEA_LEAF_FENCE, FLOWERING_AZALEA_LEAF_FENCE_GATE, FLOWERING_AZALEA_LEAF_SLAB, FLOWERING_AZALEA_LEAF_STAIR};
    }

    // Blocks for holding up falling blocks, outside custom classes
    private static void setFall_hold() {
        ArrayList<Object> fall_set = new ArrayList<>();
        fall_set.add(REDSTONE_ORE.getDefaultState());
        fall_set.add(REDSTONE_BLOCK.getDefaultState());
        fall_set.add(REDSTONE_LAMP.getDefaultState());
        fall_set.add(GLOWSTONE.getDefaultState());
        fall_set.add(GLOWSTONE_SLAB.getDefaultState());
        fall_set.add(GLOWSTONE_STAIR.getDefaultState());
        fall_set.add(GLOWSTONE_FENCE.getDefaultState());
        fall_set.add(GLOWSTONE_FENCE_GATE.getDefaultState());
        fall_set.add(GLOWSTONE_WALL.getDefaultState());
        // add in the Glowstone blocks to this list.
        fall_hold = fall_set;
    }
    private static boolean checkBlockClass(Block block) {
       if (block instanceof energySlab) { return true; }
       if (block instanceof nonColoredSolidSandBlock) { return true; }
        return block instanceof solidSandBlock;
    }
    private static ArrayList<Object> getFall_hold() { return fall_hold; }
    public static boolean checkFallLock(@NotNull Block block) {
        return checkBlockClass(block) || getFall_hold().contains(block.getDefaultState());
    }
    // Color swapping matching list
    private static void setTerracotta_list() {
        ArrayList<Object> terracotta_set = new ArrayList<>();
        terracotta_set.add(WHITE_TERRACOTTA.getDefaultState());
        terracotta_set.add(TERRACOTTA.getDefaultState());
        terracotta_set.add(RED_TERRACOTTA.getDefaultState());
        terracotta_set.add(ORANGE_TERRACOTTA.getDefaultState());
        terracotta_set.add(MAGENTA_TERRACOTTA.getDefaultState());
        terracotta_set.add(LIGHT_BLUE_TERRACOTTA.getDefaultState());
        terracotta_set.add(YELLOW_TERRACOTTA.getDefaultState());
        terracotta_set.add(LIME_TERRACOTTA.getDefaultState());
        terracotta_set.add(PINK_TERRACOTTA.getDefaultState());
        terracotta_set.add(GRAY_TERRACOTTA.getDefaultState());
        terracotta_set.add(LIGHT_GRAY_TERRACOTTA.getDefaultState());
        terracotta_set.add(CYAN_TERRACOTTA.getDefaultState());
        terracotta_set.add(PURPLE_TERRACOTTA.getDefaultState());
        terracotta_set.add(BLUE_TERRACOTTA.getDefaultState());
        terracotta_set.add(GREEN_TERRACOTTA.getDefaultState());
        terracotta_set.add(BROWN_TERRACOTTA.getDefaultState());
        terracotta_set.add(BLACK_TERRACOTTA.getDefaultState());
        terracotta_list = terracotta_set;
    }
    public static ArrayList<Object> getTerracotta_list() { return terracotta_list; }

    private static void setConcretePowder_list(){
        ArrayList<Object> concretePowder_set = new ArrayList<>();
        concretePowder_set.add(RED_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(WHITE_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(ORANGE_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(MAGENTA_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(LIGHT_BLUE_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(YELLOW_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(LIME_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(PINK_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(GRAY_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(LIGHT_GRAY_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(CYAN_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(PURPLE_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(BLUE_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(GREEN_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(BROWN_CONCRETE_POWDER.getDefaultState());
        concretePowder_set.add(BLACK_CONCRETE_POWDER.getDefaultState());
        concretePowder_list = concretePowder_set;
    }
    public static ArrayList<Object> getConcretePowder_list() { return concretePowder_list; }
    private static void setConcrete_list() {
        ArrayList<Object> concrete_set = new ArrayList<>();
        concrete_set.add(RED_CONCRETE.getDefaultState());
        concrete_set.add(WHITE_CONCRETE.getDefaultState());
        concrete_set.add(ORANGE_CONCRETE.getDefaultState());
        concrete_set.add(MAGENTA_CONCRETE.getDefaultState());
        concrete_set.add(LIGHT_BLUE_CONCRETE.getDefaultState());
        concrete_set.add(YELLOW_CONCRETE.getDefaultState());
        concrete_set.add(LIME_CONCRETE.getDefaultState());
        concrete_set.add(PINK_CONCRETE.getDefaultState());
        concrete_set.add(GRAY_CONCRETE.getDefaultState());
        concrete_set.add(LIGHT_GRAY_CONCRETE.getDefaultState());
        concrete_set.add(CYAN_CONCRETE.getDefaultState());
        concrete_set.add(PURPLE_CONCRETE.getDefaultState());
        concrete_set.add(BLUE_CONCRETE.getDefaultState());
        concrete_set.add(GREEN_CONCRETE.getDefaultState());
        concrete_set.add(BROWN_CONCRETE.getDefaultState());
        concrete_set.add(BLACK_CONCRETE.getDefaultState());
        concrete_list = concrete_set;
    }
    public static ArrayList<Object> getConcrete_list() { return concrete_list; }

    private static void setSlab_list() {
        ArrayList<Object> slab_set = new ArrayList<>();
        slab_set.add(CUT_SANDSTONE_SLAB.getDefaultState());
        slab_set.add(CUT_RED_SANDSTONE_SLAB.getDefaultState());
        slab_set.add(SMOOTH_SANDSTONE_SLAB.getDefaultState());
        slab_set.add(SMOOTH_RED_SANDSTONE_SLAB.getDefaultState());
        slab_set.add(SANDSTONE_SLAB.getDefaultState());
        slab_set.add(RED_SANDSTONE_SLAB.getDefaultState());
        slab_list = slab_set;
    }
    public static ArrayList<Object> getSlab_list() { return slab_list; }

    private static void setStair_list() {
        ArrayList<Object> stair_set = new ArrayList<>();
        stair_set.add(SANDSTONE_STAIRS.getDefaultState());
        stair_set.add(RED_SANDSTONE_STAIRS.getDefaultState());
        stair_set.add(SMOOTH_SANDSTONE_STAIRS.getDefaultState());
        stair_set.add(SMOOTH_RED_SANDSTONE_STAIRS.getDefaultState());
        stair_list = stair_set;
    }
    public static ArrayList<Object> getStair_list() { return stair_list; }

    private static void setAxis_list() {
        ArrayList<Object> axis_set = new ArrayList<>();
        axis_set.add(CUT_RED_SANDSTONE.getDefaultState());
        axis_set.add(CUT_SANDSTONE.getDefaultState());
        axis_list = axis_set;
    }
    public static ArrayList<Object> getAxis_list() { return axis_list; }

    private static void setGeneral_list() {
        setTerracotta_list();
        setConcrete_list();
        ArrayList<Object> general_set = new ArrayList<>();
        general_set.addAll(terracotta_list);
        general_set.addAll(concrete_list);
        general_set.add(CHISELED_SANDSTONE.getDefaultState());
        general_set.add(CHISELED_RED_SANDSTONE.getDefaultState());
        general_set.add(SANDSTONE.getDefaultState());
        general_set.add(RED_SANDSTONE.getDefaultState());
        general_set.add(SMOOTH_RED_SANDSTONE.getDefaultState());
        general_set.add(SMOOTH_SANDSTONE.getDefaultState());
        general_list = general_set;
    }
    public static ArrayList<Object> getGeneral_list() { return general_list; }

    private static void setGravity_list() {
        setSand_list();
        setConcretePowder_list();
        ArrayList<Object> gravity_set = new ArrayList<>();
        gravity_set.addAll(sand_list);
        gravity_set.addAll(concretePowder_list);
        gravity_list = gravity_set;
    }
    public static ArrayList<Object> getGravity_list() { return gravity_list; }

    private static void setSand_list() {
        ArrayList<Object> sand_set = new ArrayList<>();
        sand_set.add(SAND.getDefaultState());
        sand_set.add(RED_SAND.getDefaultState());
        sand_list = sand_set;
    }
    public static ArrayList<Object> getSand_list() { return sand_list; }
    private static void setWall_list() {
        ArrayList<Object> wall_set = new ArrayList<>();
        wall_set.add(SANDSTONE_WALL.getDefaultState());
        wall_set.add(RED_SANDSTONE_WALL.getDefaultState());
        wall_list = wall_set;
    }
    public static ArrayList<Object> getWall_list() { return wall_list; }

    // call methods to set private lists, called first in register list to avoid any issue
    public static void setBlockArrays() {
        setFall_hold();
        setGeneral_list();
        setSlab_list();
        setStair_list();
        setGravity_list();
        setWall_list();
        setAxis_list();
    }
}
