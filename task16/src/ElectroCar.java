public class ElectroCar extends DvsCar {

    public String to = "This is Electro Car";
    @Override
    protected double getPower(double p, double h) {
        if (p > 0 && h > 0)
            p = p * h;
        return p;
    }


}
