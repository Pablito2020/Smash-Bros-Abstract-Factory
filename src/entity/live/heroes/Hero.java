package entity.live.heroes;

import entity.live.LiveEntity;
import entity.live.enemies.Enemy;

public class Hero extends LiveEntity {

    protected double damage;

    public void attack(Enemy enemy) {
        enemy.reduceLife(damage);
    }

}
