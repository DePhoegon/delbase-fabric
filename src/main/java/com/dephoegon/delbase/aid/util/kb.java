package com.dephoegon.delbase.aid.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;

import static com.dephoegon.delbase.aid.util.ModKeyBindings.R_CTRL;
import static com.dephoegon.delbase.aid.util.ModKeyBindings.R_SHIFT;
import static net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper.getBoundKeyOf;
import static net.minecraft.client.util.InputUtil.isKeyPressed;

public class kb {
    //  Right ones commented code out. 1.18.2 is just ...   IDK, I've no luck with keybinding conflicts - will keep till I decide how to handle the rest of the versions.
    private static boolean RShift() { return isKB_KeyBindDown(R_SHIFT); }
    private static boolean RCtrl() { return isKB_KeyBindDown(R_CTRL); }
    public static boolean HShift() { return RShift(); }
    public static boolean HCtrl() { return RCtrl(); }

    public static boolean isKB_KeyBindDown(KeyBinding mapping) {
        if (mapping == null) { return false; }
        InputUtil.Key key = getBoundKeyOf(mapping);
        int Keycode = key.getCode();
        return keyCheck(key.getCategory(), Keycode);
    }
    // private static boolean keyCheck (int Keycode) { return keyCheck(InputUtil.Type.KEYSYM, Keycode); }
    public static boolean keyCheck(InputUtil.Type type, int Keycode) {
        if (type != InputUtil.Type.KEYSYM) { return false; }
        return isKeyPressed(MinecraftClient.getInstance().getWindow().getHandle(), Keycode);
    }
    /*
    public static boolean isKeyBindDefault(KeyBinding mapping) {
        if (mapping != null) { return mapping.isDefault(); }
        return false;
    }
     */
}