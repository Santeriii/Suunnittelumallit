package stateVisitor;

public interface PokemonState {
	 
	 public void switchEvolveStages();
	 public void accept(Visitor v);
	 
}
