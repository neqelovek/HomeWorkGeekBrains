package Lesson7;

import java.util.Random;

public class Cat {
    private String name;
    Random random = new Random();

    private final int MAX_SATIETY = random.nextInt(10) + 4;
    private int satiety;

    public Cat(String name) {
        this.name = name;

    }

    public void eat(Plate plate) {
        int appetite = MAX_SATIETY - satiety;
        int foodCount = plate.getFood();
        if (foodCount - appetite >= 0){
            plate.descreaseFood(appetite);
            satiety = MAX_SATIETY;
        }
    }

    public boolean isSatietyCat(){
        return satiety == MAX_SATIETY;
    }

    public String getName() {
        return name;
    }
}
