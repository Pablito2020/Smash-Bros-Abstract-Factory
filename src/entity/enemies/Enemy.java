package entity.enemies;

import entity.Entity;
import entity.heroes.Hero;

public interface Enemy extends Entity {
    void attack(Hero principal);
}
