public class Frog extends Ampnibian {

    String name = "Frog";

    void moveInWater() {
        System.out.println("I am Frog, and I can swim very fast");
    }

    void moveOnLand() {
        System.out.println("I am Frog, and I am the fastest jumper");
    }

    void sayKva(){
        System.out.println("Frog say Kva-Kva");
    }

    public String getName() {
        return name;
    }
}
