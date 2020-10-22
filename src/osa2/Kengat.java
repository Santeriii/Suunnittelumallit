package osa2;

public class Kengat implements KengatIF {
	
	private String merkki;
	
	public Kengat(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "Kenkäni ovat '" + this.merkki + "'-merkkisiä";
	}
	
}