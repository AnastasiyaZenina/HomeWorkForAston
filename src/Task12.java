import java.util.Arrays;

public class Task12 {
    public static void multiplyByTwo() {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas.length;
        for (int i = 0; i < maxMas; i++) {
            if (mas[i] < 6)
                mas[i] = mas[i] * 2;
        }
        System.out.println(Arrays.toString(mas));

    }
}



