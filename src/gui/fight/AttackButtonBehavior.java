package gui.fight;

import graphicscomponents.button.ClickBehavior;
import smashbros.SmashBros;

public class AttackButtonBehavior implements ClickBehavior {

    private final SmashBros context;

    public AttackButtonBehavior(SmashBros context) {
        this.context = context;
    }

    @Override
    public void clickAction() {
        context.attack();
    }

}
