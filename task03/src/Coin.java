import java.util.Scanner;

public class Coin {

        public int inputMethod(String message){

            Scanner in = new Scanner(System.in);
            System.out.println(message);
            int ipCoin = in.nextInt();
            return ipCoin;
        }

        public int collectCoin(int count){
            int startCount = 1;
            for (int i = 0; i < count -1; i++) {
                startCount++;
                System.out.println("Oh, I have a " + startCount + " coins");

            }
            return startCount;
        }

    }

