
import java.util.LinkedList;

public class ConnectionManager {

    static private LinkedList<Manager> managers = new LinkedList<>();

    static {
        Manager Luka = new Manager("Luka Modrich");
        Manager Ivan = new Manager("Ivan Perishich");
        Manager Ivanko = new Manager("Ivan Rakitich");
        Manager Mateo = new Manager("Mateo Kovacich");
        Manager Domagoi = new Manager("Domagoi Vida");

        managers.add(Luka);
        managers.add(Ivan);
        managers.add(Ivanko);
        managers.add(Mateo);
        managers.add(Domagoi);

    }


    static Manager getManager() {
        if (managers.size()!=0) {
            return managers.removeFirst();
        }
        return null;
    }
}

