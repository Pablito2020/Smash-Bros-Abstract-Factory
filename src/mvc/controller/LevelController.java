package mvc.controller;

import factory.Level;
import mvc.controller.fight.ControllerFightClassic;
import mvc.model.ClassicFightModel;
import mvc.model.FightModel;
import mvc.view.Display;
import mvc.view.LevelView;
import smashbros.SmashBros;

public class LevelController implements Controller {

    private SmashBros context;
    private Display display;
    private LevelView view;

    public LevelController(SmashBros main, Display display) {
        this.context = main;
        this.display = display;
        this.view = new LevelView(this, display);
        view.addElements();
    }

    public void setEasyLevel() {
        context.setModel(new ClassicFightModel(Level.EASY));
        display.removeAll();
        context.setController(new ControllerFightClassic((FightModel) context.getModel(), display));
    }

    public void setDifficultLevel() {
        context.setModel(new ClassicFightModel(Level.DIFFICULT));
        display.removeAll();
        context.setController(new ControllerFightClassic((FightModel) context.getModel(), display));
    }

    public void setMediumLevel() {
        context.setModel(new ClassicFightModel(Level.MEDIUM));
        display.removeAll();
        context.setController(new ControllerFightClassic((FightModel) context.getModel(), display));
    }

}
