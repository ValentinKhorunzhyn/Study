import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {
    private List<Connection> connectionList = new ArrayList<Connection>();
    private static ConnectionManager manager;

    public static ConnectionManager getManager() {
        if (manager == null) {
            manager = new ConnectionManager();
            init(manager);
        }
        return manager;
    }

    private ConnectionManager() {

    }

    private static void init(ConnectionManager manager) {
        for (int i = 1; i < 20; i++) {
            Connection connection = new Connection();
            manager.getConnectionList().add(connection);
        }
    }

    private List<Connection> getConnectionList() {
        return this.connectionList;
    }


    public Connection getConnection() {
        if (!this.getConnectionList().isEmpty()) {
            return this.getConnectionList().remove(0);
        } else {
            return null;
        }
    }

}
