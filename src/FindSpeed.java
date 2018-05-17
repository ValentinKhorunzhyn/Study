import java.util.Scanner;

public class FindSpeed {

    public static void main(String[] args) {
        System.out.println("You launched SPEED program");
        FindSpeed FSpeed = new FindSpeed();
        String [] Values = new String[2];
        String TTime = FSpeed.inputMethod("Enter the amount of time in seconds: ");
        Values[0] = TTime;
        String TDist = FSpeed.inputMethod("Enter the distance in metres: ");
        Values[1] = TDist;
        int SuperSpeed = (Integer.parseInt(TDist)/Integer.parseInt(TTime));
        System.out.println("Speed of your Sperm: " + SuperSpeed + " m/s");


    }

    private String inputMethod(String message) {
        Scanner in = new Scanner(System.in);
        boolean flag;
        String variableS;
        do {
            flag = true;
            System.out.print(message);
            variableS = in.nextLine();

            for (int i = 0; i < variableS.length(); i++) {
                if (!Character.isDigit(variableS.charAt(i))) {
                    flag = false;
                }
            }

            if (flag == false) {
                System.out.println("You must use only digits from 0 to 9");
            }

        } while (flag == false);

        return variableS;

    }

}