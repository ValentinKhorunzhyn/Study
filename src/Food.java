abstract public class Food {

    String smell = "Smell food";

    abstract void eat();

    void cook() {
        System.out.println("Cook food");
    }
}

class Fruit extends Food{

    String smell = "Smell fruit";

    void eat() {
        System.out.println("Eat fruit");
    }

    void cook() {
        System.out.println("Cook fruit");
    }
}

class Meat extends Food {

    String taste = "Meat taste";

    @Override
    void eat() {
        System.out.println("Eat meat");
    }
}

class B {

    public static void main(String[] args) {
        Meat meat = new Meat();
        Fruit fruit = new Fruit();

        Meat[] meats;


    }
}


