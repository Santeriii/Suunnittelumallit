package osa2;

public class TPaita implements TPaitaIF {
	
	private String merkki;
	
	public TPaita(String merkki) {
		this.merkki = merkki;
	}
	
	@Override
	public String toString() {
		return "T-paitani on '" + this.merkki + "'-merkkinen";
	}
	
}