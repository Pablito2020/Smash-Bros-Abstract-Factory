package factory.types;

import entity.live.enemies.Enemy;
import entity.live.enemies.KoopaTroopa;
import entity.live.heroes.Hero;
import entity.live.heroes.Mario;
import factory.EntityFactory;

public class MediumEntityFactory extends EntityFactory {

    @Override
    public Hero getHero() {
        return new Mario();
    }

    @Override
    public Enemy getEnemy() {
        return new KoopaTroopa();
    }

}
