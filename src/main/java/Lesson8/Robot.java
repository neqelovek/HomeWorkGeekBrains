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
        public int getRun() {
            return run;
        }
    }

//    public int getRun() {
//        return run;
//    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }
}
