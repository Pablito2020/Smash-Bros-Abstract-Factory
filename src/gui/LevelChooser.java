package gui;

import acm.graphics.GCanvas;
import gui.components.Button;
import gui.components.Title;

public class LevelChooser extends Display {

    private final Title title;
    public final Button easyLevel;
    public final Button difficultLevel;

    public LevelChooser(GCanvas gCanvas) {
        super(gCanvas);
        this.title = new Title("SUPER SMASH BROS", gCanvas.getWidth(), gCanvas.getHeight());
        this.easyLevel = new Button(title.getXCentered(), (double) gCanvas.getHeight() * 2 / 3, "Easy");
        this.difficultLevel = new Button(title.getXCentered() + title.getWidth(), (double) gCanvas.getHeight() * 2 / 3, "Difficult");
    }

    @Override
    public void addElements() {
        gCanvas.add(title);
        gCanvas.add(easyLevel);
        gCanvas.add(difficultLevel);
    }

}
