package graphics;

import java.util.Arrays;

public class Drawing implements Drawable {
    private static final int INITIAL_SIZE = 100;
    private Drawable[] drawables;

    private int size = 0;

    public Drawing() {
        drawables = new Drawable[INITIAL_SIZE];
    }

    public void add(Drawable shape) {
        drawables[getFreeLocation()] = shape;
        size++;
    }

    public void remove(Drawable shape) {
        if (isPresent(shape)) {
            for (int i = 0; i < size; ++i) {
                if (shape.equals(drawables[i])) {
                    drawables[i] = null;
                    break;
                }
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isPresent(Drawable shape) {
        for (Drawable s : drawables) {
            if (shape.equals(s)) {
                return true;
            }
        }
        return false;
    }

    private int getFreeLocation() {
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] == null) {
                return i;
            }
        }
        return size;
    }

    public void clear() {
        Arrays.fill(drawables, null);
        size = 0;
    }

    @Override
    public String toString() {
        return String.format("Drawing{size=%d}", size);
    }

    @Override
    public void draw() {
        System.out.println(this);
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                drawable.draw();
            }
        }
    }

    @Override
    public void scale(int factor) {
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                drawable.scale(factor);
            }
        }
    }
}
