package entity.heroes;

import entity.Entity;
import entity.enemies.Enemy;

public interface Hero extends Entity {
    void attack(Enemy enemy);
}
