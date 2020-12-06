package facade;

import java.util.Scanner;

public class CPU {

	public void Freeze(Memory memory, int size, HDD hdd) {
		memory.Load(hdd, size);
	}
	  /*void Jump(long position);
	  void Execute();*/
	
}
