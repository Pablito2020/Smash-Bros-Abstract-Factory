package fight;

import heroes.Hero;
import enemies.Enemy;
import java.util.Scanner;

enum Level { EASY , DIFFICULT; }

public class Main {

    private Level currentLevel;
    private Enemy enemy;
    private Hero hero;
    private Fight fight;
    private Scanner reader;

    public static void main(String[] args) {
        Main game = new Main();
        game.executeGame();
    }

    private void executeGame() {
        currentLevel = userInputLevel();
        hero = CharacterChooser.getHero(currentLevel);
        enemy = CharacterChooser.getEnemy(currentLevel);
        fight = new Fight(hero, enemy);
        fight.showInfoPlayers();
        fight.fightPlayers();
    }

    // Ask user methods

    private Level userInputLevel() {
        System.out.println("Select the level of difficulty you want (EASY or DIFFICULT):");
        reader = new Scanner(System.in);
        String levelString = reader.nextLine();
        return Level.valueOf(levelString);
    }

}
