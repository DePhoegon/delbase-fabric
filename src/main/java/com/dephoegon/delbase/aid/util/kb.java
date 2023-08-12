package com.dephoegon.delbase.aid.util;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import static com.dephoegon.delbase.aid.util.KeyBindings.L_CTRL;
import static com.dephoegon.delbase.aid.util.KeyBindings.L_SHIFT;
import static net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper.getBoundKeyOf;
import static net.minecraft.client.util.InputUtil.isKeyPressed;

public class kb {
    private static boolean lShift;
    private static boolean lCtrl;
    private static boolean LShift() { return lShift; }
    private static boolean RShift() { return keyCheck(GLFW.GLFW_KEY_RIGHT_SHIFT); }
    private static boolean LCtrl() { return lCtrl; }
    private static boolean RCtrl() { return keyCheck(GLFW.GLFW_KEY_RIGHT_CONTROL); }
    public static boolean HShift() { return isKeyBindDefault(L_SHIFT) ? LShift() || RShift() : LShift(); }
    public static boolean HCtrl() { return isKeyBindDefault(L_CTRL) ? LCtrl() || RCtrl() : LCtrl(); }
    public static void keyBinds() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (L_SHIFT.wasPressed()) { lShift = true; }
            while (!L_SHIFT.wasPressed()) { lShift = false; }
            while (L_CTRL.wasPressed()) { lCtrl = true; }
            while (!L_CTRL.wasPressed()) { lCtrl = false; }
        });
    }

    public static boolean isKB_KeyBindDown(KeyBinding mapping) {
        if (mapping == null) { return false; }
        InputUtil.Key key = getBoundKeyOf(mapping);
        int Keycode = key.getCode();
        return keyCheck(key.getCategory(), Keycode);
    }
    private static boolean keyCheck (int Keycode) { return keyCheck(InputUtil.Type.KEYSYM, Keycode); }
    public static boolean keyCheck(InputUtil.Type type, int Keycode) {
        if (type != InputUtil.Type.KEYSYM) { return false; }
        return isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), Keycode);
    }
    public static boolean isKeyBindDefault(KeyBinding mapping) {
        if (mapping != null) { return mapping.isDefault(); }
        return false;
    }
}
