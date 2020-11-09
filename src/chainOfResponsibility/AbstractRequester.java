package chainOfResponsibility;

public abstract class AbstractRequester {
		public static int LOW = 2;
	   public static int MEDIUM = 5;
	   public static int HIGH = 100;

	   protected int level;

	   //next element in chain or responsibility
	   protected AbstractRequester nextRequester;

	   public void setNextRequester(AbstractRequester nextRequester){
	      this.nextRequester = nextRequester;
	   }

	   public void logMessage(int level, String message){
	      if(this.level <= level){
	         write(message);
	      }
	      if(nextRequester !=null){
	         nextRequester.logMessage(level, message);
	      }
	   }

	   abstract protected void write(String message);
}
