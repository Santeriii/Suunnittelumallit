package state;

public class StateDesignPattern {
	public static void main( String[] args )
	 {
		 Pokemon pokemon= new Pokemon();
		 
		 for (int i = 0; i < 10; i++) {
			 pokemon.fight();
		 }
	 }
}
