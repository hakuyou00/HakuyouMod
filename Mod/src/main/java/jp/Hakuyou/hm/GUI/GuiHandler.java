package jp.Hakuyou.hm.GUI;

import jp.Hakuyou.hm.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x,int y,int z){
        if(ID == Main.GUI_ID){
            return new RodContainer(x,y,z);
        }
        return null;
    }
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,int x,int y,int z){
        if(ID == Main.GUI_ID)
        {
            return new RodGuiContainer(x,y,z);
        }
        return null;
    }
}
