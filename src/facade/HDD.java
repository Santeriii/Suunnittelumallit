package facade;

import java.util.ArrayList;

public class HDD {
	
	private ArrayList<Character> data = new ArrayList<>();
	
	public HDD (ArrayList<Character> data)  {
		this.data = data;
	}

	Character Read(int lba, int size) {
		for (int i = lba; i < size; i++) {
			System.out.println(data.get(i));
		}
		return data.get(size - 1);
	}
	
}
