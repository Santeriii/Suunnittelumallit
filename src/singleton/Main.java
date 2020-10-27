package singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		
		Farkut adidasFarkut = AdidasVaateFactory.getInstance().makeFarkut();
		Kengat adidasKengat = AdidasVaateFactory.getInstance().makeKengat();
		Lippis adidasLippis = AdidasVaateFactory.getInstance().makeLippis();
		TPaita adidasTPaita = AdidasVaateFactory.getInstance().makeTPaita();
		
		System.out.println(adidasFarkut.toString());
		System.out.println(adidasKengat.toString());
		System.out.println(adidasLippis.toString());
		System.out.println(adidasTPaita.toString());
		
		adidasFarkut = BossVaateFactory.getInstance().makeFarkut();
		adidasKengat = BossVaateFactory.getInstance().makeKengat();
		adidasLippis = BossVaateFactory.getInstance().makeLippis();
		adidasTPaita = BossVaateFactory.getInstance().makeTPaita();
		
		System.out.println(adidasFarkut.toString());
		System.out.println(adidasKengat.toString());
		System.out.println(adidasLippis.toString());
		System.out.println(adidasTPaita.toString());
	}
}
