import java.util.Scanner;

public class Computer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of RAM in your computer and HDD: ");
        String ch = in.nextLine();
        String[] compRamHdd = ch.split(" ");
        int[] compInt = new int[compRamHdd.length];
        for (int i = 0; i < compRamHdd.length; i++) {
            compInt[i] = Integer.parseInt(compRamHdd[i]);
        }

        Double ram = Double.valueOf(new Double(1));
        Integer hdd = compInt[1];
        System.out.println("RAM: " + ram + " Gb");
        System.out.println("HDD " + hdd.doubleValue() + " Gb");
    }
}