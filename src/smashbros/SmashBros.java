package smashbros;

import acm.program.GraphicsProgram;
import acm.program.ProgramMenuBar;
import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;
import factory.EntityFactory;
import factory.Level;
import gui.Display;
import gui.fight.FightDisplay;
import gui.levels.LevelChooser;

public class SmashBros extends GraphicsProgram {

    private Display display;
    private Enemy enemy;
    private Hero hero;

    public void run() {
        createLevelUI();
    }

    @Override
    protected ProgramMenuBar createMenuBar() {
        return null;
    }

    // Abstract Factory implementation here 👀

    public void setLevelEntities(Level level) {
        EntityFactory entityCreator = EntityFactory.parseFactory(level);
        hero = entityCreator.getHero();
        enemy = entityCreator.getEnemy();
    }

    // Display implementation

    private void createLevelUI() {
        display = new LevelChooser(getGCanvas(), this);
        display.addElements();
        setTitle("Select a level");
    }

    public void createFight() {
        display.clean();
        display = new FightDisplay(getGCanvas(), this, hero, enemy);
        display.addElements();
        setTitle("Smash!!");
    }

    public void attack() {
        if (hero.hasDied() || enemy.hasDied()) return;
        hero.attack(enemy);
        enemy.attack(hero);
        if (display instanceof FightDisplay) ((FightDisplay) display).changeLifePercentage();
    }

}
