package osa2;

public class BossVaateFactory implements BossVaateFactoryIF {
	
	@Override
	public Farkut makeFarkut() {
		return new Farkut("Boss");
	}

	@Override
	public Kengat makeKengat() {
		return new Kengat("Boss");
	}

	@Override
	public Lippis makeLippis() {
		return new Lippis("Boss");
	}

	@Override
	public TPaita makeTPaita() {
		return new TPaita("Boss");
	}
	
}
