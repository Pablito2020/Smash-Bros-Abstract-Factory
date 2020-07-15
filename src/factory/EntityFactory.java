package factory;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import factory.types.DifficultEntity;
import factory.types.EasyEntity;
import factory.types.MediumEntity;

import java.util.Random;

public abstract class EntityFactory {

    // Just in case some day we want to add some random logic to the factories
    protected final Random rand = new Random();
    protected int randomNumber;

    public static EntityFactory parseFactory(Level level) {
        switch(level) {
            case EASY:
                return new EasyEntity();
            case MEDIUM:
                return new MediumEntity();
            case DIFFICULT:
                return new DifficultEntity();
            default:
                throw new IllegalArgumentException("Level " + level + " doesn't exist!");
        }
    }

    public abstract Hero getHero();

    public abstract Enemy getEnemy();

}
