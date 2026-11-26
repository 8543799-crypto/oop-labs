package ControlWork.task1_2;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan() {
        this.hours = 0;
        this.minutes = 0;
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException();
        }
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException();
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public TimeSpan(TimeSpan other) {
        this.hours = other.getHours();
        this.minutes = other.getMinutes();
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException();
        }
        int totalMinutes = getTotalMinutes() + hours * 60 + minutes;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void add(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException();
        }
        int totalMinutes = getTotalMinutes() + minutes;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public void add(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    public void addTimeSpan(TimeSpan timespan) {
        add(timespan);
    }

    public double getTotalHours() {
        return this.hours + this.minutes / 60.0;
    }

    public int getTotalMinutes() {
        return this.hours * 60 + this.minutes;
    }

    public void subtract(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException();
        }
        int currentTotal = getTotalMinutes();
        int subtractTotal = hours * 60 + minutes;
        if (subtractTotal > currentTotal) {
            throw new IllegalArgumentException();
        }
        int remaining = currentTotal - subtractTotal;
        this.hours = remaining / 60;
        this.minutes = remaining % 60;
    }

    public void subtract(int minutes) {
        if (minutes < 0) {
            throw new IllegalArgumentException();
        }
        int currentTotal = getTotalMinutes();
        if (minutes > currentTotal) {
            throw new IllegalArgumentException();
        }
        int remaining = currentTotal - minutes;
        this.hours = remaining / 60;
        this.minutes = remaining % 60;
    }

    public void subtract(TimeSpan span) {
        subtract(span.getHours(), span.getMinutes());
    }

    public void scale(int factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException();
        }
        int totalMinutes = getTotalMinutes() * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    @Override
    public String toString() {
        return hours + "h " + minutes + "m";
    }
}
