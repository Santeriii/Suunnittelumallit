package observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		EventSource eventSource = new EventSource(timer);
        DigitalClock kello = new DigitalClock();
        eventSource.addObserver(kello);
        eventSource.startClock();
	}
}
