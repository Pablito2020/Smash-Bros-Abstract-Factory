package gui;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import gui.components.Button;

import java.awt.*;

public class LevelChooser implements Display {

    private final GraphicsProgram applicationContext;
    public final Button easyLevel;
    public final Button difficultLevel;
    private final GLabel title;

    public LevelChooser(GraphicsProgram applicationContext) {
        this.applicationContext = applicationContext;
        this.title = createSmashBrosText();
        this.easyLevel = new Button(applicationContext.getWidth() / 4, applicationContext.getHeight() / 2, "Easy");
        this.difficultLevel = new Button(applicationContext.getWidth() / 2, applicationContext.getHeight() / 2 , "Difficult");
    }

    @Override
    public void clean() {
        title.setVisible(false);
        easyLevel.setVisible(false);
        difficultLevel.setVisible(false);
    }

    @Override
    public void addElements() {
        applicationContext.setBackground(Color.BLACK);
        applicationContext.setTitle("Choose a level:");
        addTitleScreen();
        applicationContext.add(easyLevel);
        applicationContext.add(difficultLevel);
    }

    // Title Smash Bros

    private GLabel createSmashBrosText() {
        GLabel title = new GLabel("SUPER SMASH BROS");
        title.setFont("SansSerif-bold-40");
        title.setColor(Color.WHITE);
        return title;
    }

    private void addTitleScreen() {
        double x = (applicationContext.getWidth() - title.getWidth()) / 2;
        double y = (applicationContext.getHeight() - title.getHeight()) / 2;
        applicationContext.add(title, x, y);
    }

}
