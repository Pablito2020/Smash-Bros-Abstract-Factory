package gui;

import acm.graphics.GCanvas;
import entity.live.Enemy;
import entity.live.Hero;
import gui.components.Button;
import gui.components.LiveEntityUI;

public class FightDisplay extends Display {

    public final Button attackButton;
    private final LiveEntityUI hero;
    private final LiveEntityUI enemy;

    public FightDisplay(GCanvas gCanvas, Hero hero, Enemy enemy) {
        super(gCanvas);
        this.hero = new LiveEntityUI(hero, (double) gCanvas.getWidth() * 1 / 4, (double) gCanvas.getHeight() * 2 / 3);
        this.enemy = new LiveEntityUI(enemy, (double) gCanvas.getWidth() * 3 / 4, (double) gCanvas.getHeight() / 3);
        this.attackButton = new Button((double) gCanvas.getWidth() / 2, (double) gCanvas.getHeight() / 2, "Attack!");
    }

    public void addElements() {
        gCanvas.add(attackButton);
        gCanvas.add(hero);
        gCanvas.add(enemy);
    }

    public void changeLifePercentage() {
        hero.updateLife();
        enemy.updateLife();
    }

}

