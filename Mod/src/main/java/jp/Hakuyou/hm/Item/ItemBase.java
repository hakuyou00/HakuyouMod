package jp.Hakuyou.hm.Item;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name)
    {
        super();
        setUnlocalizedName(name);
        setRegistryName(Main.MODID,name);
        setCreativeTab(Main.creativeTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
