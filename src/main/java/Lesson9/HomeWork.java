package Lesson9;

public class HomeWork {
    public static void main(String[] args) {
//        1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
//        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
// и просуммировать. Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException – с детализацией,
// в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод,
// обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.

        String[][] values1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}


        };
        String[][] values2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "Ой", "3", "4"},
                {"1", "2", "3", "4"}


        };
        String[][] values3 = {
                {"1", "2",},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };


        calkSum(values1); // Пример без ошибок.

        calkSum(values2); // Пример с ошибкой MyArrayDataException.

        calkSum(values3); // Пример с ошибкой MyArraySizeException.

    }

    static int calkSum(String[][] values) {
        chekSizeArrays(values);

        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    String arraysMassage = String.format("В ячейке [%s][%s] массива values не удалось преобразование!", i, j);
                    throw new MyArrayDataException(arraysMassage, e);
                }
            }
        }
        return sum;
    }

    static void chekSizeArrays(String[][] values) {
        chekSizeArrays(values.length);
        for (String[] meaning : values) {
            chekSizeArrays(meaning.length);
        }
    }

    static void chekSizeArrays(int sizeArrays) {
        if (sizeArrays != 4) {
            throw new MyArraySizeException("Массив не соответствует требуемому размеру");
        }
    }
}
