package Lesson10;

public class DoTask1 {
    public void changingArrayElements(String[] array, int firstIndex, int secondIndex) {
        String value = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = value;
        for (String s : array) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
