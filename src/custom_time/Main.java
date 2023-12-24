package custom_time;

public class Main {
    public static void main(String[] args) {
        CustomTime ct = new CustomTime(23, 22, 23);
        printTime(ct.getTime());
    }

    public static void printTime(int[] time) {
        int hr = time[0];
        int mint = time[1];
        int sec = time[2];
        System.err.println("This time is set to: " + hr + ":" + mint + ":" + sec);
    }
}
