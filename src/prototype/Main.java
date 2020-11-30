package prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Clock> clocks = new ArrayList<>();
        List<Clock> clocksCopy = new ArrayList<>();

        DigitalClock digi = new DigitalClock();
        digi.hour = 10;
        digi.minute = 20;
        digi.seconds = 15;
        clocks.add(digi);

        DigitalClock anotherDigitalClock = (DigitalClock) digi.clone();
        clocks.add(anotherDigitalClock);

        cloneAndCompare(clocks, clocksCopy);
    }

    private static void cloneAndCompare(List<Clock> clocks, List<Clock> clocksCopy) {
        for (Clock clock : clocks) {
            clocksCopy.add(clock.clone());
        }

        for (int i = 0; i < clocks.size(); i++) {
            if (clocks.get(i) != clocksCopy.get(i)) {
                System.out.println(i + ": Clocks are different objects (yay!)");
                if (clocks.get(i).equals(clocksCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Clock objects are the same (booo!)");
            }
        }
    }
}
