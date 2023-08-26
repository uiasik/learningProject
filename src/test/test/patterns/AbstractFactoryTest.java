package test.test.patterns;

import main.java.patterns.abstractFactory.circle.BlueCircle;
import main.java.patterns.abstractFactory.circle.RedCircle;
import main.java.patterns.abstractFactory.square.BlueSquare;
import main.java.patterns.abstractFactory.square.RedSquare;
import org.junit.Assert;
import org.junit.Test;
import main.java.patterns.abstractFactory.figureFactory.BlueFigureFactory;
import main.java.patterns.abstractFactory.figureFactory.FigureFactory;
import main.java.patterns.abstractFactory.figureFactory.RedFigureFactory;

public class AbstractFactoryTest {
    @Test
    public void createClasses(){
        FigureFactory redFigureFactory = new RedFigureFactory();
        FigureFactory blueFigureFactory = new BlueFigureFactory();

        Assert.assertEquals(RedCircle.class, redFigureFactory.createCircle().getClass());
        Assert.assertEquals(BlueCircle.class, blueFigureFactory.createCircle().getClass());
        Assert.assertEquals(RedSquare.class, redFigureFactory.createSquare().getClass());
        Assert.assertEquals(BlueSquare.class, blueFigureFactory.createSquare().getClass());
    }
}
