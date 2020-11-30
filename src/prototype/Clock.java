package prototype;

public abstract class Clock {
    public int hour;
    public int minute;

    public Clock() {
    }

    public Clock(Clock target) {
        if (target != null) {
            this.hour = target.hour;
            this.minute = target.minute;
        }
    }

    public abstract Clock clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Clock)) return false;
        Clock clock2 = (Clock) object2;
        return clock2.hour == hour && clock2.minute == minute;
    }
}
