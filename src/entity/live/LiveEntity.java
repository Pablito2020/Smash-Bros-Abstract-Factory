package entity.live;

import entity.Entity;

public class LiveEntity extends Entity {

    protected String name;
    protected double life;

    public String getName() {
        return name;
    }

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
