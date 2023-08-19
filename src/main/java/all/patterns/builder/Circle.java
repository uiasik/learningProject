package all.patterns.builder;

public class Circle {
    private int x;
    private int y;
    private int radius;
    private int red;
    private int green;
    private int blue;

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

    private Circle() {
    }

    public static class Builder {
        private int x;
        private int y;
        private int radius;
        private int red;
        private int green;
        private int blue;

        public Builder setX(int x) {
            this.x = x;
            return this;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }

        public Builder setRadius(int radius) {
            this.radius = radius;
            return this;
        }

        public Builder setRed(int red) {
            this.red = red;
            return this;
        }

        public Builder setGreen(int green) {
            this.green = green;
            return this;
        }

        public Builder setBlue(int blue) {
            this.blue = blue;
            return this;
        }

        public Circle build() {
            Circle circle = new Circle();

            circle.x = x;
            circle.y = y;
            circle.radius = radius;
            circle.red = red;
            circle.green = green;
            circle.blue = blue;

            return circle;
        }
    }
}
