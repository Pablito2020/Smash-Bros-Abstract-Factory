package smashBros;

import acm.program.GraphicsProgram;
import acm.program.ProgramMenuBar;
import entity.live.Enemy;
import entity.live.Hero;
import factory.EntityFactory;
import factory.Level;
import gui.Display;
import gui.FightDisplay;
import gui.LevelChooser;

import java.awt.event.MouseEvent;

public class SmashBros extends GraphicsProgram {

    private EntityFactory entityCreator;
    private Enemy enemy;
    private Hero hero;
    private Display display;


    public void run() {
        this.createLevelUI();
        this.addMouseListeners();
    }

    // Auxiliary methods

    private void createFightUI() {
        display.clean();
        this.display = new FightDisplay(this, hero, enemy);
        display.addElements();
    }

    private void assignLevelToEntities(Level level) {
        entityCreator = EntityFactory.parseFactory(level);
        hero = entityCreator.getHero();
        enemy = entityCreator.getEnemy();
    }

    private void fightEntities() {
        showInfoPlayers();
        fightPlayers();
    }

    private void createLevelUI() {
        display = new LevelChooser(this);
        display.addElements();
    }

    public void showInfoPlayers() {
        System.out.println("Fight between " + hero.getName() + " and " + enemy.getName() + " is going to start!");
        System.out.println("[" + hero.getName() + "] " + "life: " + hero.percentageLife());
        System.out.println("[" + enemy.getName() + "] " + "life: " + enemy.percentageLife());
    }

    public void fightPlayers() {
        ((FightDisplay) display).executeFight();
    }


    // Mouse Listener

    @Override
    public void mouseClicked(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();

        if (display instanceof LevelChooser && ((LevelChooser) display).difficultLevel.contains(x,y)) {
            assignLevelToEntities(Level.DIFFICULT);
            createFightUI();
        } else if (display instanceof LevelChooser && ((LevelChooser)display).easyLevel.contains(x,y)) {
            assignLevelToEntities(Level.EASY);
            createFightUI();
        } else if (display instanceof FightDisplay && ((FightDisplay) display).attackButton.contains(x,y)) {
            fightEntities();
        }

    }

    @Override
    protected ProgramMenuBar createMenuBar() {
        return null;
    }

}
