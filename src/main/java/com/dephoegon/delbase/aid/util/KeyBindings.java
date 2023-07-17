package com.dephoegon.delbase.aid.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

@Environment(EnvType.CLIENT)
public class KeyBindings {
    public static KeyBinding L_SHIFT = registerKB_Keys("tooltip.key.shift", InputUtil.GLFW_KEY_LEFT_SHIFT);
    public static KeyBinding L_CTRL = registerKB_Keys("tooltip.key.ctrl", InputUtil.GLFW_KEY_LEFT_CONTROL);

    private static KeyBinding registerKB_Keys(String name, int keyCode) {
        return KeyBindingHelper.registerKeyBinding(new KeyBinding(name, InputUtil.Type.KEYSYM, keyCode, "tooltip.key.category"));
    }
}
