package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
//    Расширить задачу про котов и тарелки с едой
// Добавить проверку, чтобы из тарелки нельзя было взять больше еды, чем в ней есть на текущий момент
// Каждому коту добавить boolean поле сытность (по-умолчанию все коты голодные, т.е. сытность=false)
// Считаем, что если коту недостаточно еды в тарелке, то он не ест из этой тарелки.
// Если коту достаточно еды, то он ее ест и становится сытым
// Продемонстрировать логику программы. Создать массив котов и тарелку с каким-то количеством еды.
// Всех котов направляем есть из этой тарелки. После прохода массива продемонстрировать,
// какие коты стали сытые, а какие остались голодные. Значения можно придумать самому
// Добавить в класс тарелки метод, позволяющий увеличивать количество еды в тарелке (просто прибавлять)
    public static void main(String[] args) throws InterruptedException {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Черныш");
        Cat cat4 = new Cat("Рыжик");

        Plate plate = new Plate(0);

        Cat [] cats = {cat1, cat2, cat3, cat4};

       while (true) {
           plate.addFood(3);
           for (Cat cat : cats) {
               cat.eat(plate);
               System.out.printf("%s поел и его сытость: %s%n ", cat.getName(),cat.isSatietyCat());
           }

           plate.info();
            Thread.sleep(3000);
       }



    }
}