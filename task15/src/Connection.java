public class Connection {

    private String name;
    private int id;
    private static int count = 0;

    public Connection() {
        System.out.println("Connection created");
        ++count;
        this.id = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount(){
        return count;
    }

    public void doSomething(){
        System.out.println("Connection " + this.id + " does");
    }
    @Override
    public String toString() {
        return name;
    }

}
