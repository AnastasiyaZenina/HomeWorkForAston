import java.util.Arrays;

public class Task11 {

    public static void lengthOneHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

    }
}
