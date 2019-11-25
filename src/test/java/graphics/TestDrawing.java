package graphics;

import graphics.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDrawing {
    Drawing drawing;

    @BeforeEach
    void setUp() {
        drawing = new Drawing();
    }

    @Test
    void testAddShapeIncreasesSize() {
        // given drawing

        // when
        drawing.add(new Square(10));

        // then
        assertEquals(1, drawing.getSize());
    }

    @Test
    void testCanAddMultipleShapes() {
        // given drawing

        // when
        drawing.add(new Square(10));
        drawing.add(new Circle(10));
        drawing.add(new Rectangle(2, 4, 5, 6));

        // then
        assertEquals(3, drawing.getSize());
    }

    @Test
    void testCanRemoveShape() {
        // given drawing
        Square square = new Square(10);
        drawing.add(square);

        // when
        drawing.remove(square);

        // then
        assertEquals(0, drawing.getSize());
    }

    @Test
    void testCanDetectIfShapeIsPresent() {
        // given drawing
        Square square = new Square(10);
        drawing.add(square);

        // when
        boolean isPresent = drawing.isPresent(square);

        // then
        assertTrue(isPresent);
    }

    @Test
    void testDoesntRemoveNonExistentShape() {
        // given drawing
        Square square = new Square(10);
        Circle circle = new Circle(10);
        drawing.add(square);

        // when
        drawing.remove(circle);

        // then
        assertEquals(1, drawing.getSize());
    }

    @Test
    void testCanAddAndRemoveShapes() {
        // given drawing
        drawing.add(new Circle(10));
        drawing.add(new Square(10));
        drawing.add(new Square(10, 4, 8));
        drawing.remove(new Square(10));
        final Shape rect = new Rectangle(40, 8, 0, 10);

        // when
        drawing.add(rect);

        // then
        assertTrue(drawing.isPresent(rect));
    }

    @Test
    void testClearDrawing() {
        // given drawing
        drawing.add(new Square(10));
        drawing.add(new Circle(10));

        // when
        drawing.clear();

        // then
        assertEquals(0, drawing.getSize());
    }

    @Test
    void testClearDrawingRemovesShapes() {
        // given drawing
        drawing.add(new Square(10));
        drawing.add(new Circle(10));

        // when
        drawing.clear();

        // then
        assertFalse(drawing.isPresent(new Square(10)));
        assertFalse(drawing.isPresent(new Circle(10)));
    }
}
