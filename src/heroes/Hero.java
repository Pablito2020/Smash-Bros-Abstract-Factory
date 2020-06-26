package heroes;

import enemies.Enemy;

public interface Hero {
    String getName();
    void reduceLife(double quantity);
    void attack(Enemy enemy);
    double percentageLife();
    boolean hasDied();
    String getImagePath();
}
