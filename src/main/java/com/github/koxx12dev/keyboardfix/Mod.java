package com.github.koxx12dev.keyboardfix;

import net.minecraft.client.settings.KeyBinding;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.event.EventBus;
import net.weavemc.loader.api.event.KeyboardEvent;

import static org.lwjgl.input.Keyboard.*;

public class Mod implements ModInitializer {
    //based on https://raw.githubusercontent.com/Leo3418/mckeyboardfix/master/src/main/java/io/github/leo3418/mckeyboardfix/MCKeyboardFix.java
    @Override
    public void preInit() {
        EventBus.subscribe(KeyboardEvent.class, keyboardEvent -> {
            switch (keyboardEvent.getKeyCode()) {
                case KEY_CIRCUMFLEX: // Shift-6
                    KeyBinding.onTick(KEY_6);
                    KeyBinding.onTick(KEY_5);
                    KeyBinding.onTick(KEY_4);
                    KeyBinding.onTick(KEY_3);
                    // Fall through
                case KEY_AT: // Shift-2
                    KeyBinding.onTick(KEY_2);
                    KeyBinding.onTick(KEY_1);
            }
        });
    }
}