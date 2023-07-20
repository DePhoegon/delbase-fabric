package com.dephoegon.delbase.aid.world;

import net.minecraft.nbt.NbtCompound;
import org.jetbrains.annotations.NotNull;

public class globalVariables {
    private static int stationCraftTime;
    public static final String stationCraftTime1 = "station_craft_time";
    private static int woodSalvageRolls;
    public static final String woodSalvageRolls1 = "wood_salvage_rolls";
    private static int stoneSalvageRolls;
    public static final String stoneSalvageRolls1 = "stone_salvage_rolls";
    private static int netherriteBonusRolls;
    public static final String netherriteBonusRolls1 = "netherrite_bonus_rolls";
    private static int netherriteChestDiamondBonus;
    public static final String netherriteChestDiamondBonus1 = "netherrite_chest_diamond_bonus";
    private static int netherriteHelmetDiamondBonus;
    public static final String netherriteHelmetDiamondBonus1 = "netherrite_helmet_diamond_bonus";
    private static int netherriteLeggingsDiamondBonus;
    public static final String netherriteLeggingsDiamondBonus1 = "netherrite_leggings_diamond_bonus";
    private static int netherriteBootsDiamondBonus;
    public static final String netherriteBootsDiamondBonus1 = "netherrite_boots_diamond_bonus";
    private static int netherriteSwordDiamondBonus;
    public static final String netherriteSwordDiamondBonus1 = "netherrite_sword_diamond_bonus";
    private static int netherriteAxeDiamondBonus;
    public static final String netherriteAxeDiamondBonus1 = "netherrite_axe_diamond_bonus";
    private static int netherritePickAxeDiamondBonus;
    public static final String netherritePickAxeDiamondBonus1 = "netherrite_pickaxe_diamond_bonus";
    public globalVariables() { }
    public globalVariables (NbtCompound nbt) { fromNbt(nbt); }
    public NbtCompound toNbt(@NotNull NbtCompound nbt) {
        nbt.putInt(stationCraftTime1, stationCraftTime);
        nbt.putInt(woodSalvageRolls1, woodSalvageRolls);
        nbt.putInt(stoneSalvageRolls1, stoneSalvageRolls);
        nbt.putInt(netherriteBonusRolls1, netherriteBonusRolls);
        nbt.putInt(netherriteChestDiamondBonus1, netherriteChestDiamondBonus);
        nbt.putInt(netherriteHelmetDiamondBonus1, netherriteHelmetDiamondBonus);
        nbt.putInt(netherriteLeggingsDiamondBonus1, netherriteLeggingsDiamondBonus);
        nbt.putInt(netherriteBootsDiamondBonus1, netherriteBootsDiamondBonus);
        nbt.putInt(netherriteSwordDiamondBonus1, netherriteSwordDiamondBonus);
        nbt.putInt(netherriteAxeDiamondBonus1, netherriteAxeDiamondBonus);
        nbt.putInt(netherritePickAxeDiamondBonus1, netherritePickAxeDiamondBonus);
        return nbt;
    }
    public void fromNbt(@NotNull NbtCompound nbt) {
        stationCraftTime = nbt.getInt(stationCraftTime1);
        woodSalvageRolls = nbt.getInt(woodSalvageRolls1);
        stoneSalvageRolls = nbt.getInt(stoneSalvageRolls1);
        netherriteBonusRolls = nbt.getInt(netherriteBonusRolls1);
        netherriteChestDiamondBonus = nbt.getInt(netherriteChestDiamondBonus1);
        netherriteHelmetDiamondBonus = nbt.getInt(netherriteHelmetDiamondBonus1);
        netherriteLeggingsDiamondBonus = nbt.getInt(netherriteLeggingsDiamondBonus1);
        netherriteBootsDiamondBonus = nbt.getInt(netherriteBootsDiamondBonus1);
        netherriteSwordDiamondBonus = nbt.getInt(netherriteSwordDiamondBonus1);
        netherriteAxeDiamondBonus = nbt.getInt(netherriteAxeDiamondBonus1);
        netherritePickAxeDiamondBonus = nbt.getInt(netherritePickAxeDiamondBonus1);
    }
    public int getStationCraftTime() { return stationCraftTime; }
    public static Integer getStaticStationCraftTime() { return stationCraftTime; }
    public int getWoodSalvageRolls() { return woodSalvageRolls; }
    public static Integer getStaticWoodSalvageRolls() { return woodSalvageRolls; }
    public int getStoneSalvageRolls() { return stoneSalvageRolls; }
    public static Integer getStaticStoneSalvageRolls() { return stoneSalvageRolls; }
    public int getNetherriteBonusRolls() { return netherriteBonusRolls; }
    public static Integer getStaticNetherriteBonusRolls() { return netherriteBonusRolls; }
    public int getNetherriteChestDiamondBonus() { return netherriteChestDiamondBonus; }
    public static Integer getStaticNetherriteChestDiamondBonus() { return netherriteChestDiamondBonus; }
    public int getNetherriteHelmetDiamondBonus() { return netherriteHelmetDiamondBonus; }
    public static Integer getStaticNetherriteHelmetDiamondBonus() { return netherriteHelmetDiamondBonus; }
    public int getNetherriteLeggingsDiamondBonus() { return netherriteLeggingsDiamondBonus; }
    public static Integer getStaticNetherriteLeggingsDiamondBonus() { return netherriteLeggingsDiamondBonus; }
    public int getNetherriteAxeDiamondBonus() { return netherriteAxeDiamondBonus; }
    public static Integer getStaticNetherriteAxeDiamondBonus() { return netherriteAxeDiamondBonus; }
    public int getNetherriteSwordDiamondBonus() { return netherriteSwordDiamondBonus; }
    public static Integer getStaticNetherriteSwordDiamondBonus() { return netherriteSwordDiamondBonus; }
    public int getNetherriteBootsDiamondBonus() { return netherriteBootsDiamondBonus; }
    public static Integer getStaticNetherriteBootsDiamondBonus() { return netherriteBootsDiamondBonus; }
    public int getNetherritePickAxeDiamondBonus() { return netherritePickAxeDiamondBonus; }
    public static Integer getStaticNetherritePickAxeDiamondBonus() { return netherritePickAxeDiamondBonus; }
    public static void setNetherriteBonusRolls(int netherriteBonusRolls) { globalVariables.netherriteBonusRolls = netherriteBonusRolls; }
    public static void setNetherriteAxeDiamondBonus(int netherriteAxeDiamondBonus) { globalVariables.netherriteAxeDiamondBonus = netherriteAxeDiamondBonus; }
    public static void setNetherriteBootsDiamondBonus(int netherriteBootsDiamondBonus) { globalVariables.netherriteBootsDiamondBonus = netherriteBootsDiamondBonus; }
    public static void setNetherriteChestDiamondBonus(int netherriteChestDiamondBonus) { globalVariables.netherriteChestDiamondBonus = netherriteChestDiamondBonus; }
    public static void setNetherriteHelmetDiamondBonus(int netherriteHelmetDiamondBonus) { globalVariables.netherriteHelmetDiamondBonus = netherriteHelmetDiamondBonus; }
    public static void setNetherriteLeggingsDiamondBonus(int netherriteLeggingsDiamondBonus) { globalVariables.netherriteLeggingsDiamondBonus = netherriteLeggingsDiamondBonus; }
    public static void setNetherriteSwordDiamondBonus(int netherriteSwordDiamondBonus) { globalVariables.netherriteSwordDiamondBonus = netherriteSwordDiamondBonus; }
    public static void setStationCraftTime(int stationCraftTime) { globalVariables.stationCraftTime = stationCraftTime; }
    public static void setNetherritePickAxeDiamondBonus(int netherritePickAxeDiamondBonus) { globalVariables.netherritePickAxeDiamondBonus = netherritePickAxeDiamondBonus; }
    public static void setStoneSalvageRolls(int stoneSalvageRolls) { globalVariables.stoneSalvageRolls = stoneSalvageRolls; }
    public static void setWoodSalvageRolls(int woodSalvageRolls) { globalVariables.woodSalvageRolls = woodSalvageRolls; }
    public static int getValueOrDefault(Integer value, int defaultValue) {
        if (value != null) { return value; }
        return defaultValue;
    }
}