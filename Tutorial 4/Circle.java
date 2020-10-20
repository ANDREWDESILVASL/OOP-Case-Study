public class Circle extends GeometricObject {
    protected double radius;

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return (Math.pow(this.radius,2))*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*this.radius);
    }

    @Override
    public String getShape() {
        return "Circle";
    }

}
