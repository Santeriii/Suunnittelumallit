package osa2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {

		Farkut adidasFarkut = new AdidasVaateFactory().makeFarkut();
		Kengat adidasKengat = new AdidasVaateFactory().makeKengat();
		Lippis adidasLippis = new AdidasVaateFactory().makeLippis();
		TPaita adidasTPaita = new AdidasVaateFactory().makeTPaita();
		
		System.out.println(adidasFarkut.toString());
		System.out.println(adidasKengat.toString());
		System.out.println(adidasLippis.toString());
		System.out.println(adidasTPaita.toString());
		
		adidasFarkut = new BossVaateFactory().makeFarkut();
		adidasKengat = new BossVaateFactory().makeKengat();
		adidasLippis = new BossVaateFactory().makeLippis();
		adidasTPaita = new BossVaateFactory().makeTPaita();
		
		System.out.println(adidasFarkut.toString());
		System.out.println(adidasKengat.toString());
		System.out.println(adidasLippis.toString());
		System.out.println(adidasTPaita.toString());
	}
}
