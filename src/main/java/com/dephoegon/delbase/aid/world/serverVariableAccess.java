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
    public static final Identifier DELBASE_CONFIG_VARIABLES = new Identifier(Delbase.Delbase_ID, "delbase_config_variables");
    public void init() {
        ServerWorldEvents.LOAD.register((server, world) -> {
            if (!world.isClient()) {
                File file = new File(world.getServer().getSavePath(WorldSavePath.ROOT).toFile(), DELBASE_CONFIG_VARIABLES.toString());
                if (file.exists()) {
                    try (DataInputStream input = new DataInputStream(new FileInputStream(file))) {
                        globalVariables storedVariables = new globalVariables(NbtIo.readCompressed(input));
                        setDelbaseConfigVariables(storedVariables);
                        // Use globalVariables here
                    } catch (IOException e) {
                        // Handle error
                        delbaseLogger.LOGGER.warn("Loaded Default Variables\nFailed to load saved global variables data: " + e.getMessage());
                        defaultVariables.setDefaultValues();
                    }
                } else { defaultVariables.setDefaultValues(); }
            }
        });

        ServerWorldEvents.UNLOAD.register((server, world) -> {
            if (!world.isClient()) {
                File file = new File(world.getServer().getSavePath(WorldSavePath.ROOT).toFile(), DELBASE_CONFIG_VARIABLES.toString());
                try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
                    globalVariables globalVariables = new globalVariables();
                    // Set globalVariables here
                    NbtIo.writeCompressed(globalVariables.toNbt(new NbtCompound()), output);
                } catch (IOException e) {
                    // Handle error
                    delbaseLogger.LOGGER.warn("Failure to save global Variables data : "+ e.getMessage());
                }
            }
        });
    }
    private void setDelbaseConfigVariables(@NotNull globalVariables variables) {
        globalVariables.setStationCraftTime(variables.getStationCraftTime());
        globalVariables.setWoodSalvageRolls(variables.getWoodSalvageRolls());
        globalVariables.setStoneSalvageRolls(variables.getStoneSalvageRolls());
        globalVariables.setNetherriteBonusRolls(variables.getNetherriteBonusRolls());
        globalVariables.setNetherriteChestDiamondBonus(variables.getNetherriteChestDiamondBonus());
        globalVariables.setNetherriteHelmetDiamondBonus(variables.getNetherriteHelmetDiamondBonus());
        globalVariables.setNetherriteLeggingsDiamondBonus(variables.getNetherriteLeggingsDiamondBonus());
        globalVariables.setNetherriteAxeDiamondBonus(variables.getNetherriteAxeDiamondBonus());
        globalVariables.setNetherriteSwordDiamondBonus(variables.getNetherriteSwordDiamondBonus());
        globalVariables.setNetherriteBootsDiamondBonus(variables.getNetherriteBootsDiamondBonus());
        globalVariables.setNetherritePickAxeDiamondBonus(variables.getNetherritePickAxeDiamondBonus());
    }
}
