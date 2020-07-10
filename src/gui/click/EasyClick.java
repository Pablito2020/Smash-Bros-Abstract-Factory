package gui.click;

import factory.Level;
import smashbros.SmashBros;

public class EasyClick implements ClickBehavior {

    private SmashBros context;

    public EasyClick(SmashBros context) {
        this.context = context;
    }

    @Override
    public void clickAction() {
        context.setLevelEntities(Level.EASY);
        context.createFight();
    }

}

