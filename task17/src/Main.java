public class Main {
    public static void main(String[] args) {
        Ampnibian amp = new Ampnibian();
        Frog timka = new Frog();
        amp.moveInWater();
        amp.moveOnLand();
        timka.moveInWater();
        timka.moveOnLand();
        Ampnibian am = new Frog();
        Frog amphibian = (Frog) am;
        amphibian.sayKva();
    }
}
