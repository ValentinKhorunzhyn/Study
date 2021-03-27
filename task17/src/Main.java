public class Main {
    public static void main(String[] args) {
        Ampnibian amp = new Ampnibian();
        Frog timka = new Frog();
        amp.moveInWater();
        amp.moveOnLand();
        timka.moveInWater();
        timka.moveOnLand();
        Ampnibian am = new Frog();
        System.out.println("!!!!!!!!!!!!!!!!!" +  am.getName());
        Frog amphibian = (Frog) am;
        amphibian.sayKva();
        Ampnibian gora = new Frog();
        gora.moveInWater();
    }
}
