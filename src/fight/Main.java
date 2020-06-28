package fight;

import acm.program.GraphicsProgram;

import factory.EntityFactory;
import factory.Level;
import gui.Display;
import entity.heroes.Hero;
import entity.enemies.Enemy;
import gui.fight.FightDisplay;
import gui.main.LevelChooser;

public class Main  extends GraphicsProgram {

    private EntityFactory entityCreator;
    private Enemy enemy;
    private Hero hero;
    private Display display;
    private Fight fight;

    public void run() {
      this.executeGame();
    }

    private void executeGame() {
        display = new LevelChooser(this);
        display.addElements();
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
        display.clean();
        this.display = new FightDisplay(this, hero, enemy);
        display.addElements();
    }

    private void fightEntities() {
        fight = new Fight(this, hero, enemy);
        fight.showInfoPlayers();
        fight.fightPlayers();
    }

}
