package jp.Hakuyou.hm.Key;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class KeyBindings {
    private static final String category = "hm.binding.cat";

    public static final KeyBinding keyBinding =
            new KeyBinding("hm.binding.sample", Keyboard.KEY_Y,category);

    public static void init()
    {
        ClientRegistry.registerKeyBinding(keyBinding);
    }
}
