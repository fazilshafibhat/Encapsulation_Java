package custom_time;

public class CustomTime {

    /*
     * Constants
     */
    final static int MAX_HOURS = 23;
    final static int MAX_MINS = 59;
    final static int MAX_SECS = 59;

    private int hour;
    private int minute;
    private int second;

    public CustomTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    private void setHour(int hour) {
        if (hour >= 0 && hour <= MAX_HOURS) {
            this.hour = hour;
        } else {
            System.out.println("Error: hour must be between 0 and 23 inclusive!");
            hour = 0;
        }
    }

    private void setMinute(int minute) {
        if (minute >= 0 && minute <= MAX_MINS) {
            this.minute = minute;
        } else {
            System.out.println("Error: minute must be between 0 and 59 inclusive!");
            minute = 0;
        }
    }

    private void setSecond(int second) {
        if (second >= 0 && second <= MAX_SECS) {
            this.second = second;
        } else {
            System.out.println("Error: second must be between 0 and 59 inclusive!");
            second = 0;
        }
    }

    public int gethour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    int[] getTime() {
        return new int[] { hour, minute, second };
    }

    void incrementTime() {
        second = ++second % (MAX_SECS + 1);
        if (second == 0) {
            minute = ++minute % (MAX_MINS + 1);
        }
        if (second == 0 && minute == 0) {
            hour = ++hour % (MAX_HOURS + 1);
        }
    }

}
