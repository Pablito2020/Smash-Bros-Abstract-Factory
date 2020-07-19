package mvc.view;

import acm.program.GraphicsProgram;
import acm.program.ProgramMenuBar;

import java.awt.*;

public class Display extends GraphicsProgram {

    public Display() {
        this.addMouseListeners();
        setBackground(Color.BLACK);
    }

    @Override
    protected ProgramMenuBar createMenuBar() {
        return null;
    }

}
