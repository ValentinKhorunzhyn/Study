import java.util.Scanner;

public class FindSpeed {

    public static void main(String[] args) {
        System.out.println("You launched SPEED program");
        FindSpeed FSpeed = new FindSpeed();
        String inputValue = FSpeed.inputMethod("Enter the time in seconds,and distance in metres: ");
        String [] Values = new String[1];
        Values[0] = inputValue;
        String[] ValuesOfset = inputValue.split(" ");
        int VDigit[] = new int[ValuesOfset.length];

        for (int i = 0; i < ValuesOfset.length; i++) {
            VDigit[i] = Integer.parseInt(ValuesOfset[i]);
        }

        int setTime = VDigit[0];
        int setDistance = VDigit[1];
        int Speed = setTime/setDistance;

        System.out.println("Speed of your sperm: " + Speed + "m/s");

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
                if (!Character.isDigit(variableS.charAt(i)) & !Character.isSpaceChar(variableS.charAt(i))) {
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