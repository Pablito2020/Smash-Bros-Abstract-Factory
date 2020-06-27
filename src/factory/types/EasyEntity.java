package factory.types;

import entity.enemies.Enemy;
import entity.enemies.Goomba;
import entity.enemies.KoopaTroopa;
import entity.heroes.Hero;
import entity.heroes.Luigi;
import factory.EntityFactory;

import java.util.Random;

public class EasyEntity extends EntityFactory {

    private Random rand = new Random();
    private int randomNumber;

    @Override
    public Hero getHero() {
        return new Luigi();
    }

    @Override
    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        if(randomNumber < 15) return new Goomba();
        else return new KoopaTroopa();
    }

}
