package com.dephoegon.delbase.aid.world;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.util.delbaseLogger;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtIo;
import net.minecraft.util.Identifier;
import net.minecraft.util.WorldSavePath;
import org.jetbrains.annotations.NotNull;

import java.io.*;

public class serverVariableAccess {
    public static final Identifier DELBASE_CONFIG_VARIABLES = new Identifier(Delbase.Delbase_ID, "config-variables");
    public void init() {
        ServerWorldEvents.LOAD.register((server, world) -> {
            if (!world.isClient()) {
                File file = new File(world.getServer().getSavePath(WorldSavePath.ROOT).toFile(), DELBASE_CONFIG_VARIABLES.toString().replace(':', '_'));
                if (file.exists()) {
                    try (DataInputStream input = new DataInputStream(new FileInputStream(file))) {
                        globalVariablesHolder storedVariables = new globalVariablesHolder(NbtIo.readCompressed(input));
                        setDelbaseConfigVariables(storedVariables);
                        // Use globalVariables here
                    } catch (IOException e) {
                        // Handle error
                        delbaseLogger.DEL_LOGGER.warn("Loaded Default Variables\nFailed to load saved global variables data: " + e.getMessage());
                        defaultVariables.setDefaultValues();
                    }
                } else {
                    defaultVariables.setDefaultValues();
                    delbaseLogger.DEL_LOGGER.info("Loaded Default Variables, File did not exist");
                }
            }
        });

        ServerWorldEvents.UNLOAD.register((server, world) -> {
            if (!world.isClient()) {

                File file = new File(world.getServer().getSavePath(WorldSavePath.ROOT).toFile(), DELBASE_CONFIG_VARIABLES.toString().replace(':', '_'));
                try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
                    globalVariablesHolder currentVariables = new globalVariablesHolder();
                    getCurrentGlobalVariables(currentVariables);
                    // Set globalVariables here
                    NbtIo.writeCompressed(currentVariables.toNbt(new NbtCompound()), output);
                } catch (IOException e) {
                    // Handle error
                    delbaseLogger.DEL_LOGGER.warn("Failure to save global Variables data : "+ e.getMessage());
                }
            }
        });
    }
    private void setDelbaseConfigVariables(@NotNull globalVariablesHolder variables) {
        StaticGlobalVariables.setStationCraftTime(variables.getStationCraftTime());
        StaticGlobalVariables.setWoodSalvageRolls(variables.getWoodSalvageRolls());
        StaticGlobalVariables.setStoneSalvageRolls(variables.getStoneSalvageRolls());
        StaticGlobalVariables.setNetherriteBonusRolls(variables.getNetherriteBonusRolls());
        StaticGlobalVariables.setNetherriteChestDiamondBonus(variables.getNetherriteChestDiamondBonus());
        StaticGlobalVariables.setNetherriteHelmetDiamondBonus(variables.getNetherriteHelmetDiamondBonus());
        StaticGlobalVariables.setNetherriteLeggingsDiamondBonus(variables.getNetherriteLeggingsDiamondBonus());
        StaticGlobalVariables.setNetherriteAxeDiamondBonus(variables.getNetherriteAxeDiamondBonus());
        StaticGlobalVariables.setNetherriteSwordDiamondBonus(variables.getNetherriteSwordDiamondBonus());
        StaticGlobalVariables.setNetherriteBootsDiamondBonus(variables.getNetherriteBootsDiamondBonus());
        StaticGlobalVariables.setNetherritePickAxeDiamondBonus(variables.getNetherritePickAxeDiamondBonus());
    }
    public void getCurrentGlobalVariables(@NotNull globalVariablesHolder currentVariables) {
        currentVariables.setStationCraftTime(StaticGlobalVariables.getStaticStationCraftTime());
        currentVariables.setWoodSalvageRolls(StaticGlobalVariables.getStaticWoodSalvageRolls());
        currentVariables.setStoneSalvageRolls(StaticGlobalVariables.getStaticStoneSalvageRolls());
        currentVariables.setNetherriteBonusRolls(StaticGlobalVariables.getStaticNetherriteBonusRolls());
        currentVariables.setNetherriteChestDiamondBonus(StaticGlobalVariables.getStaticNetherriteChestDiamondBonus());
        currentVariables.setNetherriteHelmetDiamondBonus(StaticGlobalVariables.getStaticNetherriteHelmetDiamondBonus());
        currentVariables.setNetherriteLeggingsDiamondBonus(StaticGlobalVariables.getStaticNetherriteLeggingsDiamondBonus());
        currentVariables.setNetherriteAxeDiamondBonus(StaticGlobalVariables.getStaticNetherriteAxeDiamondBonus());
        currentVariables.setNetherriteSwordDiamondBonus(StaticGlobalVariables.getStaticNetherriteSwordDiamondBonus());
        currentVariables.setNetherriteBootsDiamondBonus(StaticGlobalVariables.getStaticNetherriteBootsDiamondBonus());
        currentVariables.setNetherritePickAxeDiamondBonus(StaticGlobalVariables.getStaticNetherritePickAxeDiamondBonus());
    }
}