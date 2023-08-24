package main.java.patterns.abstractFactory.figureFactory;


import main.java.patterns.abstractFactory.circle.BlueCircle;
import main.java.patterns.abstractFactory.circle.Circle;
import main.java.patterns.abstractFactory.square.BlueSquare;
import main.java.patterns.abstractFactory.square.Square;

public class BlueFigureFactory implements FigureFactory {

    @Override
    public Circle createCircle() {
        return new BlueCircle();
    }

    @Override
    public Square createSquare() {
        return new BlueSquare();
    }
}
