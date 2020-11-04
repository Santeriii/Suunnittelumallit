package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	   public static void main(String[] args) {
		   List<String> songs = new ArrayList<String>();
		   songs.add("One");
		   songs.add("Calling");
		   songs.add("Surrender");
		   songs.add("The Sky Will Turn");
		   songs.add("Holiday");
		   songs.add("Play Dead");
		   songs.add("Over");
		   songs.add("Looking Glass");
		   songs.add("Kill The Lights");
		   
		   Context context = new Context(new breakAfterEvery());		
	      System.out.println(context.executeStrategy(songs));

	      context = new Context(new breakAfterEverySecond());		
	      System.out.println(context.executeStrategy(songs));

	      context = new Context(new breakAfterEveryThird());		
	      System.out.println(context.executeStrategy(songs));
		   
	   }
}
