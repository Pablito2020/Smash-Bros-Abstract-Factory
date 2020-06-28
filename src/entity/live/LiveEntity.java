package entity.live;

import entity.Entity;

public class LiveEntity extends Entity {

    protected double life;

    public void reduceLife(double quantity) {
        life -= quantity;
    }

    public double percentageLife() {
        if (life < 0) return 0;
        return life;
    }

    public boolean hasDied() {
        return life <= 0;
    }

}
