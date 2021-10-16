package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        System.out.println();
        chekSumSignA(12,45);
        chekSumSignA(-145,67);
        System.out.println();
        printColor(-54);
        printColor(0);
        printColor(987);
        printColor(43);
        System.out.println();
        compareNumbers(5,3);
        compareNumbers(12,34);


    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void chekSumSignA(int a, int b){
        int sum = a + b;
        if (sum >= 0){
            System.out.println( sum + " Сумма положительная");
        }else {
            System.out.println(sum + " Сумма отрицательная");
        }
    }

    static void printColor(int value){
        if (value <= 0){
            System.out.println("Красынй");
        } if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } if (value > 100){
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers(int a, int b){
           if (a >= b){
            System.out.println(a + " >= " + b);}
           else {
               System.out.println(a + " < " + b);
           }

    }


}