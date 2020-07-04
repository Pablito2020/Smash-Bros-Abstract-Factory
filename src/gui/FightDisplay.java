package gui;

import acm.graphics.GCanvas;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import entity.live.Enemy;
import entity.live.Hero;
import gui.components.Button;

import java.awt.*;

public class FightDisplay {

    private final GCanvas gCanvas;
    private GImage imageHero;
    private GImage imageEnemy;
    private GLabel percentageEnemy;
    private GLabel percentageHero;
    public final Button attackButton;
    private Hero hero;
    private Enemy enemy;

    public FightDisplay(GCanvas gCanvas, Hero hero, Enemy enemy) {
        this.gCanvas = gCanvas;
        this.hero = hero;
        this.enemy = enemy;
        this.attackButton = new Button((double) gCanvas.getWidth() / 2, (double) gCanvas.getHeight() / 2, "Attack!");
    }

    private void addHero() {
        String imagePath = hero.getImagePath();
        imageHero = new GImage(imagePath);
        double x = (gCanvas.getWidth() - imageHero.getWidth()) * 1 / 4;
        double y = (gCanvas.getHeight() - imageHero.getHeight()) * 2 / 3;
        gCanvas.add(imageHero, x, y);
    }

    private void addEnemy() {
        String imagePath = enemy.getImagePath();
        imageEnemy = new GImage(imagePath);
        double x = (gCanvas.getWidth() - imageEnemy.getWidth()) * 3 / 4;
        double y = (gCanvas.getHeight() - imageEnemy.getHeight()) / 3;
        gCanvas.add(imageEnemy, x, y);
    }

    public void clean() {
        gCanvas.removeAll();
    }

    public void addElements() {
        this.gCanvas.setBackground(Color.BLACK);
        this.gCanvas.add(attackButton);
        // TODO: Needs to go to other location (hero component and enemy component)
        this.addHero();
        this.addEnemy();
        this.addHeroPercentage();
        this.addEnemyPercentage();
    }

    public void changeLifePercentage() {
        percentageHero.setLabel(String.valueOf(hero.percentageLife()));
        percentageEnemy.setLabel(String.valueOf(enemy.percentageLife()));
    }

    public void addHeroPercentage() {
        percentageHero = new GLabel(String.valueOf(hero.percentageLife()));
        percentageHero.setColor(Color.WHITE);
        double x = imageHero.getX() + imageHero.getWidth() / 2;
        double y = imageHero.getY() - percentageHero.getHeight();
        gCanvas.add(percentageHero, x, y);
    }

    public void addEnemyPercentage() {
        percentageEnemy = new GLabel(String.valueOf(enemy.percentageLife()));
        percentageEnemy.setColor(Color.WHITE);
        double x = imageEnemy.getX() + imageEnemy.getWidth() / 2;
        double y = imageEnemy.getY() - percentageEnemy.getHeight();
        gCanvas.add(percentageEnemy, x, y);
    }

}

