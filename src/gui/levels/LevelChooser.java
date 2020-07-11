package gui.levels;

import acm.graphics.GCanvas;
import graphicscomponents.Title;
import graphicscomponents.button.Button;
import gui.Display;
import smashbros.SmashBros;


public class LevelChooser extends Display {

    public final Button easyLevel;
    public final Button difficultLevel;
    private final Title title;

    public LevelChooser(GCanvas gCanvas, SmashBros context) {
        super(gCanvas, context);
        this.title = new Title("Choose the level you want:", gCanvas.getWidth(), gCanvas.getHeight());
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
