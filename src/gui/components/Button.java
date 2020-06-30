package gui.components;

import acm.graphics.*;

import java.awt.*;

public class Button extends GCompound {

    private static final double PADDING = 0.1;

    private GRoundRect button;
    private GLabel buttonText;
    private String text;

    private Color textColor = Color.WHITE;
    private Color buttonColor = Color.RED;

    public Button(double x, double y, String text) {
        this.text = text;
        this.createText();
        this.createRectangle(x, y);
        this.colorizeButtonPropierties();
        this.addButtonToCompound(x, y);
    }

    private void createRectangle(double x, double y) {
        GRectangle rectangleFromText = buttonText.getBounds();
        double width = rectangleFromText.getWidth() * PADDING * 2 + rectangleFromText.getWidth() ;
        double height = rectangleFromText.getHeight() * PADDING * 2  + rectangleFromText.getHeight();
        button = new GRoundRect(x,y, width, height);
    }

    private void createText() {
        buttonText = new GLabel(text);
    }

    private void addButtonToCompound(double x, double y) {
        add(button);
        add(buttonText, x + button.getWidth() * PADDING, y + buttonText.getHeight());
    }

    private void colorizeButtonPropierties() {
        button.setFilled(true);
        button.setFillColor(buttonColor);
        buttonText.setColor(textColor);
    }

    public void setRectangleColor(Color color) {
        buttonColor = color;
    }

    public Color getRectangleColor() {
        return buttonColor;
    }

    public void setTextColor(Color color) {
        textColor = color;
    }

    public Color getTextColor() {
        return textColor;
    }

}
