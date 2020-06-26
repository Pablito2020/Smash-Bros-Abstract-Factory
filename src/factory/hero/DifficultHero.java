package factory.hero;

import heroes.Hero;
import heroes.Mario;

public class DifficultHero implements HeroFactory {

    public Hero getHeroe() {
        return new Mario();
    }

}
