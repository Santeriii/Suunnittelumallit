package singleton;

public class AdidasVaateFactory implements AdidasVaateFactoryIF {
	
	private static AdidasVaateFactory INSTANCE = null;
	private AdidasVaateFactory(){}
	public static AdidasVaateFactory getInstance(){
		if (INSTANCE == null){
			INSTANCE = new AdidasVaateFactory();
		}
		return INSTANCE;
	}
	
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
