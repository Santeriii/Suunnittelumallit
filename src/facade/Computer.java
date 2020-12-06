package facade;

public class Computer {
	
	private CPU cpu;
	private Memory memory;
	private HDD hdd;
	
	public Computer(CPU cpu, Memory memory, HDD hdd) {
		this.cpu = cpu;
		this.memory = memory;
		this.hdd = hdd;
	}
	
	  void Start() {
	    cpu.Freeze(memory, 4, hdd);
	    memory.Load(hdd, 8);
	    /*cpu.Jump(kBootAddress);
	    cpu.Execute();*/
	  }
}
