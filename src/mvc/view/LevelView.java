package mvc.view;

import components.Title;
import mvc.controller.LevelController;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LevelView implements View {

    private final LevelController controller;

    private final Display display;
    private Title title;
    private Button easyLevel;
    private Button mediumLevel;
    private Button difficultLevel;

    public LevelView(LevelController controller, Display display) {
        this.display = display;
        this.controller = controller;
        this.setButtons();
        this.addButtonsListeners();
    }

    @Override
    public void addElements() {
        display.getGCanvas().add(title);
        display.getGCanvas().add(easyLevel);
        display.getGCanvas().add(mediumLevel);
        display.getGCanvas().add(difficultLevel);
    }

    @Override
    public void cleanView() {
        display.removeAll();
    }

    private void setButtons() {
        this.title = new Title("Choose the level you want:", display.getGCanvas().getWidth(), display.getGCanvas().getHeight());
        this.easyLevel = new Button("Easy", title.getXCentered(), (double) display.getGCanvas().getHeight() * 2 / 3);
        this.mediumLevel = new Button("Medium", title.getXCentered() + title.getWidth() / 2, (double) display.getGCanvas().getHeight() * 2 / 3);
        this.difficultLevel = new Button("Difficult", title.getXCentered() + title.getWidth(), (double) display.getGCanvas().getHeight() * 2 / 3);
    }

    private void addButtonsListeners() {
        easyLevel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                controller.setEasyLevel();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        difficultLevel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                controller.setDifficultLevel();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        mediumLevel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                controller.setMediumLevel();
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

    }

}
