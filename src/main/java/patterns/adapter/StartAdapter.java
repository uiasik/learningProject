package main.java.patterns.adapter;

import main.java.Start;

public class StartAdapter implements Start {
    public void start(){
        Figure figure = new RectangleAdapter(new Rectangle());
        figure.draw();
    }
}
