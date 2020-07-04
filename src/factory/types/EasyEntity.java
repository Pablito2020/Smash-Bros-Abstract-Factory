package factory.types;

import entity.live.Enemy;
import entity.live.Hero;
import entity.live.enemies.Goomba;
import entity.live.enemies.KoopaTroopa;
import entity.live.heroes.Luigi;
import factory.EntityFactory;

public class EasyEntity extends EntityFactory {

    @Override
    public Hero getHero() {
        // NOTE: this needs to change if you want to add more heroes
        return new Luigi();
    }

    @Override
    public Enemy getEnemy() {
        randomNumber = rand.nextInt(20);
        // NOTE: this needs to change if you want to add more enemies
        return randomNumber < 15 ? new Goomba() : new KoopaTroopa();
    }

}
