package all.patterns.bridge;

import all.patterns.bridge.colors.BlueColor;
import all.patterns.bridge.colors.Color;
import all.patterns.bridge.colors.RedColor;
import all.patterns.bridge.shape.Circle;
import all.patterns.bridge.shape.Rectangle;
import all.patterns.bridge.shape.Shape;

public class StartBridge {
    public void start() {
        Color red = new RedColor();
        Color blue = new BlueColor();
        Shape circle = new Circle(red);
        Shape rectangle = new Rectangle(blue);
        circle.draw();
        rectangle.draw();
    }
}
