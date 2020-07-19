package mvc.model.fightstyle;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;

public class ClassicFight implements Fight {

    private Hero hero;
    private Enemy enemy;

    public ClassicFight(Hero hero, Enemy enemy) {
        this.hero = hero;
        this.enemy = enemy;
    }

    @Override
    public void fightEntities() {
        if(fightContinues()) {
            hero.attack(enemy);
            enemy.attack(hero);
        }
    }

    private boolean fightContinues() {
        return !(hero.hasDied() || enemy.hasDied());
    }

}
