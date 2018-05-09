import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Good Day, I am a CALCULATOR");
        Calculator calc = new Calculator();

        int fNumber = calc.inputMethod("Input first number please: ");
        int sNumber = calc.inputMethod("Input second number please: ");

        int aAction = calc.chooseOperation();

        calc.doOperation(fNumber, sNumber, aAction);
    }

    private int inputMethod(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }

    private int chooseOperation() {
        return this.inputMethod("Enter the arithmetic action (1- multiplication, 2 - addition," +
                " 3 - division, 4 - subtraction): ");
    }

    private void doOperation(int fNumber, int sNumber, int aAction) {
        switch (aAction) {
            case 1:
                System.out.println("Your answer: " + (fNumber * sNumber));
                break;
            case 2:
                System.out.println("Your answer: " + (fNumber + sNumber));
                break;
            case 3:
                System.out.println("Your answer: " + (fNumber / sNumber));
                break;
            case 4:
                System.out.println("Your answer: " + (fNumber - sNumber));
                break;
            default:
                System.out.println("You must enter an integer from 1 to 4");
        }
    }
}

