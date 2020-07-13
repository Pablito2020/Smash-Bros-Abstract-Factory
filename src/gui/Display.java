package gui;

import acm.program.GraphicsProgram;
import acm.program.ProgramMenuBar;

import java.awt.*;

public class Display extends GraphicsProgram {


    public Display() {
        this.makeChangesCanvas();
    }

    public void clean() {
        removeAll();
    }

    public void addElements(){

    }

    public Display nextScreen(Display display) {
        clean();
        return display;
    }

    // Auxiliary private methods

    private void makeChangesCanvas() {
        setBackground(Color.BLACK);
    }

    @Override
    protected ProgramMenuBar createMenuBar() {
        return null;
    }

}
