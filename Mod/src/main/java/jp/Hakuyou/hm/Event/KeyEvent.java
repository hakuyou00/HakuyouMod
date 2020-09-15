package jp.Hakuyou.hm.Event;

import jp.Hakuyou.hm.Key.KeyBindings;
import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.proxy.ClientProxy;
import jp.Hakuyou.hm.util.Util;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyEvent {
    @SubscribeEvent
    public void KeyBindingEvent(KeyInputEvent event)
    {
        if(KeyBindings.keyBinding.isPressed())
        {
            Util.client.player.openGui(Main.INSTANCE,Main.GUI_ID,Util.client.world,
                    (int)Util.client.player.posX,(int)Util.client.player.posY,(int)Util.client.player.posZ);
        }
    }
}
