package main.java.patterns.abstractFactory.figureFactory;


import main.java.patterns.abstractFactory.circle.Circle;
import main.java.patterns.abstractFactory.square.Square;

public interface FigureFactory {
    public Circle createCircle();
    public Square createSquare();
}
