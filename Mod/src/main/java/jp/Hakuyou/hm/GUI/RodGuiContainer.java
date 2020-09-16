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
    public void initGui() {
        super.initGui();

        //add Button
        this.buttonList.add(
                new GuiButton(1,130,105,45,20,Main.INSTANCE.Button_Texts[0])
        );
        this.buttonList.add(
                new GuiButton(2,185,105,45,20,Main.INSTANCE.Button_Texts[1])
        );
        this.buttonList.add(
                new GuiButton(3,240,105,45,20,Main.INSTANCE.Button_Texts[2])
        );
    }
    @Override
    protected void actionPerformed(GuiButton b) {
        for (int i = 0; i < Main.INSTANCE.Button_Texts.length; i++) {
            if (i == b.id - 1) {
                Main.INSTANCE.Button_Texts[i] = "Selected";
            } else {
                Main.INSTANCE.Button_Texts[i] = "Change";
            }
            this.buttonList.get(i).displayString = Main.INSTANCE.Button_Texts[i];
        }
        Main.INSTANCE.PushedButtonNum = b.id;
    }
}
