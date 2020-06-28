package entity.live;

import entity.live.LiveEntity;
import entity.live.Enemy;

public class Hero extends LiveEntity {

    protected double damage;

    public void attack(Enemy enemy) {
        enemy.reduceLife(damage);
    }

}
