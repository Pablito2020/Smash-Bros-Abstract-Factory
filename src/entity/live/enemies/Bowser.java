package entity.live.enemies;

import entity.live.Enemy;

public class Bowser extends Enemy {

    public Bowser() {
        this.life = 100;
        this.imagePath = "Bowser.jpg";
        this.name = "Bowser";
        this.quantityDamage = 10;
    }

}
