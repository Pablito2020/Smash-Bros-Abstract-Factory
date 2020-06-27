package fight;

import acm.program.GraphicsProgram;

import factory.EntityFactory;
import factory.Level;
import gui.FightDisplay;
import entity.heroes.Hero;
import entity.enemies.Enemy;

public class Main  extends GraphicsProgram {

    private EntityFactory entityCreator;
    private Enemy enemy;
    private Hero hero;
    private FightDisplay fightDisplay;
    private Fight fight;

    public void run() {
      fightDisplay = new FightDisplay(this);
      executeGame();
    }

    private void executeGame() {
        assignLevelToEntities();
        createFightUI();
        fightEntities();
    }

    // Auxiliary methods

    private void assignLevelToEntities() {
        String levelString = readLine("Select the level of difficulty you want:");
        entityCreator = EntityFactory.parseFactory(Level.valueOf(levelString));
        hero = entityCreator.getHero();
        enemy = entityCreator.getEnemy();
    }

    private void createFightUI() {
        fightDisplay.addHero(hero);
        fightDisplay.addEnemy(enemy);
        fightDisplay.addButtonFight();
    }

    private void fightEntities() {
        fight = new Fight(hero, enemy);
        fight.showInfoPlayers();
        fight.fightPlayers();
    }

}
