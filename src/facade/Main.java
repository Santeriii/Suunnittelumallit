package facade;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Character> data = new ArrayList<>();
		
		data.add('D');
		data.add('A');
		data.add('T');
		data.add('A');
		data.add('B');
		data.add('B');
		data.add('A');
		data.add('S');
		data.add('E');
		
		CPU cpu = new CPU();
		HDD hdd = new HDD(data);
		Memory memory = new Memory();
		
		
		Computer computer = new Computer(cpu, memory, hdd);
		  computer.Start();
    }
}
