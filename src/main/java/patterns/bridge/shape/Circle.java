package main.java.patterns.bridge.shape;

import main.java.patterns.bridge.colors.Color;

public class Circle implements Shape{
    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        color.applyColor();
        System.out.println("circle");
    }
}
