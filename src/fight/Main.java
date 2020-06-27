package fight;

import acm.program.GraphicsProgram;

import gui.FightDisplay;
import heroes.Hero;
import enemies.Enemy;

enum Level { EASY , DIFFICULT; }

public class Main  extends GraphicsProgram {

    private Level currentLevel;
    private Enemy enemy;
    private Hero hero;
    private Fight fight;
    private FightDisplay fightDisplay;

    public void run() {
      fightDisplay = new FightDisplay(this);
      executeGame();
    }

    private void executeGame() {
        // Type of characters
        currentLevel = userInputLevel();
        hero = CharacterChooser.getHero(currentLevel);
        enemy = CharacterChooser.getEnemy(currentLevel);

        // Fight display
        fightDisplay.addHero(hero);
        fightDisplay.addEnemy(enemy);
        fightDisplay.addButtonFight();

        // Fight
        fight = new Fight(hero, enemy);
        fight.showInfoPlayers();
        fight.fightPlayers();
    }

    // Ask user methods

    private Level userInputLevel() {
        String levelString = readLine("Select the level of difficulty you want:");
        return Level.valueOf(levelString);
    }

}
