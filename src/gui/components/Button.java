package gui.components;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Button {

    private GRect button;
    private Color buttonColor;
    private final GraphicsProgram applicationContext;

    private GLabel buttonText;
    private String text;
    private Color textColor;

    private final double x;
    private final double y;

    public Button(GraphicsProgram applicationContext, double x, double y) {
        this.applicationContext = applicationContext;
        this.buttonColor = Color.RED;
        this.textColor = Color.WHITE;
        this.text = "";
        this.x = x;
        this.y = y;
    }

    public void addButton() {
        addButtonObject();
        addButtonText();
    }

    private void addButtonObject() {
        button = new GRect(70, 20);
        button.setFilled(true);
        button.setFillColor(buttonColor);
        double xButton = this.x - button.getWidth();
        double yButton = this.y - button.getHeight();
        applicationContext.add(button, xButton, yButton);
    }

    private void addButtonText() {
        buttonText = new GLabel(text);
        buttonText.setColor(textColor);
        double xText = button.getX() + (buttonText.getWidth() / 4);
        double yText = button.getY() + buttonText.getHeight();
        applicationContext.add(buttonText, xText, yText);
    }

    public void setButtonColor(Color buttonColor) {
        this.buttonColor = buttonColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setVisible(boolean visible) {
        button.setVisible(visible);
        buttonText.setVisible(visible);
    }

    public double getX() {
        return button.getX();
    }

    public double getY() {
       return button.getY();
    }

    public double getWidth() {
        return button.getWidth();
    }

    public double getHeight() {
        return button.getHeight();
    }

}
