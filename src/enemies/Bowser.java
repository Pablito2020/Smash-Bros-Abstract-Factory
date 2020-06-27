package enemies;

import heroes.Hero;

public class Bowser implements Enemy {

    private static final double DAMAGE = 10;
    private static final String NAME = "Bowser";
    private static final double INITIAL_LIFE = 100;
    private static final String IMAGE_PATH = "Bowser.jpg";

    private double life;

    public Bowser() {
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
