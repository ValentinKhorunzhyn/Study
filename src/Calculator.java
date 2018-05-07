import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Вас приветствует программа CALCULATOR");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int fNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        int sNumber = in.nextInt();
        System.out.print("Введите желаемое арифметическое действие(1- умножить, 2 - сложить," +
                " 3 - разделить, 4 - вычесть): ");
        int aAction = in.nextInt();
        if (aAction == 1) {
            System.out.println("Ваш ответ: " + (fNumber*sNumber));
        } else if (aAction == 2) {
            System.out.println("Ваш ответ: " + (fNumber+sNumber) );
        } else if (aAction == 3) {
            System.out.println("Ваш ответ: " + (fNumber/sNumber));
        } else if (aAction == 4) {
            System.out.println("Ваш ответ: " + (fNumber-sNumber));
        } else {
            System.out.println("Вы вышли за необходимый диапазон");
        }
    }
}
