import java.lang.String;

public class Dog {

    public String name;
    public String says;

    public  Dog(String name, String says){
        this.name = name;
        this.says = says;
    }

    public static void main(String[] args) {
        Dog myDog1 = new Dog( "Spot", "Ruff!" );
        Dog myDog2 = new Dog("Scruffy", "Wurf!");
        System.out.println("Dog " + myDog1.name + " say: " + myDog1.says);
        System.out.println("Dog " + myDog2.name + " say: " + myDog2.says);
    }


}