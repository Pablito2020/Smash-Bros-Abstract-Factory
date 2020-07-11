package entity.live.enemies;

import entity.live.LiveEntity;
import entity.live.heroes.Hero;

public class Enemy extends LiveEntity {

    protected double quantityDamage;

    public void attack(Hero hero) {
        hero.reduceLife(quantityDamage);
    }

}
