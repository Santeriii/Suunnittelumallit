package stateVisitor;

public class PokemonVisitor implements Visitor {

	@Override
	public void givePoints(PokemonEvolveStageOne ps) {
		ps.switchEvolveStages();
		System.out.println(" gets 50 points!");
	}
	
	@Override
	public void givePoints(PokemonEvolveStageTwo ps) {
		ps.switchEvolveStages();
		System.out.println(" gets 100 points!");
	}
	
	@Override
	public void givePoints(PokemonEvolveStageThree ps) {
		ps.switchEvolveStages();
		System.out.println(" gets 150 points!");
	}

}
