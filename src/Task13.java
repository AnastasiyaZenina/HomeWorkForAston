public class Task13 {
    public static void fillingArrayDiagonals() {
        int[][] mas = new int[4][4];

        for (int i = 0; i < mas.length; i++) {
            mas[i][i] = 1;
            mas[i][mas.length - i - 1] = 1;
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}