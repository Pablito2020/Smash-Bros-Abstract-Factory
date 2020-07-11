package gui.levels;

import graphicscomponents.button.ClickBehavior;
import factory.Level;
import smashbros.SmashBros;

public class DifficultClick implements ClickBehavior {

    private SmashBros context;

    public DifficultClick(SmashBros context) {
        this.context = context;
    }

    @Override
    public void clickAction() {
        context.setLevelEntities(Level.DIFFICULT);
        context.createFight();
    }

}
