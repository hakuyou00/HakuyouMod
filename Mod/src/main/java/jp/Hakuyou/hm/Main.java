package jp.Hakuyou.hm;

import jp.Hakuyou.hm.Event.AttackEvent;
import jp.Hakuyou.hm.Event.ClickEvent;
import jp.Hakuyou.hm.Event.KeyEvent;
import jp.Hakuyou.hm.GUI.GuiHandler;
import jp.Hakuyou.hm.Key.KeyBindings;
import jp.Hakuyou.hm.Tab.ModTab;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.proxy.CommonProxy;
import jp.Hakuyou.hm.world.ModWorldGen;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Main.MODID,
        name = Main.NAME,
        version = Main.VERSION
)
public class Main
{
    public static final String MODID = "hm";
    public static final String NAME = "Hakuyou Mod";
    public static final String VERSION = "1.0.0";

    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "jp.Hakuyou.hm.proxy.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "jp.Hakuyou.hm.proxy.CommonProxy";

    public static Logger logger;

    public int PushedButtonNum = 0;
    public String[] Button_Texts = { "Selected","Change","Change"};

    @Mod.Instance(MODID)
    public static Main INSTANCE;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new ModTab("hakuyoumod");

    public static final int GUI_ID = 0;
    public static final ResourceLocation rodGUI =
            new ResourceLocation( "hm:textures/gui/rodgui.png");

    @EventHandler
    public void Load(FMLPreInitializationEvent event)
    {
        KeyBindings.init();
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new AttackEvent());
        MinecraftForge.EVENT_BUS.register(new ClickEvent());
        MinecraftForge.EVENT_BUS.register(new KeyEvent());
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();

        GameRegistry.registerWorldGenerator(new ModWorldGen(),3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(this,new GuiHandler());
    }

    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event)
    {

    }
}
