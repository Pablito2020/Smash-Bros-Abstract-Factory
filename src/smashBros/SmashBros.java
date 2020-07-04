package smashBros;

import java.awt.event.MouseEvent;
import acm.program.GraphicsProgram;
import acm.program.ProgramMenuBar;
import gui.FightDisplay;
import gui.LevelChooser;

import entity.live.Enemy;
import entity.live.Hero;

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
        this.addMouseListeners();
    }

    // Mouse Listener

    @Override
    public void mouseClicked(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();

        if (levelDisplay.difficultLevel.contains(x, y)) {
            assignLevelToEntities(Level.DIFFICULT);
            createFightUI();
        } else if (levelDisplay.easyLevel.contains(x, y)) {
            assignLevelToEntities(Level.EASY);
            createFightUI();
        } else if (fightDisplay != null && fightDisplay.attackButton.contains(x, y) && !enemy.hasDied() && !hero.hasDied()) {
            fightPlayers();
        }

    }

    @Override
    protected ProgramMenuBar createMenuBar() {
        return null;
    }

    // Auxiliary methods

    private void createLevelUI() {
        levelDisplay = new LevelChooser(getGCanvas());
        levelDisplay.addElements();
        setTitle("Select a level");
    }

    private void createFightUI() {
        levelDisplay.clean();
        fightDisplay = new FightDisplay(getGCanvas(), hero, enemy);
        fightDisplay.addElements();
        setTitle("Smash!!");
    }

    private void assignLevelToEntities(Level level) {
        entityCreator = EntityFactory.parseFactory(level);
        hero = entityCreator.getHero();
        enemy = entityCreator.getEnemy();
    }

    private void fightPlayers() {
        enemy.attack(hero);
        hero.attack(enemy);
        fightDisplay.changeLifePercentage();
        checkIfWeHaveWinner();
    }

    private void checkIfWeHaveWinner() {
        if(enemy.hasDied()) setTitle("Hero: " + hero.getName() + " has won!");
        else if(hero.hasDied()) setTitle("Enemy : " + enemy.getName() + " has won!");
    }

}
