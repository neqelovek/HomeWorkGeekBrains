package Lesson8;

public class People {

    private int run;
    private int jump;

    public People(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }
    public class Action {

        public void peopleRun() {
            System.out.println("Человек бежит ");
        }

        public void peopleJump() {
            System.out.println("Человек прыгает");

        }
    }
}
