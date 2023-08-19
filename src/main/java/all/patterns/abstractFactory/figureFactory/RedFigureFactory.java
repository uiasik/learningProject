package all.patterns.abstractFactory.figureFactory;

import all.patterns.abstractFactory.circle.Circle;
import all.patterns.abstractFactory.circle.RedCircle;
import all.patterns.abstractFactory.square.RedSquare;
import all.patterns.abstractFactory.square.Square;

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
