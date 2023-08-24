package main.java.patterns.bridge;

import main.java.Start;
import main.java.patterns.bridge.colors.BlueColor;
import main.java.patterns.bridge.colors.Color;
import main.java.patterns.bridge.colors.RedColor;
import main.java.patterns.bridge.shape.Circle;
import main.java.patterns.bridge.shape.Rectangle;
import main.java.patterns.bridge.shape.Shape;

public class StartBridge implements Start {
    public void start() {
        Color red = new RedColor();
        Color blue = new BlueColor();
        Shape circle = new Circle(red);
        Shape rectangle = new Rectangle(blue);
        circle.draw();
        rectangle.draw();
    }
}
