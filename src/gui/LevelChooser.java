package gui;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import gui.components.Button;

import java.awt.*;

public class LevelChooser implements Display {

    private final GraphicsProgram applicationContext;
    private final Button easyLevel;
    private final Button difficultLevel;
    private final GLabel title;

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

    @Override
    public boolean isValid(double x, double y) {
        boolean buttonEasy = x >= easyLevel.getX() && x <= easyLevel.getX() + easyLevel.getWidth() && y >= easyLevel.getY() && y <= easyLevel.getHeight() + easyLevel.getY();
        boolean buttonDifficult = x >= difficultLevel.getX() && x <= difficultLevel.getX() + difficultLevel.getWidth() && y >= difficultLevel.getY() && y <= difficultLevel.getHeight() + difficultLevel.getY();
        return buttonDifficult || buttonEasy;
    }

    private Button createEasyButton() {
        Button easy = new Button(applicationContext, applicationContext.getWidth() / 3, applicationContext.getHeight() / 2);
        easy.setText("EASY");
        return easy;
    }

    private Button createDifficultButton() {
        Button difficult = new Button(applicationContext, applicationContext.getWidth() * 2 / 3, applicationContext.getHeight() / 2);
        difficult.setText("DIFFICULT");
        return difficult;
    }

    private GLabel createSmashBrosText() {
        GLabel title = new GLabel("SUPER SMASH BROS");
        double x = (applicationContext.getWidth() - title.getWidth()) / 4;
        double y = applicationContext.getHeight() / 4;
        title.setLocation(x, y);
        title.setFont("SansSerif-bold-40");
        title.setColor(Color.WHITE);
        return title;
    }

}
