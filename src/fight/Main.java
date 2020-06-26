package fight;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import heroes.Hero;
import enemies.Enemy;

enum Level { EASY , DIFFICULT; }

public class Main  extends GraphicsProgram {

    private Level currentLevel;
    private Enemy enemy;
    private Hero hero;
    private Fight fight;

    public void run() {
      executeGame();
    }

    private void executeGame() {
        currentLevel = userInputLevel();
        hero = CharacterChooser.getHero(currentLevel);
        enemy = CharacterChooser.getEnemy(currentLevel);
        addImage(hero.getImagePath());
        addImage(enemy.getImagePath());
        fight = new Fight(hero, enemy);
        fight.showInfoPlayers();
        fight.fightPlayers();
    }

    // Ask user methods

    private Level userInputLevel() {
        String levelString = readLine("Select the level of difficulty you want (EASY or DIFFICULT)");
        return Level.valueOf(levelString);
    }

    private void addImage(String imagePath) {
        GImage logo = new GImage(imagePath);
        double x = (getWidth() - logo.getWidth()) / 2;
        double y = (getHeight() - logo.getHeight()) / 2;
        add(logo, x, y);
    }

}
