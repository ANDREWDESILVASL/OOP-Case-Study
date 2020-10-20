public class Square extends GeometricObject {
    private double side;

    public Square(boolean filled, String color, double side) {
        super(filled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return 4*this.side;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
