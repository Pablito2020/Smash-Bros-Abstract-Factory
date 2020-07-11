package gui.levels;

import factory.Level;
import graphicscomponents.button.ClickBehavior;
import smashbros.SmashBros;

public class EasyClick implements ClickBehavior {

    private final SmashBros context;

    public EasyClick(SmashBros context) {
        this.context = context;
    }

    @Override
    public void clickAction() {
        context.setLevelEntities(Level.EASY);
        context.createFight();
    }

}

