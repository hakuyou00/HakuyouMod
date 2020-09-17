package jp.Hakuyou.hm.Item.Tools;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.util.IHasModel;
import net.minecraft.item.Item;

public class Rod extends Item implements IHasModel {
    public Rod(String name,int damage)
    {
        super();
        setRegistryName(Main.MODID,name);
        setCreativeTab(Main.creativeTab);
        setUnlocalizedName(name);
        setMaxStackSize(1);
        setMaxDamage(damage);

        registerModels();
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
