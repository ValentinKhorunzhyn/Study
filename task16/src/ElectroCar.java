public class ElectroCar extends DvsCar {

    @Override
    protected double getPower(double p, double h) {
        if (p > 0 && h > 0)
            p = p * h;
        return p;
    }
}
