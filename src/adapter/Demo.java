package adapter;

public class Demo {
    public static void main(String[] args) {
        PyoreaReika reika = new PyoreaReika(5);
        PyoreaTikku pyoreaTikku = new PyoreaTikku(5);
        if (reika.sopii(pyoreaTikku)) {
            System.out.println("Pyöreä tikku säteellä 5 sopii reikään säteellä 5.");
        }

        NelikulmainenTikku pieniNelikulmainenTikku = new NelikulmainenTikku(2);
        NelikulmainenTikku suuriNelikulmainenTikku = new NelikulmainenTikku(20);

        NelikulmainenTikkuAdapter pieniNelikTikkuAdapter = new NelikulmainenTikkuAdapter(pieniNelikulmainenTikku);
        NelikulmainenTikkuAdapter suuriNelikTikkuAdapter = new NelikulmainenTikkuAdapter(suuriNelikulmainenTikku);
        if (reika.sopii(pieniNelikTikkuAdapter)) {
            System.out.println("Nelikulmainen tikku leveydellä 2 sopii reikään säteellä 5.");
        }
        if (!reika.sopii(suuriNelikTikkuAdapter)) {
            System.out.println("Nelikulmainen tikku leveydellä 20 ei sovi reikään säteellä 5.");
        }
    }
}