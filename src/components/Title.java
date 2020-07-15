package components;

import acm.graphics.GCompound;
import acm.graphics.GLabel;

import java.awt.*;

public class Title extends GCompound {

    private final GLabel title;
    private double xCentered, yCentered;

    public Title(String title, double x, double y) {
        this.title = new GLabel(title);
        this.defaultProperties();
        this.addCentered(x, y);
    }

    private void defaultProperties() {
        title.setFont("SansSerif-bold-40");
        title.setColor(Color.WHITE);
    }

    private void addCentered(double x, double y) {
        xCentered = (x - title.getWidth()) / 2;
        yCentered = (y - title.getHeight()) / 2;
        add(title, xCentered, yCentered);
    }

    public double getXCentered() {
        return xCentered;
    }

    public double getYCentered() {
        return yCentered;
    }

}
