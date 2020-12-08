package facade;

import java.util.Arrays;

public class Memory {
	
	public void load(long position, byte[] data) {
        System.out.println("Memory load at " + position + "\ndata: " + Arrays.toString(data));
    }
	
}
