package gui;

import acm.graphics.GCanvas;
import smashbros.SmashBros;

import java.awt.*;

public abstract class Display {

    protected GCanvas gCanvas;
    protected SmashBros context;

    public Display(GCanvas gCanvas, SmashBros context) {
        this.gCanvas = gCanvas;
        this.context = context;
        this.makeChangesCanvas();
    }

    public void clean() {
        gCanvas.removeAll();
    }

    public abstract void addElements();

    // Auxiliary private methods

    private void makeChangesCanvas() {
        gCanvas.setBackground(Color.BLACK);
    }

}
