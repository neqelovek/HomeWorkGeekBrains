package Lesson14;

import java.util.Arrays;

public class HomeWork {

    public static void main(String[] args) {

        HomeWork homeWork = new HomeWork();

        System.out.println(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 3, 4, 5}));
        System.out.println(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 3, 4}));
        System.out.println(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 2, 1, 1, 2, 3, 4, 5, 3}));
        System.out.println(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 3, 4, 5}));
        System.out.println();
        homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 1, 1}, -3);
        homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 1, 1}, 2);
        homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 2, 3, 4, 5, 1, 1}, -34);
        homeWork.shiftingNumberToTask8(new int[]{2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1}, 23);


    }

    boolean checkBalanceToTask7(int[] array) {
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

    private int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int[] shiftingNumberToTask8(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, shiftNumber);
        } else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + " смещается на " + n);

        return array;
    }

    private void shiftRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lestValue = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = lestValue;
        }
    }

    private void shiftLeft(int[] array, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            int firstValue = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = firstValue;
        }
    }
}
