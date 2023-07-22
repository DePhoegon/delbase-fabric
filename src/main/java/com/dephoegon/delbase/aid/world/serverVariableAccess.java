package com.dephoegon.delbase.aid.world;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtIo;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.WorldSavePath;
import org.jetbrains.annotations.NotNull;

import java.io.*;

import static com.dephoegon.delbase.aid.world.defaultVariables.*;

public class serverVariableAccess {
    public static final Identifier DELBASE_CONFIG_VARIABLES = new Identifier(Delbase.Delbase_ID, "config-variables");
    private long lastEventTime = 0;
    private long lastUnloadEventTime = 0;
    private final long COOL_DOWN = 5000; // 5 seconds
    public void init() {
        ServerLifecycleEvents.SERVER_STARTED.register(server -> {
            lastEventTime = System.currentTimeMillis();
            File load_file = new File(server.getSavePath(WorldSavePath.ROOT).toFile(), DELBASE_CONFIG_VARIABLES.toString().replace(':', '_'));
            if (load_file.exists()) {
                try (DataInputStream input = new DataInputStream(new FileInputStream(load_file))) {
                    globalVariablesHolder storedVariables = new globalVariablesHolder(NbtIo.readCompressed(input));
                    setDelbaseConfigVariables(storedVariables);
                    Delbase.LOGGER.info("(Delbase Mod) - Global Variables Set from Config file");
                    // Use globalVariables here
                } catch (IOException e) {
                    // Handle error
                    Delbase.LOGGER.warn("Loaded Default Variables\nFailed to load saved global variables data: " + e.getMessage());
                    defaultVariables.setDefaultValues();
                }
            } else {
                defaultVariables.setDefaultValues();
                Delbase.LOGGER.info("Loaded Default Variables, File did not exist");
            }
            ServerWorldEvents.LOAD.register((unusedServer, world) -> {
            if (!world.isClient()) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastEventTime > COOL_DOWN) {
                    lastEventTime = currentTime;
                    saveFile(server.getOverworld());
                }
            }
        });
        });

        ServerWorldEvents.UNLOAD.register((server, world) -> {
            if (!world.isClient()) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastUnloadEventTime > COOL_DOWN) {
                    lastUnloadEventTime = currentTime;
                    saveFile(server.getOverworld());
                }
            }
        });
    }
    private void saveFile(@NotNull ServerWorld world) {
        File file = new File(world.getServer().getSavePath(WorldSavePath.ROOT).toFile(), DELBASE_CONFIG_VARIABLES.toString().replace(':', '_'));
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(file))) {
            globalVariablesHolder currentVariables = new globalVariablesHolder();
            getCurrentGlobalVariables(currentVariables);
            // Set globalVariables here
            if (globalVariablesChanged(currentVariables)) {
                NbtIo.writeCompressed(currentVariables.toNbt(new NbtCompound()), output);
                Delbase.LOGGER.info("(Delbase Mod) - Global Variables Saved to Config file");
            }
        } catch (IOException e) {
            // Handle error
            Delbase.LOGGER.warn("Failure to save global Variables data : "+ e.getMessage());
        }
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
    private boolean globalVariablesChanged(@NotNull globalVariablesHolder currentVariables) {
        globalVariableNullCheck();

        if (currentVariables.getStationCraftTime() != StaticGlobalVariables.getStaticStationCraftTime()) { return true; }
        if (currentVariables.getWoodSalvageRolls() != StaticGlobalVariables.getStaticWoodSalvageRolls()) { return true; }
        if (currentVariables.getStoneSalvageRolls() != StaticGlobalVariables.getStaticStoneSalvageRolls()) { return true; }
        if (currentVariables.getNetherriteBonusRolls() != StaticGlobalVariables.getStaticNetherriteBonusRolls()) { return true; }
        if (currentVariables.getNetherriteChestDiamondBonus() != StaticGlobalVariables.getStaticNetherriteChestDiamondBonus()) { return true; }
        if (currentVariables.getNetherriteHelmetDiamondBonus() != StaticGlobalVariables.getStaticNetherriteHelmetDiamondBonus()) { return true; }
        if (currentVariables.getNetherriteLeggingsDiamondBonus() != StaticGlobalVariables.getStaticNetherriteLeggingsDiamondBonus()) { return true; }
        if (currentVariables.getNetherriteAxeDiamondBonus() != StaticGlobalVariables.getStaticNetherriteAxeDiamondBonus()) { return true; }
        if (currentVariables.getNetherriteSwordDiamondBonus() != StaticGlobalVariables.getStaticNetherriteSwordDiamondBonus()) { return true; }
        if (currentVariables.getNetherriteBootsDiamondBonus() != StaticGlobalVariables.getStaticNetherriteBootsDiamondBonus()) { return true; }
        return currentVariables.getNetherritePickAxeDiamondBonus() != StaticGlobalVariables.getStaticNetherritePickAxeDiamondBonus();
    }
    private void globalVariableNullCheck() {
        if (StaticGlobalVariables.getStaticStationCraftTime() == null) { StaticGlobalVariables.setStationCraftTime(dStationCraftTime); }
        if (StaticGlobalVariables.getStaticWoodSalvageRolls() == null) { StaticGlobalVariables.setWoodSalvageRolls(dWoodSalvageRolls); }
        if (StaticGlobalVariables.getStaticStoneSalvageRolls() == null) { StaticGlobalVariables.setStoneSalvageRolls(dStoneSalvageRolls); }
        if (StaticGlobalVariables.getStaticNetherriteBonusRolls() == null) { StaticGlobalVariables.setNetherriteBonusRolls(dNetherriteBonusRolls); }
        if (StaticGlobalVariables.getStaticNetherriteChestDiamondBonus() == null) { StaticGlobalVariables.setNetherriteChestDiamondBonus(dNetherriteChestDiamondBonus); }
        if (StaticGlobalVariables.getStaticNetherriteHelmetDiamondBonus() == null) { StaticGlobalVariables.setNetherriteHelmetDiamondBonus(dNetherriteHelmetDiamondBonus); }
        if (StaticGlobalVariables.getStaticNetherriteLeggingsDiamondBonus() == null) { StaticGlobalVariables.setNetherriteLeggingsDiamondBonus(dNetherriteLeggingsDiamondBonus); }
        if (StaticGlobalVariables.getStaticNetherriteAxeDiamondBonus() == null) { StaticGlobalVariables.setNetherriteAxeDiamondBonus(dNetherriteAxeDiamondBonus); }
        if (StaticGlobalVariables.getStaticNetherriteSwordDiamondBonus() == null) { StaticGlobalVariables.setNetherriteSwordDiamondBonus(dNetherriteSwordDiamondBonus); }
        if (StaticGlobalVariables.getStaticNetherriteBootsDiamondBonus() == null) { StaticGlobalVariables.setNetherriteBootsDiamondBonus(dNetherriteBootsDiamondBonus); }
        if (StaticGlobalVariables.getStaticNetherritePickAxeDiamondBonus() == null) { StaticGlobalVariables.setNetherritePickAxeDiamondBonus(dNetherritePickAxeDiamondBonus); }
    }
}