package com.dephoegon.delbase.aid.world;

public class StaticGlobalVariables {
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
    public StaticGlobalVariables() { }
    public static Integer getStaticStationCraftTime() { return stationCraftTime; }
    public static Integer getStaticWoodSalvageRolls() { return woodSalvageRolls; }
    public static Integer getStaticStoneSalvageRolls() { return stoneSalvageRolls; }
    public static Integer getStaticNetherriteBonusRolls() { return netherriteBonusRolls; }
    public static Integer getStaticNetherriteChestDiamondBonus() { return netherriteChestDiamondBonus; }
    public static Integer getStaticNetherriteHelmetDiamondBonus() { return netherriteHelmetDiamondBonus; }
    public static Integer getStaticNetherriteLeggingsDiamondBonus() { return netherriteLeggingsDiamondBonus; }
    public static Integer getStaticNetherriteAxeDiamondBonus() { return netherriteAxeDiamondBonus; }
    public static Integer getStaticNetherriteSwordDiamondBonus() { return netherriteSwordDiamondBonus; }
    public static Integer getStaticNetherriteBootsDiamondBonus() { return netherriteBootsDiamondBonus; }
    public static Integer getStaticNetherritePickAxeDiamondBonus() { return netherritePickAxeDiamondBonus; }
    public static void setNetherriteBonusRolls(int netherriteBonusRolls) { StaticGlobalVariables.netherriteBonusRolls = netherriteBonusRolls; }
    public static void setNetherriteAxeDiamondBonus(int netherriteAxeDiamondBonus) { StaticGlobalVariables.netherriteAxeDiamondBonus = netherriteAxeDiamondBonus; }
    public static void setNetherriteBootsDiamondBonus(int netherriteBootsDiamondBonus) { StaticGlobalVariables.netherriteBootsDiamondBonus = netherriteBootsDiamondBonus; }
    public static void setNetherriteChestDiamondBonus(int netherriteChestDiamondBonus) { StaticGlobalVariables.netherriteChestDiamondBonus = netherriteChestDiamondBonus; }
    public static void setNetherriteHelmetDiamondBonus(int netherriteHelmetDiamondBonus) { StaticGlobalVariables.netherriteHelmetDiamondBonus = netherriteHelmetDiamondBonus; }
    public static void setNetherriteLeggingsDiamondBonus(int netherriteLeggingsDiamondBonus) { StaticGlobalVariables.netherriteLeggingsDiamondBonus = netherriteLeggingsDiamondBonus; }
    public static void setNetherriteSwordDiamondBonus(int netherriteSwordDiamondBonus) { StaticGlobalVariables.netherriteSwordDiamondBonus = netherriteSwordDiamondBonus; }
    public static void setStationCraftTime(int stationCraftTime) { StaticGlobalVariables.stationCraftTime = stationCraftTime; }
    public static void setNetherritePickAxeDiamondBonus(int netherritePickAxeDiamondBonus) { StaticGlobalVariables.netherritePickAxeDiamondBonus = netherritePickAxeDiamondBonus; }
    public static void setStoneSalvageRolls(int stoneSalvageRolls) { StaticGlobalVariables.stoneSalvageRolls = stoneSalvageRolls; }
    public static void setWoodSalvageRolls(int woodSalvageRolls) { StaticGlobalVariables.woodSalvageRolls = woodSalvageRolls; }
    public static int getValueOrDefault(Integer value, int defaultValue) {
        if (value != null) { return value; }
        return defaultValue;
    }
}