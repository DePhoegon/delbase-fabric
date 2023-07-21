package com.dephoegon.delbase.aid.world;

import net.minecraft.nbt.NbtCompound;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.world.StaticGlobalVariables.*;

public class globalVariablesHolder {
    private int stationCraftTime;
    private int woodSalvageRolls;
    private int stoneSalvageRolls;
    private int netherriteBonusRolls;
    private int netherriteChestDiamondBonus;
    private int netherriteHelmetDiamondBonus;
    private int netherriteLeggingsDiamondBonus;
    private int netherriteBootsDiamondBonus;
    private int netherriteSwordDiamondBonus;
    private int netherriteAxeDiamondBonus;
    private int netherritePickAxeDiamondBonus;

    public globalVariablesHolder() { }
    public globalVariablesHolder(NbtCompound nbt) { fromNbt(nbt); }
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

    public int getStationCraftTime() { return this.stationCraftTime; }
    public int getWoodSalvageRolls() { return this.woodSalvageRolls; }
    public int getStoneSalvageRolls() { return this.stoneSalvageRolls; }
    public int getNetherriteBonusRolls() { return this.netherriteBonusRolls; }
    public int getNetherriteChestDiamondBonus() { return this.netherriteChestDiamondBonus; }
    public int getNetherriteHelmetDiamondBonus() { return this.netherriteHelmetDiamondBonus; }
    public int getNetherriteLeggingsDiamondBonus() { return this.netherriteLeggingsDiamondBonus; }
    public int getNetherriteAxeDiamondBonus() { return this.netherriteAxeDiamondBonus; }
    public int getNetherriteSwordDiamondBonus() { return this.netherriteSwordDiamondBonus; }
    public int getNetherriteBootsDiamondBonus() { return this.netherriteBootsDiamondBonus; }
    public int getNetherritePickAxeDiamondBonus() { return this.netherritePickAxeDiamondBonus; }
    public void setNetherriteBonusRolls(int netherriteBonusRolls) { this.netherriteBonusRolls = netherriteBonusRolls; }
    public void setNetherriteAxeDiamondBonus(int netherriteAxeDiamondBonus) { this.netherriteAxeDiamondBonus = netherriteAxeDiamondBonus; }
    public void setNetherriteBootsDiamondBonus(int netherriteBootsDiamondBonus) { this.netherriteBootsDiamondBonus = netherriteBootsDiamondBonus; }
    public void setNetherriteChestDiamondBonus(int netherriteChestDiamondBonus) { this.netherriteChestDiamondBonus = netherriteChestDiamondBonus; }
    public void setNetherriteHelmetDiamondBonus(int netherriteHelmetDiamondBonus) { this.netherriteHelmetDiamondBonus = netherriteHelmetDiamondBonus; }
    public void setNetherriteLeggingsDiamondBonus(int netherriteLeggingsDiamondBonus) { this.netherriteLeggingsDiamondBonus = netherriteLeggingsDiamondBonus; }
    public void setNetherriteSwordDiamondBonus(int netherriteSwordDiamondBonus) { this.netherriteSwordDiamondBonus = netherriteSwordDiamondBonus; }
    public void setStationCraftTime(int stationCraftTime) { this.stationCraftTime = stationCraftTime; }
    public void setNetherritePickAxeDiamondBonus(int netherritePickAxeDiamondBonus) { this.netherritePickAxeDiamondBonus = netherritePickAxeDiamondBonus; }
    public void setStoneSalvageRolls(int stoneSalvageRolls) { this.stoneSalvageRolls = stoneSalvageRolls; }
    public void setWoodSalvageRolls(int woodSalvageRolls) { this.woodSalvageRolls = woodSalvageRolls; }
}
