package fight;

import factory.hero.HeroFactory;
import factory.enemy.EnemyFactory;

import factory.hero.EasyHero;
import factory.enemy.EasyEnemy;
import factory.hero.DifficultHero;
import factory.enemy.DifficultEnemy;

import enemies.Enemy;
import heroes.Hero;

public class CharacterChooser {

    private static EnemyFactory enemyCreator;
    private static HeroFactory heroCreator;

    public static Hero getHero(Level level) {
        assignHeroLevel(level);
        return heroCreator.getHero();
    }

    // NOTE: This method needs to change when a new level is added!
    private static void assignHeroLevel(Level level) {
        heroCreator = (level == Level.EASY) ? new EasyHero() : new DifficultHero();
    }

    public static Enemy getEnemy(Level level) {
        assignEnemyLevel(level);
        return enemyCreator.getEnemy();
    }

    // NOTE: This method needs to change when a new level is added!
    private static void assignEnemyLevel(Level level) {
        enemyCreator = (level == Level.EASY) ? new EasyEnemy() : new DifficultEnemy();
    }

}
