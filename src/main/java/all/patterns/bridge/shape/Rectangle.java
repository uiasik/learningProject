package all.patterns.bridge.shape;

import all.patterns.bridge.colors.Color;

public class Rectangle implements Shape{
    private final Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.println(" rectangle");
    }
}
