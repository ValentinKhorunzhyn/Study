

public class Main {


    public static void main(String[] args) {
//        System.out.println(ConnectionManager.managers);
        for (int i = 0; i < 6; i++) {
            System.out.println(ConnectionManager.getManager());
        }

    }
}
