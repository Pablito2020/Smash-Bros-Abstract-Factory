package mvc.view;

import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GLabel;

import java.awt.*;

public class LiveEntityUI extends GCompound {

    private GImage entityImage;
    private GLabel entityPercentage;

    public LiveEntityUI(double x, double y, String imagePath, double life) {
        this.createImage(x, y, imagePath);
        this.createPercentage(life);
    }

    private void createImage(double x, double y, String imagePath) {
        entityImage = new GImage(imagePath);
        add(entityImage, x, y);
    }

    private void createPercentage(double life) {
        entityPercentage = new GLabel(String.valueOf(life));
        entityPercentage.setColor(Color.WHITE);
        double x = entityImage.getX() + entityImage.getWidth() / 2;
        double y = entityImage.getY() - entityPercentage.getHeight();
        add(entityPercentage, x, y);
    }

    public void updateLife(double newLife) {
        entityPercentage.setLabel(String.valueOf(newLife));
    }

}
