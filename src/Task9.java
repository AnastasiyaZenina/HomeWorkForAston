public class Task9 {
    public static void leapYear(int year) {
        boolean c;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            c = true;
        } else {
            c = false;
        }
        System.out.println(c);

    }
}