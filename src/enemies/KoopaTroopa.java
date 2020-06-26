package enemies;

import heroes.Hero;

public class KoopaTroopa implements Enemy {

    private static final double DAMAGE = 6;
    private static final double INITIAL_LIFE = 60;
    private static final String NAME = "Koopa Troopa";
    private static final String IMAGE_PATH = "KoopaTroopa.jpg";

    private double life;

    public KoopaTroopa() {
        this.life = INITIAL_LIFE;
    }

    public void reduceLife(double quantity) {
        life -= quantity;
    }

    public String getName() {
        return NAME;
    }
    
    public void attack(Hero principal) {
        principal.reduceLife(DAMAGE);
    }

    public double percentageLife() {
        return life;
    }

    public boolean hasDied() {
        return life <= 0;
    }

    public String getImagePath() {
        return IMAGE_PATH;
    }

}


