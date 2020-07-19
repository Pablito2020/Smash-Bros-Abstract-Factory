package mvc.view;

import mvc.controller.fight.ControllerFight;
import mvc.model.FightModel;
import mvc.observer.Observable;
import mvc.observer.Observer;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FightView implements Observer, View {

    private final ControllerFight controller;
    private final FightModel model;

    private final Display display;
    private Button fightButton;
    private LiveEntityUI heroUI;
    private LiveEntityUI enemyUI;

    public FightView(ControllerFight controller, FightModel model, Display display) {
        this.controller = controller;
        this.model = model;
        this.display = display;
        ((Observable) model).addObserver(this);
        this.createVisualElements(display);
        this.mouseListener();
    }

    private void createVisualElements(Display display) {
        this.fightButton = new Button("Attack!", (double) display.getWidth() / 2, (double) display.getHeight() / 2);
        this.heroUI = new LiveEntityUI(((double) display.getWidth() * 1) / 4, (double) display.getHeight() * 2 / 3, model.getHeroPath(), model.getHeroLife());
        this.enemyUI = new LiveEntityUI(((double) display.getWidth() * 3) / 4, (double) display.getHeight() / 3, model.getEnemyPath(), model.getEnemyLife());
    }

    @Override
    public void addElements() {
        display.getGCanvas().add(fightButton);
        display.getGCanvas().add(heroUI);
        display.getGCanvas().add(enemyUI);
    }

    @Override
    public void cleanView() {
        display.removeAll();
    }

    private void mouseListener() {
        fightButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                controller.fightEntities();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });
    }

    @Override
    public void update() {
        heroUI.updateLife(model.getHeroLife());
        enemyUI.updateLife(model.getEnemyLife());
    }

}
