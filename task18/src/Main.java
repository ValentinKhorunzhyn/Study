public class Main {
    public static void main(String[] args) {
        Point pt1 = new Point(14, 13);
        Point pt2 = new Point(17, 2);
        Point pt3 = pt1;
        boolean ob = pt1.equals(pt2);
        System.out.println(ob);
        System.out.println(pt1.hashCode());
        System.out.println(pt2.hashCode());
        System.out.println(pt2.toString());

    }
}
