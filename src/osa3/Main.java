package osa3;

public class Main {
	public static void main(String[] args) {
		LaiteosaIF kotelo = new Kotelo(100);
		LaiteosaIF emo = new Emolevy(30);
		
		kotelo.lisaaOsa(emo);
		
		LaiteosaIF I7_2600 = new Prosessori(50);
		
		kotelo.lisaaOsa(I7_2600);
		emo.lisaaOsa(I7_2600);
		
		LaiteosaIF gTX_650_Ti = new Naytonohjain(70);
		
		kotelo.lisaaOsa(gTX_650_Ti);
		emo.lisaaOsa(gTX_650_Ti);
		
		LaiteosaIF ram = new Valimuisti(80);
		
		kotelo.lisaaOsa(ram);
		emo.lisaaOsa(ram);
		
		LaiteosaIF verkkokortti = new Verkkokortti(25);
		
		kotelo.lisaaOsa(verkkokortti);
		emo.lisaaOsa(verkkokortti);
		
		System.out.println(kotelo.haeHinta());
		System.out.println(emo.haeHinta());
	}
}
