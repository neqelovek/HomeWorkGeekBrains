package Lesson8;

public  class Robot {

    private String name;
    private int run;
    private int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public class Action {

        public void robotRun() {
            System.out.println("Робот " + name + " бегает");

        }

        public void robotJump() {
            System.out.println("Робот " + name +  " прыгает");

        }
        public int getRun() {
            return run;
        }
        public String getName() {
            return name;
        }

        public int getJump() {
            return jump;
        }

    }
}
