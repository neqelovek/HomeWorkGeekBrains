package lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs("Мухтар", 460, 7);
        Dogs dog2 = new Dogs("Полкан", 730, 14);
        Dogs dog3 = new Dogs("Барон", 490, 13);
        Cats cat1 = new Cats("Мурзик", 340, 0);
        Cats cat2 = new Cats("Барсик", 25, 3);
        Cats cat3 = new Cats("Мурка", 240, 0);
        Cats cat4 = new Cats("Черныш", 20, 0);

        dog1.goDistance();
        dog2.goDistance();
        dog3.goDistance();
        cat1.goDistance();
        cat2.goDistance();
        cat3.goDistance();
        cat4.goDistance();
        System.out.println();

        System.out.println("Общее число собак " + Dogs.dogsCounter);
        System.out.println("Общее число кошек " + Cats.catCounter);
        System.out.println("Общее число животных " + Animals.getAnimalsCounter());
    }
}

