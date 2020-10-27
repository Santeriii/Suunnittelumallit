package singleton;

public class BossVaateFactory implements BossVaateFactoryIF {
	
	private static BossVaateFactory INSTANCE = null;
	private BossVaateFactory(){}
	public static BossVaateFactory getInstance(){
		if (INSTANCE == null){
			INSTANCE = new BossVaateFactory();
		}
		return INSTANCE;
	}
	
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
