public class TestClass6 {
    public static void main(String[] params) {
        int count = 0;
        int summ = 0;
        do {
            if (count % 3 == 0) continue;
            summ += count;
        } while (count++ < 11);
        System.out.println(summ);
    }
}
