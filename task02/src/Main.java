public class Main {
    public static void main(String[] args) {
        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog();
        myDog1.setName("Spot");
        myDog2.setName("Scruffy");
        myDog1.setSays("Ruff");
        myDog2.setSays("Wurf");
        System.out.println("Dog " + myDog1.getName() + " say: " + myDog1.getSays());
        System.out.println("Dog " + myDog2.getName() + " say: " + myDog2.getSays());
    }
}