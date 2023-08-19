package all.patterns.adapter;

public class RectangleAdapter implements Figure{
    private final Rectangle rectangle;
    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    @Override
    public void draw() {
        rectangle.drawRectangle();
    }
}
