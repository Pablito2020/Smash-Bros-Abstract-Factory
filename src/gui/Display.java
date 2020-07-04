package gui;

import acm.graphics.GCanvas;

import java.awt.*;

abstract class Display {

    protected GCanvas gCanvas;

    public Display(GCanvas gCanvas) {
        this.gCanvas = gCanvas;
        this.makeChangesCanvas();
    }

    public void clean() {
        gCanvas.removeAll();
    }

    public abstract void addElements();


    // Auxiliar private methods

    private void makeChangesCanvas() {
        gCanvas.setBackground(Color.BLACK);
    }

}
