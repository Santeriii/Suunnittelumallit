package memento;

public class Main {
	public static void main(String[] args) {
		Arvuuttaja textEditor = new Arvuuttaja(new TextWindow(4));
		AsiakasThread asiakas = new AsiakasThread(textEditor);
		textEditor.write(4);
		textEditor.hitSave();
		
		asiakas.start();

	}
}
