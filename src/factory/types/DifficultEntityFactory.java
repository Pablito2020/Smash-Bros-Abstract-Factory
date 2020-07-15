package factory.types;

import entity.live.enemies.Bowser;
import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import entity.live.heroes.Peach;
import factory.EntityFactory;


public class DifficultEntityFactory extends EntityFactory {

    @Override
    public Hero getHero() {
        return new Peach();
    }

    @Override
    public Enemy getEnemy() {
        return new Bowser();
    }

}
