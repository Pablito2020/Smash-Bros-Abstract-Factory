package factory.enemy;

import enemies.Bowser;
import enemies.Enemy;
import enemies.KoopaTroopa;

import java.util.Random;

public class DifficultEnemy implements EnemyFactory {

    private Random rand = new Random();
    private int randomNumber;

    public DifficultEnemy() {
        this.randomNumber = -1;
    }

    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        if(randomNumber < 10) return new Bowser();
        else return new KoopaTroopa();
    }

}
