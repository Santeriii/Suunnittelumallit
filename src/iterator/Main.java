package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Iterator<String> it = cars.iterator();
    Iterator<String> it2 = cars.iterator();

    MyThread threadOne = new MyThread(it, 6);
    MyThread threadTwo = new MyThread(it2, 7);
    
    threadOne.start();
    threadTwo.start();
  }
}
