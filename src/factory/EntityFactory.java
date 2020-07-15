package factory;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import factory.types.DifficultEntityFactory;
import factory.types.EasyEntityFactory;
import factory.types.MediumEntityFactory;

import java.util.Random;

public abstract class EntityFactory {

    // Just in case some day we want to add some random logic to the factories
    protected final Random rand = new Random();
    protected int randomNumber;

    public static EntityFactory parseFactory(Level level) {
        switch(level) {
            case EASY:
                return new EasyEntityFactory();
            case MEDIUM:
                return new MediumEntityFactory();
            case DIFFICULT:
                return new DifficultEntityFactory();
            default:
                throw new IllegalArgumentException("Level " + level + " doesn't exist!");
        }
    }

    public abstract Hero getHero();

    public abstract Enemy getEnemy();

}
