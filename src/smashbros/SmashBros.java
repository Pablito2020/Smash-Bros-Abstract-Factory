package smashbros;

import java.awt.event.MouseEvent;
import acm.program.GraphicsProgram;
import acm.program.ProgramMenuBar;
import gui.FightDisplay;
import gui.LevelChooser;

import entity.live.enemies.Enemy;
import entity.live.heroes.Hero;

import factory.EntityFactory;
import factory.Level;

public class SmashBros extends GraphicsProgram {

    private EntityFactory entityCreator;
    private Enemy enemy;
    private Hero hero;
    private LevelChooser levelDisplay;
    private FightDisplay fightDisplay;

    public void run() {
        this.createLevelUI();
    }

    @Override
    protected ProgramMenuBar createMenuBar() {
        return null;
    }

    // Auxiliary methods

    private void createLevelUI() {
        levelDisplay = new LevelChooser(getGCanvas(), this);
        levelDisplay.addElements();
        setTitle("Select a level");
    }

    public void setLevelEntities(Level level) {
        entityCreator = EntityFactory.parseFactory(level);
        hero = entityCreator.getHero();
        enemy = entityCreator.getEnemy();
    }

    public void makeFight() {
        levelDisplay.clean();
        fightDisplay = new FightDisplay(getGCanvas(), hero, enemy);
        fightDisplay.addElements();
        setTitle("Smash!!");
    }

}
