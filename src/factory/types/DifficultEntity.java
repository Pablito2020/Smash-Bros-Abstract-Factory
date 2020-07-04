package factory.types;

import entity.live.Enemy;
import entity.live.Hero;
import entity.live.enemies.Bowser;
import entity.live.enemies.KoopaTroopa;
import entity.live.heroes.Mario;
import factory.EntityFactory;


public class DifficultEntity extends EntityFactory {

    @Override
    public Hero getHero() {
        // NOTE: this needs to change if you want to add more heroes
        return new Mario();
    }


    @Override
    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        // NOTE: this needs to change if you want to add more enemies
        return randomNumber < 10 ? new Bowser() : new KoopaTroopa();
    }

}
