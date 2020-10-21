package factorymethod;

public class Kuraattori extends AterioivaOtus {
	
	public Juoma createJuoma() {
		return new Tee();
	}
}
