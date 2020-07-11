package gui.fight;

import acm.graphics.GCanvas;
import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import gui.Display;
import graphicscomponents.button.Button;
import graphicscomponents.LiveEntityUI;
import smashbros.SmashBros;

public class FightDisplay extends Display {

    public final Button attackButton;
    private final LiveEntityUI heroUI;
    private final LiveEntityUI enemyUI;

    public FightDisplay(GCanvas gCanvas, SmashBros context, Hero hero, Enemy enemy) {
        super(gCanvas, context);
        this.heroUI = new LiveEntityUI(hero, (double) gCanvas.getWidth() * 1 / 4, (double) gCanvas.getHeight() * 2 / 3);
        this.enemyUI = new LiveEntityUI(enemy, (double) gCanvas.getWidth() * 3 / 4, (double) gCanvas.getHeight() / 3);
        this.attackButton = new Button((double) gCanvas.getWidth() / 2, (double) gCanvas.getHeight() / 2, "Attack!", new AttackButtonBehavior(context));
    }

    @Override
    public void addElements() {
        gCanvas.add(attackButton);
        gCanvas.add(heroUI);
        gCanvas.add(enemyUI);
    }

    public void changeLifePercentage() {
        heroUI.updateLife();
        enemyUI.updateLife();
    }

}

