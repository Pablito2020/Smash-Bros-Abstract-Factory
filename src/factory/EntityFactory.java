package factory;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import factory.types.DifficultEntity;
import factory.types.EasyEntity;

import java.util.Random;

public abstract class EntityFactory {

    protected final Random rand = new Random();
    protected int randomNumber;

    public static EntityFactory parseFactory(Level level) {
        return (level == Level.EASY) ? new EasyEntity() : new DifficultEntity();
    }

    public abstract Hero getHero();

    public abstract Enemy getEnemy();

}
