package entity.live.enemies;

import entity.live.Enemy;

public class KoopaTroopa extends Enemy {

    public KoopaTroopa() {
        this.life = 60;
        this.imagePath = "KoopaTroopa.jpg";
        this.name = "Koopa Troopa";
        this.quantityDamage = 6;
    }

}


