package osa2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		Class c = null;
		AdidasVaateFactoryIF adidasTehdas = null;
		
		Properties properties = new Properties();
		try {
			properties.load(
			new FileInputStream("adidasTehdas.properties"));
		} catch (IOException e) {e.printStackTrace();}
			try{
			//luetaan toteuttava tehdas properties-tiedostosta
			c = Class.forName(properties.getProperty("adidasTehdas"));
			adidasTehdas = (AdidasVaateFactoryIF)c.newInstance();
		} catch (Exception e){e.printStackTrace();}
		
		Farkut adidasFarkut = adidasTehdas.makeFarkut();
		Kengat adidasKengat = new AdidasVaateFactory().makeKengat();
		Lippis adidasLippis = new AdidasVaateFactory().makeLippis();
		TPaita adidasTPaita = new AdidasVaateFactory().makeTPaita();
		
		System.out.println(adidasFarkut.toString());
		System.out.println(adidasKengat.toString());
		System.out.println(adidasLippis.toString());
		System.out.println(adidasTPaita.toString());
		
		Farkut bossFarkut = new BossVaateFactory().makeFarkut();
		Kengat bossKengat = new BossVaateFactory().makeKengat();
		Lippis bossLippis = new BossVaateFactory().makeLippis();
		TPaita bossTPaita = new BossVaateFactory().makeTPaita();
		
		System.out.println(bossFarkut.toString());
		System.out.println(bossKengat.toString());
		System.out.println(bossLippis.toString());
		System.out.println(bossTPaita.toString());
	}
}
