package gui;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import gui.components.Button;

import java.awt.*;

public class LevelChooser implements Display {

    private final GraphicsProgram applicationContext;
    public Button easyLevel;
    public Button difficultLevel;
    private final GLabel title;

    public LevelChooser(GraphicsProgram applicationContext) {
        this.applicationContext = applicationContext;
        this.title = createSmashBrosText();
    }

    @Override
    public void clean() {
        applicationContext.remove(title);
        applicationContext.remove(easyLevel);
        applicationContext.remove(difficultLevel);
    }

    @Override
    public void addElements() {
        applicationContext.setBackground(Color.BLACK);
        applicationContext.setTitle("Choose a level:");
        addTitleScreen();
        addButtonsScreen();
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

    private void addButtonsScreen() {
        this.easyLevel = new Button(title.getX(), applicationContext.getHeight() * 2 / 3, "Easy");
        this.difficultLevel = new Button(title.getX() + title.getWidth(), applicationContext.getHeight() * 2 /3, "Difficult");
        applicationContext.add(easyLevel);
        applicationContext.add(difficultLevel);
    }

}
