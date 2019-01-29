public class ConnectionManager {

    static private Connection[] manager = new Connection[5];

    static {
        manager[0] = new Connection("Luka Modrich");
        manager[1] = new Connection("Ivan Perishich");
        manager[2] = new Connection("Ivan Rakitich");
        manager[3] = new Connection("Mateo Kovachich");
        manager[4] = new Connection("Domagoi Vida");


    }

    static Connection getConnection() {
        Connection connection = null;
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] != null) {
                connection = manager[i];
                manager[i] = null;
                return connection;
            }
        }
        return connection;
    }
}



