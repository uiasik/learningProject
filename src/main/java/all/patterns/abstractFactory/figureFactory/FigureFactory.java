package all.patterns.abstractFactory.figureFactory;

import all.patterns.abstractFactory.circle.Circle;
import all.patterns.abstractFactory.square.Square;

public interface FigureFactory {
    public Circle createCircle();
    public Square createSquare();
}
