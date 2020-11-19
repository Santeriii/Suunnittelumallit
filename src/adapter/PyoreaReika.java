package adapter;

public class PyoreaReika {
    private double sade;

    public PyoreaReika(double sade) {
        this.sade = sade;
    }

    public double getSade() {
        return sade;
    }

    public boolean sopii(PyoreaTikku tikku) {
        boolean tulos;
        tulos = (this.getSade() >= tikku.getSade());
        return tulos;
    }
}
