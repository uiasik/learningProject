package all.patterns.builder;

public class StartBuilder {
    public void start(){
        Circle circle = new Circle.Builder()
                .setX(11)
                .setY(23)
                .setRadius(54)
                .setBlue(122)
                .build();

        System.out.println(circle);
    }
}
