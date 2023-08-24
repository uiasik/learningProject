package main.java.patterns.factory.figureFactory;

import main.java.patterns.factory.figure.Figure;
import main.java.patterns.factory.figure.Square;

public class SquareFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new Square();
    }
}
