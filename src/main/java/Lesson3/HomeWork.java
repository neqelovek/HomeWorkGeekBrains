package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        createdArrayToTask1();
        System.out.println();
        createdArrayToTask2();
        System.out.println();
        createdArrayToTask3();
        System.out.println();
        created2DArraysToTask4();
        System.out.println();
        writingMethodForArray();
        System.out.println();
        creatArraysToTask6();
        System.out.println();
        System.out.println(checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 2}));
        System.out.println(checkBalanceToTask7(new int[]{1, 1, 1, 1, 1, 2, 2}));
        System.out.println(checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 2, 2, 2}));
        System.out.println(checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 2, 2}));
        System.out.println();
        shiftingNumberTotask8(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        shiftingNumberTotask8(new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10}, 2222);
        shiftingNumberTotask8(new int[]{1, 2, 3, 4}, 1);
        shiftingNumberTotask8(new int[]{1, 2, 3, 4}, -1);
        shiftingNumberTotask8(new int[]{1, 2, 3, 4,5,6,7,8,9}, -4);
        shiftingNumberTotask8(new int[]{1, 2, 3, 4,5,6,7,8,8,9}, -111);


    }
//    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;

    static void createdArrayToTask1() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
//    2. Задать пустой целочисленный массив длиной 100.
//    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    static void createdArrayToTask2() {
        int[] arr = new int[101];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
//     3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//     пройти по нему циклом, и числа меньшие 6 умножить на 2;

    static void createdArrayToTask3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
//    если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
//    индексы таких элементов равны,
//    то есть [0][0], [1][1], [2][2], …, [n][n];

    static void created2DArraysToTask4() {
        int[][] arrays = new int[5][5];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == j || j == arrays[i].length - i - 1) {
                    arrays[i][j] = 1;
                }
                System.out.print(arrays[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


//    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len,
//    каждая ячейка которого равна initialValue;

    static void writingMethodForArray() {
        System.out.println("Укажите длину массива");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.println("Задайте значения ячеек массива");
        Scanner scan = new Scanner(System.in);
        int initialValue = scan.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
    }
//    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы.

    static void creatArraysToTask6() {
        int[] arr = {2, 4, 76, 4, 2, 7, 1, -342, 68, 89, 643};
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int min = arr[0];
        System.out.println("Максимальный элемент массива это " + max);
        System.out.println();
        System.out.println("Минимальный элемент массива это " + min);
    }

//    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true,
//    если в массиве есть место, в котором сумма левой и правой части массива равны.

    static boolean checkBalanceToTask7(int[] array) {
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);

        if (rightSum % 2 != 0) {
            return false;
        }
        for (int j : array) {

            leftSum += j;
            rightSum -= j;

            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

//    8. *** Написать метод, которому на вход подается одномерный массив и число n
//    (может быть положительным, или отрицательным),
//    при этом метод должен сместить все элементы массива на n позиций.
//    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//    \Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
//    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//    При каком n в какую сторону сдвиг можете выбирать сами.

    private static void shiftingNumberTotask8(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0){
            shiftLeft(array, shiftNumber);
        } else {
            shiftRight(array,shiftNumber);
        }
        System.out.println(Arrays.toString(array) + " смещается на " + n);

    }

    private static void shiftRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lestValue = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = lestValue;
        }
    }

    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = firstValue;
        }
    }
}
