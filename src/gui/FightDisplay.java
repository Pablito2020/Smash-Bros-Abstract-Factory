package gui;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import entity.live.Enemy;
import entity.live.Hero;
import gui.components.Button;

import java.awt.*;

public class FightDisplay implements Display {

    private GraphicsProgram applicationContext;
    private GImage imageHero;
    private GImage imageEnemy;
    private Button attackButton;
    private Hero hero;
    private Enemy enemy;

    public FightDisplay(GraphicsProgram applicationContext, Hero hero, Enemy enemy) {
        this.applicationContext = applicationContext;
        this.hero = hero;
        this.enemy = enemy;
        this.attackButton = new Button(applicationContext, applicationContext.getWidth(), applicationContext.getHeight());
    }

    private void addHero(Hero hero) {
        String imagePath = hero.getImagePath();
        imageHero = new GImage(imagePath);
        double x = (applicationContext.getWidth() - imageHero.getWidth()) * 1 / 4;
        double y = (applicationContext.getHeight() - imageHero.getHeight()) * 2 / 3;
        applicationContext.add(imageHero, x, y);
    }

    private void addEnemy(Enemy enemy) {
        String imagePath = enemy.getImagePath();
        imageEnemy = new GImage(imagePath);
        double x = (applicationContext.getWidth() - imageEnemy.getWidth()) * 3/ 4;
        double y = (applicationContext.getHeight() - imageEnemy.getHeight())  / 3;
        applicationContext.add(imageEnemy, x, y);
    }

    private void addButtonFight() {
        attackButton.setText("Attack!");
        attackButton.addButton();
    }

    @Override
    public void clean() {
        imageHero.setVisible(false);
        imageEnemy.setVisible(false);
        attackButton.setVisible(false);
    }

    @Override
    public void addElements() {
        this.applicationContext.setBackground(Color.BLACK);
        this.applicationContext.setTitle("Pokemon Smash!");
        this.addHero(hero);
        this.addEnemy(enemy);
        this.addButtonFight();
    }
}
