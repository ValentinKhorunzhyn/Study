public class Main {
    public static void main(String[] args) {
        Connection firstmanager;
        Connection secondmanager;
        firstmanager = new Connection("Vasiliy");
        secondmanager = new Connection("Boris");
        System.out.println(firstmanager.toString());
        System.out.println(firstmanager);
        System.out.println(secondmanager.toString());
    }
}
