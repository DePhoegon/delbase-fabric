package com.dephoegon.delbase.aid.recipe;

import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

import static com.dephoegon.delbase.aid.world.defaultVariables.dNetherriteBonusRolls;
import static com.dephoegon.delbase.aid.world.globalVariables.*;
import static net.minecraft.item.Items.*;

public class TierRandomDropAid {
    public static @NotNull SimpleInventory stoneContainer(int size) {
        SimpleInventory stone = new SimpleInventory(size);
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(5);
            switch (RNGs) {
                case 0 -> stone.setStack(i, new ItemStack(STICK));
                case 2 -> stone.setStack(i, new ItemStack(BLACKSTONE));
                case 3 -> stone.setStack(i, new ItemStack(COBBLED_DEEPSLATE));
                default -> stone.setStack(i, new ItemStack(COBBLESTONE));
            }
        }
        return stone;
    }
    public static @NotNull SimpleInventory woodContainer(int size) {
        SimpleInventory stone = new SimpleInventory(size);
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(11);
            switch (RNGs) {
                case 0 -> stone.setStack(i, new ItemStack(STICK));
                case 1 -> stone.setStack(i, new ItemStack(ACACIA_PLANKS));
                case 2 -> stone.setStack(i, new ItemStack(DARK_OAK_PLANKS));
                case 4 -> stone.setStack(i, new ItemStack(JUNGLE_PLANKS));
                case 5 -> stone.setStack(i, new ItemStack(BIRCH_PLANKS));
                case 6 -> stone.setStack(i, new ItemStack(SPRUCE_PLANKS));
                case 8 -> stone.setStack(i, new ItemStack(CRIMSON_PLANKS));
                case 9 -> stone.setStack(i, new ItemStack(WARPED_PLANKS));
                default -> stone.setStack(i, new ItemStack(OAK_PLANKS));
            }
        }
        return stone;
    }
    public static @NotNull SimpleInventory netheriteToolsBonus(int diamond) {
        int bonusSize = getValueOrDefault(getStaticNetherriteBonusRolls(), dNetherriteBonusRolls);
        SimpleInventory stone = new SimpleInventory(bonusSize+diamond);
        for (int i = 0; i < diamond; i++) {
            stone.setStack(i, new ItemStack(DIAMOND));
        }
        for (int i = 0; i < bonusSize; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(5);
            if (RNGs > 2) { stone.setStack(i+diamond, new ItemStack(STICK)); }
        }
        return stone;
    }
    public static @NotNull SimpleInventory ToolsBonus() {
        int bonusSize = getValueOrDefault(getStaticNetherriteBonusRolls(), dNetherriteBonusRolls);
        SimpleInventory stone = new SimpleInventory(bonusSize);
        for (int i = 0; i < bonusSize; i++) {
            Random random = new Random();
            int RNGs = random.nextInt(5);
            if (RNGs > 2) { stone.setStack(i, new ItemStack(STICK)); }
        }
        return stone;
    }
}
