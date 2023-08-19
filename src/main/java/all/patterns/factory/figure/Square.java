package all.patterns.factory.figure;

import all.patterns.factory.figure.Figure;

public class Square implements Figure {
    @Override
    public void printFigure() {
        System.out.println("Square");
    }
}
