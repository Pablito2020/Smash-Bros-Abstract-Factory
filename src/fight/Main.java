package fight;

import acm.program.GraphicsProgram;
import entity.live.Enemy;
import entity.live.Hero;
import factory.EntityFactory;
import factory.Level;
import gui.Display;
import gui.FightDisplay;
import gui.LevelChooser;

import java.awt.event.MouseEvent;

public class Main extends GraphicsProgram {

    private EntityFactory entityCreator;
    private Enemy enemy;
    private Hero hero;
    private Display display;
    private Fight fight;

    public void run() {
        this.addMouseListeners();
        this.createLevelUI();
    }

    // Auxiliary methods

    private void assignLevelToEntities(Level level) {
        entityCreator = EntityFactory.parseFactory(level);
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

    // Mouse Listener

    @Override
    public void mouseClicked(MouseEvent e) {
        double x = e.getX();
        double y = e.getY();

        if (display instanceof LevelChooser && ((LevelChooser) display).difficultLevel.contains(x,y)) {
            assignLevelToEntities(Level.DIFFICULT);
            createFightUI();
            return;
        }
        if(display instanceof LevelChooser && ((LevelChooser)display).easyLevel.contains(x,y)) {
            assignLevelToEntities(Level.EASY);
            createFightUI();
            return;
        }

        if(display instanceof FightDisplay && ((FightDisplay) display).attackButton.contains(x,y)) {
            fightEntities();
        }

    }

}
