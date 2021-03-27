public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new MyThread());
        System.out.println(t1.getName() + " " + t1.getState());
        Thread t2 = new Thread(new MyThread());

        t2.start();
        t1.start();
        System.out.println(t1.getName() + " " + t1.getState());


        Thread.sleep(1000);

        System.out.println(t1.getName() + " " + t1.getState());
        System.exit(0);
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
//        for (int x = 1; x < 4; x++) {
////            System.out.println("Run by "
////                    + Thread.currentThread().getName()
////                    + ", x is " + x);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }
        additionalMethod();
    }

    private static synchronized void additionalMethod() {
        while (true) {

        }
    }

}
