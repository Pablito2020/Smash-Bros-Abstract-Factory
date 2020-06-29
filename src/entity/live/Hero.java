package entity.live;

public class Hero extends LiveEntity {

    protected double damage;

    public void attack(Enemy enemy) {
        enemy.reduceLife(damage);
    }

}
