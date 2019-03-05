public class Main {
    public static void main(String[] args) {
        DvsCar car1 = new DvsCar();
        ElectroCar car2 = new ElectroCar();
        System.out.println(car2.to);
        System.out.println(car1.getPower(1));
        System.out.println(car1.getPower(125.3,425.6));
        System.out.println(car1.getPower(14.2,-12.8,30));
        System.out.println(car2.getPower(125.8,20.8,12));
        System.out.println(car2.getPower(12.8,3.4));

    }
}
