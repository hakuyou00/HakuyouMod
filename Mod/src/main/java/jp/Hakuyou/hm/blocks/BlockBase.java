package jp.Hakuyou.hm.blocks;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModBlocks;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material,float hardness,float resistance)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(Main.MODID,name);
        setCreativeTab(Main.creativeTab);
        setHardness(hardness);
        setResistance(resistance);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this),0,"inventory");
    }
}
