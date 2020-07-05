package entity.live.enemies;

import entity.live.heroes.Hero;
import entity.live.LiveEntity;

public class Enemy extends LiveEntity {

    protected double quantityDamage;

    public void attack(Hero hero) {
        hero.reduceLife(quantityDamage);
    }

}
