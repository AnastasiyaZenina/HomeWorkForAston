public class SizeAndSumArray {

    public static int sizeAndSumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        // Проверяем размер массива
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException("Неверный размер массива! Размер массива должен быть 4x4");
        }

        int sum = 0;/* инициализируем переменную для
         накопления суммы всех преобразованных в целые числа элементов массива.*/

        // Проходим по всем элементам массива
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    // Пытаемся преобразовать элемент в int
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    // Если преобразование не удалось, бросаем исключение с информацией о ячейке
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}

