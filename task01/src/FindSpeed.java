import java.util.Scanner;

public class FindSpeed {

    public String inputMethod(String message) {
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

    public int[] parseString(String stringArgs){
        String[] valuesOfSet = stringArgs.split(" ");
        int vDigit[] = new int[valuesOfSet.length];

        for (int i = 0; i < valuesOfSet.length; i++) {
            vDigit[i] = Integer.parseInt(valuesOfSet[i]);
        }
        return vDigit;
    }

}