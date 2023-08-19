package all.patterns.abstractFactory.figureFactory;

import all.patterns.abstractFactory.circle.BlueCircle;
import all.patterns.abstractFactory.circle.Circle;
import all.patterns.abstractFactory.square.BlueSquare;
import all.patterns.abstractFactory.square.Square;

public class BlueFigureFactory implements FigureFactory{

    @Override
    public Circle createCircle() {
        return new BlueCircle();
    }

    @Override
    public Square createSquare() {
        return new BlueSquare();
    }
}
