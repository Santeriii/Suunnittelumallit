package stateVisitor;

public abstract interface Visitor {
	
	void givePoints(PokemonEvolveStageOne ps);
	void givePoints(PokemonEvolveStageTwo ps);
	void givePoints(PokemonEvolveStageThree ps);
	
}
