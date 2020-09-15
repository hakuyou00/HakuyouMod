package jp.Hakuyou.hm.Item.Tools;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;

public class Sword extends ItemSword implements IHasModel {
    public Sword(String name, ToolMaterial material, int damage)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(Main.MODID,name);
        setCreativeTab(Main.creativeTab);
        setMaxDamage(damage);
        setMaxStackSize(1);


        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
