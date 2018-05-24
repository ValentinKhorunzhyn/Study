import java.util.Scanner;

public class Compare {

    public Double inputMethod(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        Double ipv = in.nextDouble();
        return ipv;

    }

    public void compareMethod(Double v1, Double v2) {
        int result = Double.compare(v1, v2);
        switch (result) {
            case 1: {
                System.out.println("The largest number is: " + v1);
                System.out.println("The smallest number is: " + v2);
                break;
            }
            case -1: {
                System.out.println("The largest number is: " + v2);
                System.out.println("The smallest number is: " + v1);
                break;
            }
            default: {
                System.out.println("v2 equals v1");
                break;
            }
        }
    }
}









