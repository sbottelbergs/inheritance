package graphics;

public interface Scaleable {
    int QUARTER = 25;
    int DOUBLE = 200;
    int HALF = 50;

    void scale(int factor);

    default void scaleDouble() {
        scale(DOUBLE);
    }

    default void scaleHalf() {
        scale(HALF);
    }
}
