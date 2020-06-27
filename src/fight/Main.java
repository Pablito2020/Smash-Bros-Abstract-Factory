package fight;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import heroes.Hero;
import enemies.Enemy;

import java.awt.*;

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
        frontEndStyle();
        // Type of characters
        currentLevel = userInputLevel();
        hero = CharacterChooser.getHero(currentLevel);
        enemy = CharacterChooser.getEnemy(currentLevel);
        // Images of the characters
        addImage(hero.getImagePath());
        addImage(enemy.getImagePath());
        // Fight
        fight = new Fight(hero, enemy);
        fight.showInfoPlayers();
        fight.fightPlayers();
    }

    // Ask user methods

    private Level userInputLevel() {
        String levelString = readLine("Select the level of difficulty you want (EASY or DIFFICULT)");
        return Level.valueOf(levelString);
    }

    // Front end methods (need to change to an external class)
    private void addImage(String imagePath) {
        GImage logo = new GImage(imagePath);
        double x = (getWidth() - logo.getWidth()) / 2;
        double y = (getHeight() - logo.getHeight()) / 2;
        add(logo, x, y);
    }

    private void frontEndStyle() {
        setTitle("Pokemon Smash!");
        setBackground(Color.BLACK);
    }

}
