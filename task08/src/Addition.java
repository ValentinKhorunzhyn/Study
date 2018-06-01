import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        System.out.println("This program counts the sum of two numbers!");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        String f = in.nextLine();
        System.out.print("Enter the second value: ");
        String s = in.nextLine();

        Float fValue = Float.parseFloat(f);
        Double sValue = Double.parseDouble(s);

       Long sum = fValue.longValue() + sValue.longValue();
        System.out.println("The sum of two numbers: " + sum);

    }
}