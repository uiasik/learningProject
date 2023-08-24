package main.java.patterns.builder;

import main.java.Start;

public class StartBuilder implements Start {
    public void start(){
        Circle circle = new Circle.Builder()
                .setX(11)
                .setY(23)
                .setRadius(54)
                .setBlue(122)
                .build();

        System.out.println(circle);
    }
}
