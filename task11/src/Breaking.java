public class Breaking {

    public static void main(String[] args) {
        String str = "Yurka";

        switch (str) {

            case "vsc" : {
                System.out.println("Yurka ne etot");

            }
            case "Yurka" : {

                System.out.println("Eto Yurka");
            }

        }

        for (int i = 1; i < 6; i++) {

            switch (i) {
                case 1: {
                    System.out.println("This number is 1");

                }
                case 2: {
                    System.out.println("This number is 2");
                    break;
                }
                case 3: {
                    System.out.println("This number is 3");
                    break;
                }
                case 4: {
                    System.out.println("This number is 4");
                    break;
                }
                case 5: {
                    System.out.println("This number is 5");
                    break;
                }

            }

        }

    }

}