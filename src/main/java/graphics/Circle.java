package graphics;

public class Circle extends Shape {
    private int radius;

    public Circle() {
        this(0);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this(circle.radius, circle.getX(), circle.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void grow(int d) {
        setRadius(getRadius() + d);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                "} ";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
