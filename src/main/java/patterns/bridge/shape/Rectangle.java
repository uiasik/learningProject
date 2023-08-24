package main.java.patterns.bridge.shape;

import main.java.patterns.bridge.colors.Color;

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
