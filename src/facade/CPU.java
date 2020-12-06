package facade;

import java.util.Scanner;

public class CPU {

	public void Freeze(Memory memory, int size, HDD hdd) {
		memory.Load(hdd, size);
	}
	
	
	/*void Jump(int position) {
		memory.Load(hdd, position)
	}
	  void Execute();*/
	
}
