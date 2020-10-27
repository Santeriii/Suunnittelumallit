package observer;

import java.util.Observable;
public class EventSource extends Observable {
	ClockTimer timer = new ClockTimer();
	
	public EventSource(ClockTimer timer) {
		this.timer = timer;
	}
	
    void startClock() {
    	String time;
        while(true){
        	this.timer.tick();
        	time = timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond();
            //set change
            setChanged();
            //notify observers for change
            notifyObservers(time);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
    }
}