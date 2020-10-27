package observer;

public class ClockTimer {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	void tick(){
		if (second < 59) {
			second++;
		} else if (minute < 59) {
			second = 0;
			minute++;
		} else if (hour < 24){
			second = 0;
			minute = 0;
			hour++;
		} else {
			second = 0;
			minute = 0;
			hour = 0;
		}
	}
} 
