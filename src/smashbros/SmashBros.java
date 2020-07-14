package smashbros;

import components.button.ClickBehavior;
import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import factory.EntityFactory;
import factory.Level;
import gui.Display;
import gui.FightDisplay;
import gui.LevelChooser;

public class SmashBros {

    private Display display;
    private FightDisplay fightDisplay;
    private Enemy enemy;
    private Hero hero;

    public static void main(String[] args) {
        SmashBros game = new SmashBros();
        game.startDisplay();
        game.createLevelUI();
    }

    // Abstract Factory implementation here 👀

    private void setLevelEntities(Level level) {
        EntityFactory entityCreator = EntityFactory.parseFactory(level);
        hero = entityCreator.getHero();
        enemy = entityCreator.getEnemy();
    }

    // I decided to keep the button behaviors here, because now we can see all the process of choosing the factory and getting the entities in this class
    // although this violates some OOP principles, this is just a simple program for showing the abstract factory design so, who matters...

    private ClickBehavior easyButtonBehavior() {
        return () -> {
            setLevelEntities(Level.EASY);
            createFightUI();
        };
    }

    private ClickBehavior difficultButtonBehavior() {
        return () -> {
            setLevelEntities(Level.DIFFICULT);
            createFightUI();
        };
    }

    // Display implementation

    private void startDisplay() {
        display = new Display();
        display.start();
    }

    private void createLevelUI() {
        LevelChooser levelChooser = new LevelChooser(display, easyButtonBehavior(), difficultButtonBehavior());
        levelChooser.addElements();
        display.setTitle("Select a level");
    }

    private void createFightUI() {
        display.clean();
        ClickBehavior attackBehavior = this::attack;
        fightDisplay = new FightDisplay(display, hero, enemy, attackBehavior);
        fightDisplay.addElements();
        display.setTitle("Smash!!");
    }

    private void attack() {
        if (hero.hasDied() || enemy.hasDied()) return;
        hero.attack(enemy);
        enemy.attack(hero);
        fightDisplay.changeLifePercentage();
    }

}
