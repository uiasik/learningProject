package all.patterns.adapter;

public class StartAdapter {
    public void start(){
        Figure figure = new RectangleAdapter(new Rectangle());
        figure.draw();
    }
}
