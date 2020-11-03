package state;

public class Pokemon implements PokemonState {

	private PokemonState pokemonState;

	 private PokemonState pokemonEvolveStageOne = new PokemonEvolveStageOne();
	 private PokemonState pokemonEvolveStageTwo = new PokemonEvolveStageTwo();
	 private PokemonState pokemonEvolveStageThree = new PokemonEvolveStageThree();
	 
	 public PokemonState getPokemonState()
	 {
		 return pokemonState;
	 }
	 
	 public void setPokemonState(PokemonState pokemonState)
	 {
		 this.pokemonState = pokemonState;
	 
	 }
	 
	 public void fight() {
		 if (pokemonState == null) {
			 setPokemonState(pokemonEvolveStageOne);
		 }
		 int attackOrDefend = (int) Math.round(Math.random() * 1);
		 if (attackOrDefend == 1) {
			 pokemonState.switchEvolveStages();
			 System.out.println(" attacks!");
			 if (pokemonState == pokemonEvolveStageOne) {
				 setPokemonState(pokemonEvolveStageTwo);
			 } else {
				 setPokemonState(pokemonEvolveStageThree);
			 }
			 System.out.print("It evolved to ");
			 pokemonState.switchEvolveStages();
			 System.out.println();
		 } else {
			 pokemonState.switchEvolveStages();
			 System.out.println(" defends!");
			 if (pokemonState == pokemonEvolveStageThree) {
				 setPokemonState(pokemonEvolveStageTwo);
			 } else {
				 setPokemonState(pokemonEvolveStageOne);
			 }
			 System.out.print("It de-evolved to ");
			 pokemonState.switchEvolveStages();
			 System.out.println();
		 }
	 }
	 
	 @Override
	 public void switchEvolveStages()
	 {
		 System.out.println("Current evolve form of Pokemon : " + 
		 pokemonState.getClass().getName());
		 pokemonState.switchEvolveStages();
	 
	 }
	
}
