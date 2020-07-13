package components;

import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import entity.live.LiveEntity;

import java.awt.*;

public class LiveEntityUI extends GCompound {

    private final LiveEntity entity;
    private GImage entityImage;
    private GLabel entityPercentage;

    public LiveEntityUI(LiveEntity entity, double x, double y) {
        this.entity = entity;
        this.createImage(x, y);
        this.createPercentage();
    }

    private void createImage(double x, double y) {
        String imagePath = entity.getImagePath();
        entityImage = new GImage(imagePath);
        add(entityImage, x, y);
    }

    private void createPercentage() {
        entityPercentage = new GLabel(String.valueOf(entity.percentageLife()));
        entityPercentage.setColor(Color.WHITE);
        double x = entityImage.getX() + entityImage.getWidth() / 2;
        double y = entityImage.getY() - entityPercentage.getHeight();
        add(entityPercentage, x, y);
    }

    public void updateLife() {
        entityPercentage.setLabel(String.valueOf(entity.percentageLife()));
    }

}
