package chainOfResponsibility;

public class MediumRequester extends AbstractRequester {

	public MediumRequester(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Pyydetty " + message + ":n prosentin palkankorotusta.");
	   }
	
}
