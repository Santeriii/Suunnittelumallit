package templateMethod;

public class Main {
	public static void main( String[] args ) {
		Monopoly monopoly = new Monopoly();
		
		monopoly.initializeGame();
		
		while (true) {
			boolean end = monopoly.endOfGame();
			if(end == true) {
				break;
			}
			for (int i = 1; i <= monopoly.playerCount(); i++) {
				monopoly.makePlay(i);
			}
		}
		
		monopoly.printWinner();
	}
}
