package gui;

import acm.graphics.GCanvas;
import factory.Level;
import gui.components.Button;
import gui.components.Title;
import smashbros.SmashBros;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LevelChooser extends Display {

    private final Title title;
    public final Button easyLevel;
    private final SmashBros context;
    public final Button difficultLevel;

    public LevelChooser(GCanvas gCanvas, SmashBros context) {
        super(gCanvas);
        this.title = new Title("SUPER SMASH BROS", gCanvas.getWidth(), gCanvas.getHeight());
        this.easyLevel = new Button(title.getXCentered(), (double) gCanvas.getHeight() * 2 / 3, "Easy");
        this.difficultLevel = new Button(title.getXCentered() + title.getWidth(), (double) gCanvas.getHeight() * 2 / 3, "Difficult");
        this.context = context;
        this.addMouseListeners();
    }

    @Override
    public void addElements() {
        gCanvas.add(title);
        gCanvas.add(easyLevel);
        gCanvas.add(difficultLevel);
    }

    private void addMouseListeners() {
        easyLevel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                context.setLevelEntities(Level.EASY);
                context.makeFight();
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
            public void mouseClicked(MouseEvent arg0) {
                context.setLevelEntities(Level.DIFFICULT);
                context.makeFight();
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
