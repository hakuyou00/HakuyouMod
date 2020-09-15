package jp.Hakuyou.hm.Event;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import jp.Hakuyou.hm.proxy.ClientProxy;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import javax.xml.stream.events.Attribute;

public class AttackEvent {
    @SubscribeEvent
    public void FireSword(AttackEntityEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        Entity target = event.getTarget();

        if (player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ModItems.FireSword) {
            target.setFire(5);
        }
        if(player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ModItems.FirePickaxe)
        {
            target.setFire(5);
        }
        if(player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ModItems.HakuyouSword)
        {
            ItemStack item = player.getHeldItem(EnumHand.MAIN_HAND);
            item.setItemDamage(item.getItemDamage() - 1);
        }
    }
}
