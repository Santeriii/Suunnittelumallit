package facade;

public class Memory {
	
	private int position = 0;

	void Load(HDD hdd, int size) {
		this.position = hdd.Read(position, size);
	}
	
}
