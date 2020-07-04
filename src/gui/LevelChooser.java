package gui;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import gui.components.Button;

import java.awt.*;

public class LevelChooser extends Display {

    private final GLabel title;
    public Button easyLevel;
    public Button difficultLevel;

    public LevelChooser(GCanvas gCanvas) {
        super(gCanvas);
        this.title = createSmashBrosText();
        this.easyLevel = new Button(title.getX(), (double) gCanvas.getHeight() * 2 / 3, "Easy");
        this.difficultLevel = new Button(title.getX() + title.getWidth(), (double) gCanvas.getHeight() * 2 / 3, "Difficult");
    }

    public void addElements() {
        addTitleScreen();
        gCanvas.add(easyLevel);
        gCanvas.add(difficultLevel);
    }

    private GLabel createSmashBrosText() {
        GLabel title = new GLabel("SUPER SMASH BROS");
        title.setFont("SansSerif-bold-40");
        title.setColor(Color.WHITE);
        return title;
    }

    private void addTitleScreen() {
        double x = (gCanvas.getWidth() - title.getWidth()) / 2;
        double y = (gCanvas.getHeight() - title.getHeight()) / 2;
        gCanvas.add(title, x, y);
    }

}
