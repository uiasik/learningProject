package main.java.patterns.factory;


import main.java.Start;
import main.java.patterns.factory.figure.Figure;
import main.java.patterns.factory.figureFactory.FigureFactory;
import main.java.patterns.factory.figureFactory.SquareFactory;

public class StartFactory implements Start {
    public void start(){
        FigureFactory figureFactory = new SquareFactory();
        Figure figure = figureFactory.createFigure();
        figure.printFigure();
    }
}
