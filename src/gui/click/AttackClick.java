package gui.click;

import smashbros.SmashBros;

public class AttackClick implements ClickBehavior {

    private SmashBros context;

    public AttackClick(SmashBros context) {
        this.context = context;
    }

    @Override
    public void clickAction() {
        context.attack();
    }

}
