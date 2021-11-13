package Lesson8;

public class Cat {

    private int run;
    private int jump;

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }
    public class Action {

        public void catRun() {
            System.out.println("Кот бежит ");
        }

        public void catJump() {
            System.out.println("Кот прыгает");

        }
    }
}
