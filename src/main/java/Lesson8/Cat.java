package Lesson8;

public class Cat {

    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
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
