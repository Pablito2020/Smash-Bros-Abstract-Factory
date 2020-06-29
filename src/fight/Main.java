package fight;

import acm.program.GraphicsProgram;

import factory.EntityFactory;
import factory.Level;
import gui.Display;
import entity.live.Hero;
import entity.live.Enemy;
import gui.FightDisplay;
import gui.LevelChooser;

public class Main extends GraphicsProgram {

    private EntityFactory entityCreator;
    private Enemy enemy;
    private Hero hero;
    private Display display;
    private Fight fight;

    public void run() {
      this.executeGame();
    }

    private void executeGame() {
        createLevelUI();
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

    private void createLevelUI() {
        display = new LevelChooser(this);
        display.addElements();
    }

}
