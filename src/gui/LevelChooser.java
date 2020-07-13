package gui;

import components.Title;
import components.button.Button;
import components.button.ClickBehavior;


public class LevelChooser {

    public Button easyLevel;
    public Button difficultLevel;
    private Title title;
    private final Display display;

    public LevelChooser(Display display, ClickBehavior easyButtonBehavior, ClickBehavior difficultButtonBehavior) {
        this.display = display;
        this.title = new Title("Choose the level you want:", display.getGCanvas().getWidth(), display.getGCanvas().getHeight());
        this.easyLevel = new Button(title.getX(), (double) display.getGCanvas().getHeight() * 2 / 3, "Easy",easyButtonBehavior);
        this.difficultLevel = new Button(title.getX() + title.getWidth(), (double) display.getGCanvas().getHeight() * 2 / 3, "Difficult", difficultButtonBehavior);
    }

    public void addElements() {
        display.getGCanvas().add(title);
        display.getGCanvas().add(easyLevel);
        display.getGCanvas().add(difficultLevel);
    }

}
