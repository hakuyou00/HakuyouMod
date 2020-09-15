package jp.Hakuyou.hm.GUI;

import jp.Hakuyou.hm.Main;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;

public class RodGuiContainer extends GuiContainer {
    public RodGuiContainer(int x, int y, int z)
    {
        super(new RodContainer(x,y,z));
    }
    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX,int mouseZ)
    {
        super.drawGuiContainerForegroundLayer(mouseX,mouseZ);
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTick,int mouseX,int mouseZ)
    {
        this.mc.renderEngine.bindTexture(Main.rodGUI);
        this.drawTexturedModalRect(this.guiLeft,this.guiTop,0,0,xSize,ySize);
    }
    @Override
    public void initGui()
    {
        super.initGui();

        this.buttonList.add(new GuiButton(1,100,200,100,20,"Hello"));
    }
    @Override
    protected void actionPerformed(GuiButton b){
        if(b.id == 1){
            Main.logger.debug("pushed button");
        }
    }
}
