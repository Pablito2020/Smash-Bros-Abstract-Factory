package gui;

import acm.graphics.GCanvas;
import gui.click.DifficultClick;
import gui.click.EasyClick;
import gui.components.Button;
import gui.components.Title;
import smashbros.SmashBros;


public class LevelChooser extends Display {

    public final Button easyLevel;
    public final Button difficultLevel;
    private final Title title;

    public LevelChooser(GCanvas gCanvas, SmashBros context) {
        super(gCanvas, context);
        this.title = new Title("SUPER SMASH BROS", gCanvas.getWidth(), gCanvas.getHeight());
        this.easyLevel = new Button(title.getXCentered(), (double) gCanvas.getHeight() * 2 / 3, "Easy", new EasyClick(context));
        this.difficultLevel = new Button(title.getXCentered() + title.getWidth(), (double) gCanvas.getHeight() * 2 / 3, "Difficult", new DifficultClick(context));
    }

    @Override
    public void addElements() {
        gCanvas.add(title);
        gCanvas.add(easyLevel);
        gCanvas.add(difficultLevel);
    }

}
