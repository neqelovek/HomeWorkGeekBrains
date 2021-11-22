package Lesson10;

import Lesson10.fruit.Apple;
import Lesson10.fruit.Box;
import Lesson10.fruit.Orange;

public class HomeWork {
    public static void main(String[] args) {
//        1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
//        2. Улыбнуться :)
//        3. Большая задача:
//        Есть классы Fruit -> Apple, Orange (больше фруктов не надо);
//        Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        Для хранения фруктов внутри коробки можно использовать массив
//        Сделать метод getWeight(), который высчитывает вес коробки,
//        зная количество фруктов и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f. Не важно, в каких это единицах);
//        Внутри класса Коробка сделать метод compare,
//        который позволяет сравнить текущую коробку с той,
//        которую подадут в compare в качестве параметра,
//        true – если она равны по весу, false – в противном случае
//        (коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую
//        (помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами).
//        Соответственно, в текущей коробке фруктов не остается,
//        а в другую перекидываются объекты, которые были в этой коробке;
//        Не забываем про метод добавления фрукта в коробку.


        String[] array = {"a", "b", "c", "d", "e", "f"};
        DoTask1 doTask1 = new DoTask1();
        doTask1.changingArrayElements(array, 0, 5);
        System.out.println();


        Box<Orange> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();
        box1.addFruit(new Orange(), 11.5f);
        box2.addFruit(new Orange(), 4.9f);
        box3.addFruit(new Apple(), 7.5f);
        box4.addFruit(new Apple(), 17.7f);
        System.out.println("Box 1: " + box1.getWeight());
        System.out.println("Box 2: " + box2.getWeight());
        System.out.println("Box 3: " + box3.getWeight());
        System.out.println("Box 4: " + box4.getWeight());
        System.out.println(box1.compare(box2));
        System.out.println(box2.compare(box3));
        System.out.println(box3.compare(box4));
        System.out.println(box1.compare(box4));

    }
}

