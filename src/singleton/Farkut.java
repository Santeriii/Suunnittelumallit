package singleton;

public class Farkut implements FarkutIF {
	
	private String merkki;
	
	public Farkut(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "Farkkuni ovat '" + this.merkki + "'-merkkisiä";
	}
	
}
