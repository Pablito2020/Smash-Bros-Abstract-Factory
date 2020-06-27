package factory;

import entity.enemies.Enemy;
import entity.heroes.Hero;
import factory.types.DifficultEntity;
import factory.types.EasyEntity;

public abstract class EntityFactory {

    public abstract Hero getHero();
    public abstract Enemy getEnemy();

    public static EntityFactory parseFactory(Level level) {
         return (level == Level.EASY) ? new EasyEntity() : new DifficultEntity();
    }
}
