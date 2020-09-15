package jp.Hakuyou.hm.GUI;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;


public class RodContainer extends Container {
    int x,y,z;

    public RodContainer(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public boolean canInteractWith(EntityPlayer player)
    {
        return true;
    }
}
