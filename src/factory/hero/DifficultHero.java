package factory.hero;

import heroes.Hero;
import heroes.Mario;

public class DifficultHero implements HeroFactory {

    public Hero getHero() {
        return new Mario();
    }

}
