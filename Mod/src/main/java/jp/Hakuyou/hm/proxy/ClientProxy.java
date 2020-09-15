package jp.Hakuyou.hm.proxy;

import jp.Hakuyou.hm.Event.AttackEvent;
import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModBlocks;
import jp.Hakuyou.hm.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

@Mod.EventBusSubscriber
public class ClientProxy extends CommonProxy {

    public static EntityPlayer player = Minecraft.getMinecraft().player;

    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void registerClientInfo()
    {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        ModItems.ITEMS.forEach(s -> event.getRegistry().registerAll(s));
        ModBlocks.BLOCKS.forEach(s -> event.getRegistry().registerAll(
                new ItemBlock(s).setRegistryName(s.getRegistryName())
        ));
    }
}
