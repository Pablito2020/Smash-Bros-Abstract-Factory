package enemies;

import heroes.Hero;

public interface Enemy {
    void reduceLife(double quantity);
    void attack(Hero principal);
    String getName();

    double percentageLife();
    boolean hasDied();
}
