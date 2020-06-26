package heroes;

import enemies.Enemy;

public class Luigi implements Hero {
    
    private static final double DAMAGE = 8;
    private static final double LIFE = 120;
    private static final String NAME = "Luigi";

    private double life;

    public Luigi(){
        this.life = LIFE;
    }

    public String getName() {
        return NAME;
    }

    public void reduceLife(double quantity) {
        life -= quantity;
    }

    public void attack(Enemy enemy){
        enemy.reduceLife(DAMAGE);
    }

    public double percentageLife() {
        return life;
    }

    public boolean hasDied() {
        return life <= 0;
    }

}

