package factory.types;

import entity.live.enemies.Enemy;
import entity.live.enemies.Goomba;
import entity.live.heroes.Hero;
import entity.live.heroes.Luigi;
import factory.EntityFactory;

public class EasyEntityFactory extends EntityFactory {

    @Override
    public Hero getHero() {
        return new Luigi();
    }

    @Override
    public Enemy getEnemy() {
        return new Goomba();
    }

}
