public class Rectangle extends GeometricObject{
    protected double length;
    protected double width;

    public Rectangle(boolean filled, String color, double length, double width) {
        super(filled, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return (2*this.length)+(2*this.width);
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
