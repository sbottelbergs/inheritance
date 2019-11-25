import graphics.Circle;
import graphics.Drawing;
import graphics.Rectangle;
import graphics.Square;

public class DrawingApp {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle(5, 1, 4));
        System.out.println("Size: " + drawing.getSize());
        drawing.add(new Square(15, 10, 8));
        System.out.println("Size: " + drawing.getSize());
        drawing.add(new Rectangle(5, 10, 5, 5));
        System.out.println("Size: " + drawing.getSize());

        System.out.println();
        drawing.draw();

        System.out.println();
        System.out.println("Scaling half");
        drawing.scaleHalf();
        drawing.draw();

        System.out.println();
        System.out.println("Scaling double");
        drawing.scaleDouble();
        drawing.draw();
    }
}
