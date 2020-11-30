package stateVisitor;

public class StateDesignPattern {
	public static void main( String[] args )
	 {
		
		Visitor v = new PokemonVisitor();
		 Pokemon pokemon= new Pokemon();
		 
		 for (int i = 0; i < 10; i++) {
			 pokemon.fight();
			 pokemon.accept(v);
		 }
	 }
}
