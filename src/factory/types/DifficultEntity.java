package factory.types;

import entity.live.enemies.Bowser;
import entity.live.Enemy;
import entity.live.enemies.KoopaTroopa;
import entity.live.Hero;
import entity.live.heroes.Mario;
import factory.EntityFactory;

import java.util.Random;

public class DifficultEntity extends EntityFactory {

    private Random rand = new Random();
    private int randomNumber;

    @Override
    public Hero getHero() {
        return new Mario();
    }

    @Override
    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        if(randomNumber < 10) return new Bowser();
        else return new KoopaTroopa();
    }

}
