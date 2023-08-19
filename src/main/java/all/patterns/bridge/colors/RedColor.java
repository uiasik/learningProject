package all.patterns.bridge.colors;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.print("apply red");
    }
}
