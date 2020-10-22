package osa3;

public class Valimuisti implements LaiteosaIF {

	private int hinta;
	
	public Valimuisti (int hinta) {
		this.hinta = hinta;
	}

	@Override
	public int haeHinta() {
		return this.hinta;
	}

	@Override
	public void lisaaOsa(LaiteosaIF laiteosa) {
		throw new RuntimeException
		("Laiteosan lisääminen itsenäiseen komponenttiin ei mahdollista...");
	}
}
