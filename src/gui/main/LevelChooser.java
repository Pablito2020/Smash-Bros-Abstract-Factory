package gui.main;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import gui.Display;
import gui.components.Button;

import java.awt.*;

public class LevelChooser implements Display {

    private GraphicsProgram applicationContext;
    private Button easyLevel;
    private Button difficultLevel;
    private GLabel title;

    public LevelChooser(GraphicsProgram applicationContext) {
        this.applicationContext = applicationContext;
        this.title = createSmashBrosText();
        this.easyLevel = createEasyButton();
        this.difficultLevel = createDifficultButton();
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
        applicationContext.add(title);
        easyLevel.addButton();
        difficultLevel.addButton();
    }

    private Button createEasyButton() {
       Button easy = new Button(applicationContext, applicationContext.getWidth() / 2, applicationContext.getHeight() / 2);
       easy.setText("EASY");
       return easy;
    }

    private Button createDifficultButton() {
        Button difficult =  new Button(applicationContext, applicationContext.getHeight() / 3, applicationContext.getWidth() / 3);
        difficult.setText("DIFFICULT");
        return difficult;
    }

    private GLabel createSmashBrosText() {
        GLabel title = new GLabel("SUPER SMASH BROS", applicationContext.getHeight() / 6, applicationContext.getWidth() / 4);
        title.setFont("SansSerif-bold-40");
        title.setColor(Color.WHITE);
        return title;
    }

}
