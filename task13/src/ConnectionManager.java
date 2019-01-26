public class ConnectionManager {

    String name;
    static Connection[]Manager = new Connection[5];

    public static void main(String[] args) {
        Manager[0] = new Connection("Luka Modrich");
        Manager[1] = new Connection("Ivan Perishich");
        Manager[2] = new Connection("Ivan Rakitich");
        Manager[3] = new Connection("Mateo Kovachich");
        Manager[4] = new Connection("Domagoi Vida");

        


    }

    private static Object getObject(String name){
        return Object.class;
    }



    private static class Connection {

        String name;

        public Connection(String name){

            this.name = name;
        }

    }
}