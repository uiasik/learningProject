package all.patterns.abstractFactory;

import all.patterns.abstractFactory.circle.Circle;
import all.patterns.abstractFactory.figureFactory.BlueFigureFactory;
import all.patterns.abstractFactory.figureFactory.FigureFactory;
import all.patterns.abstractFactory.figureFactory.RedFigureFactory;
import all.patterns.abstractFactory.square.Square;

public class StartAbstractFactory {


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
