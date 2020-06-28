package entity.heroes;

import entity.enemies.Enemy;

public class Mario implements Hero {
    
    private static final double DAMAGE = 12;
    private static final double LIFE = 100;
    private static final String NAME = "Mario";
    private static final String IMAGE_PATH = "Mario.jpg";

    private double life;

    public Mario(){
        this.life = LIFE;
    }

    public void reduceLife(double quantity) {
        life -= quantity;
    }

    public String getName() {
        return NAME;
    }

    public void attack(Enemy enemy){
        enemy.reduceLife(DAMAGE);
    }

    public double percentageLife() {
        if (life < 0) return 0;
        return life;
    }

    public boolean hasDied() {
        return life <= 0;
    }

    public String getImagePath() {
        return IMAGE_PATH;
    }

}

