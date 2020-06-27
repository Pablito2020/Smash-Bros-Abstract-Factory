package entity.enemies;

import entity.heroes.Hero;

public class Goomba implements Enemy {

    private static final double DAMAGE = 4;
    private static final double INITIAL_LIFE = 30;
    private static final String NAME = "Goomba";
    private static final String IMAGE_PATH = "Goomba.jpg";

    private double life;

    public Goomba() {
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
