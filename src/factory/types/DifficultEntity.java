package factory.types;

import entity.live.enemies.Bowser;
import entity.live.enemies.Enemy;
import entity.live.enemies.KoopaTroopa;
import entity.live.heroes.Hero;
import entity.live.heroes.Mario;
import entity.live.heroes.Peach;
import factory.EntityFactory;


public class DifficultEntity extends EntityFactory {

    @Override
    public Hero getHero() {
        randomNumber = rand.nextInt(20);
        // NOTE: this needs to change if you want to add more heroes
        return randomNumber < 10 ? new Mario() : new Peach();
    }

    @Override
    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        // NOTE: this needs to change if you want to add more enemies
        return randomNumber < 10 ? new Bowser() : new KoopaTroopa();
    }

}
