package proxy;

import java.util.ArrayList;
import java.util.Scanner;

public class ProxyExample {
	public static void main(final String[] arguments) {
		Scanner lukija = new Scanner(System.in);
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        ArrayList<Image> imageAlbum = new ArrayList<>();
        imageAlbum.add(image1);
        imageAlbum.add(image2);

        //valokuvakansion sisältö
        for (Image i : imageAlbum) {
        	i.showData();
        }
        
        //valokuvakansion selaaminen
        for (Image i : imageAlbum) {
        	i.displayImage();
        }
        
        while (true) {
        	System.out.println("Syötä kuvan indeksi:");
        	int index = lukija.nextInt();
        	if (imageAlbum.get(index) != null) {
        		imageAlbum.get(index).displayImage();
        	} else {
        		System.out.print("Haetulla indeksillä ei löytynyt kuvaa");
        	}
        }
    }
}
