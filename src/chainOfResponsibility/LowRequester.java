package chainOfResponsibility;

public class LowRequester extends AbstractRequester {

	public LowRequester(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Pyydetty " + message + ":n prosentin palkankorotusta.");
	   }
	
}
