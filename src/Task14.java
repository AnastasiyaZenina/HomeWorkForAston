import java.util.Arrays;

public class Task14 {
    public static void returnAnArray(int len, int initialValue) {
        int mas[] = new int[len];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = initialValue;
        }
       System.out.println(Arrays.toString(mas));

    }
}
