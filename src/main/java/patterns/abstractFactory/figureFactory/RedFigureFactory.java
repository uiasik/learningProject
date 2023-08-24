package main.java.patterns.abstractFactory.figureFactory;


import main.java.patterns.abstractFactory.circle.Circle;
import main.java.patterns.abstractFactory.circle.RedCircle;
import main.java.patterns.abstractFactory.square.RedSquare;
import main.java.patterns.abstractFactory.square.Square;

public class RedFigureFactory implements FigureFactory{
    @Override
    public Circle createCircle() {
        return new RedCircle();
    }

    @Override
    public Square createSquare() {
        return new RedSquare();
    }
}
