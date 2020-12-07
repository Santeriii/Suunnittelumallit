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
		data.add('A');
		data.add('S');
		data.add('E');
		
		CPU cpu = new CPU();
		Memory memory = new Memory();
		HardDrive hdd = new HardDrive(data);
		
		
        Computer computer = new Computer(cpu, memory, hdd);
        computer.run();
    }
}
