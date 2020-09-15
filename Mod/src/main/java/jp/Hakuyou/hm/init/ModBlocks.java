package jp.Hakuyou.hm.init;

import jp.Hakuyou.hm.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Material BLOCK_MATERIAL = null;


    public static final Block Hakuyou = new BlockBase("Hakuyou", Material.IRON,1.5f,6.0f);
}
