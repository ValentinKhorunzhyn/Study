public class DvsCar {

    Double power;
    public String to = "This DVSCar";

    int getPower(int p) {
        return p;
    }

    protected double getPower(double p, double h) {

        if (p > 0 && h > 0) {
            power = p * h;
        } else {
            System.out.println("Введены неверные параметры мощности и коэффициента");
        }
        return power;
    }

    protected double getPower(double p, double h, int t) {
        if (p > 0 && h > 0 && t > 0) {
            power = p * h * t;
        } else {
            System.out.println("Коэффициенты работы ДВС не могут быть отрицательны");
        }
        return power;
    }

}
