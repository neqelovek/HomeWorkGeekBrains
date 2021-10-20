package Lesson2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(checkingTheSum(3,5));
        System.out.println(checkingTheSum(3,7));
        System.out.println(checkingTheSum(15,5));
        System.out.println(checkingTheSum(17,9));
        System.out.println();
        checkingNumber(-3421);
        checkingNumber(1986);
        System.out.println();
        System.out.println(checkingPositiveAndNegativeNumber(-2334));
        System.out.println(checkingPositiveAndNegativeNumber(234));
        System.out.println();
        printLine("Как то так ", 5);
        System.out.println();
        System.out.println(determineTheYear(2000));
        System.out.println(determineTheYear(1989));




    }
//    1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно),
//    если да – вернуть true, в противном случае – false.

    static boolean checkingTheSum(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }
//    2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.

    static void checkingNumber(int number ){
        if(number >= 0){
            System.out.println("Число " + number + " положительное");
        }else {
            System.out.println("Число " + number + " отрицательное");
        }
    }
//    3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    static boolean checkingPositiveAndNegativeNumber(int number){
        return number < 0;
    }

//    4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    static void printLine(String line,int a){
        for (int i = 0; i < a; i++) {
            System.out.println(line + i);
        }
    }
//    5. * Написать метод, который определяет, является ли год високосным,
//    и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
//    кроме каждого 100-го, при этом каждый 400-й – високосный.

    static boolean determineTheYear(int a){
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

}
