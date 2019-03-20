public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "abscis: " + x + " ordinat: " + y;
    }

    @Override
    public boolean equals(Object p) {
        if (p == null)
            return false;
        if (p == this)
            return true;
        if (p.getClass() == this.getClass()) {
            Point point = (Point) p;
            if (point.x == this.x && point.y == this.y)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 97;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }

}
