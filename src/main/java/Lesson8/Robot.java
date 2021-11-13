package Lesson8;

public  class Robot {

    private int run;
    private int jump;

    public Robot(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }
    public class Action {

        public void robotRun() {
            System.out.println("Робот бежит ");
        }

        public void robotJump() {
            System.out.println("Робот прыгает");

        }
    }
}
