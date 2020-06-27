package factory.types;

import entity.enemies.Bowser;
import entity.enemies.Enemy;
import entity.enemies.KoopaTroopa;
import entity.heroes.Hero;
import entity.heroes.Mario;
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
