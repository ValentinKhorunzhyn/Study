public class RandomShapeGenerator {
    private Shape shape;
    double b;

    Shape next() {
        b = Math.random();
        if (b < 0.5) {
            shape = new Triangle();
        } else {
            shape = new Rectangle();
        }
        return shape;
    }

}
