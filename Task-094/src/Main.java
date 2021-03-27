import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new SystemTimeThread(2));
        t.start();
    }
}

class SystemTimeThread implements Runnable {

    private long millis;

    public SystemTimeThread(int seconds) {
        this.millis = seconds * 1000;
    }

    @Override
    public void run() {
        DateFormat df = new SimpleDateFormat("HH:mm:ss");

        while (true) {
            Date dateobj = new Date();
            System.out.println("System time: " + df.format(dateobj));
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}