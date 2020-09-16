package jp.Hakuyou.hm.Event;

import jp.Hakuyou.hm.Main;
import jp.Hakuyou.hm.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClickEvent {
    @SubscribeEvent
    public void LeftClick(PlayerInteractEvent.RightClickItem event)
    {
        EntityPlayer player = event.getEntityPlayer();

        if(!player.world.isRemote)
        {
            //Rod
            if (player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ModItems.Rod) {
                //Fire Ball
                if(Main.INSTANCE.PushedButtonNum == 0) {
                    ItemStack item = player.getHeldItem(EnumHand.MAIN_HAND);

                    Vec3d v3 = player.getLook(1);
                    EntitySmallFireball fireball = new EntitySmallFireball(player.world,
                            player.posX, player.posY + player.eyeHeight, player.posZ,
                            v3.x, v3.y, v3.z);
                    fireball.shootingEntity = player;
                    player.world.spawnEntity(fireball);
                    player.world.playSound(player, player.getPosition(), SoundEvents.ENTITY_GHAST_SHOOT,
                            SoundCategory.NEUTRAL, 0.5f, 0.4f);

                    item.setItemDamage(item.getItemDamage() + 1);
                }
                //Thunder
                if(Main.INSTANCE.PushedButtonNum == 1){
                }
                //
                if(Main.INSTANCE.PushedButtonNum == 2){
                }
            }
        }
    }
    @SubscribeEvent
    public void LeftClickEmpty(PlayerInteractEvent.LeftClickEmpty event)
    {
        EntityPlayer player = event.getEntityPlayer();

        if(!player.world.isRemote) {
        }
    }
    @SubscribeEvent
    public void RightClick(PlayerInteractEvent.LeftClickBlock event)
    {

    }
}
