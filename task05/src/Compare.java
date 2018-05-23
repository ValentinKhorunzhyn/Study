import java.util.Scanner;

public class Compare {

    public Double inputMethod(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        Double ipv = in.nextDouble();
        return ipv;

    }

    public void compareMethod(Double v1, Double v2){
        if ((Math.abs(v1)/Math.abs(v2)) < 1 ){
            System.out.println("The largest number is: " + v2);
            System.out.println("The smallest number is: " + v1);
        } else if((Math.abs(v1)/Math.abs(v2)) > 1){
            System.out.println("The largest number is: " + v1);
            System.out.println("The smallest number is: " + v2);
        } else {
            System.out.println("Values are equal to each other");
        }

    }
}