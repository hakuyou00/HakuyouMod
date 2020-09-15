package jp.Hakuyou.hm.Tab;

import jp.Hakuyou.hm.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {
    public ModTab(String tabName)
    {
        super(tabName);
    }
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.FireSword);
    }
}
