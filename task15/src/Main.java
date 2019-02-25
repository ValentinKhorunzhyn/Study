public class Main {
    public static void main(String[] args) {

        ConnectionManager manager = ConnectionManager.getManager();
        for (int i = 0; i < 30; i++) {
         Connection connection = manager.getConnection();
         if (connection != null){
             connection.doSomething();
         }else {
             System.out.println("Connection is off");
         }
        }
    }
}
