package W08;

public class Concept3 {
    public static boolean isMultThree(int num) {
        return num % 3 == 0;
    }

    public static int tensPlaceDigit(int number) {
        return (number > 0 ? number : -1 * number) % 100 / 10;
    }

    public boolean soundAlarm() {
        return alarmOn() && (getTime() >= 60 * 1 && getTime() <= 60 * 18);
    }

    private int getTime() {
        //return time in minutes...
        return 0;
    }

    private boolean alarmOn() {
        return true;
    }

}
