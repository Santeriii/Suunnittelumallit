package stateVisitor;

public class PokemonEvolveStageTwo implements PokemonState {
	
	@Override
	public void switchEvolveStages() {
		System.out.print("Charmeleon");
	}
	
	public void accept(Visitor v) {
        v.givePoints(this);
	}
}
