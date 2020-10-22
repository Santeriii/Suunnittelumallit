package osa2;

public class Lippis implements LippisIF {
	
	private String merkki;
	
	public Lippis(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "Lippikseni on '" + this.merkki + "'-merkkinen";
	}
	
}