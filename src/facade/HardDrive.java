package facade;

import java.util.ArrayList;

public class HardDrive {
	
	private ArrayList<Character> data;
	
	public HardDrive(ArrayList<Character> data) {
		this.data = data;
	}
	
	public Character readdata(int index) {
		System.out.println("reading data at index: " + index);
		return data.get(index);
	}
	
}
