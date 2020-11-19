package adapter;

public class NelikulmainenTikku {
    private double leveys;

    public NelikulmainenTikku(double leveys) {
        this.leveys = leveys;
    }

    public double getLeveys() {
        return leveys;
    }

    public double getNelio() {
        double tulos;
        tulos = Math.pow(this.leveys, 2);
        return tulos;
    }
}
