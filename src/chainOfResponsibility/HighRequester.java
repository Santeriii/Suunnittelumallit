package chainOfResponsibility;

public class HighRequester extends AbstractRequester {

		public HighRequester(int level){
	      this.level = level;
	   }

	   @Override
	   protected void write(String message) {		
	      System.out.println("Pyydetty " + message + ":n prosentin palkankorotusta.");
	   }
	
}
