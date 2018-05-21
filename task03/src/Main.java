public class Main {

    public static void main(String[] args) {

        Coin co = new Coin();
        int gaveCoin = co.inputMethod("Enter the number of coins you want to receive from the Leprechaun? ");
        co.collectCoin(gaveCoin);

    }
}