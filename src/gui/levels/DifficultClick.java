package gui.levels;

import factory.Level;
import graphicscomponents.button.ClickBehavior;
import smashbros.SmashBros;

public class DifficultClick implements ClickBehavior {

    private final SmashBros context;

    public DifficultClick(SmashBros context) {
        this.context = context;
    }

    @Override
    public void clickAction() {
        context.setLevelEntities(Level.DIFFICULT);
        context.createFight();
    }

}
