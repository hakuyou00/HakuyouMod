package jp.Hakuyou.hm.Item.Tools;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class Pickaxe extends ItemPickaxe implements IHasModel {
    public Pickaxe(String name,ToolMaterial material,int damage)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(Main.MODID,name);
        setCreativeTab(Main.creativeTab);
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
