package gui;

import acm.graphics.GCanvas;
import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import gui.components.Button;
import gui.components.LiveEntityUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FightDisplay extends Display {

    public final Button attackButton;
    private final LiveEntityUI heroUI;
    private final LiveEntityUI enemyUI;
    private final Hero hero;
    private final Enemy enemy;

    public FightDisplay(GCanvas gCanvas, Hero hero, Enemy enemy) {
        super(gCanvas);
        this.hero = hero;
        this.enemy = enemy;
        this.heroUI = new LiveEntityUI(hero, (double) gCanvas.getWidth() * 1 / 4, (double) gCanvas.getHeight() * 2 / 3);
        this.enemyUI = new LiveEntityUI(enemy, (double) gCanvas.getWidth() * 3 / 4, (double) gCanvas.getHeight() / 3);
        this.attackButton = new Button((double) gCanvas.getWidth() / 2, (double) gCanvas.getHeight() / 2, "Attack!");
        this.addMouseListeners();
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

    private void addMouseListeners() {
        attackButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                if (attackButton.contains(arg0.getX(), arg0.getY())) {
                    fightEntities();
                }
            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {
            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });
    }

    private void fightEntities() {
        enemy.attack(hero);
        hero.attack(enemy);
        changeLifePercentage();
    }

}

