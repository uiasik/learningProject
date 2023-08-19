package all.patterns.factory;

import all.patterns.factory.figure.Figure;
import all.patterns.factory.figureFactory.FigureFactory;
import all.patterns.factory.figureFactory.SphereFactory;
import all.patterns.factory.figureFactory.SquareFactory;

public class FactoryStart {
    public void start(){
        FigureFactory figureFactory = new SquareFactory();
        Figure figure = figureFactory.createFigure();
        figure.printFigure();
    }
}
