package jp.Hakuyou.hm.init;

import jp.Hakuyou.hm.Item.Foods.FoodBase;
import jp.Hakuyou.hm.Item.Tools.Pickaxe;
import jp.Hakuyou.hm.Item.Tools.Rod;
import jp.Hakuyou.hm.Item.Tools.Sword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item.ToolMaterial FIRESWORD_MATERIAL
            = EnumHelper.addToolMaterial("firesword_material",3, 250, 8.0F, 2.0F, 10);
    public static final Item.ToolMaterial FIREPICKAXE_MATERIAL
            = EnumHelper.addToolMaterial("firepickaxe_material",3,250,8.0f,1.0f,10);
    public static final Item.ToolMaterial HAKUYOUSWORD_MATERIAL
            = EnumHelper.addToolMaterial("hakuyousword_material",4,1024,12.0f,5.5f,30);

    //Tool
    public static final ItemSword FireSword = new Sword("firesword",FIRESWORD_MATERIAL,512);
    public static final ItemPickaxe FirePickaxe = new Pickaxe("firepickaxe",FIREPICKAXE_MATERIAL,512);
    public static final  ItemSword HakuyouSword = new Sword("hakuyousword",HAKUYOUSWORD_MATERIAL,1024);

    //Item
    public static final Item Rod = new Rod("rod",256);

    //Food
    public static final Item Pan = new FoodBase("Pan", 4, 2.4f, false);
    public static final Item Ham = new FoodBase("Ham", 3, 3.5f, false);
}
