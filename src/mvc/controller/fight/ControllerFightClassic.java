package mvc.controller.fight;

import mvc.model.FightModel;
import mvc.view.Display;
import mvc.view.FightView;
import mvc.view.View;


public class ControllerFightClassic implements ControllerFight {

    private final FightModel model;
    private final View fightView;

    public ControllerFightClassic(FightModel modelLevel, Display display) {
        this.model = modelLevel;
        fightView = new FightView(this, model, display);
        fightView.addElements();
    }

    @Override
    public void nextScreen() {
        throw new IllegalCallerException("For now we don't have any other screen");
    }

    @Override
    public void fightEntities() {
        model.fightEntities();
    }

}
