package all.patterns.factory.figureFactory;

import all.patterns.factory.figure.Figure;
import all.patterns.factory.figure.Sphere;

public class SphereFactory implements FigureFactory{
    @Override
    public Figure createFigure() {
        return new Sphere();
    }
}
