import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int o = n % 2;
            sb.append(o);
            n = n / 2;
        }
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb);
        System.out.println(sb);
        System.out.println(sb);
    }
}