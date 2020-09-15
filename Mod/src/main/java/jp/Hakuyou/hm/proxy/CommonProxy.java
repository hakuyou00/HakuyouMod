package jp.Hakuyou.hm.proxy;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModBlocks;
import jp.Hakuyou.hm.init.ModItems;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber
public class CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {}

    public void registerClientInfo() {}

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {}
}
