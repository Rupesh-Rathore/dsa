package prac;

public class LeapYear {
    public static boolean isLeapYr (int yr) {
        if (yr % 100 == 0) {
            return yr % 400 == 0;
        }
        if (yr % 4 == 0) return true;
        return false;
    }
}
