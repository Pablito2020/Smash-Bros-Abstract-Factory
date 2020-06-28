package gui;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Button {

    private GraphicsProgram applicationContext;

    private GRect button;
    private Color buttonColor;

    private GLabel buttonText;
    private String text;
    private Color textColor;

    private double x;
    private double y;

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
        button = new GRect(50, 25);
        button.setFilled(true);
        button.setFillColor(buttonColor);
        double xButton = this.x - button.getWidth();
        double yButton = this.y - button.getHeight();
        applicationContext.add(button, xButton, yButton);
    }

    private void addButtonText() {
        buttonText = new GLabel(text);
        buttonText.setColor(textColor);
        double xText = button.getX() + (buttonText.getWidth() / 4 );
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

}
