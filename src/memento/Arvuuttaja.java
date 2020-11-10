package memento;

public class Arvuuttaja extends Thread {
	 
    private TextWindow textWindow;
 
    public Arvuuttaja(TextWindow textWindow) {
        this.textWindow = textWindow;
    }
    
    private TextWindowState savedTextWindow;
    
    public void hitSave() {
        savedTextWindow = textWindow.save();
    }
     
    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

	public void write(Integer integer) {
		textWindow.changeNumber(integer);
	}
	
	public boolean vertaa(Integer arvaus, Integer arvattava) {
		if (arvaus == arvattava) {
			System.out.println("Okein! (arvattu " + arvaus + ", arvattava " + arvattava + ")");
			return true;
		} else {
			System.out.println("Väärin! (arvattu " + arvaus + ")");
			return false;
		}
	}

	public Integer liityPeliin() {
		return textWindow.getNumber();
	}
}
