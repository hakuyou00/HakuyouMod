package jp.Hakuyou.hm.Item.Foods;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;


public class FoodBase extends ItemFood implements IHasModel {
    public FoodBase(String name,int amount,float saturation,boolean isAnimalFood)
    {
        super(amount,saturation,isAnimalFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(Main.MODID,name);
        this.setCreativeTab(Main.creativeTab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this,0,"inventory");
    }
}
