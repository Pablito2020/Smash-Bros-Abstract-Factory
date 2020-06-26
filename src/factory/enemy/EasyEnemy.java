package factory.enemy;

import enemies.Enemy;
import enemies.Goomba;
import enemies.KoopaTroopa;

import java.util.Random;

public class EasyEnemy implements EnemyFactory {

    private Random rand = new Random();
    private int randomNumber;

    public EasyEnemy() {
        this.randomNumber = -1;
    }

    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        if(randomNumber < 15) return new Goomba();
        else return new KoopaTroopa();
    }

}

