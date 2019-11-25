package graphics;

import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(int width, int height) {
        this(width, height, 0, 0);
    }

    public Rectangle(int width, int height, int x, int y) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getWidth(), rectangle.getHeight(), rectangle.getX(), rectangle.getY());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void grow(int d) {
        setWidth(getWidth() + d);
        setHeight(getHeight() + d);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                "} ";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return super.equals(o) &&
                width == rectangle.width &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public void scale(int factor) {
        height = (height * factor) / 100;
        width = (width * factor) / 100;
    }
}
