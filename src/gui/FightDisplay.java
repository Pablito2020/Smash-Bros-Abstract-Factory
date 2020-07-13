package gui;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import components.LiveEntityUI;
import components.button.Button;
import components.button.ClickBehavior;

public class FightDisplay {

    private Button attackButton;
    private LiveEntityUI heroUI;
    private LiveEntityUI enemyUI;
    private final Display display;

    public FightDisplay(Display display, Hero hero, Enemy enemy, ClickBehavior attackButtonBehavior) {
        this.display = display;
        this.heroUI = new LiveEntityUI(hero, (double) display.getWidth() * 1 / 4, (double) display.getHeight() * 2 / 3);
        this.enemyUI = new LiveEntityUI(enemy, (double) display.getWidth() * 3 / 4, (double) display.getHeight() / 3);
        this.attackButton = new Button((double) display.getWidth() / 2, (double) display.getHeight() / 2, "Attack!", attackButtonBehavior);
    }

    public void addElements() {
        display.getGCanvas().add(attackButton);
        display.getGCanvas().add(heroUI);
        display.getGCanvas().add(enemyUI);
    }

    public void changeLifePercentage() {
        heroUI.updateLife();
        enemyUI.updateLife();
    }

}

