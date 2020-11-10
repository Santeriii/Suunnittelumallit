package memento;

public class TextWindow {
	 
    private Integer currentNumber;
 
    public TextWindow(Integer number) {
    	this.currentNumber = number;
    }
 
    public void changeNumber(Integer number) {
        currentNumber = number;
    }
    
    public Integer getNumber() {
    	return currentNumber;
    }
    
    public TextWindowState save() {
        return new TextWindowState(currentNumber);
    }
     
    public void restore(TextWindowState save) {
        currentNumber = save.getNumber();
    }
}