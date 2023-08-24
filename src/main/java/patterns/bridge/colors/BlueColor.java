package main.java.patterns.bridge.colors;

public class BlueColor implements Color{
    @Override
    public void applyColor() {
        System.out.print("apply blue");
    }
}
