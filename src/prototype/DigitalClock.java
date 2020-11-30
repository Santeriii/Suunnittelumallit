package prototype;

public class DigitalClock extends Clock {
    public int seconds;

    public DigitalClock() {
    }

    public DigitalClock(DigitalClock target) {
        super(target);
        if (target != null) {
            this.seconds = target.seconds;
        }
    }

    @Override
    public Clock clone() {
        return new DigitalClock(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof DigitalClock) || !super.equals(object2)) return false;
        DigitalClock clock2 = (DigitalClock) object2;
        return clock2.seconds == seconds;
    }
}
