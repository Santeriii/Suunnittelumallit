package iterator;

import java.util.Iterator;

public class MyThread extends Thread {
	
	private Iterator<String> it;
	int value;
	
	public MyThread (Iterator<String> it, int value) {
		this.it = it;
		this.value = value;
	}

	@Override
	public void run() {
		while (it.hasNext()) printNumber(this.value);
	}
	
	public void printNumber(int number) {
        if (value % 2 == 0) {
            System.out.println(it.next());
            value++;
        }
    }
}
