package factory.hero;

import heroes.Hero;
import heroes.Luigi;

public class EasyHero implements HeroFactory {

    public Hero getHeroe() {
        return new Luigi();
    }

}
