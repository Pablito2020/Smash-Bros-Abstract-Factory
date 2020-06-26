package factory.hero;

import heroes.Hero;
import heroes.Luigi;

public class EasyHero implements HeroFactory {

    public Hero getHero() {
        return new Luigi();
    }

}
