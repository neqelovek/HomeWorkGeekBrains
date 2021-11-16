package Lesson8;

public class People {

    private String name;
    private int run;
    private int jump;

    public People(String name, int run, int jump) {
        this.name = name;
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
        public String getName() {
            return name;
        }

        public int getRun() {
            return run;
        }

        public int getJump() {
            return jump;
        }

    }
}
