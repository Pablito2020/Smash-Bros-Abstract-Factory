package factory.types;

import entity.live.Enemy;
import entity.live.enemies.Goomba;
import entity.live.enemies.KoopaTroopa;
import entity.live.Hero;
import entity.live.heroes.Luigi;
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
