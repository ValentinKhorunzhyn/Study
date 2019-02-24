public class Connection {
    private static Connection manager;
    private String name;
    private int id;
    Connection(String name){
        System.out.println("Connection created");
        this.name = name;
        ++id;
    }


    public static Connection getConnection(){
        if (manager == null){
            manager = new Connection("");
        }
        return manager;
    }

    @Override
    public String toString(){return name;}

}
