package gui;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import entity.enemies.Enemy;
import entity.heroes.Hero;

public class FightDisplay extends Display {

    private GImage imageHero;
    private GImage imageEnemy;
    private Button attackButton;

    public FightDisplay(GraphicsProgram applicationContext, Hero hero, Enemy enemy) {
        super(applicationContext);          // Invoke Display constructor
        this.addHero(hero);
        this.addEnemy(enemy);
        this.attackButton = new Button(applicationContext.getWidth(), applicationContext.getHeight());
        this.addButtonFight();
    }

    public boolean pressedAttackButton() {
        return false; //TODO: Needs to change
    }

    public boolean pressed

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

}
