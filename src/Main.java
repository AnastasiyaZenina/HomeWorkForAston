//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            String[][] arr = {
                    {"1", "2", "3","4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "sixteen"}
            };

            try {
                int sum = SizeAndSumArray.sizeAndSumArray(arr);
                System.out.println("Сумма элементов массива: " + sum);
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }

