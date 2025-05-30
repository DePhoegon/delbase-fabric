package com.dephoegon.delbase.aid.util;

import com.dephoegon.delbase.Delbase;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class ModKeyBindings {
    public static KeyBinding R_SHIFT = registerKB_Keys("tooltip.key.shift", GLFW.GLFW_KEY_RIGHT_SHIFT);
    public static KeyBinding R_CTRL = registerKB_Keys("tooltip.key.ctrl", GLFW.GLFW_KEY_RIGHT_CONTROL);

    private static KeyBinding registerKB_Keys(String name, int keyCode) {
        return KeyBindingHelper.registerKeyBinding(new KeyBinding(name, InputUtil.Type.KEYSYM, keyCode, "tooltip.key.category"));
    }
    public static void registerKeyBinds() { Delbase.LOGGER.info("Registering KeyBinds for "+Delbase.Delbase_ID); }
}
