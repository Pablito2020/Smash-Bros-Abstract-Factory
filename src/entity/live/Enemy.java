package entity.live;

public class Enemy extends LiveEntity {

    protected double quantityDamage;

    public void attack(Hero principal) {
        principal.reduceLife(quantityDamage);
    }

}
