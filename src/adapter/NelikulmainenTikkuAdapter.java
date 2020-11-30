package adapter;

public class NelikulmainenTikkuAdapter extends PyoreaTikku {
    private NelikulmainenTikku tikku;

    public NelikulmainenTikkuAdapter(NelikulmainenTikku tikku) {
        this.tikku = tikku;
    }

    @Override
    public double getSade() {
        double tulos;
        tulos = (Math.sqrt(Math.pow((tikku.getLeveys() / 2), 2) * 2));
        return tulos;
    }
}
