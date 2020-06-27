package gui;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

// TODO: Add compatibility with x and y coordinates (maybe with getters & setters or with other constructor)
public class Button {

    private GraphicsProgram applicationContext;
    private GRect button;
    private GLabel buttonText;
    private Color buttonColor;
    private Color textColor;
    private String text;

    public Button(GraphicsProgram applicationContext) {
        this.applicationContext = applicationContext;
        this.buttonColor = Color.RED;
        this.textColor = Color.WHITE;
        this.text = "Attack !";
    }

    public void addButton() {
        addButtonObject();
        addButtonText();
    }

    private void addButtonText() {
        buttonText = new GLabel(text);
        buttonText.setColor(textColor);
        double x = button.getX() + (buttonText.getWidth() / 4 );
        double y = button.getY() + buttonText.getHeight();
        applicationContext.add(buttonText, x, y);
    }

    private void addButtonObject() {
        button = new GRect(50, 25);
        button.setFilled(true);
        button.setFillColor(buttonColor);
        double x = applicationContext.getWidth() - button.getWidth();
        double y = applicationContext.getHeight() - button.getHeight();
        applicationContext.add(button, x, y);
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
