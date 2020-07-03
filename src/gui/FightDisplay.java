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

    public FightDisplay(GCanvas applicationContext, Hero hero, Enemy enemy) {
        this.gCanvas = applicationContext;
        this.hero = hero;
        this.enemy = enemy;
        this.attackButton = new Button(applicationContext.getWidth() / 2, applicationContext.getHeight() / 2, "Attack!");
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
        gCanvas.remove(imageHero);
        gCanvas.remove(imageEnemy);
        gCanvas.remove(attackButton);
        gCanvas.remove(percentageEnemy);
        gCanvas.remove(percentageHero);
    }

    public void addElements() {
        this.gCanvas.setBackground(Color.BLACK);
        this.gCanvas.add(attackButton);
        this.addHero();
        this.addEnemy();
        this.addHeroPercentage();
        this.addEnemyPercentage();
    }

    public void changeLifePercentage() {
        this.hero = hero;
        this.enemy = enemy;
        percentageHero.setLabel(String.valueOf(hero.percentageLife()));
        percentageEnemy.setLabel(String.valueOf(enemy.percentageLife()));
    }

    public void addHeroPercentage() {
        percentageHero = new GLabel(String.valueOf(hero.percentageLife()), 50, 50);
        percentageHero.setColor(Color.WHITE);
        gCanvas.add(percentageHero);
    }

    public void addEnemyPercentage() {
        percentageEnemy = new GLabel(String.valueOf(enemy.percentageLife()), 150, 150);
        percentageEnemy.setColor(Color.WHITE);
        gCanvas.add(percentageEnemy);
    }

}

