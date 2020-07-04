package gui;

import acm.graphics.GCanvas;

import java.awt.*;

class Display {

    protected GCanvas gCanvas;

    public Display(GCanvas gCanvas) {
        this.gCanvas = gCanvas;
        this.makeChangesCanvas();
    }

    public void clean() {
        gCanvas.removeAll();
    }

    private void makeChangesCanvas() {
        gCanvas.setBackground(Color.BLACK);
    }

}
