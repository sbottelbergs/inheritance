import graphics.Circle;
import graphics.Rectangle;
import graphics.Shape;
import graphics.Square;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(10, 20, 1, 2),
                new Square(10, 0, 0),
                new Circle(5, 10, 15)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
