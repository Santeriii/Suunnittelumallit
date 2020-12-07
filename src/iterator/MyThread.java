package iterator;

import java.util.Iterator;
import java.util.Scanner;

public class MyThread extends Thread {
	
	private Iterator<String> it;
	private Scanner lukija = new Scanner(System.in);
	
	public MyThread (Iterator<String> it) {
		this.it = it;
	}

	@Override
	public void run() {
		int execute;
		while (it.hasNext()) {
			System.out.println("Jatka : syötä '1', odota : syötä '0', poista nykyinen iteroitava yksilö: 2");
			execute = Integer.parseInt(lukija.nextLine());
			if (execute == 1) {
				printIteratorContents();
			} else if (execute == 2) {
				it.remove();
			}
		}
	}
	
	public void printIteratorContents() {
		System.out.println(it.next());
	}
}
