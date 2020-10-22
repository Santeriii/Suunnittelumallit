package osa2;

public class AdidasVaateFactory implements AdidasVaateFactoryIF {

	@Override
	public Farkut makeFarkut() {
		return new Farkut("Adidas");
	}

	@Override
	public Kengat makeKengat() {
		return new Kengat("Adidas");
	}

	@Override
	public Lippis makeLippis() {
		return new Lippis("Adidas");
	}

	@Override
	public TPaita makeTPaita() {
		return new TPaita("Adidas");
	}
	
}
