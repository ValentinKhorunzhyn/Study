public class EnumBrake {
    public static void main(String[] args) {
        String[] array = new String[]{};

        for (Numbers n : Numbers.values()) {
            switch (n) {

                case one: {
                    System.out.println("Number 1");
                    break;
                }
                case two: {
                    System.out.println("Number 2");
                    break;
                }

                case three: {
                    System.out.println("Number 3");
                    break;
                }
                case four: {
                    System.out.println("Number 4");
                    break;
                }
                case five: {
                    System.out.println("Number 5");
                    break;
                }

            }
        }

    }

    enum Numbers {one,two,three,four,five}

}