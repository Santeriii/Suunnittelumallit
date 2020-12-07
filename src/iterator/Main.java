package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Iterator<String> it = cars.iterator();
    Iterator<String> it2 = cars.iterator();

    MyThread threadOne = new MyThread(it);
    MyThread threadTwo = new MyThread(it2);
    
    threadOne.start();
    threadTwo.start();
    
    /*MyThread threadOne = new MyThread(it);
    MyThread threadTwo = new MyThread(it);
    
    threadOne.start();
    threadTwo.start();*/
    
    /*MyThread threadOne = new MyThread(it);
    
    threadOne.start();*/
    
    
  }
}
