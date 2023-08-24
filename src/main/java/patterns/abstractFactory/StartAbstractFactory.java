package main.java.patterns.abstractFactory;


import main.java.Start;
import main.java.patterns.abstractFactory.circle.Circle;
import main.java.patterns.abstractFactory.figureFactory.BlueFigureFactory;
import main.java.patterns.abstractFactory.figureFactory.FigureFactory;
import main.java.patterns.abstractFactory.figureFactory.RedFigureFactory;
import main.java.patterns.abstractFactory.square.Square;

public class StartAbstractFactory implements Start {


    public void start() {
        FigureFactory redFigureFactory = new RedFigureFactory();
        FigureFactory blueFigureFactory = new BlueFigureFactory();

        Circle redCircle = redFigureFactory.createCircle();
        Circle blueCircle = blueFigureFactory.createCircle();
        Square redSquare = redFigureFactory.createSquare();
        Square blueSquare = blueFigureFactory.createSquare();

        redCircle.draw();
        blueCircle.draw();
        redSquare.draw();
        blueSquare.draw();
    }

}
