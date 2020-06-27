package gui;

import java.awt.Color;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import enemies.Enemy;
import heroes.Hero;

public class FightDisplay {

    private static final Color BACKGROUND_COLOR = Color.BLACK;
    private static final String TITLE_NAME = "Pokemon Smash";

    private GraphicsProgram applicationContext;
    private GImage imageHero;
    private GImage imageEnemy;
    private Button attackButton;


    public FightDisplay(GraphicsProgram applicationContext) {
        this.applicationContext = applicationContext;
        this.visualChangesCanvas();
        this.attackButton = new Button(applicationContext);
    }

    private void visualChangesCanvas() {
        applicationContext.setTitle(TITLE_NAME);
        applicationContext.setBackground(BACKGROUND_COLOR);
    }

    public void addHero(Hero hero) {
        String imagePath = hero.getImagePath();
        imageHero = new GImage(imagePath);
        double x = (applicationContext.getWidth() - imageHero.getWidth()) * 1 / 4;
        double y = (applicationContext.getHeight() - imageHero.getHeight()) * 2 / 3;
        applicationContext.add(imageHero, x, y);
    }

    public void addEnemy(Enemy enemy) {
        String imagePath = enemy.getImagePath();
        imageEnemy = new GImage(imagePath);
        double x = (applicationContext.getWidth() - imageEnemy.getWidth()) * 3/ 4;
        double y = (applicationContext.getHeight() - imageEnemy.getHeight())  / 3;
        applicationContext.add(imageEnemy, x, y);
    }

    public void addButtonFight() {
        attackButton.addButton();
    }

}
