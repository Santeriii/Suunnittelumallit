package facade;

public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private HardDrive hdd;
	
	public Computer(CPU cpu, Memory memory, HardDrive hdd) {
		this.cpu = cpu;
		this.memory = memory;
		this.hdd = hdd;
	}
	
	public void run() {
		int index = 0;
		while (true) {
			cpu.processData(memory.load(hdd.readdata(index)));
			index++;
		}
    }
}
