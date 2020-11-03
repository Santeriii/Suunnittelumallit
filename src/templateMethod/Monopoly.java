package templateMethod;

import java.util.HashMap;

class Monopoly extends Game {
	 
    /* Implementation of necessary concrete methods */
	private HashMap<Integer, Integer> players = new HashMap<Integer, Integer>();
	private boolean endOfGame = false;

    void initializeGame() {
        for (int i = 1; i <= 4; i++) {
        	players.put(i, 0);
        }
        System.out.println(players);
    }

    void makePlay(int player) {
        int points = (int) Math.round(Math.random() * 10);
        players.put(player, players.get(player) + points);
        for (int i = 1; i <= players.size(); i++) {
        	if (players.get(i) >= 100) {
        		endOfGame = true;
        	}
        }
        System.out.println(players);
    }
    
    int playerCount() {
    	return players.size();
    }

    boolean endOfGame() {
        return endOfGame;
    }

    void printWinner() {
        int winner = 1;
        for (int i = 1; i < players.size(); i++) {
        	if (players.get(i) < players.get(i + 1)) {
        		winner = i + 1;
        	}
        }
        System.out.println("And the winner is player number " + winner + "!");
    }

    /* Specific declarations for the Monopoly game. */

    // ...

}

