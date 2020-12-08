package facade;

import java.util.Scanner;

public class CPU {

	long pos;

    public void freeze() {
        System.out.println("CPU Froze");
    }

    public void jump(long position) {
        System.out.println("CPU jump to " + position);
        this.pos = position;
    }

    public void execute() {
        System.out.println("CPU Running");
    }
}
