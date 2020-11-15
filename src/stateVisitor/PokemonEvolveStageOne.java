package stateVisitor;

public class PokemonEvolveStageOne implements PokemonState {

	@Override
	public void switchEvolveStages() {
		System.out.print("Charmander");
	}
	
	 public void accept(Visitor v) {
	        v.givePoints(this);
	 }

}
