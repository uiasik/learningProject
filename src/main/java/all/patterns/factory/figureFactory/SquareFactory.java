package all.patterns.factory.figureFactory;

import all.patterns.factory.figure.Figure;
import all.patterns.factory.figure.Square;

public class SquareFactory implements FigureFactory{
    @Override
    public Figure createFigure() {
        return new Square();
    }
}
