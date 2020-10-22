package osa3;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements LaiteosaIF {

	private int hinta;
	List<LaiteosaIF> laiteosalista = new ArrayList<LaiteosaIF>();
	
	public Kotelo (int hinta) {
		this.hinta = hinta;
	}

	@Override
	public int haeHinta() {
		for (LaiteosaIF osa : laiteosalista) {
			this.hinta += osa.haeHinta();
		}
		return this.hinta;
	}

	@Override
	public void lisaaOsa(LaiteosaIF laiteosa) {
		laiteosalista.add(laiteosa);
	}
}
