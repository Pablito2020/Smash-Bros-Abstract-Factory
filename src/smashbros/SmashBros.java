package smashbros;

import mvc.controller.Controller;
import mvc.controller.LevelController;
import mvc.model.Model;
import mvc.view.Display;

public class SmashBros {

    private Display display;
    private Model model;
    private Controller controller;

    public static void main(String[] args) {
        SmashBros game = new SmashBros();
        game.start();
    }

    private void start() {
        this.display = new Display();
        display.start();
        controller = new LevelController(this, display);
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

}
