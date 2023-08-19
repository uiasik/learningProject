package all.patterns.bridge.shape;

import all.patterns.bridge.colors.Color;

public class Circle implements Shape{
    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.println(" circle");
    }
}
