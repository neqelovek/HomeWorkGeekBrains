package XXX;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Сколько чисел в лотерее?");
        int n = in.nextInt();

        System.out.println("Сколько вам нужно?");
        int k = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Ваши числа");
        for (int r : result)
            System.out.println(r);
    }
}
