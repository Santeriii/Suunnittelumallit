package facade;

import java.util.ArrayList;

public class HardDrive {
	
	public byte[] read(long lba, int size) {
        System.out.println("Hard drive reading at " + lba + " with size " + size);
        return new byte[1024];
    }
	
}
