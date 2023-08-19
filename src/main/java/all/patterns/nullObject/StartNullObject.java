package all.patterns.nullObject;

public class StartNullObject {
    public void start() {
        ReturnFigure returnFigure = new ReturnFigure(1);
        returnFigure.returnFigure().drawFigure();
        ReturnFigure returnNoFigure = new ReturnFigure(0);
        returnNoFigure.returnFigure().drawFigure();
    }
}
