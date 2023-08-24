package main.java.patterns.nullObject;

public class ReturnFigure {
    private final int value;

    public ReturnFigure(int value) {
        this.value = value;
    }

    public Figure returnFigure(){
        if (value != 0){
            return new Figure();
        } else {
            return new NoFigure();
        }
    }
}
