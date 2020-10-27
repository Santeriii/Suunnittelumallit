package observer;
import java.util.Observable;
import java.util.Observer;
public class DigitalClock implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println((String)arg);
    }
}