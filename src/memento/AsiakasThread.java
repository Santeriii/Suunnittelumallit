package memento;

public class AsiakasThread extends Thread {
	
	private TextWindow textWindow;
	private Arvuuttaja arvuuttaja;
	
	public AsiakasThread (Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
	}
	
	public void run() {
		Integer rand, arvattava;
		Boolean voitto = false;
		while (!voitto) {
			rand = (int) Math.round(Math.random() * 10);
			textWindow = new TextWindow(rand);
			arvattava = arvuuttaja.liityPeliin();
			voitto = arvuuttaja.vertaa(rand, arvattava);
		}
	}
}
