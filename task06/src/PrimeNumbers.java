public class PrimeNumbers {


    public void fined() {
        boolean flag = false;

        for (int i = 2; i <= 150; i++) {

            for (int j = 2; j < i; j++) {

                if (i % j != 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(" " + i + " ");
            }
        }
    }

}