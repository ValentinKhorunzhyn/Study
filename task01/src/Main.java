
public class Main {

    public static void main(String[] args) {
        System.out.println("You launched SPEED program");
        FindSpeed findSpeed = new FindSpeed();
        String inputValue = findSpeed.inputMethod("Enter the time in seconds,and distance in metres: ");

        int[] vDigit = findSpeed.parseString(inputValue);

        int setTime = vDigit[0];
        int setDistance = vDigit[1];
        int Speed = setTime/setDistance;

        System.out.println("Speed of your body: " + Speed + " m/s");
    }

}
