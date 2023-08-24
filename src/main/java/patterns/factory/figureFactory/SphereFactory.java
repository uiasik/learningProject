package main.java.patterns.factory.figureFactory;


import main.java.patterns.factory.figure.Figure;
import main.java.patterns.factory.figure.Sphere;

public class SphereFactory implements FigureFactory{
    @Override
    public Figure createFigure() {
        return new Sphere();
    }
}
