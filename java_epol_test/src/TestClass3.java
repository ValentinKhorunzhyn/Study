public class TestClass3 {
    public static void main(String[] args) {
        int x = 1;
        int[] y = {1};
        incr(x);
        incr(y);
        System.out.println(x);
        System.out.println(y[0]);

    }

    static void incr(int n) {
        n++;
    }

    static void incr(int[] n) {
        n[0]++;
    }

}
