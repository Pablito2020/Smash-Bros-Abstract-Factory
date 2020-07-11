package graphicscomponents.button;

import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GRectangle;
import acm.graphics.GRoundRect;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button extends GCompound {

    private static final double PADDING = 0.1;

    private final ClickBehavior clickBehavior;
    private GRoundRect button;
    private GLabel buttonText;
    private final String text;

    private Color textColor = Color.WHITE;
    private Color buttonColor = Color.RED;

    public Button(double x, double y, String text, ClickBehavior clickBehavior) {
        this.text = text;
        this.clickBehavior = clickBehavior;
        this.createText();
        this.createRectangle(x, y);
        this.colorizeButtonProperties();
        this.addButtonToCompound(x, y);
        this.addListener();
    }

    private void createRectangle(double x, double y) {
        GRectangle rectangleFromText = buttonText.getBounds();
        double width = rectangleFromText.getWidth() * PADDING * 2 + rectangleFromText.getWidth();
        double height = rectangleFromText.getHeight() * PADDING * 2 + rectangleFromText.getHeight();
        button = new GRoundRect(x, y, width, height);
    }

    private void createText() {
        buttonText = new GLabel(text);
    }

    private void addButtonToCompound(double x, double y) {
        add(button);
        add(buttonText, x + button.getWidth() * PADDING, y + buttonText.getHeight());
    }

    private void colorizeButtonProperties() {
        button.setFilled(true);
        button.setFillColor(buttonColor);
        buttonText.setColor(textColor);
    }

    public Color getRectangleColor() {
        return buttonColor;
    }

    public void setRectangleColor(Color color) {
        buttonColor = color;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color color) {
        textColor = color;
    }

    public void addListener() {
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                clickBehavior.clickAction();
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
