package facade;

public class Computer {
	
	private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public Computer() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(0xc154e5, hd.read(100, 1024));
        processor.jump(0x000);
        processor.execute();
    }
}
