public class Main {

    public static void main(String[] args) {

        Compare com = new Compare();

        Double fValue = com.inputMethod("Enter the first decimal number and exponent: ");
        Double sValue = com.inputMethod("Enter the second decimal number and exponent: ");
        com.compareMethod(fValue,sValue);


    }
}