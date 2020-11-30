package stateVisitor;

public class PokemonEvolveStageThree implements PokemonState {

	@Override
	public void switchEvolveStages() {
		System.out.print("Charizard");
	}
	
	public void accept(Visitor v) {
        v.givePoints(this);
	}
	
}
